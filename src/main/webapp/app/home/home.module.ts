import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [PortailCssIpresSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class PortailCssIpresHomeModule {}
