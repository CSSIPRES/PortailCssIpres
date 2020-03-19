import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { RepresentantLegalService } from 'app/entities/representant-legal/representant-legal.service';
import { IRepresentantLegal, RepresentantLegal } from 'app/shared/model/representant-legal.model';

describe('Service Tests', () => {
  describe('RepresentantLegal Service', () => {
    let injector: TestBed;
    let service: RepresentantLegalService;
    let httpMock: HttpTestingController;
    let elemDefault: IRepresentantLegal;
    let expectedResult: IRepresentantLegal | IRepresentantLegal[] | boolean | null;
    let currentDate: moment.Moment;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule]
      });
      expectedResult = null;
      injector = getTestBed();
      service = injector.get(RepresentantLegalService);
      httpMock = injector.get(HttpTestingController);
      currentDate = moment();

      elemDefault = new RepresentantLegal(
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        currentDate,
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
        'AAAAAAA'
      );
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign(
          {
            birthdate: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a RepresentantLegal', () => {
        const returnedFromService = Object.assign(
          {
            id: 0,
            birthdate: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            birthdate: currentDate
          },
          returnedFromService
        );

        service.create(new RepresentantLegal()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a RepresentantLegal', () => {
        const returnedFromService = Object.assign(
          {
            legalRepPerson: 'BBBBBB',
            lastName: 'BBBBBB',
            firstName: 'BBBBBB',
            birthdate: currentDate.format(DATE_FORMAT),
            nationality: 'BBBBBB',
            nin: 'BBBBBB',
            placeOfBirth: 'BBBBBB',
            cityOfBirth: 'BBBBBB',
            typeOfIdentity: 'BBBBBB',
            identityIdNumber: 'BBBBBB',
            ninCedeo: 'BBBBBB',
            issuedDate: 'BBBBBB',
            expiryDate: 'BBBBBB',
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            landLineNumber: 'BBBBBB',
            mobileNumber: 'BBBBBB',
            email: 'BBBBBB'
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            birthdate: currentDate
          },
          returnedFromService
        );

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of RepresentantLegal', () => {
        const returnedFromService = Object.assign(
          {
            legalRepPerson: 'BBBBBB',
            lastName: 'BBBBBB',
            firstName: 'BBBBBB',
            birthdate: currentDate.format(DATE_FORMAT),
            nationality: 'BBBBBB',
            nin: 'BBBBBB',
            placeOfBirth: 'BBBBBB',
            cityOfBirth: 'BBBBBB',
            typeOfIdentity: 'BBBBBB',
            identityIdNumber: 'BBBBBB',
            ninCedeo: 'BBBBBB',
            issuedDate: 'BBBBBB',
            expiryDate: 'BBBBBB',
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            landLineNumber: 'BBBBBB',
            mobileNumber: 'BBBBBB',
            email: 'BBBBBB'
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            birthdate: currentDate
          },
          returnedFromService
        );

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a RepresentantLegal', () => {
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
