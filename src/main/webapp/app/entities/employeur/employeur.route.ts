import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { JhiResolvePagingParams } from 'ng-jhipster';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IEmployeur, Employeur } from 'app/shared/model/employeur.model';
import { EmployeurService } from './employeur.service';
import { EmployeurComponent } from './employeur.component';
import { EmployeurDetailComponent } from './employeur-detail.component';
import { EmployeurUpdateComponent } from './employeur-update.component';

@Injectable({ providedIn: 'root' })
export class EmployeurResolve implements Resolve<IEmployeur> {
  constructor(private service: EmployeurService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IEmployeur> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((employeur: HttpResponse<Employeur>) => {
          if (employeur.body) {
            return of(employeur.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new Employeur());
  }
}

export const employeurRoute: Routes = [
  {
    path: '',
    component: EmployeurComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'portailCssIpresApp.employeur.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: EmployeurDetailComponent,
    resolve: {
      employeur: EmployeurResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.employeur.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: EmployeurUpdateComponent,
    resolve: {
      employeur: EmployeurResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.employeur.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: EmployeurUpdateComponent,
    resolve: {
      employeur: EmployeurResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.employeur.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
