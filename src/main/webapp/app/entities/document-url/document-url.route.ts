import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, Routes, Router } from '@angular/router';
import { JhiResolvePagingParams } from 'ng-jhipster';
import { Observable, of, EMPTY } from 'rxjs';
import { flatMap } from 'rxjs/operators';

import { Authority } from 'app/shared/constants/authority.constants';
import { UserRouteAccessService } from 'app/core/auth/user-route-access-service';
import { IDocumentUrl, DocumentUrl } from 'app/shared/model/document-url.model';
import { DocumentUrlService } from './document-url.service';
import { DocumentUrlComponent } from './document-url.component';
import { DocumentUrlDetailComponent } from './document-url-detail.component';
import { DocumentUrlUpdateComponent } from './document-url-update.component';

@Injectable({ providedIn: 'root' })
export class DocumentUrlResolve implements Resolve<IDocumentUrl> {
  constructor(private service: DocumentUrlService, private router: Router) {}

  resolve(route: ActivatedRouteSnapshot): Observable<IDocumentUrl> | Observable<never> {
    const id = route.params['id'];
    if (id) {
      return this.service.find(id).pipe(
        flatMap((documentUrl: HttpResponse<DocumentUrl>) => {
          if (documentUrl.body) {
            return of(documentUrl.body);
          } else {
            this.router.navigate(['404']);
            return EMPTY;
          }
        })
      );
    }
    return of(new DocumentUrl());
  }
}

export const documentUrlRoute: Routes = [
  {
    path: '',
    component: DocumentUrlComponent,
    resolve: {
      pagingParams: JhiResolvePagingParams
    },
    data: {
      authorities: [Authority.USER],
      defaultSort: 'id,asc',
      pageTitle: 'portailCssIpresApp.documentUrl.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/view',
    component: DocumentUrlDetailComponent,
    resolve: {
      documentUrl: DocumentUrlResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.documentUrl.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: 'new',
    component: DocumentUrlUpdateComponent,
    resolve: {
      documentUrl: DocumentUrlResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.documentUrl.home.title'
    },
    canActivate: [UserRouteAccessService]
  },
  {
    path: ':id/edit',
    component: DocumentUrlUpdateComponent,
    resolve: {
      documentUrl: DocumentUrlResolve
    },
    data: {
      authorities: [Authority.USER],
      pageTitle: 'portailCssIpresApp.documentUrl.home.title'
    },
    canActivate: [UserRouteAccessService]
  }
];
