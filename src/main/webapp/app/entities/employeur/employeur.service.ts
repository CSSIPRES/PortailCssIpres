import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IEmployeur } from 'app/shared/model/employeur.model';

type EntityResponseType = HttpResponse<IEmployeur>;
type EntityArrayResponseType = HttpResponse<IEmployeur[]>;

@Injectable({ providedIn: 'root' })
export class EmployeurService {
  public resourceUrl = SERVER_API_URL + 'api/employeurs';

  constructor(protected http: HttpClient) {}

  create(employeur: IEmployeur): Observable<EntityResponseType> {
    return this.http.post<IEmployeur>(this.resourceUrl, employeur, { observe: 'response' });
  }

  update(employeur: IEmployeur): Observable<EntityResponseType> {
    return this.http.put<IEmployeur>(this.resourceUrl, employeur, { observe: 'response' });
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IEmployeur>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IEmployeur[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }
}
