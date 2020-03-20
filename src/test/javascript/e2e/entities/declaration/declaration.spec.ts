import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { DeclarationComponentsPage, DeclarationDeleteDialog, DeclarationUpdatePage } from './declaration.page-object';

const expect = chai.expect;

describe('Declaration e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let declarationComponentsPage: DeclarationComponentsPage;
  let declarationUpdatePage: DeclarationUpdatePage;
  let declarationDeleteDialog: DeclarationDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Declarations', async () => {
    await navBarPage.goToEntity('declaration');
    declarationComponentsPage = new DeclarationComponentsPage();
    await browser.wait(ec.visibilityOf(declarationComponentsPage.title), 5000);
    expect(await declarationComponentsPage.getTitle()).to.eq('portailCssIpresApp.declaration.home.title');
    await browser.wait(
      ec.or(ec.visibilityOf(declarationComponentsPage.entities), ec.visibilityOf(declarationComponentsPage.noResult)),
      1000
    );
  });

  it('should load create Declaration page', async () => {
    await declarationComponentsPage.clickOnCreateButton();
    declarationUpdatePage = new DeclarationUpdatePage();
    expect(await declarationUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.declaration.home.createOrEditLabel');
    await declarationUpdatePage.cancel();
  });

  it('should create and save Declarations', async () => {
    const nbButtonsBeforeCreate = await declarationComponentsPage.countDeleteButtons();

    await declarationComponentsPage.clickOnCreateButton();

    await promise.all([
      declarationUpdatePage.setIdIdentifiantInput('idIdentifiant'),
      declarationUpdatePage.setRaisonSocialeInput('raisonSociale'),
      declarationUpdatePage.setAdresseInput('adresse'),
      declarationUpdatePage.setTypeDeclarationInput('typeDeclaration'),
      declarationUpdatePage.setDateDebutCotisationInput('2000-12-31'),
      declarationUpdatePage.setTotalNouvSalariesInput('5'),
      declarationUpdatePage.setTotalSalariesInput('5'),
      declarationUpdatePage.setCumulTotSalAssIpresRgInput('5'),
      declarationUpdatePage.setCumulTotSalAssIpresRccInput('5'),
      declarationUpdatePage.setCumulTotSalAssCssPfInput('5'),
      declarationUpdatePage.setCumulTotSalAssCssAtmpInput('5'),
      declarationUpdatePage.setTotalSalVersesInput('5'),
      declarationUpdatePage.setMntCotPfCalcParEmployeurInput('5'),
      declarationUpdatePage.setMntCotAtMpCalcParEmployeurInput('5'),
      declarationUpdatePage.setMntCotRgCalcParEmployeurInput('5'),
      declarationUpdatePage.setMntCotRccCalcParEmployeurInput('5')
    ]);

    expect(await declarationUpdatePage.getIdIdentifiantInput()).to.eq(
      'idIdentifiant',
      'Expected IdIdentifiant value to be equals to idIdentifiant'
    );
    expect(await declarationUpdatePage.getRaisonSocialeInput()).to.eq(
      'raisonSociale',
      'Expected RaisonSociale value to be equals to raisonSociale'
    );
    expect(await declarationUpdatePage.getAdresseInput()).to.eq('adresse', 'Expected Adresse value to be equals to adresse');
    expect(await declarationUpdatePage.getTypeDeclarationInput()).to.eq(
      'typeDeclaration',
      'Expected TypeDeclaration value to be equals to typeDeclaration'
    );
    expect(await declarationUpdatePage.getDateDebutCotisationInput()).to.eq(
      '2000-12-31',
      'Expected dateDebutCotisation value to be equals to 2000-12-31'
    );
    expect(await declarationUpdatePage.getTotalNouvSalariesInput()).to.eq('5', 'Expected totalNouvSalaries value to be equals to 5');
    expect(await declarationUpdatePage.getTotalSalariesInput()).to.eq('5', 'Expected totalSalaries value to be equals to 5');
    expect(await declarationUpdatePage.getCumulTotSalAssIpresRgInput()).to.eq(
      '5',
      'Expected cumulTotSalAssIpresRg value to be equals to 5'
    );
    expect(await declarationUpdatePage.getCumulTotSalAssIpresRccInput()).to.eq(
      '5',
      'Expected cumulTotSalAssIpresRcc value to be equals to 5'
    );
    expect(await declarationUpdatePage.getCumulTotSalAssCssPfInput()).to.eq('5', 'Expected cumulTotSalAssCssPf value to be equals to 5');
    expect(await declarationUpdatePage.getCumulTotSalAssCssAtmpInput()).to.eq(
      '5',
      'Expected cumulTotSalAssCssAtmp value to be equals to 5'
    );
    expect(await declarationUpdatePage.getTotalSalVersesInput()).to.eq('5', 'Expected totalSalVerses value to be equals to 5');
    expect(await declarationUpdatePage.getMntCotPfCalcParEmployeurInput()).to.eq(
      '5',
      'Expected mntCotPfCalcParEmployeur value to be equals to 5'
    );
    expect(await declarationUpdatePage.getMntCotAtMpCalcParEmployeurInput()).to.eq(
      '5',
      'Expected mntCotAtMpCalcParEmployeur value to be equals to 5'
    );
    expect(await declarationUpdatePage.getMntCotRgCalcParEmployeurInput()).to.eq(
      '5',
      'Expected mntCotRgCalcParEmployeur value to be equals to 5'
    );
    expect(await declarationUpdatePage.getMntCotRccCalcParEmployeurInput()).to.eq(
      '5',
      'Expected mntCotRccCalcParEmployeur value to be equals to 5'
    );

    await declarationUpdatePage.save();
    expect(await declarationUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await declarationComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last Declaration', async () => {
    const nbButtonsBeforeDelete = await declarationComponentsPage.countDeleteButtons();
    await declarationComponentsPage.clickOnLastDeleteButton();

    declarationDeleteDialog = new DeclarationDeleteDialog();
    expect(await declarationDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.declaration.delete.question');
    await declarationDeleteDialog.clickOnConfirmButton();

    expect(await declarationComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
