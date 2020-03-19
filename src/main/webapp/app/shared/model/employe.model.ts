import { Moment } from 'moment';
import { IDeclaration } from 'app/shared/model/declaration.model';
import { IImmatriculation } from 'app/shared/model/immatriculation.model';

export interface IEmploye {
  id?: number;
  rechercheEmploye?: string;
  nomEmploye?: string;
  prenomEmploye?: string;
  sexe?: string;
  etatCivil?: string;
  dateNaissance?: Moment;
  numRegNaiss?: string;
  nomPere?: string;
  prenomPere?: string;
  nomMere?: string;
  prenomMere?: string;
  nationalite?: string;
  typePieceIdentite?: string;
  nin?: string;
  ninCedeao?: string;
  numPieceIdentite?: string;
  delivreLe?: string;
  lieuDelivrance?: string;
  expireLe?: string;
  villeNaissance?: string;
  paysNaissance?: string;
  employeurPrec?: string;
  pays?: string;
  region?: string;
  department?: string;
  arondissement?: string;
  commune?: string;
  qartier?: string;
  address?: string;
  boitePostale?: string;
  typeMouvement?: string;
  natureContrat?: string;
  dateDebutContrat?: Moment;
  dateFinContrat?: Moment;
  profession?: string;
  emploi?: string;
  nonCadre?: string;
  ouiCadre?: string;
  conventionApplicable?: string;
  salaireContractuel?: number;
  tempsTravail?: number;
  categorie?: string;
  motifSortie?: string;
  totSalAssCssPf1?: number;
  totSalAssCssAtmp1?: number;
  totSalAssIpresRg1?: number;
  totSalAssIpresRcc1?: number;
  salaireBrut1?: number;
  nombreJours1?: number;
  nombreHeures1?: number;
  tempsTravail1?: string;
  trancheTravail1?: string;
  regimeGeneral1?: string;
  regimCompCadre1?: string;
  dateEffetRegimeCadre1?: Moment;
  totSalAssCssPf2?: number;
  totSalAssCssAtmp2?: number;
  totSalAssIpresRg2?: number;
  totSalAssIpresRcc2?: number;
  salaireBrut2?: number;
  nombreJours2?: number;
  nombreHeures2?: number;
  tempsTravail2?: string;
  trancheTravail2?: string;
  regimeGeneral2?: string;
  regimCompCadre2?: string;
  dateEffetRegimeCadre2?: Moment;
  totSalAssCssPf3?: number;
  totSalAssCssAtmp3?: number;
  totSalAssIpresRg3?: number;
  totSalAssIpresRcc3?: number;
  salaireBrut3?: number;
  nombreJours3?: number;
  nombreHeures3?: number;
  tempsTravail3?: string;
  trancheTravail3?: string;
  regimeGeneral3?: string;
  regimCompCadre3?: string;
  dateEffetRegimeCadre3?: Moment;
  declaration?: IDeclaration;
  employeur?: IImmatriculation;
}

export class Employe implements IEmploye {
  constructor(
    public id?: number,
    public rechercheEmploye?: string,
    public nomEmploye?: string,
    public prenomEmploye?: string,
    public sexe?: string,
    public etatCivil?: string,
    public dateNaissance?: Moment,
    public numRegNaiss?: string,
    public nomPere?: string,
    public prenomPere?: string,
    public nomMere?: string,
    public prenomMere?: string,
    public nationalite?: string,
    public typePieceIdentite?: string,
    public nin?: string,
    public ninCedeao?: string,
    public numPieceIdentite?: string,
    public delivreLe?: string,
    public lieuDelivrance?: string,
    public expireLe?: string,
    public villeNaissance?: string,
    public paysNaissance?: string,
    public employeurPrec?: string,
    public pays?: string,
    public region?: string,
    public department?: string,
    public arondissement?: string,
    public commune?: string,
    public qartier?: string,
    public address?: string,
    public boitePostale?: string,
    public typeMouvement?: string,
    public natureContrat?: string,
    public dateDebutContrat?: Moment,
    public dateFinContrat?: Moment,
    public profession?: string,
    public emploi?: string,
    public nonCadre?: string,
    public ouiCadre?: string,
    public conventionApplicable?: string,
    public salaireContractuel?: number,
    public tempsTravail?: number,
    public categorie?: string,
    public motifSortie?: string,
    public totSalAssCssPf1?: number,
    public totSalAssCssAtmp1?: number,
    public totSalAssIpresRg1?: number,
    public totSalAssIpresRcc1?: number,
    public salaireBrut1?: number,
    public nombreJours1?: number,
    public nombreHeures1?: number,
    public tempsTravail1?: string,
    public trancheTravail1?: string,
    public regimeGeneral1?: string,
    public regimCompCadre1?: string,
    public dateEffetRegimeCadre1?: Moment,
    public totSalAssCssPf2?: number,
    public totSalAssCssAtmp2?: number,
    public totSalAssIpresRg2?: number,
    public totSalAssIpresRcc2?: number,
    public salaireBrut2?: number,
    public nombreJours2?: number,
    public nombreHeures2?: number,
    public tempsTravail2?: string,
    public trancheTravail2?: string,
    public regimeGeneral2?: string,
    public regimCompCadre2?: string,
    public dateEffetRegimeCadre2?: Moment,
    public totSalAssCssPf3?: number,
    public totSalAssCssAtmp3?: number,
    public totSalAssIpresRg3?: number,
    public totSalAssIpresRcc3?: number,
    public salaireBrut3?: number,
    public nombreJours3?: number,
    public nombreHeures3?: number,
    public tempsTravail3?: string,
    public trancheTravail3?: string,
    public regimeGeneral3?: string,
    public regimCompCadre3?: string,
    public dateEffetRegimeCadre3?: Moment,
    public declaration?: IDeclaration,
    public employeur?: IImmatriculation
  ) {}
}
