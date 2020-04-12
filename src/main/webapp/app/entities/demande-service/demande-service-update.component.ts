import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IDemandeService, DemandeService } from 'app/shared/model/demande-service.model';
import { DemandeServiceService } from './demande-service.service';
import { IEmployeur } from 'app/shared/model/employeur.model';
import { EmployeurService } from 'app/entities/employeur/employeur.service';

@Component({
  selector: 'jhi-demande-service-update',
  templateUrl: './demande-service-update.component.html'
})
export class DemandeServiceUpdateComponent implements OnInit {
  isSaving = false;
  employeurs: IEmployeur[] = [];

  editForm = this.fb.group({
    id: [],
    typeDemande: [],
    idDossier: [],
    statutDossier: [],
    urlDocument: [],
    employeur: []
  });

  constructor(
    protected demandeServiceService: DemandeServiceService,
    protected employeurService: EmployeurService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ demandeService }) => {
      this.updateForm(demandeService);

      this.employeurService.query().subscribe((res: HttpResponse<IEmployeur[]>) => (this.employeurs = res.body || []));
    });
  }

  updateForm(demandeService: IDemandeService): void {
    this.editForm.patchValue({
      id: demandeService.id,
      typeDemande: demandeService.typeDemande,
      idDossier: demandeService.idDossier,
      statutDossier: demandeService.statutDossier,
      urlDocument: demandeService.urlDocument,
      employeur: demandeService.employeur
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const demandeService = this.createFromForm();
    if (demandeService.id !== undefined) {
      this.subscribeToSaveResponse(this.demandeServiceService.update(demandeService));
    } else {
      this.subscribeToSaveResponse(this.demandeServiceService.create(demandeService));
    }
  }

  private createFromForm(): IDemandeService {
    return {
      ...new DemandeService(),
      id: this.editForm.get(['id'])!.value,
      typeDemande: this.editForm.get(['typeDemande'])!.value,
      idDossier: this.editForm.get(['idDossier'])!.value,
      statutDossier: this.editForm.get(['statutDossier'])!.value,
      urlDocument: this.editForm.get(['urlDocument'])!.value,
      employeur: this.editForm.get(['employeur'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IDemandeService>>): void {
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
