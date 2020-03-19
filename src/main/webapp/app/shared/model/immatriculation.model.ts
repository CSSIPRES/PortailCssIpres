import { Moment } from 'moment';
import { IUser } from 'app/core/user/user.model';
import { IEmploye } from 'app/shared/model/employe.model';
import { IDocument } from 'app/shared/model/document.model';

export interface IImmatriculation {
  id?: number;
  regType?: string;
  employerType?: string;
  typeEtablissement?: string;
  employerName?: string;
  hqId?: string;
  nineaNumber?: string;
  ninetNumber?: string;
  compagnyOriginId?: string;
  legalStatus?: string;
  taxId?: string;
  taxIdDate?: Moment;
  tradeRegisterNumber?: string;
  tradeRegisterDate?: Moment;
  dateOfInpsection?: Moment;
  dateOfFirtHire?: Moment;
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
  legalRepPerson?: string;
  lastNameRep?: string;
  firstNameRep?: string;
  birthdateRep?: Moment;
  nationalityRep?: string;
  ninRep?: string;
  placeOfBirthRep?: string;
  cityOfBirthRep?: string;
  typeOfIdentityRep?: string;
  identityIdNumberRep?: string;
  ninCedeoRep?: string;
  issuedDateRep?: string;
  expiryDateRep?: string;
  regionRep?: string;
  departmentRep?: string;
  arondissementRep?: string;
  communeRep?: string;
  qartierRep?: string;
  addressRep?: string;
  landLineNumberRep?: string;
  mobileNumberRep?: string;
  emailRep?: string;
  employerRegistrationFormId?: string;
  employeeRegistrationFormId?: string;
  processFlowId?: string;
  statutDossier?: string;
  statutImmatriculation?: boolean;
  user?: IUser;
  employes?: IEmploye[];
  documents?: IDocument[];
}

export class Immatriculation implements IImmatriculation {
  constructor(
    public id?: number,
    public regType?: string,
    public employerType?: string,
    public typeEtablissement?: string,
    public employerName?: string,
    public hqId?: string,
    public nineaNumber?: string,
    public ninetNumber?: string,
    public compagnyOriginId?: string,
    public legalStatus?: string,
    public taxId?: string,
    public taxIdDate?: Moment,
    public tradeRegisterNumber?: string,
    public tradeRegisterDate?: Moment,
    public dateOfInpsection?: Moment,
    public dateOfFirtHire?: Moment,
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
    public legalRepPerson?: string,
    public lastNameRep?: string,
    public firstNameRep?: string,
    public birthdateRep?: Moment,
    public nationalityRep?: string,
    public ninRep?: string,
    public placeOfBirthRep?: string,
    public cityOfBirthRep?: string,
    public typeOfIdentityRep?: string,
    public identityIdNumberRep?: string,
    public ninCedeoRep?: string,
    public issuedDateRep?: string,
    public expiryDateRep?: string,
    public regionRep?: string,
    public departmentRep?: string,
    public arondissementRep?: string,
    public communeRep?: string,
    public qartierRep?: string,
    public addressRep?: string,
    public landLineNumberRep?: string,
    public mobileNumberRep?: string,
    public emailRep?: string,
    public employerRegistrationFormId?: string,
    public employeeRegistrationFormId?: string,
    public processFlowId?: string,
    public statutDossier?: string,
    public statutImmatriculation?: boolean,
    public user?: IUser,
    public employes?: IEmploye[],
    public documents?: IDocument[]
  ) {
    this.statutImmatriculation = this.statutImmatriculation || false;
  }
}
