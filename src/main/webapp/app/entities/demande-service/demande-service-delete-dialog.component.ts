import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IDemandeService } from 'app/shared/model/demande-service.model';
import { DemandeServiceService } from './demande-service.service';

@Component({
  templateUrl: './demande-service-delete-dialog.component.html'
})
export class DemandeServiceDeleteDialogComponent {
  demandeService?: IDemandeService;

  constructor(
    protected demandeServiceService: DemandeServiceService,
    public activeModal: NgbActiveModal,
    protected eventManager: JhiEventManager
  ) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.demandeServiceService.delete(id).subscribe(() => {
      this.eventManager.broadcast('demandeServiceListModification');
      this.activeModal.close();
    });
  }
}
