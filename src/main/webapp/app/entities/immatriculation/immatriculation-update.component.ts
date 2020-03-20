import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import { IImmatriculation, Immatriculation } from 'app/shared/model/immatriculation.model';
import { ImmatriculationService } from './immatriculation.service';
import { IRepresentantLegal } from 'app/shared/model/representant-legal.model';
import { RepresentantLegalService } from 'app/entities/representant-legal/representant-legal.service';
import { IUser } from 'app/core/user/user.model';
import { UserService } from 'app/core/user/user.service';

type SelectableEntity = IRepresentantLegal | IUser;

@Component({
  selector: 'jhi-immatriculation-update',
  templateUrl: './immatriculation-update.component.html'
})
export class ImmatriculationUpdateComponent implements OnInit {
  isSaving = false;
  representantlegals: IRepresentantLegal[] = [];
  users: IUser[] = [];
  taxIdDateDp: any;
  tradeRegisterDateDp: any;
  dateOfInpsectionDp: any;
  dateOfFirtHireDp: any;

  editForm = this.fb.group({
    id: [],
    regType: [],
    employerType: [null, [Validators.required]],
    typeEtablissement: [null, [Validators.required]],
    employerName: [null, [Validators.required]],
    hqId: [],
    nineaNumber: [null, [Validators.required]],
    ninetNumber: [],
    compagnyOriginId: [],
    legalStatus: [null, [Validators.required]],
    taxId: [],
    taxIdDate: [],
    tradeRegisterNumber: [],
    tradeRegisterDate: [],
    dateOfInpsection: [],
    dateOfFirtHire: [],
    shortName: [],
    businessSector: [null, [Validators.required]],
    mainLineOfBusiness: [null, [Validators.required]],
    noOfWorkersInGenScheme: [],
    noOfWorkersInBasicScheme: [],
    region: [null, [Validators.required]],
    department: [null, [Validators.required]],
    arondissement: [null, [Validators.required]],
    commune: [null, [Validators.required]],
    qartier: [null, [Validators.required]],
    address: [null, [Validators.required]],
    postboxNo: [],
    telephone: [],
    email: [],
    website: [],
    zoneCss: [],
    zoneIpres: [],
    sectorCss: [],
    sectorIpres: [],
    agencyCss: [],
    agencyIpres: [],
    employerRegistrationFormId: [],
    employeeRegistrationFormId: [],
    processFlowId: [],
    statutDossier: [],
    statutImmatriculation: [],
    representantLegal: [],
    user: []
  });

