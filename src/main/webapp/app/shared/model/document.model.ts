import { IImmatriculation } from 'app/shared/model/immatriculation.model';

export interface IDocument {
  id?: number;
  name?: string;
  url?: string;
  documentContentType?: string;
  document?: any;
  employeur?: IImmatriculation;
}

export class Document implements IDocument {
  constructor(
    public id?: number,
    public name?: string,
    public url?: string,
    public documentContentType?: string,
    public document?: any,
    public employeur?: IImmatriculation
  ) {}
}
