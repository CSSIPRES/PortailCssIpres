import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IDocumentUrl } from 'app/shared/model/document-url.model';
import { DocumentUrlService } from './document-url.service';

@Component({
  templateUrl: './document-url-delete-dialog.component.html'
})
export class DocumentUrlDeleteDialogComponent {
  documentUrl?: IDocumentUrl;

  constructor(
    protected documentUrlService: DocumentUrlService,
    public activeModal: NgbActiveModal,
    protected eventManager: JhiEventManager
  ) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.documentUrlService.delete(id).subscribe(() => {
      this.eventManager.broadcast('documentUrlListModification');
      this.activeModal.close();
    });
  }
}
