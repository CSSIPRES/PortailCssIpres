import { Moment } from 'moment';

export interface IRepresentantLegal {
  id?: number;
  legalRepPerson?: string;
  lastName?: string;
  firstName?: string;
  birthdate?: Moment;
  nationality?: string;
  nin?: string;
  placeOfBirth?: string;
  cityOfBirth?: string;
  typeOfIdentity?: string;
  identityIdNumber?: string;
  ninCedeo?: string;
  issuedDate?: string;
  expiryDate?: string;
  region?: string;
  department?: string;
  arondissement?: string;
  commune?: string;
  qartier?: string;
  address?: string;
  landLineNumber?: string;
  mobileNumber?: string;
  email?: string;
}

export class RepresentantLegal implements IRepresentantLegal {
  constructor(
    public id?: number,
    public legalRepPerson?: string,
    public lastName?: string,
    public firstName?: string,
    public birthdate?: Moment,
    public nationality?: string,
    public nin?: string,
    public placeOfBirth?: string,
    public cityOfBirth?: string,
    public typeOfIdentity?: string,
    public identityIdNumber?: string,
    public ninCedeo?: string,
    public issuedDate?: string,
    public expiryDate?: string,
    public region?: string,
    public department?: string,
    public arondissement?: string,
    public commune?: string,
    public qartier?: string,
    public address?: string,
    public landLineNumber?: string,
    public mobileNumber?: string,
    public email?: string
  ) {}
}
