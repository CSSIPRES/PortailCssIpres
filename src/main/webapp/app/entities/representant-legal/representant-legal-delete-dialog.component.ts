import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IRepresentantLegal } from 'app/shared/model/representant-legal.model';
import { RepresentantLegalService } from './representant-legal.service';

@Component({
  templateUrl: './representant-legal-delete-dialog.component.html'
})
export class RepresentantLegalDeleteDialogComponent {
  representantLegal?: IRepresentantLegal;

  constructor(
    protected representantLegalService: RepresentantLegalService,
    public activeModal: NgbActiveModal,
    protected eventManager: JhiEventManager
  ) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.representantLegalService.delete(id).subscribe(() => {
      this.eventManager.broadcast('representantLegalListModification');
      this.activeModal.close();
    });
  }
}
