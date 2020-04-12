import { IEmployeur } from 'app/shared/model/employeur.model';

export interface IDemandeService {
  id?: number;
  typeDemande?: string;
  idDossier?: string;
  statutDossier?: string;
  urlDocument?: string;
  employeur?: IEmployeur;
}

export class DemandeService implements IDemandeService {
  constructor(
    public id?: number,
    public typeDemande?: string,
    public idDossier?: string,
    public statutDossier?: string,
    public urlDocument?: string,
    public employeur?: IEmployeur
  ) {}
}
