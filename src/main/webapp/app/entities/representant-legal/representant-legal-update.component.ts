import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IRepresentantLegal, RepresentantLegal } from 'app/shared/model/representant-legal.model';
import { RepresentantLegalService } from './representant-legal.service';

@Component({
  selector: 'jhi-representant-legal-update',
  templateUrl: './representant-legal-update.component.html'
})
export class RepresentantLegalUpdateComponent implements OnInit {
  isSaving = false;
  birthdateDp: any;

  editForm = this.fb.group({
    id: [],
    legalRepPerson: [],
    lastName: [null, [Validators.required]],
    firstName: [null, [Validators.required]],
    birthdate: [null, [Validators.required]],
    nationality: [null, [Validators.required]],
    nin: [],
    placeOfBirth: [],
    cityOfBirth: [],
    typeOfIdentity: [],
    identityIdNumber: [],
    ninCedeo: [],
    issuedDate: [],
    expiryDate: [],
    region: [],
    department: [],
    arondissement: [],
    commune: [],
    qartier: [],
    address: [],
    landLineNumber: [],
    mobileNumber: [],
    email: []
  });

  constructor(
    protected representantLegalService: RepresentantLegalService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ representantLegal }) => {
      this.updateForm(representantLegal);
    });
  }

  updateForm(representantLegal: IRepresentantLegal): void {
    this.editForm.patchValue({
      id: representantLegal.id,
      legalRepPerson: representantLegal.legalRepPerson,
      lastName: representantLegal.lastName,
      firstName: representantLegal.firstName,
      birthdate: representantLegal.birthdate,
      nationality: representantLegal.nationality,
      nin: representantLegal.nin,
      placeOfBirth: representantLegal.placeOfBirth,
      cityOfBirth: representantLegal.cityOfBirth,
      typeOfIdentity: representantLegal.typeOfIdentity,
      identityIdNumber: representantLegal.identityIdNumber,
      ninCedeo: representantLegal.ninCedeo,
      issuedDate: representantLegal.issuedDate,
      expiryDate: representantLegal.expiryDate,
      region: representantLegal.region,
      department: representantLegal.department,
      arondissement: representantLegal.arondissement,
      commune: representantLegal.commune,
      qartier: representantLegal.qartier,
      address: representantLegal.address,
      landLineNumber: representantLegal.landLineNumber,
      mobileNumber: representantLegal.mobileNumber,
      email: representantLegal.email
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const representantLegal = this.createFromForm();
    if (representantLegal.id !== undefined) {
      this.subscribeToSaveResponse(this.representantLegalService.update(representantLegal));
    } else {
      this.subscribeToSaveResponse(this.representantLegalService.create(representantLegal));
    }
  }

  private createFromForm(): IRepresentantLegal {
    return {
      ...new RepresentantLegal(),
      id: this.editForm.get(['id'])!.value,
      legalRepPerson: this.editForm.get(['legalRepPerson'])!.value,
      lastName: this.editForm.get(['lastName'])!.value,
      firstName: this.editForm.get(['firstName'])!.value,
      birthdate: this.editForm.get(['birthdate'])!.value,
      nationality: this.editForm.get(['nationality'])!.value,
      nin: this.editForm.get(['nin'])!.value,
      placeOfBirth: this.editForm.get(['placeOfBirth'])!.value,
      cityOfBirth: this.editForm.get(['cityOfBirth'])!.value,
      typeOfIdentity: this.editForm.get(['typeOfIdentity'])!.value,
      identityIdNumber: this.editForm.get(['identityIdNumber'])!.value,
      ninCedeo: this.editForm.get(['ninCedeo'])!.value,
      issuedDate: this.editForm.get(['issuedDate'])!.value,
      expiryDate: this.editForm.get(['expiryDate'])!.value,
      region: this.editForm.get(['region'])!.value,
      department: this.editForm.get(['department'])!.value,
      arondissement: this.editForm.get(['arondissement'])!.value,
      commune: this.editForm.get(['commune'])!.value,
      qartier: this.editForm.get(['qartier'])!.value,
      address: this.editForm.get(['address'])!.value,
      landLineNumber: this.editForm.get(['landLineNumber'])!.value,
      mobileNumber: this.editForm.get(['mobileNumber'])!.value,
      email: this.editForm.get(['email'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IRepresentantLegal>>): void {
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
