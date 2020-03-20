import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { DeclarationService } from 'app/entities/declaration/declaration.service';
import { IDeclaration, Declaration } from 'app/shared/model/declaration.model';

describe('Service Tests', () => {
  describe('Declaration Service', () => {
    let injector: TestBed;
    let service: DeclarationService;
    let httpMock: HttpTestingController;
    let elemDefault: IDeclaration;
    let expectedResult: IDeclaration | IDeclaration[] | boolean | null;
    let currentDate: moment.Moment;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule]
      });
      expectedResult = null;
      injector = getTestBed();
      service = injector.get(DeclarationService);
      httpMock = injector.get(HttpTestingController);
      currentDate = moment();

      elemDefault = new Declaration(0, 'AAAAAAA', 'AAAAAAA', 'AAAAAAA', 'AAAAAAA', currentDate, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign(
          {
            dateDebutCotisation: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a Declaration', () => {
        const returnedFromService = Object.assign(
          {
            id: 0,
            dateDebutCotisation: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateDebutCotisation: currentDate
          },
          returnedFromService
        );

        service.create(new Declaration()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a Declaration', () => {
        const returnedFromService = Object.assign(
          {
            idIdentifiant: 'BBBBBB',
            raisonSociale: 'BBBBBB',
            adresse: 'BBBBBB',
            typeDeclaration: 'BBBBBB',
            dateDebutCotisation: currentDate.format(DATE_FORMAT),
            totalNouvSalaries: 1,
            totalSalaries: 1,
            cumulTotSalAssIpresRg: 1,
            cumulTotSalAssIpresRcc: 1,
            cumulTotSalAssCssPf: 1,
            cumulTotSalAssCssAtmp: 1,
            totalSalVerses: 1,
            mntCotPfCalcParEmployeur: 1,
            mntCotAtMpCalcParEmployeur: 1,
            mntCotRgCalcParEmployeur: 1,
            mntCotRccCalcParEmployeur: 1
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateDebutCotisation: currentDate
          },
          returnedFromService
        );

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of Declaration', () => {
        const returnedFromService = Object.assign(
          {
            idIdentifiant: 'BBBBBB',
            raisonSociale: 'BBBBBB',
            adresse: 'BBBBBB',
            typeDeclaration: 'BBBBBB',
            dateDebutCotisation: currentDate.format(DATE_FORMAT),
            totalNouvSalaries: 1,
            totalSalaries: 1,
            cumulTotSalAssIpresRg: 1,
            cumulTotSalAssIpresRcc: 1,
            cumulTotSalAssCssPf: 1,
            cumulTotSalAssCssAtmp: 1,
            totalSalVerses: 1,
            mntCotPfCalcParEmployeur: 1,
            mntCotAtMpCalcParEmployeur: 1,
            mntCotRgCalcParEmployeur: 1,
            mntCotRccCalcParEmployeur: 1
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateDebutCotisation: currentDate
          },
          returnedFromService
        );

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a Declaration', () => {
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
