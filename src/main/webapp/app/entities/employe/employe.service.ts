import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import * as moment from 'moment';

import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IEmploye } from 'app/shared/model/employe.model';

type EntityResponseType = HttpResponse<IEmploye>;
type EntityArrayResponseType = HttpResponse<IEmploye[]>;

@Injectable({ providedIn: 'root' })
export class EmployeService {
  public resourceUrl = SERVER_API_URL + 'api/employes';

  constructor(protected http: HttpClient) {}

  create(employe: IEmploye): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(employe);
    return this.http
      .post<IEmploye>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  update(employe: IEmploye): Observable<EntityResponseType> {
    const copy = this.convertDateFromClient(employe);
    return this.http
      .put<IEmploye>(this.resourceUrl, copy, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http
      .get<IEmploye>(`${this.resourceUrl}/${id}`, { observe: 'response' })
      .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http
      .get<IEmploye[]>(this.resourceUrl, { params: options, observe: 'response' })
      .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  protected convertDateFromClient(employe: IEmploye): IEmploye {
    const copy: IEmploye = Object.assign({}, employe, {
      dateNaissance: employe.dateNaissance && employe.dateNaissance.isValid() ? employe.dateNaissance.format(DATE_FORMAT) : undefined,
      dateDebutContrat:
        employe.dateDebutContrat && employe.dateDebutContrat.isValid() ? employe.dateDebutContrat.format(DATE_FORMAT) : undefined,
      dateFinContrat: employe.dateFinContrat && employe.dateFinContrat.isValid() ? employe.dateFinContrat.format(DATE_FORMAT) : undefined,
      dateEffetRegimeCadre1:
        employe.dateEffetRegimeCadre1 && employe.dateEffetRegimeCadre1.isValid()
          ? employe.dateEffetRegimeCadre1.format(DATE_FORMAT)
          : undefined,
      dateEffetRegimeCadre2:
        employe.dateEffetRegimeCadre2 && employe.dateEffetRegimeCadre2.isValid()
          ? employe.dateEffetRegimeCadre2.format(DATE_FORMAT)
          : undefined,
      dateEffetRegimeCadre3:
        employe.dateEffetRegimeCadre3 && employe.dateEffetRegimeCadre3.isValid()
          ? employe.dateEffetRegimeCadre3.format(DATE_FORMAT)
          : undefined
    });
    return copy;
  }

  protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
    if (res.body) {
      res.body.dateNaissance = res.body.dateNaissance ? moment(res.body.dateNaissance) : undefined;
      res.body.dateDebutContrat = res.body.dateDebutContrat ? moment(res.body.dateDebutContrat) : undefined;
      res.body.dateFinContrat = res.body.dateFinContrat ? moment(res.body.dateFinContrat) : undefined;
      res.body.dateEffetRegimeCadre1 = res.body.dateEffetRegimeCadre1 ? moment(res.body.dateEffetRegimeCadre1) : undefined;
      res.body.dateEffetRegimeCadre2 = res.body.dateEffetRegimeCadre2 ? moment(res.body.dateEffetRegimeCadre2) : undefined;
      res.body.dateEffetRegimeCadre3 = res.body.dateEffetRegimeCadre3 ? moment(res.body.dateEffetRegimeCadre3) : undefined;
    }
    return res;
  }

  protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
    if (res.body) {
      res.body.forEach((employe: IEmploye) => {
        employe.dateNaissance = employe.dateNaissance ? moment(employe.dateNaissance) : undefined;
        employe.dateDebutContrat = employe.dateDebutContrat ? moment(employe.dateDebutContrat) : undefined;
        employe.dateFinContrat = employe.dateFinContrat ? moment(employe.dateFinContrat) : undefined;
        employe.dateEffetRegimeCadre1 = employe.dateEffetRegimeCadre1 ? moment(employe.dateEffetRegimeCadre1) : undefined;
        employe.dateEffetRegimeCadre2 = employe.dateEffetRegimeCadre2 ? moment(employe.dateEffetRegimeCadre2) : undefined;
        employe.dateEffetRegimeCadre3 = employe.dateEffetRegimeCadre3 ? moment(employe.dateEffetRegimeCadre3) : undefined;
      });
    }
    return res;
  }
}
