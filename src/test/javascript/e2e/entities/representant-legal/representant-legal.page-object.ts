import { element, by, ElementFinder } from 'protractor';

export class RepresentantLegalComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-representant-legal div table .btn-danger'));
  title = element.all(by.css('jhi-representant-legal div h2#page-heading span')).first();
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

export class RepresentantLegalUpdatePage {
  pageTitle = element(by.id('jhi-representant-legal-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  legalRepPersonInput = element(by.id('field_legalRepPerson'));
  lastNameInput = element(by.id('field_lastName'));
  firstNameInput = element(by.id('field_firstName'));
  birthdateInput = element(by.id('field_birthdate'));
  nationalityInput = element(by.id('field_nationality'));
  ninInput = element(by.id('field_nin'));
  placeOfBirthInput = element(by.id('field_placeOfBirth'));
  cityOfBirthInput = element(by.id('field_cityOfBirth'));
  typeOfIdentityInput = element(by.id('field_typeOfIdentity'));
  identityIdNumberInput = element(by.id('field_identityIdNumber'));
  ninCedeoInput = element(by.id('field_ninCedeo'));
  issuedDateInput = element(by.id('field_issuedDate'));
  expiryDateInput = element(by.id('field_expiryDate'));
  regionInput = element(by.id('field_region'));
  departmentInput = element(by.id('field_department'));
  arondissementInput = element(by.id('field_arondissement'));
  communeInput = element(by.id('field_commune'));
  qartierInput = element(by.id('field_qartier'));
  addressInput = element(by.id('field_address'));
  landLineNumberInput = element(by.id('field_landLineNumber'));
  mobileNumberInput = element(by.id('field_mobileNumber'));
  emailInput = element(by.id('field_email'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setLegalRepPersonInput(legalRepPerson: string): Promise<void> {
    await this.legalRepPersonInput.sendKeys(legalRepPerson);
  }

  async getLegalRepPersonInput(): Promise<string> {
    return await this.legalRepPersonInput.getAttribute('value');
  }

  async setLastNameInput(lastName: string): Promise<void> {
    await this.lastNameInput.sendKeys(lastName);
  }

  async getLastNameInput(): Promise<string> {
    return await this.lastNameInput.getAttribute('value');
  }

  async setFirstNameInput(firstName: string): Promise<void> {
    await this.firstNameInput.sendKeys(firstName);
  }

  async getFirstNameInput(): Promise<string> {
    return await this.firstNameInput.getAttribute('value');
  }

  async setBirthdateInput(birthdate: string): Promise<void> {
    await this.birthdateInput.sendKeys(birthdate);
  }

  async getBirthdateInput(): Promise<string> {
    return await this.birthdateInput.getAttribute('value');
  }

  async setNationalityInput(nationality: string): Promise<void> {
    await this.nationalityInput.sendKeys(nationality);
  }

  async getNationalityInput(): Promise<string> {
    return await this.nationalityInput.getAttribute('value');
  }

  async setNinInput(nin: string): Promise<void> {
    await this.ninInput.sendKeys(nin);
  }

  async getNinInput(): Promise<string> {
    return await this.ninInput.getAttribute('value');
  }

  async setPlaceOfBirthInput(placeOfBirth: string): Promise<void> {
    await this.placeOfBirthInput.sendKeys(placeOfBirth);
  }

  async getPlaceOfBirthInput(): Promise<string> {
    return await this.placeOfBirthInput.getAttribute('value');
  }

  async setCityOfBirthInput(cityOfBirth: string): Promise<void> {
    await this.cityOfBirthInput.sendKeys(cityOfBirth);
  }

  async getCityOfBirthInput(): Promise<string> {
    return await this.cityOfBirthInput.getAttribute('value');
  }

  async setTypeOfIdentityInput(typeOfIdentity: string): Promise<void> {
    await this.typeOfIdentityInput.sendKeys(typeOfIdentity);
  }

  async getTypeOfIdentityInput(): Promise<string> {
    return await this.typeOfIdentityInput.getAttribute('value');
  }

  async setIdentityIdNumberInput(identityIdNumber: string): Promise<void> {
    await this.identityIdNumberInput.sendKeys(identityIdNumber);
  }

  async getIdentityIdNumberInput(): Promise<string> {
    return await this.identityIdNumberInput.getAttribute('value');
  }

  async setNinCedeoInput(ninCedeo: string): Promise<void> {
    await this.ninCedeoInput.sendKeys(ninCedeo);
  }

  async getNinCedeoInput(): Promise<string> {
    return await this.ninCedeoInput.getAttribute('value');
  }

  async setIssuedDateInput(issuedDate: string): Promise<void> {
    await this.issuedDateInput.sendKeys(issuedDate);
  }

  async getIssuedDateInput(): Promise<string> {
    return await this.issuedDateInput.getAttribute('value');
  }

  async setExpiryDateInput(expiryDate: string): Promise<void> {
    await this.expiryDateInput.sendKeys(expiryDate);
  }

  async getExpiryDateInput(): Promise<string> {
    return await this.expiryDateInput.getAttribute('value');
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

  async setLandLineNumberInput(landLineNumber: string): Promise<void> {
    await this.landLineNumberInput.sendKeys(landLineNumber);
  }

  async getLandLineNumberInput(): Promise<string> {
    return await this.landLineNumberInput.getAttribute('value');
  }

  async setMobileNumberInput(mobileNumber: string): Promise<void> {
    await this.mobileNumberInput.sendKeys(mobileNumber);
  }

  async getMobileNumberInput(): Promise<string> {
    return await this.mobileNumberInput.getAttribute('value');
  }

  async setEmailInput(email: string): Promise<void> {
    await this.emailInput.sendKeys(email);
  }

  async getEmailInput(): Promise<string> {
    return await this.emailInput.getAttribute('value');
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

export class RepresentantLegalDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-representantLegal-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-representantLegal'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
