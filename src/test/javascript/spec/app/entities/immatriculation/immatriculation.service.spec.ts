import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { ImmatriculationService } from 'app/entities/immatriculation/immatriculation.service';
import { IImmatriculation, Immatriculation } from 'app/shared/model/immatriculation.model';

describe('Service Tests', () => {
  describe('Immatriculation Service', () => {
    let injector: TestBed;
    let service: ImmatriculationService;
    let httpMock: HttpTestingController;
    let elemDefault: IImmatriculation;
    let expectedResult: IImmatriculation | IImmatriculation[] | boolean | null;
    let currentDate: moment.Moment;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule]
      });
      expectedResult = null;
      injector = getTestBed();
      service = injector.get(ImmatriculationService);
      httpMock = injector.get(HttpTestingController);
      currentDate = moment();

      elemDefault = new Immatriculation(
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        currentDate,
        'AAAAAAA',
        currentDate,
        currentDate,
        currentDate,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        0,
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        false
      );
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign(
          {
            taxIdDate: currentDate.format(DATE_FORMAT),
            tradeRegisterDate: currentDate.format(DATE_FORMAT),
            dateOfInpsection: currentDate.format(DATE_FORMAT),
            dateOfFirtHire: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a Immatriculation', () => {
        const returnedFromService = Object.assign(
          {
            id: 0,
            taxIdDate: currentDate.format(DATE_FORMAT),
            tradeRegisterDate: currentDate.format(DATE_FORMAT),
            dateOfInpsection: currentDate.format(DATE_FORMAT),
            dateOfFirtHire: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            taxIdDate: currentDate,
            tradeRegisterDate: currentDate,
            dateOfInpsection: currentDate,
            dateOfFirtHire: currentDate
          },
          returnedFromService
        );

        service.create(new Immatriculation()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a Immatriculation', () => {
        const returnedFromService = Object.assign(
          {
            regType: 'BBBBBB',
            employerType: 'BBBBBB',
            typeEtablissement: 'BBBBBB',
            employerName: 'BBBBBB',
            hqId: 'BBBBBB',
            nineaNumber: 'BBBBBB',
            ninetNumber: 'BBBBBB',
            compagnyOriginId: 'BBBBBB',
            legalStatus: 'BBBBBB',
            taxId: 'BBBBBB',
            taxIdDate: currentDate.format(DATE_FORMAT),
            tradeRegisterNumber: 'BBBBBB',
            tradeRegisterDate: currentDate.format(DATE_FORMAT),
            dateOfInpsection: currentDate.format(DATE_FORMAT),
            dateOfFirtHire: currentDate.format(DATE_FORMAT),
            shortName: 'BBBBBB',
            businessSector: 'BBBBBB',
            mainLineOfBusiness: 'BBBBBB',
            noOfWorkersInGenScheme: 1,
            noOfWorkersInBasicScheme: 1,
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            postboxNo: 'BBBBBB',
            telephone: 'BBBBBB',
            email: 'BBBBBB',
            website: 'BBBBBB',
            zoneCss: 'BBBBBB',
            zoneIpres: 'BBBBBB',
            sectorCss: 'BBBBBB',
            sectorIpres: 'BBBBBB',
            agencyCss: 'BBBBBB',
            agencyIpres: 'BBBBBB',
            employerRegistrationFormId: 'BBBBBB',
            employeeRegistrationFormId: 'BBBBBB',
            processFlowId: 'BBBBBB',
            statutDossier: 'BBBBBB',
            statutImmatriculation: true
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            taxIdDate: currentDate,
            tradeRegisterDate: currentDate,
            dateOfInpsection: currentDate,
            dateOfFirtHire: currentDate
          },
          returnedFromService
        );

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of Immatriculation', () => {
        const returnedFromService = Object.assign(
          {
            regType: 'BBBBBB',
            employerType: 'BBBBBB',
            typeEtablissement: 'BBBBBB',
            employerName: 'BBBBBB',
            hqId: 'BBBBBB',
            nineaNumber: 'BBBBBB',
            ninetNumber: 'BBBBBB',
            compagnyOriginId: 'BBBBBB',
            legalStatus: 'BBBBBB',
            taxId: 'BBBBBB',
            taxIdDate: currentDate.format(DATE_FORMAT),
            tradeRegisterNumber: 'BBBBBB',
            tradeRegisterDate: currentDate.format(DATE_FORMAT),
            dateOfInpsection: currentDate.format(DATE_FORMAT),
            dateOfFirtHire: currentDate.format(DATE_FORMAT),
            shortName: 'BBBBBB',
            businessSector: 'BBBBBB',
            mainLineOfBusiness: 'BBBBBB',
            noOfWorkersInGenScheme: 1,
            noOfWorkersInBasicScheme: 1,
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            postboxNo: 'BBBBBB',
            telephone: 'BBBBBB',
            email: 'BBBBBB',
            website: 'BBBBBB',
            zoneCss: 'BBBBBB',
            zoneIpres: 'BBBBBB',
            sectorCss: 'BBBBBB',
            sectorIpres: 'BBBBBB',
            agencyCss: 'BBBBBB',
            agencyIpres: 'BBBBBB',
            employerRegistrationFormId: 'BBBBBB',
            employeeRegistrationFormId: 'BBBBBB',
            processFlowId: 'BBBBBB',
            statutDossier: 'BBBBBB',
            statutImmatriculation: true
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            taxIdDate: currentDate,
            tradeRegisterDate: currentDate,
            dateOfInpsection: currentDate,
            dateOfFirtHire: currentDate
          },
          returnedFromService
        );

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a Immatriculation', () => {
        service.delete(123).subscribe(resp => (expectedResult = resp.ok));

        const req = httpMock.expectOne({ method: 'DELETE' });
        req.flush({ status: 200 });
        expect(expectedResult);
      });
    });

    afterEach(() => {
      httpMock.verify();
    });
  });
});
