import { element, by, ElementFinder } from 'protractor';

export class DeclarationComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-declaration div table .btn-danger'));
  title = element.all(by.css('jhi-declaration div h2#page-heading span')).first();
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

export class DeclarationUpdatePage {
  pageTitle = element(by.id('jhi-declaration-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  idIdentifiantInput = element(by.id('field_idIdentifiant'));
  raisonSocialeInput = element(by.id('field_raisonSociale'));
  adresseInput = element(by.id('field_adresse'));
  typeDeclarationInput = element(by.id('field_typeDeclaration'));
  dateDebutCotisationInput = element(by.id('field_dateDebutCotisation'));
  totalNouvSalariesInput = element(by.id('field_totalNouvSalaries'));
  totalSalariesInput = element(by.id('field_totalSalaries'));
  cumulTotSalAssIpresRgInput = element(by.id('field_cumulTotSalAssIpresRg'));
  cumulTotSalAssIpresRccInput = element(by.id('field_cumulTotSalAssIpresRcc'));
  cumulTotSalAssCssPfInput = element(by.id('field_cumulTotSalAssCssPf'));
  cumulTotSalAssCssAtmpInput = element(by.id('field_cumulTotSalAssCssAtmp'));
  totalSalVersesInput = element(by.id('field_totalSalVerses'));
  mntCotPfCalcParEmployeurInput = element(by.id('field_mntCotPfCalcParEmployeur'));
  mntCotAtMpCalcParEmployeurInput = element(by.id('field_mntCotAtMpCalcParEmployeur'));
  mntCotRgCalcParEmployeurInput = element(by.id('field_mntCotRgCalcParEmployeur'));
  mntCotRccCalcParEmployeurInput = element(by.id('field_mntCotRccCalcParEmployeur'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setIdIdentifiantInput(idIdentifiant: string): Promise<void> {
    await this.idIdentifiantInput.sendKeys(idIdentifiant);
  }

  async getIdIdentifiantInput(): Promise<string> {
    return await this.idIdentifiantInput.getAttribute('value');
  }

  async setRaisonSocialeInput(raisonSociale: string): Promise<void> {
    await this.raisonSocialeInput.sendKeys(raisonSociale);
  }

  async getRaisonSocialeInput(): Promise<string> {
    return await this.raisonSocialeInput.getAttribute('value');
  }

  async setAdresseInput(adresse: string): Promise<void> {
    await this.adresseInput.sendKeys(adresse);
  }

  async getAdresseInput(): Promise<string> {
    return await this.adresseInput.getAttribute('value');
  }

  async setTypeDeclarationInput(typeDeclaration: string): Promise<void> {
    await this.typeDeclarationInput.sendKeys(typeDeclaration);
  }

  async getTypeDeclarationInput(): Promise<string> {
    return await this.typeDeclarationInput.getAttribute('value');
  }

  async setDateDebutCotisationInput(dateDebutCotisation: string): Promise<void> {
    await this.dateDebutCotisationInput.sendKeys(dateDebutCotisation);
  }

  async getDateDebutCotisationInput(): Promise<string> {
    return await this.dateDebutCotisationInput.getAttribute('value');
  }

  async setTotalNouvSalariesInput(totalNouvSalaries: string): Promise<void> {
    await this.totalNouvSalariesInput.sendKeys(totalNouvSalaries);
  }

  async getTotalNouvSalariesInput(): Promise<string> {
    return await this.totalNouvSalariesInput.getAttribute('value');
  }

  async setTotalSalariesInput(totalSalaries: string): Promise<void> {
    await this.totalSalariesInput.sendKeys(totalSalaries);
  }

  async getTotalSalariesInput(): Promise<string> {
    return await this.totalSalariesInput.getAttribute('value');
  }

  async setCumulTotSalAssIpresRgInput(cumulTotSalAssIpresRg: string): Promise<void> {
    await this.cumulTotSalAssIpresRgInput.sendKeys(cumulTotSalAssIpresRg);
  }

  async getCumulTotSalAssIpresRgInput(): Promise<string> {
    return await this.cumulTotSalAssIpresRgInput.getAttribute('value');
  }

  async setCumulTotSalAssIpresRccInput(cumulTotSalAssIpresRcc: string): Promise<void> {
    await this.cumulTotSalAssIpresRccInput.sendKeys(cumulTotSalAssIpresRcc);
  }

  async getCumulTotSalAssIpresRccInput(): Promise<string> {
    return await this.cumulTotSalAssIpresRccInput.getAttribute('value');
  }

  async setCumulTotSalAssCssPfInput(cumulTotSalAssCssPf: string): Promise<void> {
    await this.cumulTotSalAssCssPfInput.sendKeys(cumulTotSalAssCssPf);
  }

  async getCumulTotSalAssCssPfInput(): Promise<string> {
    return await this.cumulTotSalAssCssPfInput.getAttribute('value');
  }

  async setCumulTotSalAssCssAtmpInput(cumulTotSalAssCssAtmp: string): Promise<void> {
    await this.cumulTotSalAssCssAtmpInput.sendKeys(cumulTotSalAssCssAtmp);
  }

  async getCumulTotSalAssCssAtmpInput(): Promise<string> {
    return await this.cumulTotSalAssCssAtmpInput.getAttribute('value');
  }

  async setTotalSalVersesInput(totalSalVerses: string): Promise<void> {
    await this.totalSalVersesInput.sendKeys(totalSalVerses);
  }

  async getTotalSalVersesInput(): Promise<string> {
    return await this.totalSalVersesInput.getAttribute('value');
  }

  async setMntCotPfCalcParEmployeurInput(mntCotPfCalcParEmployeur: string): Promise<void> {
    await this.mntCotPfCalcParEmployeurInput.sendKeys(mntCotPfCalcParEmployeur);
  }

  async getMntCotPfCalcParEmployeurInput(): Promise<string> {
    return await this.mntCotPfCalcParEmployeurInput.getAttribute('value');
  }

  async setMntCotAtMpCalcParEmployeurInput(mntCotAtMpCalcParEmployeur: string): Promise<void> {
    await this.mntCotAtMpCalcParEmployeurInput.sendKeys(mntCotAtMpCalcParEmployeur);
  }

  async getMntCotAtMpCalcParEmployeurInput(): Promise<string> {
    return await this.mntCotAtMpCalcParEmployeurInput.getAttribute('value');
  }

  async setMntCotRgCalcParEmployeurInput(mntCotRgCalcParEmployeur: string): Promise<void> {
    await this.mntCotRgCalcParEmployeurInput.sendKeys(mntCotRgCalcParEmployeur);
  }

  async getMntCotRgCalcParEmployeurInput(): Promise<string> {
    return await this.mntCotRgCalcParEmployeurInput.getAttribute('value');
  }

  async setMntCotRccCalcParEmployeurInput(mntCotRccCalcParEmployeur: string): Promise<void> {
    await this.mntCotRccCalcParEmployeurInput.sendKeys(mntCotRccCalcParEmployeur);
  }

  async getMntCotRccCalcParEmployeurInput(): Promise<string> {
    return await this.mntCotRccCalcParEmployeurInput.getAttribute('value');
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

export class DeclarationDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-declaration-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-declaration'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
