import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { JhiDataUtils, JhiFileLoadError, JhiEventManager, JhiEventWithContent } from 'ng-jhipster';

import { IDocumentUrl, DocumentUrl } from 'app/shared/model/document-url.model';
import { DocumentUrlService } from './document-url.service';
import { AlertError } from 'app/shared/alert/alert-error.model';
import { IEmployeur } from 'app/shared/model/employeur.model';
import { EmployeurService } from 'app/entities/employeur/employeur.service';

@Component({
  selector: 'jhi-document-url-update',
  templateUrl: './document-url-update.component.html'
})
export class DocumentUrlUpdateComponent implements OnInit {
  isSaving = false;
  employeurs: IEmployeur[] = [];

  editForm = this.fb.group({
    id: [],
    name: [],
    url: [],
    document: [],
    documentContentType: [],
    employeur: []
  });

  constructor(
    protected dataUtils: JhiDataUtils,
    protected eventManager: JhiEventManager,
    protected documentUrlService: DocumentUrlService,
    protected employeurService: EmployeurService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ documentUrl }) => {
      this.updateForm(documentUrl);

      this.employeurService.query().subscribe((res: HttpResponse<IEmployeur[]>) => (this.employeurs = res.body || []));
    });
  }

  updateForm(documentUrl: IDocumentUrl): void {
    this.editForm.patchValue({
      id: documentUrl.id,
      name: documentUrl.name,
      url: documentUrl.url,
      document: documentUrl.document,
      documentContentType: documentUrl.documentContentType,
      employeur: documentUrl.employeur
    });
  }

  byteSize(base64String: string): string {
    return this.dataUtils.byteSize(base64String);
  }

  openFile(contentType: string, base64String: string): void {
    this.dataUtils.openFile(contentType, base64String);
  }

  setFileData(event: Event, field: string, isImage: boolean): void {
    this.dataUtils.loadFileToForm(event, this.editForm, field, isImage).subscribe(null, (err: JhiFileLoadError) => {
      this.eventManager.broadcast(
        new JhiEventWithContent<AlertError>('portailCssIpresApp.error', { ...err, key: 'error.file.' + err.key })
      );
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const documentUrl = this.createFromForm();
    if (documentUrl.id !== undefined) {
      this.subscribeToSaveResponse(this.documentUrlService.update(documentUrl));
    } else {
      this.subscribeToSaveResponse(this.documentUrlService.create(documentUrl));
    }
  }

  private createFromForm(): IDocumentUrl {
    return {
      ...new DocumentUrl(),
      id: this.editForm.get(['id'])!.value,
      name: this.editForm.get(['name'])!.value,
      url: this.editForm.get(['url'])!.value,
      documentContentType: this.editForm.get(['documentContentType'])!.value,
      document: this.editForm.get(['document'])!.value,
      employeur: this.editForm.get(['employeur'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IDocumentUrl>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }

  trackById(index: number, item: IEmployeur): any {
    return item.id;
  }
}
