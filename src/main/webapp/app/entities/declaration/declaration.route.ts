import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { JhiResolvePagingParams } from 'ng-jhipster';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IDeclaration, Declaration } from 'app/shared/model/declaration.model';
import { DeclarationService } from './declaration.service';
import { DeclarationComponent } from './declaration.component';
import { DeclarationDetailComponent } from './declaration-detail.component';
import { DeclarationUpdateComponent } from './declaration-update.component';

@Injectable({ providedIn: 'root' })
export class DeclarationResolve implements Resolve<IDeclaration> {
  constructor(private service: DeclarationService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IDeclaration> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((declaration: HttpResponse<Declaration>) => {
          if (declaration.body) {
            return of(declaration.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new Declaration());
  }
}

export const declarationRoute: Routes = [
  {
    path: '',
    component: DeclarationComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'portailCssIpresApp.declaration.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: DeclarationDetailComponent,
    resolve: {
      declaration: DeclarationResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.declaration.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: DeclarationUpdateComponent,
    resolve: {
      declaration: DeclarationResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.declaration.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: DeclarationUpdateComponent,
    resolve: {
      declaration: DeclarationResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.declaration.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
