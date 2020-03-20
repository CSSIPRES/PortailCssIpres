import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IDeclaration } from 'app/shared/model/declaration.model';
import { DeclarationService } from './declaration.service';

@Component({
  templateUrl: './declaration-delete-dialog.component.html'
})
export class DeclarationDeleteDialogComponent {
  declaration?: IDeclaration;

  constructor(
    protected declarationService: DeclarationService,
    public activeModal: NgbActiveModal,
    protected eventManager: JhiEventManager
  ) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.declarationService.delete(id).subscribe(() => {
      this.eventManager.broadcast('declarationListModification');
      this.activeModal.close();
    });
  }
}
