import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { DemandeServiceComponentsPage, DemandeServiceDeleteDialog, DemandeServiceUpdatePage } from './demande-service.page-object';

const expect = chai.expect;

describe('DemandeService e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let demandeServiceComponentsPage: DemandeServiceComponentsPage;
  let demandeServiceUpdatePage: DemandeServiceUpdatePage;
  let demandeServiceDeleteDialog: DemandeServiceDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load DemandeServices', async () => {
    await navBarPage.goToEntity('demande-service');
    demandeServiceComponentsPage = new DemandeServiceComponentsPage();
    await browser.wait(ec.visibilityOf(demandeServiceComponentsPage.title), 5000);
    expect(await demandeServiceComponentsPage.getTitle()).to.eq('portailCssIpresApp.demandeService.home.title');
    await browser.wait(
      ec.or(ec.visibilityOf(demandeServiceComponentsPage.entities), ec.visibilityOf(demandeServiceComponentsPage.noResult)),
      1000
    );
  });

  it('should load create DemandeService page', async () => {
    await demandeServiceComponentsPage.clickOnCreateButton();
    demandeServiceUpdatePage = new DemandeServiceUpdatePage();
    expect(await demandeServiceUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.demandeService.home.createOrEditLabel');
    await demandeServiceUpdatePage.cancel();
  });

  it('should create and save DemandeServices', async () => {
    const nbButtonsBeforeCreate = await demandeServiceComponentsPage.countDeleteButtons();

    await demandeServiceComponentsPage.clickOnCreateButton();

    await promise.all([
      demandeServiceUpdatePage.setTypeDemandeInput('typeDemande'),
      demandeServiceUpdatePage.setIdDossierInput('idDossier'),
      demandeServiceUpdatePage.setStatutDossierInput('statutDossier'),
      demandeServiceUpdatePage.setUrlDocumentInput('urlDocument'),
      demandeServiceUpdatePage.employeurSelectLastOption()
    ]);

    expect(await demandeServiceUpdatePage.getTypeDemandeInput()).to.eq(
      'typeDemande',
      'Expected TypeDemande value to be equals to typeDemande'
    );
    expect(await demandeServiceUpdatePage.getIdDossierInput()).to.eq('idDossier', 'Expected IdDossier value to be equals to idDossier');
    expect(await demandeServiceUpdatePage.getStatutDossierInput()).to.eq(
      'statutDossier',
      'Expected StatutDossier value to be equals to statutDossier'
    );
    expect(await demandeServiceUpdatePage.getUrlDocumentInput()).to.eq(
      'urlDocument',
      'Expected UrlDocument value to be equals to urlDocument'
    );

    await demandeServiceUpdatePage.save();
    expect(await demandeServiceUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await demandeServiceComponentsPage.countDeleteButtons()).to.eq(
      nbButtonsBeforeCreate + 1,
      'Expected one more entry in the table'
    );
  });

  it('should delete last DemandeService', async () => {
    const nbButtonsBeforeDelete = await demandeServiceComponentsPage.countDeleteButtons();
    await demandeServiceComponentsPage.clickOnLastDeleteButton();

    demandeServiceDeleteDialog = new DemandeServiceDeleteDialog();
    expect(await demandeServiceDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.demandeService.delete.question');
    await demandeServiceDeleteDialog.clickOnConfirmButton();

    expect(await demandeServiceComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
