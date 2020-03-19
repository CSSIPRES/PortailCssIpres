import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { EmployeService } from 'app/entities/employe/employe.service';
import { IEmploye, Employe } from 'app/shared/model/employe.model';

describe('Service Tests', () => {
  describe('Employe Service', () => {
    let injector: TestBed;
    let service: EmployeService;
    let httpMock: HttpTestingController;
    let elemDefault: IEmploye;
    let expectedResult: IEmploye | IEmploye[] | boolean | null;
    let currentDate: moment.Moment;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule]
      });
      expectedResult = null;
      injector = getTestBed();
      service = injector.get(EmployeService);
      httpMock = injector.get(HttpTestingController);
      currentDate = moment();

      elemDefault = new Employe(
        0,
        'AAAAAAA',
        'AAAAAAA',
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
        currentDate,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        0,
        0,
        'AAAAAAA',
        'AAAAAAA',
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        currentDate,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        currentDate,
        0,
        0,
        0,
        0,
        0,
        0,
        0,
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        'AAAAAAA',
        currentDate
      );
    });

    describe('Service methods', () => {
      it('should find an element', () => {
        const returnedFromService = Object.assign(
          {
            dateNaissance: currentDate.format(DATE_FORMAT),
            dateDebutContrat: currentDate.format(DATE_FORMAT),
            dateFinContrat: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre1: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre2: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre3: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        service.find(123).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(elemDefault);
      });

      it('should create a Employe', () => {
        const returnedFromService = Object.assign(
          {
            id: 0,
            dateNaissance: currentDate.format(DATE_FORMAT),
            dateDebutContrat: currentDate.format(DATE_FORMAT),
            dateFinContrat: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre1: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre2: currentDate.format(DATE_FORMAT),
            dateEffetRegimeCadre3: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateNaissance: currentDate,
            dateDebutContrat: currentDate,
            dateFinContrat: currentDate,
            dateEffetRegimeCadre1: currentDate,
            dateEffetRegimeCadre2: currentDate,
            dateEffetRegimeCadre3: currentDate
          },
          returnedFromService
        );

        service.create(new Employe()).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'POST' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should update a Employe', () => {
        const returnedFromService = Object.assign(
          {
            rechercheEmploye: 'BBBBBB',
            nomEmploye: 'BBBBBB',
            prenomEmploye: 'BBBBBB',
            sexe: 'BBBBBB',
            etatCivil: 'BBBBBB',
            dateNaissance: currentDate.format(DATE_FORMAT),
            numRegNaiss: 'BBBBBB',
            nomPere: 'BBBBBB',
            prenomPere: 'BBBBBB',
            nomMere: 'BBBBBB',
            prenomMere: 'BBBBBB',
            nationalite: 'BBBBBB',
            typePieceIdentite: 'BBBBBB',
            nin: 'BBBBBB',
            ninCedeao: 'BBBBBB',
            numPieceIdentite: 'BBBBBB',
            delivreLe: 'BBBBBB',
            lieuDelivrance: 'BBBBBB',
            expireLe: 'BBBBBB',
            villeNaissance: 'BBBBBB',
            paysNaissance: 'BBBBBB',
            employeurPrec: 'BBBBBB',
            pays: 'BBBBBB',
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            boitePostale: 'BBBBBB',
            typeMouvement: 'BBBBBB',
            natureContrat: 'BBBBBB',
            dateDebutContrat: currentDate.format(DATE_FORMAT),
            dateFinContrat: currentDate.format(DATE_FORMAT),
            profession: 'BBBBBB',
            emploi: 'BBBBBB',
            nonCadre: 'BBBBBB',
            ouiCadre: 'BBBBBB',
            conventionApplicable: 'BBBBBB',
            salaireContractuel: 1,
            tempsTravail: 1,
            categorie: 'BBBBBB',
            motifSortie: 'BBBBBB',
            totSalAssCssPf1: 1,
            totSalAssCssAtmp1: 1,
            totSalAssIpresRg1: 1,
            totSalAssIpresRcc1: 1,
            salaireBrut1: 1,
            nombreJours1: 1,
            nombreHeures1: 1,
            tempsTravail1: 'BBBBBB',
            trancheTravail1: 'BBBBBB',
            regimeGeneral1: 'BBBBBB',
            regimCompCadre1: 'BBBBBB',
            dateEffetRegimeCadre1: currentDate.format(DATE_FORMAT),
            totSalAssCssPf2: 1,
            totSalAssCssAtmp2: 1,
            totSalAssIpresRg2: 1,
            totSalAssIpresRcc2: 1,
            salaireBrut2: 1,
            nombreJours2: 1,
            nombreHeures2: 1,
            tempsTravail2: 'BBBBBB',
            trancheTravail2: 'BBBBBB',
            regimeGeneral2: 'BBBBBB',
            regimCompCadre2: 'BBBBBB',
            dateEffetRegimeCadre2: currentDate.format(DATE_FORMAT),
            totSalAssCssPf3: 1,
            totSalAssCssAtmp3: 1,
            totSalAssIpresRg3: 1,
            totSalAssIpresRcc3: 1,
            salaireBrut3: 1,
            nombreJours3: 1,
            nombreHeures3: 1,
            tempsTravail3: 'BBBBBB',
            trancheTravail3: 'BBBBBB',
            regimeGeneral3: 'BBBBBB',
            regimCompCadre3: 'BBBBBB',
            dateEffetRegimeCadre3: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateNaissance: currentDate,
            dateDebutContrat: currentDate,
            dateFinContrat: currentDate,
            dateEffetRegimeCadre1: currentDate,
            dateEffetRegimeCadre2: currentDate,
            dateEffetRegimeCadre3: currentDate
          },
          returnedFromService
        );

        service.update(expected).subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'PUT' });
        req.flush(returnedFromService);
        expect(expectedResult).toMatchObject(expected);
      });

      it('should return a list of Employe', () => {
        const returnedFromService = Object.assign(
          {
            rechercheEmploye: 'BBBBBB',
            nomEmploye: 'BBBBBB',
            prenomEmploye: 'BBBBBB',
            sexe: 'BBBBBB',
            etatCivil: 'BBBBBB',
            dateNaissance: currentDate.format(DATE_FORMAT),
            numRegNaiss: 'BBBBBB',
            nomPere: 'BBBBBB',
            prenomPere: 'BBBBBB',
            nomMere: 'BBBBBB',
            prenomMere: 'BBBBBB',
            nationalite: 'BBBBBB',
            typePieceIdentite: 'BBBBBB',
            nin: 'BBBBBB',
            ninCedeao: 'BBBBBB',
            numPieceIdentite: 'BBBBBB',
            delivreLe: 'BBBBBB',
            lieuDelivrance: 'BBBBBB',
            expireLe: 'BBBBBB',
            villeNaissance: 'BBBBBB',
            paysNaissance: 'BBBBBB',
            employeurPrec: 'BBBBBB',
            pays: 'BBBBBB',
            region: 'BBBBBB',
            department: 'BBBBBB',
            arondissement: 'BBBBBB',
            commune: 'BBBBBB',
            qartier: 'BBBBBB',
            address: 'BBBBBB',
            boitePostale: 'BBBBBB',
            typeMouvement: 'BBBBBB',
            natureContrat: 'BBBBBB',
            dateDebutContrat: currentDate.format(DATE_FORMAT),
            dateFinContrat: currentDate.format(DATE_FORMAT),
            profession: 'BBBBBB',
            emploi: 'BBBBBB',
            nonCadre: 'BBBBBB',
            ouiCadre: 'BBBBBB',
            conventionApplicable: 'BBBBBB',
            salaireContractuel: 1,
            tempsTravail: 1,
            categorie: 'BBBBBB',
            motifSortie: 'BBBBBB',
            totSalAssCssPf1: 1,
            totSalAssCssAtmp1: 1,
            totSalAssIpresRg1: 1,
            totSalAssIpresRcc1: 1,
            salaireBrut1: 1,
            nombreJours1: 1,
            nombreHeures1: 1,
            tempsTravail1: 'BBBBBB',
            trancheTravail1: 'BBBBBB',
            regimeGeneral1: 'BBBBBB',
            regimCompCadre1: 'BBBBBB',
            dateEffetRegimeCadre1: currentDate.format(DATE_FORMAT),
            totSalAssCssPf2: 1,
            totSalAssCssAtmp2: 1,
            totSalAssIpresRg2: 1,
            totSalAssIpresRcc2: 1,
            salaireBrut2: 1,
            nombreJours2: 1,
            nombreHeures2: 1,
            tempsTravail2: 'BBBBBB',
            trancheTravail2: 'BBBBBB',
            regimeGeneral2: 'BBBBBB',
            regimCompCadre2: 'BBBBBB',
            dateEffetRegimeCadre2: currentDate.format(DATE_FORMAT),
            totSalAssCssPf3: 1,
            totSalAssCssAtmp3: 1,
            totSalAssIpresRg3: 1,
            totSalAssIpresRcc3: 1,
            salaireBrut3: 1,
            nombreJours3: 1,
            nombreHeures3: 1,
            tempsTravail3: 'BBBBBB',
            trancheTravail3: 'BBBBBB',
            regimeGeneral3: 'BBBBBB',
            regimCompCadre3: 'BBBBBB',
            dateEffetRegimeCadre3: currentDate.format(DATE_FORMAT)
          },
          elemDefault
        );

        const expected = Object.assign(
          {
            dateNaissance: currentDate,
            dateDebutContrat: currentDate,
            dateFinContrat: currentDate,
            dateEffetRegimeCadre1: currentDate,
            dateEffetRegimeCadre2: currentDate,
            dateEffetRegimeCadre3: currentDate
          },
          returnedFromService
        );

        service.query().subscribe(resp => (expectedResult = resp.body));

        const req = httpMock.expectOne({ method: 'GET' });
        req.flush([returnedFromService]);
        httpMock.verify();
        expect(expectedResult).toContainEqual(expected);
      });

      it('should delete a Employe', () => {
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
