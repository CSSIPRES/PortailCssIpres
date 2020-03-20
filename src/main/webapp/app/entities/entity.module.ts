import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'immatriculation',
        loadChildren: () => import('./immatriculation/immatriculation.module').then(m => m.PortailCssIpresImmatriculationModule)
      },
      {
        path: 'document',
        loadChildren: () => import('./document/document.module').then(m => m.PortailCssIpresDocumentModule)
      },
      {
        path: 'representant-legal',
        loadChildren: () => import('./representant-legal/representant-legal.module').then(m => m.PortailCssIpresRepresentantLegalModule)
      },
      {
        path: 'employe',
        loadChildren: () => import('./employe/employe.module').then(m => m.PortailCssIpresEmployeModule)
      },
      {
        path: 'declaration',
        loadChildren: () => import('./declaration/declaration.module').then(m => m.PortailCssIpresDeclarationModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class PortailCssIpresEntityModule {}
