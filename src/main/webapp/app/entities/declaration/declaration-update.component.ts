import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IDeclaration, Declaration } from 'app/shared/model/declaration.model';
import { DeclarationService } from './declaration.service';

@Component({
  selector: 'jhi-declaration-update',
  templateUrl: './declaration-update.component.html'
})
export class DeclarationUpdateComponent implements OnInit {
  isSaving = false;
  dateDebutCotisationDp: any;

  editForm = this.fb.group({
    id: [],
    idIdentifiant: [null, [Validators.required]],
    raisonSociale: [null, [Validators.required]],
    adresse: [],
    typeDeclaration: [null, [Validators.required]],
    dateDebutCotisation: [null, [Validators.required]],
    totalNouvSalaries: [],
    totalSalaries: [],
    cumulTotSalAssIpresRg: [],
    cumulTotSalAssIpresRcc: [],
    cumulTotSalAssCssPf: [],
    cumulTotSalAssCssAtmp: [],
    totalSalVerses: [],
    mntCotPfCalcParEmployeur: [],
    mntCotAtMpCalcParEmployeur: [],
    mntCotRgCalcParEmployeur: [],
    mntCotRccCalcParEmployeur: []
  });

  constructor(protected declarationService: DeclarationService, protected activatedRoute: ActivatedRoute, private fb: FormBuilder) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ declaration }) => {
      this.updateForm(declaration);
    });
  }

  updateForm(declaration: IDeclaration): void {
    this.editForm.patchValue({
      id: declaration.id,
      idIdentifiant: declaration.idIdentifiant,
      raisonSociale: declaration.raisonSociale,
      adresse: declaration.adresse,
      typeDeclaration: declaration.typeDeclaration,
      dateDebutCotisation: declaration.dateDebutCotisation,
      totalNouvSalaries: declaration.totalNouvSalaries,
      totalSalaries: declaration.totalSalaries,
      cumulTotSalAssIpresRg: declaration.cumulTotSalAssIpresRg,
      cumulTotSalAssIpresRcc: declaration.cumulTotSalAssIpresRcc,
      cumulTotSalAssCssPf: declaration.cumulTotSalAssCssPf,
      cumulTotSalAssCssAtmp: declaration.cumulTotSalAssCssAtmp,
      totalSalVerses: declaration.totalSalVerses,
      mntCotPfCalcParEmployeur: declaration.mntCotPfCalcParEmployeur,
      mntCotAtMpCalcParEmployeur: declaration.mntCotAtMpCalcParEmployeur,
      mntCotRgCalcParEmployeur: declaration.mntCotRgCalcParEmployeur,
      mntCotRccCalcParEmployeur: declaration.mntCotRccCalcParEmployeur
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const declaration = this.createFromForm();
    if (declaration.id !== undefined) {
      this.subscribeToSaveResponse(this.declarationService.update(declaration));
    } else {
      this.subscribeToSaveResponse(this.declarationService.create(declaration));
    }
  }

  private createFromForm(): IDeclaration {
    return {
      ...new Declaration(),
      id: this.editForm.get(['id'])!.value,
      idIdentifiant: this.editForm.get(['idIdentifiant'])!.value,
      raisonSociale: this.editForm.get(['raisonSociale'])!.value,
      adresse: this.editForm.get(['adresse'])!.value,
      typeDeclaration: this.editForm.get(['typeDeclaration'])!.value,
      dateDebutCotisation: this.editForm.get(['dateDebutCotisation'])!.value,
      totalNouvSalaries: this.editForm.get(['totalNouvSalaries'])!.value,
      totalSalaries: this.editForm.get(['totalSalaries'])!.value,
      cumulTotSalAssIpresRg: this.editForm.get(['cumulTotSalAssIpresRg'])!.value,
      cumulTotSalAssIpresRcc: this.editForm.get(['cumulTotSalAssIpresRcc'])!.value,
      cumulTotSalAssCssPf: this.editForm.get(['cumulTotSalAssCssPf'])!.value,
      cumulTotSalAssCssAtmp: this.editForm.get(['cumulTotSalAssCssAtmp'])!.value,
      totalSalVerses: this.editForm.get(['totalSalVerses'])!.value,
      mntCotPfCalcParEmployeur: this.editForm.get(['mntCotPfCalcParEmployeur'])!.value,
      mntCotAtMpCalcParEmployeur: this.editForm.get(['mntCotAtMpCalcParEmployeur'])!.value,
      mntCotRgCalcParEmployeur: this.editForm.get(['mntCotRgCalcParEmployeur'])!.value,
      mntCotRccCalcParEmployeur: this.editForm.get(['mntCotRccCalcParEmployeur'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IDeclaration>>): void {
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
}
