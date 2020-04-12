import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { JhiResolvePagingParams } from 'ng-jhipster';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IDemandeService, DemandeService } from 'app/shared/model/demande-service.model';
import { DemandeServiceService } from './demande-service.service';
import { DemandeServiceComponent } from './demande-service.component';
import { DemandeServiceDetailComponent } from './demande-service-detail.component';
import { DemandeServiceUpdateComponent } from './demande-service-update.component';

@Injectable({ providedIn: 'root' })
export class DemandeServiceResolve implements Resolve<IDemandeService> {
  constructor(private service: DemandeServiceService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IDemandeService> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((demandeService: HttpResponse<DemandeService>) => {
          if (demandeService.body) {
            return of(demandeService.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new DemandeService());
  }
}

export const demandeServiceRoute: Routes = [
  {
    path: '',
    component: DemandeServiceComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'portailCssIpresApp.demandeService.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: DemandeServiceDetailComponent,
    resolve: {
      demandeService: DemandeServiceResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.demandeService.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: DemandeServiceUpdateComponent,
    resolve: {
      demandeService: DemandeServiceResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.demandeService.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: DemandeServiceUpdateComponent,
    resolve: {
      demandeService: DemandeServiceResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.demandeService.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
