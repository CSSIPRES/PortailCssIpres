import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared/util/request-util';
import { IDocumentUrl } from 'app/shared/model/document-url.model';

type EntityResponseType = HttpResponse<IDocumentUrl>;
type EntityArrayResponseType = HttpResponse<IDocumentUrl[]>;

@Injectable({ providedIn: 'root' })
export class DocumentUrlService {
  public resourceUrl = SERVER_API_URL + 'api/document-urls';

  constructor(protected http: HttpClient) {}

  create(documentUrl: IDocumentUrl): Observable<EntityResponseType> {
    return this.http.post<IDocumentUrl>(this.resourceUrl, documentUrl, { observe: 'response' });
  }

  update(documentUrl: IDocumentUrl): Observable<EntityResponseType> {
    return this.http.put<IDocumentUrl>(this.resourceUrl, documentUrl, { observe: 'response' });
  }

  find(id: number): Observable<EntityResponseType> {
    return this.http.get<IDocumentUrl>(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }

  query(req?: any): Observable<EntityArrayResponseType> {
    const options = createRequestOption(req);
    return this.http.get<IDocumentUrl[]>(this.resourceUrl, { params: options, observe: 'response' });
  }

  delete(id: number): Observable<HttpResponse<{}>> {
    return this.http.delete(`${this.resourceUrl}/${id}`, { observe: 'response' });
  }
}
