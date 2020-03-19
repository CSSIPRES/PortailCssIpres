import { Moment } from 'moment';
import { IEmploye } from 'app/shared/model/employe.model';
import { IImmatriculation } from 'app/shared/model/immatriculation.model';

export interface IDeclaration {
  id?: number;
  idIdentifiant?: string;
  raisonSociale?: string;
  adresse?: string;
  typeDeclaration?: string;
  dateDebutCotisation?: Moment;
  totalNouvSalaries?: number;
  totalSalaries?: number;
  cumulTotSalAssIpresRg?: number;
  cumulTotSalAssIpresRcc?: number;
  cumulTotSalAssCssPf?: number;
  cumulTotSalAssCssAtmp?: number;
  totalSalVerses?: number;
  mntCotPfCalcParEmployeur?: number;
  mntCotAtMpCalcParEmployeur?: number;
  mntCotRgCalcParEmployeur?: number;
  mntCotRccCalcParEmployeur?: number;
  employes?: IEmploye[];
  employeur?: IImmatriculation;
}

export class Declaration implements IDeclaration {
  constructor(
    public id?: number,
    public idIdentifiant?: string,
    public raisonSociale?: string,
    public adresse?: string,
    public typeDeclaration?: string,
    public dateDebutCotisation?: Moment,
    public totalNouvSalaries?: number,
    public totalSalaries?: number,
    public cumulTotSalAssIpresRg?: number,
    public cumulTotSalAssIpresRcc?: number,
    public cumulTotSalAssCssPf?: number,
    public cumulTotSalAssCssAtmp?: number,
    public totalSalVerses?: number,
    public mntCotPfCalcParEmployeur?: number,
    public mntCotAtMpCalcParEmployeur?: number,
    public mntCotRgCalcParEmployeur?: number,
    public mntCotRccCalcParEmployeur?: number,
    public employes?: IEmploye[],
    public employeur?: IImmatriculation
  ) {}
}
