import { element, by, ElementFinder } from 'protractor';

export class DemandeServiceComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-demande-service div table .btn-danger'));
  title = element.all(by.css('jhi-demande-service div h2#page-heading span')).first();
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

export class DemandeServiceUpdatePage {
  pageTitle = element(by.id('jhi-demande-service-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  typeDemandeInput = element(by.id('field_typeDemande'));
  idDossierInput = element(by.id('field_idDossier'));
  statutDossierInput = element(by.id('field_statutDossier'));
  urlDocumentInput = element(by.id('field_urlDocument'));

  employeurSelect = element(by.id('field_employeur'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setTypeDemandeInput(typeDemande: string): Promise<void> {
    await this.typeDemandeInput.sendKeys(typeDemande);
  }

  async getTypeDemandeInput(): Promise<string> {
    return await this.typeDemandeInput.getAttribute('value');
  }

  async setIdDossierInput(idDossier: string): Promise<void> {
    await this.idDossierInput.sendKeys(idDossier);
  }

  async getIdDossierInput(): Promise<string> {
    return await this.idDossierInput.getAttribute('value');
  }

  async setStatutDossierInput(statutDossier: string): Promise<void> {
    await this.statutDossierInput.sendKeys(statutDossier);
  }

  async getStatutDossierInput(): Promise<string> {
    return await this.statutDossierInput.getAttribute('value');
  }

  async setUrlDocumentInput(urlDocument: string): Promise<void> {
    await this.urlDocumentInput.sendKeys(urlDocument);
  }

  async getUrlDocumentInput(): Promise<string> {
    return await this.urlDocumentInput.getAttribute('value');
  }

  async employeurSelectLastOption(): Promise<void> {
    await this.employeurSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async employeurSelectOption(option: string): Promise<void> {
    await this.employeurSelect.sendKeys(option);
  }

  getEmployeurSelect(): ElementFinder {
    return this.employeurSelect;
  }

  async getEmployeurSelectedOption(): Promise<string> {
    return await this.employeurSelect.element(by.css('option:checked')).getText();
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

export class DemandeServiceDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-demandeService-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-demandeService'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
