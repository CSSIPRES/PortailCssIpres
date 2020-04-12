import { IEmployeur } from 'app/shared/model/employeur.model';

export interface IDocumentUrl {
  id?: number;
  name?: string;
  url?: string;
  documentContentType?: string;
  document?: any;
  employeur?: IEmployeur;
}

export class DocumentUrl implements IDocumentUrl {
  constructor(
    public id?: number,
    public name?: string,
    public url?: string,
    public documentContentType?: string,
    public document?: any,
    public employeur?: IEmployeur
  ) {}
}
