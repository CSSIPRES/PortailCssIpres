import { IDemandeService } from 'app/shared/model/demande-service.model';
import { IDocumentUrl } from 'app/shared/model/document-url.model';
import { IUser } from 'app/core/user/user.model';

export interface IEmployeur {
  id?: number;
  employerType?: string;
  typeEtablissement?: string;
  raisonSociale?: string;
  maisonMere?: string;
  prenom?: string;
  nom?: string;
  typeIdentifiant?: string;
  numeroIdentifiant?: string;
  legalStatus?: string;
  shortName?: string;
  businessSector?: string;
  mainLineOfBusiness?: string;
  noOfWorkersInGenScheme?: number;
  noOfWorkersInBasicScheme?: number;
  region?: string;
  department?: string;
  arondissement?: string;
  commune?: string;
  qartier?: string;
  address?: string;
  postboxNo?: string;
  telephone?: string;
  email?: string;
  website?: string;
  zoneCss?: string;
  zoneIpres?: string;
  sectorCss?: string;
  sectorIpres?: string;
  agencyCss?: string;
  agencyIpres?: string;
  processFlowId?: string;
  statutDossier?: string;
  statutImmatriculation?: boolean;
  idDossiers?: IDemandeService[];
  documents?: IDocumentUrl[];
  user?: IUser;
}

export class Employeur implements IEmployeur {
  constructor(
    public id?: number,
    public employerType?: string,
    public typeEtablissement?: string,
    public raisonSociale?: string,
    public maisonMere?: string,
    public prenom?: string,
    public nom?: string,
    public typeIdentifiant?: string,
    public numeroIdentifiant?: string,
    public legalStatus?: string,
    public shortName?: string,
    public businessSector?: string,
    public mainLineOfBusiness?: string,
    public noOfWorkersInGenScheme?: number,
    public noOfWorkersInBasicScheme?: number,
    public region?: string,
    public department?: string,
    public arondissement?: string,
    public commune?: string,
    public qartier?: string,
    public address?: string,
    public postboxNo?: string,
    public telephone?: string,
    public email?: string,
    public website?: string,
    public zoneCss?: string,
    public zoneIpres?: string,
    public sectorCss?: string,
    public sectorIpres?: string,
    public agencyCss?: string,
    public agencyIpres?: string,
    public processFlowId?: string,
    public statutDossier?: string,
    public statutImmatriculation?: boolean,
    public idDossiers?: IDemandeService[],
    public documents?: IDocumentUrl[],
    public user?: IUser
  ) {
    this.statutImmatriculation = this.statutImmatriculation || false;
  }
}
