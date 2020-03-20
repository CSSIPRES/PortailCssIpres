import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresSharedModule } from 'app/shared/shared.module';
import { DeclarationComponent } from './declaration.component';
import { DeclarationDetailComponent } from './declaration-detail.component';
import { DeclarationUpdateComponent } from './declaration-update.component';
import { DeclarationDeleteDialogComponent } from './declaration-delete-dialog.component';
import { declarationRoute } from './declaration.route';

@NgModule({
  imports: [PortailCssIpresSharedModule, RouterModule.forChild(declarationRoute)],
  declarations: [DeclarationComponent, DeclarationDetailComponent, DeclarationUpdateComponent, DeclarationDeleteDialogComponent],
  entryComponents: [DeclarationDeleteDialogComponent]
})
export class PortailCssIpresDeclarationModule {}
