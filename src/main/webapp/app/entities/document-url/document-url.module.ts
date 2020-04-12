import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresSharedModule } from 'app/shared/shared.module';
import { DocumentUrlComponent } from './document-url.component';
import { DocumentUrlDetailComponent } from './document-url-detail.component';
import { DocumentUrlUpdateComponent } from './document-url-update.component';
import { DocumentUrlDeleteDialogComponent } from './document-url-delete-dialog.component';
import { documentUrlRoute } from './document-url.route';

@NgModule({
  imports: [PortailCssIpresSharedModule, RouterModule.forChild(documentUrlRoute)],
  declarations: [DocumentUrlComponent, DocumentUrlDetailComponent, DocumentUrlUpdateComponent, DocumentUrlDeleteDialogComponent],
  entryComponents: [DocumentUrlDeleteDialogComponent]
})
export class PortailCssIpresDocumentUrlModule {}
