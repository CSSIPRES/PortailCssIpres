import { element, by, ElementFinder } from 'protractor';

export class EmployeurComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-employeur div table .btn-danger'));
  title = element.all(by.css('jhi-employeur div h2#page-heading span')).first();
  noResult = element(by.id('no-result'));
  entities = element(by.id('entities'));

  async clickOnCreateButton(): Promise<void> {
    await this.createButton.click();
  }

  async clickOnLastDeleteButton(): Promise<void> {
    await this.deleteButtons.last().click();
  }

  async countDeleteButtons(): Promise<number> {
    return this.deleteButtons.count();
  }

  async getTitle(): Promise<string> {
    return this.title.getAttribute('jhiTranslate');
  }
}

export class EmployeurUpdatePage {
  pageTitle = element(by.id('jhi-employeur-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  employerTypeInput = element(by.id('field_employerType'));
  typeEtablissementInput = element(by.id('field_typeEtablissement'));
  raisonSocialeInput = element(by.id('field_raisonSociale'));
  maisonMereInput = element(by.id('field_maisonMere'));
  prenomInput = element(by.id('field_prenom'));
  nomInput = element(by.id('field_nom'));
  typeIdentifiantInput = element(by.id('field_typeIdentifiant'));
  numeroIdentifiantInput = element(by.id('field_numeroIdentifiant'));
  legalStatusInput = element(by.id('field_legalStatus'));
  shortNameInput = element(by.id('field_shortName'));
  businessSectorInput = element(by.id('field_businessSector'));
  mainLineOfBusinessInput = element(by.id('field_mainLineOfBusiness'));
  noOfWorkersInGenSchemeInput = element(by.id('field_noOfWorkersInGenScheme'));
  noOfWorkersInBasicSchemeInput = element(by.id('field_noOfWorkersInBasicScheme'));
  regionInput = element(by.id('field_region'));
  departmentInput = element(by.id('field_department'));
  arondissementInput = element(by.id('field_arondissement'));
  communeInput = element(by.id('field_commune'));
  qartierInput = element(by.id('field_qartier'));
  addressInput = element(by.id('field_address'));
  postboxNoInput = element(by.id('field_postboxNo'));
  telephoneInput = element(by.id('field_telephone'));
  emailInput = element(by.id('field_email'));
  websiteInput = element(by.id('field_website'));
  zoneCssInput = element(by.id('field_zoneCss'));
  zoneIpresInput = element(by.id('field_zoneIpres'));
  sectorCssInput = element(by.id('field_sectorCss'));
  sectorIpresInput = element(by.id('field_sectorIpres'));
  agencyCssInput = element(by.id('field_agencyCss'));
  agencyIpresInput = element(by.id('field_agencyIpres'));
  processFlowIdInput = element(by.id('field_processFlowId'));
  statutDossierInput = element(by.id('field_statutDossier'));
  statutImmatriculationInput = element(by.id('field_statutImmatriculation'));

  userSelect = element(by.id('field_user'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setEmployerTypeInput(employerType: string): Promise<void> {
    await this.employerTypeInput.sendKeys(employerType);
  }

  async getEmployerTypeInput(): Promise<string> {
    return await this.employerTypeInput.getAttribute('value');
  }

  async setTypeEtablissementInput(typeEtablissement: string): Promise<void> {
    await this.typeEtablissementInput.sendKeys(typeEtablissement);
  }

  async getTypeEtablissementInput(): Promise<string> {
    return await this.typeEtablissementInput.getAttribute('value');
  }

  async setRaisonSocialeInput(raisonSociale: string): Promise<void> {
    await this.raisonSocialeInput.sendKeys(raisonSociale);
  }

  async getRaisonSocialeInput(): Promise<string> {
    return await this.raisonSocialeInput.getAttribute('value');
  }

  async setMaisonMereInput(maisonMere: string): Promise<void> {
    await this.maisonMereInput.sendKeys(maisonMere);
  }

  async getMaisonMereInput(): Promise<string> {
    return await this.maisonMereInput.getAttribute('value');
  }

  async setPrenomInput(prenom: string): Promise<void> {
    await this.prenomInput.sendKeys(prenom);
  }

  async getPrenomInput(): Promise<string> {
    return await this.prenomInput.getAttribute('value');
  }

  async setNomInput(nom: string): Promise<void> {
    await this.nomInput.sendKeys(nom);
  }

  async getNomInput(): Promise<string> {
    return await this.nomInput.getAttribute('value');
  }

  async setTypeIdentifiantInput(typeIdentifiant: string): Promise<void> {
    await this.typeIdentifiantInput.sendKeys(typeIdentifiant);
  }

  async getTypeIdentifiantInput(): Promise<string> {
    return await this.typeIdentifiantInput.getAttribute('value');
  }

  async setNumeroIdentifiantInput(numeroIdentifiant: string): Promise<void> {
    await this.numeroIdentifiantInput.sendKeys(numeroIdentifiant);
  }

  async getNumeroIdentifiantInput(): Promise<string> {
    return await this.numeroIdentifiantInput.getAttribute('value');
  }

  async setLegalStatusInput(legalStatus: string): Promise<void> {
    await this.legalStatusInput.sendKeys(legalStatus);
  }

  async getLegalStatusInput(): Promise<string> {
    return await this.legalStatusInput.getAttribute('value');
  }

  async setShortNameInput(shortName: string): Promise<void> {
    await this.shortNameInput.sendKeys(shortName);
  }

  async getShortNameInput(): Promise<string> {
    return await this.shortNameInput.getAttribute('value');
  }

  async setBusinessSectorInput(businessSector: string): Promise<void> {
    await this.businessSectorInput.sendKeys(businessSector);
  }

  async getBusinessSectorInput(): Promise<string> {
    return await this.businessSectorInput.getAttribute('value');
  }

  async setMainLineOfBusinessInput(mainLineOfBusiness: string): Promise<void> {
    await this.mainLineOfBusinessInput.sendKeys(mainLineOfBusiness);
  }

  async getMainLineOfBusinessInput(): Promise<string> {
    return await this.mainLineOfBusinessInput.getAttribute('value');
  }

  async setNoOfWorkersInGenSchemeInput(noOfWorkersInGenScheme: string): Promise<void> {
    await this.noOfWorkersInGenSchemeInput.sendKeys(noOfWorkersInGenScheme);
  }

  async getNoOfWorkersInGenSchemeInput(): Promise<string> {
    return await this.noOfWorkersInGenSchemeInput.getAttribute('value');
  }

  async setNoOfWorkersInBasicSchemeInput(noOfWorkersInBasicScheme: string): Promise<void> {
    await this.noOfWorkersInBasicSchemeInput.sendKeys(noOfWorkersInBasicScheme);
  }

  async getNoOfWorkersInBasicSchemeInput(): Promise<string> {
    return await this.noOfWorkersInBasicSchemeInput.getAttribute('value');
  }

  async setRegionInput(region: string): Promise<void> {
    await this.regionInput.sendKeys(region);
  }

  async getRegionInput(): Promise<string> {
    return await this.regionInput.getAttribute('value');
  }

  async setDepartmentInput(department: string): Promise<void> {
    await this.departmentInput.sendKeys(department);
  }

  async getDepartmentInput(): Promise<string> {
    return await this.departmentInput.getAttribute('value');
  }

  async setArondissementInput(arondissement: string): Promise<void> {
    await this.arondissementInput.sendKeys(arondissement);
  }

  async getArondissementInput(): Promise<string> {
    return await this.arondissementInput.getAttribute('value');
  }

  async setCommuneInput(commune: string): Promise<void> {
    await this.communeInput.sendKeys(commune);
  }

  async getCommuneInput(): Promise<string> {
    return await this.communeInput.getAttribute('value');
  }

  async setQartierInput(qartier: string): Promise<void> {
    await this.qartierInput.sendKeys(qartier);
  }

  async getQartierInput(): Promise<string> {
    return await this.qartierInput.getAttribute('value');
  }

  async setAddressInput(address: string): Promise<void> {
    await this.addressInput.sendKeys(address);
  }

  async getAddressInput(): Promise<string> {
    return await this.addressInput.getAttribute('value');
  }

  async setPostboxNoInput(postboxNo: string): Promise<void> {
    await this.postboxNoInput.sendKeys(postboxNo);
  }

  async getPostboxNoInput(): Promise<string> {
    return await this.postboxNoInput.getAttribute('value');
  }

  async setTelephoneInput(telephone: string): Promise<void> {
    await this.telephoneInput.sendKeys(telephone);
  }

  async getTelephoneInput(): Promise<string> {
    return await this.telephoneInput.getAttribute('value');
  }

  async setEmailInput(email: string): Promise<void> {
    await this.emailInput.sendKeys(email);
  }

  async getEmailInput(): Promise<string> {
    return await this.emailInput.getAttribute('value');
  }

  async setWebsiteInput(website: string): Promise<void> {
    await this.websiteInput.sendKeys(website);
  }

  async getWebsiteInput(): Promise<string> {
    return await this.websiteInput.getAttribute('value');
  }

  async setZoneCssInput(zoneCss: string): Promise<void> {
    await this.zoneCssInput.sendKeys(zoneCss);
  }

  async getZoneCssInput(): Promise<string> {
    return await this.zoneCssInput.getAttribute('value');
  }

  async setZoneIpresInput(zoneIpres: string): Promise<void> {
    await this.zoneIpresInput.sendKeys(zoneIpres);
  }

  async getZoneIpresInput(): Promise<string> {
    return await this.zoneIpresInput.getAttribute('value');
  }

  async setSectorCssInput(sectorCss: string): Promise<void> {
    await this.sectorCssInput.sendKeys(sectorCss);
  }

  async getSectorCssInput(): Promise<string> {
    return await this.sectorCssInput.getAttribute('value');
  }

  async setSectorIpresInput(sectorIpres: string): Promise<void> {
    await this.sectorIpresInput.sendKeys(sectorIpres);
  }

  async getSectorIpresInput(): Promise<string> {
    return await this.sectorIpresInput.getAttribute('value');
  }

  async setAgencyCssInput(agencyCss: string): Promise<void> {
    await this.agencyCssInput.sendKeys(agencyCss);
  }

  async getAgencyCssInput(): Promise<string> {
    return await this.agencyCssInput.getAttribute('value');
  }

  async setAgencyIpresInput(agencyIpres: string): Promise<void> {
    await this.agencyIpresInput.sendKeys(agencyIpres);
  }

  async getAgencyIpresInput(): Promise<string> {
    return await this.agencyIpresInput.getAttribute('value');
  }

  async setProcessFlowIdInput(processFlowId: string): Promise<void> {
    await this.processFlowIdInput.sendKeys(processFlowId);
  }

  async getProcessFlowIdInput(): Promise<string> {
    return await this.processFlowIdInput.getAttribute('value');
  }

  async setStatutDossierInput(statutDossier: string): Promise<void> {
    await this.statutDossierInput.sendKeys(statutDossier);
  }

  async getStatutDossierInput(): Promise<string> {
    return await this.statutDossierInput.getAttribute('value');
  }

  getStatutImmatriculationInput(): ElementFinder {
    return this.statutImmatriculationInput;
  }

  async userSelectLastOption(): Promise<void> {
    await this.userSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async userSelectOption(option: string): Promise<void> {
    await this.userSelect.sendKeys(option);
  }

  getUserSelect(): ElementFinder {
    return this.userSelect;
  }

  async getUserSelectedOption(): Promise<string> {
    return await this.userSelect.element(by.css('option:checked')).getText();
  }

  async save(): Promise<void> {
    await this.saveButton.click();
  }

  async cancel(): Promise<void> {
    await this.cancelButton.click();
  }

  getSaveButton(): ElementFinder {
    return this.saveButton;
  }
}

export class EmployeurDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-employeur-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-employeur'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
