import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresSharedModule } from 'app/shared/shared.module';
import { RepresentantLegalComponent } from './representant-legal.component';
import { RepresentantLegalDetailComponent } from './representant-legal-detail.component';
import { RepresentantLegalUpdateComponent } from './representant-legal-update.component';
import { RepresentantLegalDeleteDialogComponent } from './representant-legal-delete-dialog.component';
import { representantLegalRoute } from './representant-legal.route';

@NgModule({
  imports: [PortailCssIpresSharedModule, RouterModule.forChild(representantLegalRoute)],
  declarations: [
    RepresentantLegalComponent,
    RepresentantLegalDetailComponent,
    RepresentantLegalUpdateComponent,
    RepresentantLegalDeleteDialogComponent
  ],
  entryComponents: [RepresentantLegalDeleteDialogComponent]
})
export class PortailCssIpresRepresentantLegalModule {}
