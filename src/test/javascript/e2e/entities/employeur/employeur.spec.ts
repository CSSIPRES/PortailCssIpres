import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { EmployeurComponentsPage, EmployeurDeleteDialog, EmployeurUpdatePage } from './employeur.page-object';

const expect = chai.expect;

describe('Employeur e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let employeurComponentsPage: EmployeurComponentsPage;
  let employeurUpdatePage: EmployeurUpdatePage;
  let employeurDeleteDialog: EmployeurDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Employeurs', async () => {
    await navBarPage.goToEntity('employeur');
    employeurComponentsPage = new EmployeurComponentsPage();
    await browser.wait(ec.visibilityOf(employeurComponentsPage.title), 5000);
    expect(await employeurComponentsPage.getTitle()).to.eq('portailCssIpresApp.employeur.home.title');
    await browser.wait(ec.or(ec.visibilityOf(employeurComponentsPage.entities), ec.visibilityOf(employeurComponentsPage.noResult)), 1000);
  });

  it('should load create Employeur page', async () => {
    await employeurComponentsPage.clickOnCreateButton();
    employeurUpdatePage = new EmployeurUpdatePage();
    expect(await employeurUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.employeur.home.createOrEditLabel');
    await employeurUpdatePage.cancel();
  });

  it('should create and save Employeurs', async () => {
    const nbButtonsBeforeCreate = await employeurComponentsPage.countDeleteButtons();

    await employeurComponentsPage.clickOnCreateButton();

    await promise.all([
      employeurUpdatePage.setEmployerTypeInput('employerType'),
      employeurUpdatePage.setTypeEtablissementInput('typeEtablissement'),
      employeurUpdatePage.setRaisonSocialeInput('raisonSociale'),
      employeurUpdatePage.setMaisonMereInput('maisonMere'),
      employeurUpdatePage.setPrenomInput('prenom'),
      employeurUpdatePage.setNomInput('nom'),
      employeurUpdatePage.setTypeIdentifiantInput('typeIdentifiant'),
      employeurUpdatePage.setNumeroIdentifiantInput('numeroIdentifiant'),
      employeurUpdatePage.setLegalStatusInput('legalStatus'),
      employeurUpdatePage.setShortNameInput('shortName'),
      employeurUpdatePage.setBusinessSectorInput('businessSector'),
      employeurUpdatePage.setMainLineOfBusinessInput('mainLineOfBusiness'),
      employeurUpdatePage.setNoOfWorkersInGenSchemeInput('5'),
      employeurUpdatePage.setNoOfWorkersInBasicSchemeInput('5'),
      employeurUpdatePage.setRegionInput('region'),
      employeurUpdatePage.setDepartmentInput('department'),
      employeurUpdatePage.setArondissementInput('arondissement'),
      employeurUpdatePage.setCommuneInput('commune'),
      employeurUpdatePage.setQartierInput('qartier'),
      employeurUpdatePage.setAddressInput('address'),
      employeurUpdatePage.setPostboxNoInput('postboxNo'),
      employeurUpdatePage.setTelephoneInput('telephone'),
      employeurUpdatePage.setEmailInput('email'),
      employeurUpdatePage.setWebsiteInput('website'),
      employeurUpdatePage.setZoneCssInput('zoneCss'),
      employeurUpdatePage.setZoneIpresInput('zoneIpres'),
      employeurUpdatePage.setSectorCssInput('sectorCss'),
      employeurUpdatePage.setSectorIpresInput('sectorIpres'),
      employeurUpdatePage.setAgencyCssInput('agencyCss'),
      employeurUpdatePage.setAgencyIpresInput('agencyIpres'),
      employeurUpdatePage.setProcessFlowIdInput('processFlowId'),
      employeurUpdatePage.setStatutDossierInput('statutDossier'),
      employeurUpdatePage.userSelectLastOption()
    ]);

    expect(await employeurUpdatePage.getEmployerTypeInput()).to.eq(
      'employerType',
      'Expected EmployerType value to be equals to employerType'
    );
    expect(await employeurUpdatePage.getTypeEtablissementInput()).to.eq(
      'typeEtablissement',
      'Expected TypeEtablissement value to be equals to typeEtablissement'
    );
    expect(await employeurUpdatePage.getRaisonSocialeInput()).to.eq(
      'raisonSociale',
      'Expected RaisonSociale value to be equals to raisonSociale'
    );
    expect(await employeurUpdatePage.getMaisonMereInput()).to.eq('maisonMere', 'Expected MaisonMere value to be equals to maisonMere');
    expect(await employeurUpdatePage.getPrenomInput()).to.eq('prenom', 'Expected Prenom value to be equals to prenom');
    expect(await employeurUpdatePage.getNomInput()).to.eq('nom', 'Expected Nom value to be equals to nom');
    expect(await employeurUpdatePage.getTypeIdentifiantInput()).to.eq(
      'typeIdentifiant',
      'Expected TypeIdentifiant value to be equals to typeIdentifiant'
    );
    expect(await employeurUpdatePage.getNumeroIdentifiantInput()).to.eq(
      'numeroIdentifiant',
      'Expected NumeroIdentifiant value to be equals to numeroIdentifiant'
    );
    expect(await employeurUpdatePage.getLegalStatusInput()).to.eq('legalStatus', 'Expected LegalStatus value to be equals to legalStatus');
    expect(await employeurUpdatePage.getShortNameInput()).to.eq('shortName', 'Expected ShortName value to be equals to shortName');
    expect(await employeurUpdatePage.getBusinessSectorInput()).to.eq(
      'businessSector',
      'Expected BusinessSector value to be equals to businessSector'
    );
    expect(await employeurUpdatePage.getMainLineOfBusinessInput()).to.eq(
      'mainLineOfBusiness',
      'Expected MainLineOfBusiness value to be equals to mainLineOfBusiness'
    );
    expect(await employeurUpdatePage.getNoOfWorkersInGenSchemeInput()).to.eq(
      '5',
      'Expected noOfWorkersInGenScheme value to be equals to 5'
    );
    expect(await employeurUpdatePage.getNoOfWorkersInBasicSchemeInput()).to.eq(
      '5',
      'Expected noOfWorkersInBasicScheme value to be equals to 5'
    );
    expect(await employeurUpdatePage.getRegionInput()).to.eq('region', 'Expected Region value to be equals to region');
    expect(await employeurUpdatePage.getDepartmentInput()).to.eq('department', 'Expected Department value to be equals to department');
    expect(await employeurUpdatePage.getArondissementInput()).to.eq(
      'arondissement',
      'Expected Arondissement value to be equals to arondissement'
    );
    expect(await employeurUpdatePage.getCommuneInput()).to.eq('commune', 'Expected Commune value to be equals to commune');
    expect(await employeurUpdatePage.getQartierInput()).to.eq('qartier', 'Expected Qartier value to be equals to qartier');
    expect(await employeurUpdatePage.getAddressInput()).to.eq('address', 'Expected Address value to be equals to address');
    expect(await employeurUpdatePage.getPostboxNoInput()).to.eq('postboxNo', 'Expected PostboxNo value to be equals to postboxNo');
    expect(await employeurUpdatePage.getTelephoneInput()).to.eq('telephone', 'Expected Telephone value to be equals to telephone');
    expect(await employeurUpdatePage.getEmailInput()).to.eq('email', 'Expected Email value to be equals to email');
    expect(await employeurUpdatePage.getWebsiteInput()).to.eq('website', 'Expected Website value to be equals to website');
    expect(await employeurUpdatePage.getZoneCssInput()).to.eq('zoneCss', 'Expected ZoneCss value to be equals to zoneCss');
    expect(await employeurUpdatePage.getZoneIpresInput()).to.eq('zoneIpres', 'Expected ZoneIpres value to be equals to zoneIpres');
    expect(await employeurUpdatePage.getSectorCssInput()).to.eq('sectorCss', 'Expected SectorCss value to be equals to sectorCss');
    expect(await employeurUpdatePage.getSectorIpresInput()).to.eq('sectorIpres', 'Expected SectorIpres value to be equals to sectorIpres');
    expect(await employeurUpdatePage.getAgencyCssInput()).to.eq('agencyCss', 'Expected AgencyCss value to be equals to agencyCss');
    expect(await employeurUpdatePage.getAgencyIpresInput()).to.eq('agencyIpres', 'Expected AgencyIpres value to be equals to agencyIpres');
    expect(await employeurUpdatePage.getProcessFlowIdInput()).to.eq(
      'processFlowId',
      'Expected ProcessFlowId value to be equals to processFlowId'
    );
    expect(await employeurUpdatePage.getStatutDossierInput()).to.eq(
      'statutDossier',
      'Expected StatutDossier value to be equals to statutDossier'
    );
    const selectedStatutImmatriculation = employeurUpdatePage.getStatutImmatriculationInput();
    if (await selectedStatutImmatriculation.isSelected()) {
      await employeurUpdatePage.getStatutImmatriculationInput().click();
      expect(await employeurUpdatePage.getStatutImmatriculationInput().isSelected(), 'Expected statutImmatriculation not to be selected').to
        .be.false;
    } else {
      await employeurUpdatePage.getStatutImmatriculationInput().click();
      expect(await employeurUpdatePage.getStatutImmatriculationInput().isSelected(), 'Expected statutImmatriculation to be selected').to.be
        .true;
    }

    await employeurUpdatePage.save();
    expect(await employeurUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await employeurComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last Employeur', async () => {
    const nbButtonsBeforeDelete = await employeurComponentsPage.countDeleteButtons();
    await employeurComponentsPage.clickOnLastDeleteButton();

    employeurDeleteDialog = new EmployeurDeleteDialog();
    expect(await employeurDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.employeur.delete.question');
    await employeurDeleteDialog.clickOnConfirmButton();

    expect(await employeurComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
