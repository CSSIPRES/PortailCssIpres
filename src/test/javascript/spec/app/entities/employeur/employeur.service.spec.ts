import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { EmployeurService } from 'app/entities/employeur/employeur.service';
import { IEmployeur, Employeur } from 'app/shared/model/employeur.model';

describe('Service Tests', () => {
  describe('Employeur Service', () => {
    let injector: TestBed;
    let service: EmployeurService;
    let httpMock: HttpTestingController;
    let elemDefault: IEmployeur;
    let expectedResult: IEmployeur | IEmployeur[] | boolean | null;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule]
      });
      expectedResult = null;
      injector = getTestBed();
      service = injector.get(EmployeurService);
      httpMock = injector.get(HttpTestingController);

      elemDefault = new Employeur(
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
        false
      );
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign({}, elemDefault);

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a Employeur', () => {
        const returnedFromService = Object.assign(
          {
            id: 0
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.create(new Employeur()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a Employeur', () => {
        const returnedFromService = Object.assign(
          {
            employerType: 'BBBBBB',
            typeEtablissement: 'BBBBBB',
            raisonSociale: 'BBBBBB',
            maisonMere: 'BBBBBB',
            prenom: 'BBBBBB',
            nom: 'BBBBBB',
            typeIdentifiant: 'BBBBBB',
            numeroIdentifiant: 'BBBBBB',
            legalStatus: 'BBBBBB',
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
            processFlowId: 'BBBBBB',
            statutDossier: 'BBBBBB',
            statutImmatriculation: true
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of Employeur', () => {
        const returnedFromService = Object.assign(
          {
            employerType: 'BBBBBB',
            typeEtablissement: 'BBBBBB',
            raisonSociale: 'BBBBBB',
            maisonMere: 'BBBBBB',
            prenom: 'BBBBBB',
            nom: 'BBBBBB',
            typeIdentifiant: 'BBBBBB',
            numeroIdentifiant: 'BBBBBB',
            legalStatus: 'BBBBBB',
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
            processFlowId: 'BBBBBB',
            statutDossier: 'BBBBBB',
            statutImmatriculation: true
          },
          elemDefault
        );

        const expected = Object.assign({}, returnedFromService);

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a Employeur', () => {
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
