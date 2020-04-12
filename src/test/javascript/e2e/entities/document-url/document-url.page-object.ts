import { element, by, ElementFinder } from 'protractor';

export class DocumentUrlComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-document-url div table .btn-danger'));
  title = element.all(by.css('jhi-document-url div h2#page-heading span')).first();
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

export class DocumentUrlUpdatePage {
  pageTitle = element(by.id('jhi-document-url-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  nameInput = element(by.id('field_name'));
  urlInput = element(by.id('field_url'));
  documentInput = element(by.id('file_document'));

  employeurSelect = element(by.id('field_employeur'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setNameInput(name: string): Promise<void> {
    await this.nameInput.sendKeys(name);
  }

  async getNameInput(): Promise<string> {
    return await this.nameInput.getAttribute('value');
  }

  async setUrlInput(url: string): Promise<void> {
    await this.urlInput.sendKeys(url);
  }

  async getUrlInput(): Promise<string> {
    return await this.urlInput.getAttribute('value');
  }

  async setDocumentInput(document: string): Promise<void> {
    await this.documentInput.sendKeys(document);
  }

  async getDocumentInput(): Promise<string> {
    return await this.documentInput.getAttribute('value');
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

export class DocumentUrlDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-documentUrl-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-documentUrl'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
