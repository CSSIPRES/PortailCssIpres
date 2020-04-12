import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IDemandeService } from 'app/shared/model/demande-service.model';

type EntityResponseType = HttpResponse<IDemandeService>;
type EntityArrayResponseType = HttpResponse<IDemandeService[]>;

@Injectable({ providedIn: 'root' })
export class DemandeServiceService {
  public resourceUrl = SERVER_API_URL + 'api/demande-services';

  constructor(protected http: HttpClient) {}

  create(demandeService: IDemandeService): Observable<EntityResponseType> {
    return this.http.post<IDemandeService>(this.resourceUrl, demandeService, { observe: 'response' });
  }

  update(demandeService: IDemandeService): Observable<EntityResponseType> {
    return this.http.put<IDemandeService>(this.resourceUrl, demandeService, { observe: 'response' });
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IDemandeService>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IDemandeService[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }
}
