import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import * as moment from 'moment';

import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IRepresentantLegal } from 'app/shared/model/representant-legal.model';

type EntityResponseType = HttpResponse<IRepresentantLegal>;
type EntityArrayResponseType = HttpResponse<IRepresentantLegal[]>;

@Injectable({ providedIn: 'root' })
export class RepresentantLegalService {
  public resourceUrl = SERVER_API_URL + 'api/representant-legals';

  constructor(protected http: HttpClient) {}

  create(representantLegal: IRepresentantLegal): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(representantLegal);
    return this.http
      .post<IRepresentantLegal>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  update(representantLegal: IRepresentantLegal): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(representantLegal);
    return this.http
      .put<IRepresentantLegal>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http
      .get<IRepresentantLegal>(`${this.resourceUrl}/${id}`, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http
      .get<IRepresentantLegal[]>(this.resourceUrl, { params: options, observe: 'response' })
      .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  protected convertDateFromClient(representantLegal: IRepresentantLegal): IRepresentantLegal {
    const copy: IRepresentantLegal = Object.assign({}, representantLegal, {
      birthdate:
        representantLegal.birthdate && representantLegal.birthdate.isValid() ? representantLegal.birthdate.format(DATE_FORMAT) : undefined
    });
    return copy;
  }

  protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
    if (res.body) {
      res.body.birthdate = res.body.birthdate ? moment(res.body.birthdate) : undefined;
    }
    return res;
  }

  protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
    if (res.body) {
      res.body.forEach((representantLegal: IRepresentantLegal) => {
        representantLegal.birthdate = representantLegal.birthdate ? moment(representantLegal.birthdate) : undefined;
      });
    }
    return res;
  }
}
