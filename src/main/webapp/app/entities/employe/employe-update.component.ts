import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IEmploye, Employe } from 'app/shared/model/employe.model';
import { EmployeService } from './employe.service';
import { IDeclaration } from 'app/shared/model/declaration.model';
import { DeclarationService } from 'app/entities/declaration/declaration.service';
import { IImmatriculation } from 'app/shared/model/immatriculation.model';
import { ImmatriculationService } from 'app/entities/immatriculation/immatriculation.service';

type SelectableEntity = IDeclaration | IImmatriculation;

@Component({
  selector: 'jhi-employe-update',
  templateUrl: './employe-update.component.html'
})
export class EmployeUpdateComponent implements OnInit {
  isSaving = false;
  declarations: IDeclaration[] = [];
  immatriculations: IImmatriculation[] = [];
  dateNaissanceDp: any;
  dateDebutContratDp: any;
  dateFinContratDp: any;
  dateEffetRegimeCadre1Dp: any;
  dateEffetRegimeCadre2Dp: any;
  dateEffetRegimeCadre3Dp: any;

  editForm = this.fb.group({
    id: [],
    rechercheEmploye: [],
    nomEmploye: [null, [Validators.required]],
    prenomEmploye: [null, [Validators.required]],
    sexe: [null, [Validators.required]],
    etatCivil: [null, [Validators.required]],
    dateNaissance: [null, [Validators.required]],
    numRegNaiss: [null, [Validators.required]],
    nomPere: [],
    prenomPere: [],
    nomMere: [],
    prenomMere: [],
    nationalite: [null, [Validators.required]],
    typePieceIdentite: [],
    nin: [],
    ninCedeao: [],
    numPieceIdentite: [],
    delivreLe: [],
    lieuDelivrance: [],
    expireLe: [],
    villeNaissance: [],
    paysNaissance: [],
    employeurPrec: [],
    pays: [],
    region: [],
    department: [],
    arondissement: [],
    commune: [],
    qartier: [],
    address: [],
    boitePostale: [],
    typeMouvement: [],
    natureContrat: [],
    dateDebutContrat: [],
    dateFinContrat: [],
    profession: [],
    emploi: [],
    nonCadre: [],
    ouiCadre: [],
    conventionApplicable: [],
    salaireContractuel: [],
    tempsTravail: [],
    categorie: [],
    motifSortie: [],
    totSalAssCssPf1: [],
    totSalAssCssAtmp1: [],
    totSalAssIpresRg1: [],
    totSalAssIpresRcc1: [],
    salaireBrut1: [],
    nombreJours1: [],
    nombreHeures1: [],
    tempsTravail1: [],
    trancheTravail1: [],
    regimeGeneral1: [],
    regimCompCadre1: [],
    dateEffetRegimeCadre1: [],
    totSalAssCssPf2: [],
    totSalAssCssAtmp2: [],
    totSalAssIpresRg2: [],
    totSalAssIpresRcc2: [],
    salaireBrut2: [],
    nombreJours2: [],
    nombreHeures2: [],
    tempsTravail2: [],
    trancheTravail2: [],
    regimeGeneral2: [],
    regimCompCadre2: [],
    dateEffetRegimeCadre2: [],
    totSalAssCssPf3: [],
    totSalAssCssAtmp3: [],
    totSalAssIpresRg3: [],
    totSalAssIpresRcc3: [],
    salaireBrut3: [],
    nombreJours3: [],
    nombreHeures3: [],
    tempsTravail3: [],
    trancheTravail3: [],
    regimeGeneral3: [],
    regimCompCadre3: [],
    dateEffetRegimeCadre3: [],
    declaration: [],
    employeur: []
  });