  constructor(
    protected immatriculationService: ImmatriculationService,
    protected representantLegalService: RepresentantLegalService,
    protected userService: UserService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ immatriculation }) => {
      this.updateForm(immatriculation);

      this.representantLegalService
        .query({ filter: 'immatriculation-is-null' })
        .pipe(
          map((res: HttpResponse<IRepresentantLegal[]>) => {
            return res.body || [];
          })
        )
        .subscribe((resBody: IRepresentantLegal[]) => {
          if (!immatriculation.representantLegal || !immatriculation.representantLegal.id) {
            this.representantlegals = resBody;
          } else {
            this.representantLegalService
              .find(immatriculation.representantLegal.id)
              .pipe(
                map((subRes: HttpResponse<IRepresentantLegal>) => {
                  return subRes.body ? [subRes.body].concat(resBody) : resBody;
                })
              )
              .subscribe((concatRes: IRepresentantLegal[]) => (this.representantlegals = concatRes));
          }
        });

      this.userService.query().subscribe((res: HttpResponse<IUser[]>) => (this.users = res.body || []));
    });
  }

  updateForm(immatriculation: IImmatriculation): void {
    this.editForm.patchValue({
      id: immatriculation.id,
      regType: immatriculation.regType,
      employerType: immatriculation.employerType,
      typeEtablissement: immatriculation.typeEtablissement,
      employerName: immatriculation.employerName,
      hqId: immatriculation.hqId,
      nineaNumber: immatriculation.nineaNumber,
      ninetNumber: immatriculation.ninetNumber,
      compagnyOriginId: immatriculation.compagnyOriginId,
      legalStatus: immatriculation.legalStatus,
      taxId: immatriculation.taxId,
      taxIdDate: immatriculation.taxIdDate,
      tradeRegisterNumber: immatriculation.tradeRegisterNumber,
      tradeRegisterDate: immatriculation.tradeRegisterDate,
      dateOfInpsection: immatriculation.dateOfInpsection,
      dateOfFirtHire: immatriculation.dateOfFirtHire,
      shortName: immatriculation.shortName,
      businessSector: immatriculation.businessSector,
      mainLineOfBusiness: immatriculation.mainLineOfBusiness,
      noOfWorkersInGenScheme: immatriculation.noOfWorkersInGenScheme,
      noOfWorkersInBasicScheme: immatriculation.noOfWorkersInBasicScheme,
      region: immatriculation.region,
      department: immatriculation.department,
      arondissement: immatriculation.arondissement,
      commune: immatriculation.commune,
      qartier: immatriculation.qartier,
      address: immatriculation.address,
      postboxNo: immatriculation.postboxNo,
      telephone: immatriculation.telephone,
      email: immatriculation.email,
      website: immatriculation.website,
      zoneCss: immatriculation.zoneCss,
      zoneIpres: immatriculation.zoneIpres,
      sectorCss: immatriculation.sectorCss,
      sectorIpres: immatriculation.sectorIpres,
      agencyCss: immatriculation.agencyCss,
      agencyIpres: immatriculation.agencyIpres,
      employerRegistrationFormId: immatriculation.employerRegistrationFormId,
      employeeRegistrationFormId: immatriculation.employeeRegistrationFormId,
      processFlowId: immatriculation.processFlowId,
      statutDossier: immatriculation.statutDossier,
      statutImmatriculation: immatriculation.statutImmatriculation,
      representantLegal: immatriculation.representantLegal,
      user: immatriculation.user
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const immatriculation = this.createFromForm();
    if (immatriculation.id !== undefined) {
      this.subscribeToSaveResponse(this.immatriculationService.update(immatriculation));
    } else {
      this.subscribeToSaveResponse(this.immatriculationService.create(immatriculation));
    }
  }

  private createFromForm(): IImmatriculation {
    return {
      ...new Immatriculation(),
      id: this.editForm.get(['id'])!.value,
      regType: this.editForm.get(['regType'])!.value,
      employerType: this.editForm.get(['employerType'])!.value,
      typeEtablissement: this.editForm.get(['typeEtablissement'])!.value,
      employerName: this.editForm.get(['employerName'])!.value,
      hqId: this.editForm.get(['hqId'])!.value,
      nineaNumber: this.editForm.get(['nineaNumber'])!.value,
      ninetNumber: this.editForm.get(['ninetNumber'])!.value,
      compagnyOriginId: this.editForm.get(['compagnyOriginId'])!.value,
      legalStatus: this.editForm.get(['legalStatus'])!.value,
      taxId: this.editForm.get(['taxId'])!.value,
      taxIdDate: this.editForm.get(['taxIdDate'])!.value,
      tradeRegisterNumber: this.editForm.get(['tradeRegisterNumber'])!.value,
      tradeRegisterDate: this.editForm.get(['tradeRegisterDate'])!.value,
      dateOfInpsection: this.editForm.get(['dateOfInpsection'])!.value,
      dateOfFirtHire: this.editForm.get(['dateOfFirtHire'])!.value,
      shortName: this.editForm.get(['shortName'])!.value,
      businessSector: this.editForm.get(['businessSector'])!.value,
      mainLineOfBusiness: this.editForm.get(['mainLineOfBusiness'])!.value,
      noOfWorkersInGenScheme: this.editForm.get(['noOfWorkersInGenScheme'])!.value,
      noOfWorkersInBasicScheme: this.editForm.get(['noOfWorkersInBasicScheme'])!.value,
      region: this.editForm.get(['region'])!.value,
      department: this.editForm.get(['department'])!.value,
      arondissement: this.editForm.get(['arondissement'])!.value,
      commune: this.editForm.get(['commune'])!.value,
      qartier: this.editForm.get(['qartier'])!.value,
      address: this.editForm.get(['address'])!.value,
      postboxNo: this.editForm.get(['postboxNo'])!.value,
      telephone: this.editForm.get(['telephone'])!.value,
      email: this.editForm.get(['email'])!.value,
      website: this.editForm.get(['website'])!.value,
      zoneCss: this.editForm.get(['zoneCss'])!.value,
      zoneIpres: this.editForm.get(['zoneIpres'])!.value,
      sectorCss: this.editForm.get(['sectorCss'])!.value,
      sectorIpres: this.editForm.get(['sectorIpres'])!.value,
      agencyCss: this.editForm.get(['agencyCss'])!.value,
      agencyIpres: this.editForm.get(['agencyIpres'])!.value,
      employerRegistrationFormId: this.editForm.get(['employerRegistrationFormId'])!.value,
      employeeRegistrationFormId: this.editForm.get(['employeeRegistrationFormId'])!.value,
      processFlowId: this.editForm.get(['processFlowId'])!.value,
      statutDossier: this.editForm.get(['statutDossier'])!.value,
      statutImmatriculation: this.editForm.get(['statutImmatriculation'])!.value,
      representantLegal: this.editForm.get(['representantLegal'])!.value,
      user: this.editForm.get(['user'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IImmatriculation>>): void {
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
