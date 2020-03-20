import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { JhiResolvePagingParams } from 'ng-jhipster';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IRepresentantLegal, RepresentantLegal } from 'app/shared/model/representant-legal.model';
import { RepresentantLegalService } from './representant-legal.service';
import { RepresentantLegalComponent } from './representant-legal.component';
import { RepresentantLegalDetailComponent } from './representant-legal-detail.component';
import { RepresentantLegalUpdateComponent } from './representant-legal-update.component';

@Injectable({ providedIn: 'root' })
export class RepresentantLegalResolve implements Resolve<IRepresentantLegal> {
  constructor(private service: RepresentantLegalService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IRepresentantLegal> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((representantLegal: HttpResponse<RepresentantLegal>) => {
          if (representantLegal.body) {
            return of(representantLegal.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new RepresentantLegal());
  }
}

export const representantLegalRoute: Routes = [
  {
    path: '',
    component: RepresentantLegalComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'portailCssIpresApp.representantLegal.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: RepresentantLegalDetailComponent,
    resolve: {
      representantLegal: RepresentantLegalResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.representantLegal.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: RepresentantLegalUpdateComponent,
    resolve: {
      representantLegal: RepresentantLegalResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.representantLegal.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: RepresentantLegalUpdateComponent,
    resolve: {
      representantLegal: RepresentantLegalResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.representantLegal.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
