import { element, by, ElementFinder } from 'protractor';

export class ImmatriculationComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-immatriculation div table .btn-danger'));
  title = element.all(by.css('jhi-immatriculation div h2#page-heading span')).first();
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

export class ImmatriculationUpdatePage {
  pageTitle = element(by.id('jhi-immatriculation-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  regTypeInput = element(by.id('field_regType'));
  employerTypeInput = element(by.id('field_employerType'));
  typeEtablissementInput = element(by.id('field_typeEtablissement'));
  employerNameInput = element(by.id('field_employerName'));
  hqIdInput = element(by.id('field_hqId'));
  nineaNumberInput = element(by.id('field_nineaNumber'));
  ninetNumberInput = element(by.id('field_ninetNumber'));
  compagnyOriginIdInput = element(by.id('field_compagnyOriginId'));
  legalStatusInput = element(by.id('field_legalStatus'));
  taxIdInput = element(by.id('field_taxId'));
  taxIdDateInput = element(by.id('field_taxIdDate'));
  tradeRegisterNumberInput = element(by.id('field_tradeRegisterNumber'));
  tradeRegisterDateInput = element(by.id('field_tradeRegisterDate'));
  dateOfInpsectionInput = element(by.id('field_dateOfInpsection'));
  dateOfFirtHireInput = element(by.id('field_dateOfFirtHire'));
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
  employerRegistrationFormIdInput = element(by.id('field_employerRegistrationFormId'));
  employeeRegistrationFormIdInput = element(by.id('field_employeeRegistrationFormId'));
  processFlowIdInput = element(by.id('field_processFlowId'));
  statutDossierInput = element(by.id('field_statutDossier'));
  statutImmatriculationInput = element(by.id('field_statutImmatriculation'));

  representantLegalSelect = element(by.id('field_representantLegal'));
  userSelect = element(by.id('field_user'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setRegTypeInput(regType: string): Promise<void> {
    await this.regTypeInput.sendKeys(regType);
  }

  async getRegTypeInput(): Promise<string> {
    return await this.regTypeInput.getAttribute('value');
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

  async setEmployerNameInput(employerName: string): Promise<void> {
    await this.employerNameInput.sendKeys(employerName);
  }

  async getEmployerNameInput(): Promise<string> {
    return await this.employerNameInput.getAttribute('value');
  }

  async setHqIdInput(hqId: string): Promise<void> {
    await this.hqIdInput.sendKeys(hqId);
  }

  async getHqIdInput(): Promise<string> {
    return await this.hqIdInput.getAttribute('value');
  }

  async setNineaNumberInput(nineaNumber: string): Promise<void> {
    await this.nineaNumberInput.sendKeys(nineaNumber);
  }

  async getNineaNumberInput(): Promise<string> {
    return await this.nineaNumberInput.getAttribute('value');
  }

  async setNinetNumberInput(ninetNumber: string): Promise<void> {
    await this.ninetNumberInput.sendKeys(ninetNumber);
  }

  async getNinetNumberInput(): Promise<string> {
    return await this.ninetNumberInput.getAttribute('value');
  }

  async setCompagnyOriginIdInput(compagnyOriginId: string): Promise<void> {
    await this.compagnyOriginIdInput.sendKeys(compagnyOriginId);
  }

  async getCompagnyOriginIdInput(): Promise<string> {
    return await this.compagnyOriginIdInput.getAttribute('value');
  }

  async setLegalStatusInput(legalStatus: string): Promise<void> {
    await this.legalStatusInput.sendKeys(legalStatus);
  }

  async getLegalStatusInput(): Promise<string> {
    return await this.legalStatusInput.getAttribute('value');
  }

  async setTaxIdInput(taxId: string): Promise<void> {
    await this.taxIdInput.sendKeys(taxId);
  }

  async getTaxIdInput(): Promise<string> {
    return await this.taxIdInput.getAttribute('value');
  }

  async setTaxIdDateInput(taxIdDate: string): Promise<void> {
    await this.taxIdDateInput.sendKeys(taxIdDate);
  }

  async getTaxIdDateInput(): Promise<string> {
    return await this.taxIdDateInput.getAttribute('value');
  }

  async setTradeRegisterNumberInput(tradeRegisterNumber: string): Promise<void> {
    await this.tradeRegisterNumberInput.sendKeys(tradeRegisterNumber);
  }

  async getTradeRegisterNumberInput(): Promise<string> {
    return await this.tradeRegisterNumberInput.getAttribute('value');
  }

  async setTradeRegisterDateInput(tradeRegisterDate: string): Promise<void> {
    await this.tradeRegisterDateInput.sendKeys(tradeRegisterDate);
  }

  async getTradeRegisterDateInput(): Promise<string> {
    return await this.tradeRegisterDateInput.getAttribute('value');
  }

  async setDateOfInpsectionInput(dateOfInpsection: string): Promise<void> {
    await this.dateOfInpsectionInput.sendKeys(dateOfInpsection);
  }

  async getDateOfInpsectionInput(): Promise<string> {
    return await this.dateOfInpsectionInput.getAttribute('value');
  }

  async setDateOfFirtHireInput(dateOfFirtHire: string): Promise<void> {
    await this.dateOfFirtHireInput.sendKeys(dateOfFirtHire);
  }

  async getDateOfFirtHireInput(): Promise<string> {
    return await this.dateOfFirtHireInput.getAttribute('value');
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

  async setEmployerRegistrationFormIdInput(employerRegistrationFormId: string): Promise<void> {
    await this.employerRegistrationFormIdInput.sendKeys(employerRegistrationFormId);
  }

  async getEmployerRegistrationFormIdInput(): Promise<string> {
    return await this.employerRegistrationFormIdInput.getAttribute('value');
  }

  async setEmployeeRegistrationFormIdInput(employeeRegistrationFormId: string): Promise<void> {
    await this.employeeRegistrationFormIdInput.sendKeys(employeeRegistrationFormId);
  }

  async getEmployeeRegistrationFormIdInput(): Promise<string> {
    return await this.employeeRegistrationFormIdInput.getAttribute('value');
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

  async representantLegalSelectLastOption(): Promise<void> {
    await this.representantLegalSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async representantLegalSelectOption(option: string): Promise<void> {
    await this.representantLegalSelect.sendKeys(option);
  }

  getRepresentantLegalSelect(): ElementFinder {
    return this.representantLegalSelect;
  }

  async getRepresentantLegalSelectedOption(): Promise<string> {
    return await this.representantLegalSelect.element(by.css('option:checked')).getText();
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

export class ImmatriculationDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-immatriculation-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-immatriculation'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