  constructor(
    protected employeService: EmployeService,
    protected declarationService: DeclarationService,
    protected immatriculationService: ImmatriculationService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ employe }) => {
      this.updateForm(employe);

      this.declarationService.query().subscribe((res: HttpResponse<IDeclaration[]>) => (this.declarations = res.body || []));

      this.immatriculationService.query().subscribe((res: HttpResponse<IImmatriculation[]>) => (this.immatriculations = res.body || []));
    });
  }

  updateForm(employe: IEmploye): void {
    this.editForm.patchValue({
      id: employe.id,
      rechercheEmploye: employe.rechercheEmploye,
      nomEmploye: employe.nomEmploye,
      prenomEmploye: employe.prenomEmploye,
      sexe: employe.sexe,
      etatCivil: employe.etatCivil,
      dateNaissance: employe.dateNaissance,
      numRegNaiss: employe.numRegNaiss,
      nomPere: employe.nomPere,
      prenomPere: employe.prenomPere,
      nomMere: employe.nomMere,
      prenomMere: employe.prenomMere,
      nationalite: employe.nationalite,
      typePieceIdentite: employe.typePieceIdentite,
      nin: employe.nin,
      ninCedeao: employe.ninCedeao,
      numPieceIdentite: employe.numPieceIdentite,
      delivreLe: employe.delivreLe,
      lieuDelivrance: employe.lieuDelivrance,
      expireLe: employe.expireLe,
      villeNaissance: employe.villeNaissance,
      paysNaissance: employe.paysNaissance,
      employeurPrec: employe.employeurPrec,
      pays: employe.pays,
      region: employe.region,
      department: employe.department,
      arondissement: employe.arondissement,
      commune: employe.commune,
      qartier: employe.qartier,
      address: employe.address,
      boitePostale: employe.boitePostale,
      typeMouvement: employe.typeMouvement,
      natureContrat: employe.natureContrat,
      dateDebutContrat: employe.dateDebutContrat,
      dateFinContrat: employe.dateFinContrat,
      profession: employe.profession,
      emploi: employe.emploi,
      nonCadre: employe.nonCadre,
      ouiCadre: employe.ouiCadre,
      conventionApplicable: employe.conventionApplicable,
      salaireContractuel: employe.salaireContractuel,
      tempsTravail: employe.tempsTravail,
      categorie: employe.categorie,
      motifSortie: employe.motifSortie,
      totSalAssCssPf1: employe.totSalAssCssPf1,
      totSalAssCssAtmp1: employe.totSalAssCssAtmp1,
      totSalAssIpresRg1: employe.totSalAssIpresRg1,
      totSalAssIpresRcc1: employe.totSalAssIpresRcc1,
      salaireBrut1: employe.salaireBrut1,
      nombreJours1: employe.nombreJours1,
      nombreHeures1: employe.nombreHeures1,
      tempsTravail1: employe.tempsTravail1,
      trancheTravail1: employe.trancheTravail1,
      regimeGeneral1: employe.regimeGeneral1,
      regimCompCadre1: employe.regimCompCadre1,
      dateEffetRegimeCadre1: employe.dateEffetRegimeCadre1,
      totSalAssCssPf2: employe.totSalAssCssPf2,
      totSalAssCssAtmp2: employe.totSalAssCssAtmp2,
      totSalAssIpresRg2: employe.totSalAssIpresRg2,
      totSalAssIpresRcc2: employe.totSalAssIpresRcc2,
      salaireBrut2: employe.salaireBrut2,
      nombreJours2: employe.nombreJours2,
      nombreHeures2: employe.nombreHeures2,
      tempsTravail2: employe.tempsTravail2,
      trancheTravail2: employe.trancheTravail2,
      regimeGeneral2: employe.regimeGeneral2,
      regimCompCadre2: employe.regimCompCadre2,
      dateEffetRegimeCadre2: employe.dateEffetRegimeCadre2,
      totSalAssCssPf3: employe.totSalAssCssPf3,
      totSalAssCssAtmp3: employe.totSalAssCssAtmp3,
      totSalAssIpresRg3: employe.totSalAssIpresRg3,
      totSalAssIpresRcc3: employe.totSalAssIpresRcc3,
      salaireBrut3: employe.salaireBrut3,
      nombreJours3: employe.nombreJours3,
      nombreHeures3: employe.nombreHeures3,
      tempsTravail3: employe.tempsTravail3,
      trancheTravail3: employe.trancheTravail3,
      regimeGeneral3: employe.regimeGeneral3,
      regimCompCadre3: employe.regimCompCadre3,
      dateEffetRegimeCadre3: employe.dateEffetRegimeCadre3,
      declaration: employe.declaration,
      employeur: employe.employeur
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const employe = this.createFromForm();
    if (employe.id !== undefined) {
      this.subscribeToSaveResponse(this.employeService.update(employe));
    } else {
      this.subscribeToSaveResponse(this.employeService.create(employe));
    }
  }

  private createFromForm(): IEmploye {
    return {
      ...new Employe(),
      id: this.editForm.get(['id'])!.value,
      rechercheEmploye: this.editForm.get(['rechercheEmploye'])!.value,
      nomEmploye: this.editForm.get(['nomEmploye'])!.value,
      prenomEmploye: this.editForm.get(['prenomEmploye'])!.value,
      sexe: this.editForm.get(['sexe'])!.value,
      etatCivil: this.editForm.get(['etatCivil'])!.value,
      dateNaissance: this.editForm.get(['dateNaissance'])!.value,
      numRegNaiss: this.editForm.get(['numRegNaiss'])!.value,
      nomPere: this.editForm.get(['nomPere'])!.value,
      prenomPere: this.editForm.get(['prenomPere'])!.value,
      nomMere: this.editForm.get(['nomMere'])!.value,
      prenomMere: this.editForm.get(['prenomMere'])!.value,
      nationalite: this.editForm.get(['nationalite'])!.value,
      typePieceIdentite: this.editForm.get(['typePieceIdentite'])!.value,
      nin: this.editForm.get(['nin'])!.value,
      ninCedeao: this.editForm.get(['ninCedeao'])!.value,
      numPieceIdentite: this.editForm.get(['numPieceIdentite'])!.value,
      delivreLe: this.editForm.get(['delivreLe'])!.value,
      lieuDelivrance: this.editForm.get(['lieuDelivrance'])!.value,
      expireLe: this.editForm.get(['expireLe'])!.value,
      villeNaissance: this.editForm.get(['villeNaissance'])!.value,
      paysNaissance: this.editForm.get(['paysNaissance'])!.value,
      employeurPrec: this.editForm.get(['employeurPrec'])!.value,
      pays: this.editForm.get(['pays'])!.value,
      region: this.editForm.get(['region'])!.value,
      department: this.editForm.get(['department'])!.value,
      arondissement: this.editForm.get(['arondissement'])!.value,
      commune: this.editForm.get(['commune'])!.value,
      qartier: this.editForm.get(['qartier'])!.value,
      address: this.editForm.get(['address'])!.value,
      boitePostale: this.editForm.get(['boitePostale'])!.value,
      typeMouvement: this.editForm.get(['typeMouvement'])!.value,
      natureContrat: this.editForm.get(['natureContrat'])!.value,
      dateDebutContrat: this.editForm.get(['dateDebutContrat'])!.value,
      dateFinContrat: this.editForm.get(['dateFinContrat'])!.value,
      profession: this.editForm.get(['profession'])!.value,
      emploi: this.editForm.get(['emploi'])!.value,
      nonCadre: this.editForm.get(['nonCadre'])!.value,
      ouiCadre: this.editForm.get(['ouiCadre'])!.value,
      conventionApplicable: this.editForm.get(['conventionApplicable'])!.value,
      salaireContractuel: this.editForm.get(['salaireContractuel'])!.value,
      tempsTravail: this.editForm.get(['tempsTravail'])!.value,
      categorie: this.editForm.get(['categorie'])!.value,
      motifSortie: this.editForm.get(['motifSortie'])!.value,
      totSalAssCssPf1: this.editForm.get(['totSalAssCssPf1'])!.value,
      totSalAssCssAtmp1: this.editForm.get(['totSalAssCssAtmp1'])!.value,
      totSalAssIpresRg1: this.editForm.get(['totSalAssIpresRg1'])!.value,
      totSalAssIpresRcc1: this.editForm.get(['totSalAssIpresRcc1'])!.value,
      salaireBrut1: this.editForm.get(['salaireBrut1'])!.value,
      nombreJours1: this.editForm.get(['nombreJours1'])!.value,
      nombreHeures1: this.editForm.get(['nombreHeures1'])!.value,
      tempsTravail1: this.editForm.get(['tempsTravail1'])!.value,
      trancheTravail1: this.editForm.get(['trancheTravail1'])!.value,
      regimeGeneral1: this.editForm.get(['regimeGeneral1'])!.value,
      regimCompCadre1: this.editForm.get(['regimCompCadre1'])!.value,
      dateEffetRegimeCadre1: this.editForm.get(['dateEffetRegimeCadre1'])!.value,
      totSalAssCssPf2: this.editForm.get(['totSalAssCssPf2'])!.value,
      totSalAssCssAtmp2: this.editForm.get(['totSalAssCssAtmp2'])!.value,
      totSalAssIpresRg2: this.editForm.get(['totSalAssIpresRg2'])!.value,
      totSalAssIpresRcc2: this.editForm.get(['totSalAssIpresRcc2'])!.value,
      salaireBrut2: this.editForm.get(['salaireBrut2'])!.value,
      nombreJours2: this.editForm.get(['nombreJours2'])!.value,
      nombreHeures2: this.editForm.get(['nombreHeures2'])!.value,
      tempsTravail2: this.editForm.get(['tempsTravail2'])!.value,
      trancheTravail2: this.editForm.get(['trancheTravail2'])!.value,
      regimeGeneral2: this.editForm.get(['regimeGeneral2'])!.value,
      regimCompCadre2: this.editForm.get(['regimCompCadre2'])!.value,
      dateEffetRegimeCadre2: this.editForm.get(['dateEffetRegimeCadre2'])!.value,
      totSalAssCssPf3: this.editForm.get(['totSalAssCssPf3'])!.value,
      totSalAssCssAtmp3: this.editForm.get(['totSalAssCssAtmp3'])!.value,
      totSalAssIpresRg3: this.editForm.get(['totSalAssIpresRg3'])!.value,
      totSalAssIpresRcc3: this.editForm.get(['totSalAssIpresRcc3'])!.value,
      salaireBrut3: this.editForm.get(['salaireBrut3'])!.value,
      nombreJours3: this.editForm.get(['nombreJours3'])!.value,
      nombreHeures3: this.editForm.get(['nombreHeures3'])!.value,
      tempsTravail3: this.editForm.get(['tempsTravail3'])!.value,
      trancheTravail3: this.editForm.get(['trancheTravail3'])!.value,
      regimeGeneral3: this.editForm.get(['regimeGeneral3'])!.value,
      regimCompCadre3: this.editForm.get(['regimCompCadre3'])!.value,
      dateEffetRegimeCadre3: this.editForm.get(['dateEffetRegimeCadre3'])!.value,
      declaration: this.editForm.get(['declaration'])!.value,
      employeur: this.editForm.get(['employeur'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IEmploye>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }

  trackById(index: number, item: SelectableEntity): any {
    return item.id;
  }
}
