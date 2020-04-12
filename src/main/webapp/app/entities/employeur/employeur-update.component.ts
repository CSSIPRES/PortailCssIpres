import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IEmployeur, Employeur } from 'app/shared/model/employeur.model';
import { EmployeurService } from './employeur.service';
import { IUser } from 'app/core/user/user.model';
import { UserService } from 'app/core/user/user.service';

@Component({
  selector: 'jhi-employeur-update',
  templateUrl: './employeur-update.component.html'
})
export class EmployeurUpdateComponent implements OnInit {
  isSaving = false;
  users: IUser[] = [];

  editForm = this.fb.group({
    id: [],
    employerType: [],
    typeEtablissement: [],
    raisonSociale: [],
    maisonMere: [],
    prenom: [],
    nom: [],
    typeIdentifiant: [],
    numeroIdentifiant: [],
    legalStatus: [],
    shortName: [],
    businessSector: [],
    mainLineOfBusiness: [],
    noOfWorkersInGenScheme: [],
    noOfWorkersInBasicScheme: [],
    region: [],
    department: [],
    arondissement: [],
    commune: [],
    qartier: [],
    address: [],
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
    processFlowId: [],
    statutDossier: [],
    statutImmatriculation: [],
    user: []
  });

  constructor(
    protected employeurService: EmployeurService,
    protected userService: UserService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ employeur }) => {
      this.updateForm(employeur);

      this.userService.query().subscribe((res: HttpResponse<IUser[]>) => (this.users = res.body || []));
    });
  }

  updateForm(employeur: IEmployeur): void {
    this.editForm.patchValue({
      id: employeur.id,
      employerType: employeur.employerType,
      typeEtablissement: employeur.typeEtablissement,
      raisonSociale: employeur.raisonSociale,
      maisonMere: employeur.maisonMere,
      prenom: employeur.prenom,
      nom: employeur.nom,
      typeIdentifiant: employeur.typeIdentifiant,
      numeroIdentifiant: employeur.numeroIdentifiant,
      legalStatus: employeur.legalStatus,
      shortName: employeur.shortName,
      businessSector: employeur.businessSector,
      mainLineOfBusiness: employeur.mainLineOfBusiness,
      noOfWorkersInGenScheme: employeur.noOfWorkersInGenScheme,
      noOfWorkersInBasicScheme: employeur.noOfWorkersInBasicScheme,
      region: employeur.region,
      department: employeur.department,
      arondissement: employeur.arondissement,
      commune: employeur.commune,
      qartier: employeur.qartier,
      address: employeur.address,
      postboxNo: employeur.postboxNo,
      telephone: employeur.telephone,
      email: employeur.email,
      website: employeur.website,
      zoneCss: employeur.zoneCss,
      zoneIpres: employeur.zoneIpres,
      sectorCss: employeur.sectorCss,
      sectorIpres: employeur.sectorIpres,
      agencyCss: employeur.agencyCss,
      agencyIpres: employeur.agencyIpres,
      processFlowId: employeur.processFlowId,
      statutDossier: employeur.statutDossier,
      statutImmatriculation: employeur.statutImmatriculation,
      user: employeur.user
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const employeur = this.createFromForm();
    if (employeur.id !== undefined) {
      this.subscribeToSaveResponse(this.employeurService.update(employeur));
    } else {
      this.subscribeToSaveResponse(this.employeurService.create(employeur));
    }
  }

  private createFromForm(): IEmployeur {
    return {
      ...new Employeur(),
      id: this.editForm.get(['id'])!.value,
      employerType: this.editForm.get(['employerType'])!.value,
      typeEtablissement: this.editForm.get(['typeEtablissement'])!.value,
      raisonSociale: this.editForm.get(['raisonSociale'])!.value,
      maisonMere: this.editForm.get(['maisonMere'])!.value,
      prenom: this.editForm.get(['prenom'])!.value,
      nom: this.editForm.get(['nom'])!.value,
      typeIdentifiant: this.editForm.get(['typeIdentifiant'])!.value,
      numeroIdentifiant: this.editForm.get(['numeroIdentifiant'])!.value,
      legalStatus: this.editForm.get(['legalStatus'])!.value,
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
      processFlowId: this.editForm.get(['processFlowId'])!.value,
      statutDossier: this.editForm.get(['statutDossier'])!.value,
      statutImmatriculation: this.editForm.get(['statutImmatriculation'])!.value,
      user: this.editForm.get(['user'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IEmployeur>>): void {
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

  trackById(index: number, item: IUser): any {
    return item.id;
  }
}
