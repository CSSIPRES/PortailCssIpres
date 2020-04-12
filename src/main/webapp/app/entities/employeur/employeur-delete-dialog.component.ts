import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IEmployeur } from 'app/shared/model/employeur.model';
import { EmployeurService } from './employeur.service';

@Component({
  templateUrl: './employeur-delete-dialog.component.html'
})
export class EmployeurDeleteDialogComponent {
  employeur?: IEmployeur;

  constructor(protected employeurService: EmployeurService, public activeModal: NgbActiveModal, protected eventManager: JhiEventManager) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.employeurService.delete(id).subscribe(() => {
      this.eventManager.broadcast('employeurListModification');
      this.activeModal.close();
    });
  }
}
