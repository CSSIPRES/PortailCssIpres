import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresSharedModule } from 'app/shared/shared.module';
import { ImmatriculationComponent } from './immatriculation.component';
import { ImmatriculationDetailComponent } from './immatriculation-detail.component';
import { ImmatriculationUpdateComponent } from './immatriculation-update.component';
import { ImmatriculationDeleteDialogComponent } from './immatriculation-delete-dialog.component';
import { immatriculationRoute } from './immatriculation.route';

@NgModule({
  imports: [PortailCssIpresSharedModule, RouterModule.forChild(immatriculationRoute)],
  declarations: [
    ImmatriculationComponent,
    ImmatriculationDetailComponent,
    ImmatriculationUpdateComponent,
    ImmatriculationDeleteDialogComponent
  ],
  entryComponents: [ImmatriculationDeleteDialogComponent]
})
export class PortailCssIpresImmatriculationModule {}
