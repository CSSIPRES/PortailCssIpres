import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JhiDataUtils } from 'ng-jhipster';

import { IDocumentUrl } from 'app/shared/model/document-url.model';

@Component({
  selector: 'jhi-document-url-detail',
  templateUrl: './document-url-detail.component.html'
})
export class DocumentUrlDetailComponent implements OnInit {
  documentUrl: IDocumentUrl | null = null;

  constructor(protected dataUtils: JhiDataUtils, protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ documentUrl }) => (this.documentUrl = documentUrl));
  }

  byteSize(base64String: string): string {
    return this.dataUtils.byteSize(base64String);
  }

  openFile(contentType: string, base64String: string): void {
    this.dataUtils.openFile(contentType, base64String);
  }

  previousState(): void {
    window.history.back();
  }
}
