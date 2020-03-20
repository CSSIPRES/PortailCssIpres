import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import * as moment from 'moment';

import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IImmatriculation } from 'app/shared/model/immatriculation.model';

type EntityResponseType = HttpResponse<IImmatriculation>;
type EntityArrayResponseType = HttpResponse<IImmatriculation[]>;

@Injectable({ providedIn: 'root' })
export class ImmatriculationService {
  public resourceUrl = SERVER_API_URL + 'api/immatriculations';

  constructor(protected http: HttpClient) {}

  create(immatriculation: IImmatriculation): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(immatriculation);
    return this.http
      .post<IImmatriculation>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  update(immatriculation: IImmatriculation): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(immatriculation);
    return this.http
      .put<IImmatriculation>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http
      .get<IImmatriculation>(`${this.resourceUrl}/${id}`, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http
      .get<IImmatriculation[]>(this.resourceUrl, { params: options, observe: 'response' })
      .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  protected convertDateFromClient(immatriculation: IImmatriculation): IImmatriculation {
    const copy: IImmatriculation = Object.assign({}, immatriculation, {
      taxIdDate:
        immatriculation.taxIdDate && immatriculation.taxIdDate.isValid() ? immatriculation.taxIdDate.format(DATE_FORMAT) : undefined,
      tradeRegisterDate:
        immatriculation.tradeRegisterDate && immatriculation.tradeRegisterDate.isValid()
          ? immatriculation.tradeRegisterDate.format(DATE_FORMAT)
          : undefined,
      dateOfInpsection:
        immatriculation.dateOfInpsection && immatriculation.dateOfInpsection.isValid()
          ? immatriculation.dateOfInpsection.format(DATE_FORMAT)
          : undefined,
      dateOfFirtHire:
        immatriculation.dateOfFirtHire && immatriculation.dateOfFirtHire.isValid()
          ? immatriculation.dateOfFirtHire.format(DATE_FORMAT)
          : undefined,
      birthdateRep:
        immatriculation.birthdateRep && immatriculation.birthdateRep.isValid()
          ? immatriculation.birthdateRep.format(DATE_FORMAT)
          : undefined
    });
    return copy;
  }

  protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
    if (res.body) {
      res.body.taxIdDate = res.body.taxIdDate ? moment(res.body.taxIdDate) : undefined;
      res.body.tradeRegisterDate = res.body.tradeRegisterDate ? moment(res.body.tradeRegisterDate) : undefined;
      res.body.dateOfInpsection = res.body.dateOfInpsection ? moment(res.body.dateOfInpsection) : undefined;
      res.body.dateOfFirtHire = res.body.dateOfFirtHire ? moment(res.body.dateOfFirtHire) : undefined;
      res.body.birthdateRep = res.body.birthdateRep ? moment(res.body.birthdateRep) : undefined;
    }
    return res;
  }

  protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
    if (res.body) {
      res.body.forEach((immatriculation: IImmatriculation) => {
        immatriculation.taxIdDate = immatriculation.taxIdDate ? moment(immatriculation.taxIdDate) : undefined;
        immatriculation.tradeRegisterDate = immatriculation.tradeRegisterDate ? moment(immatriculation.tradeRegisterDate) : undefined;
        immatriculation.dateOfInpsection = immatriculation.dateOfInpsection ? moment(immatriculation.dateOfInpsection) : undefined;
        immatriculation.dateOfFirtHire = immatriculation.dateOfFirtHire ? moment(immatriculation.dateOfFirtHire) : undefined;
        immatriculation.birthdateRep = immatriculation.birthdateRep ? moment(immatriculation.birthdateRep) : undefined;
      });
    }
    return res;
  }
}
