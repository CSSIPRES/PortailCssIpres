import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { ImmatriculationComponentsPage, ImmatriculationDeleteDialog, ImmatriculationUpdatePage } from './immatriculation.page-object';

const expect = chai.expect;

describe('Immatriculation e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let immatriculationComponentsPage: ImmatriculationComponentsPage;
  let immatriculationUpdatePage: ImmatriculationUpdatePage;
  let immatriculationDeleteDialog: ImmatriculationDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Immatriculations', async () => {
    await navBarPage.goToEntity('immatriculation');
    immatriculationComponentsPage = new ImmatriculationComponentsPage();
    await browser.wait(ec.visibilityOf(immatriculationComponentsPage.title), 5000);
    expect(await immatriculationComponentsPage.getTitle()).to.eq('portailCssIpresApp.immatriculation.home.title');
    await browser.wait(
      ec.or(ec.visibilityOf(immatriculationComponentsPage.entities), ec.visibilityOf(immatriculationComponentsPage.noResult)),
      1000
    );
  });

  it('should load create Immatriculation page', async () => {
    await immatriculationComponentsPage.clickOnCreateButton();
    immatriculationUpdatePage = new ImmatriculationUpdatePage();
    expect(await immatriculationUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.immatriculation.home.createOrEditLabel');
    await immatriculationUpdatePage.cancel();
  });

  it('should create and save Immatriculations', async () => {
    const nbButtonsBeforeCreate = await immatriculationComponentsPage.countDeleteButtons();

    await immatriculationComponentsPage.clickOnCreateButton();

    await promise.all([
      immatriculationUpdatePage.setRegTypeInput('regType'),
      immatriculationUpdatePage.setEmployerTypeInput('employerType'),
      immatriculationUpdatePage.setTypeEtablissementInput('typeEtablissement'),
      immatriculationUpdatePage.setEmployerNameInput('employerName'),
      immatriculationUpdatePage.setHqIdInput('hqId'),
      immatriculationUpdatePage.setNineaNumberInput('nineaNumber'),
      immatriculationUpdatePage.setNinetNumberInput('ninetNumber'),
      immatriculationUpdatePage.setCompagnyOriginIdInput('compagnyOriginId'),
      immatriculationUpdatePage.setLegalStatusInput('legalStatus'),
      immatriculationUpdatePage.setTaxIdInput('taxId'),
      immatriculationUpdatePage.setTaxIdDateInput('2000-12-31'),
      immatriculationUpdatePage.setTradeRegisterNumberInput('tradeRegisterNumber'),
      immatriculationUpdatePage.setTradeRegisterDateInput('2000-12-31'),
      immatriculationUpdatePage.setDateOfInpsectionInput('2000-12-31'),
      immatriculationUpdatePage.setDateOfFirtHireInput('2000-12-31'),
      immatriculationUpdatePage.setShortNameInput('shortName'),
      immatriculationUpdatePage.setBusinessSectorInput('businessSector'),
      immatriculationUpdatePage.setMainLineOfBusinessInput('mainLineOfBusiness'),
      immatriculationUpdatePage.setNoOfWorkersInGenSchemeInput('5'),
      immatriculationUpdatePage.setNoOfWorkersInBasicSchemeInput('5'),
      immatriculationUpdatePage.setRegionInput('region'),
      immatriculationUpdatePage.setDepartmentInput('department'),
      immatriculationUpdatePage.setArondissementInput('arondissement'),
      immatriculationUpdatePage.setCommuneInput('commune'),
      immatriculationUpdatePage.setQartierInput('qartier'),
      immatriculationUpdatePage.setAddressInput('address'),
      immatriculationUpdatePage.setPostboxNoInput('postboxNo'),
      immatriculationUpdatePage.setTelephoneInput('telephone'),
      immatriculationUpdatePage.setEmailInput('email'),
      immatriculationUpdatePage.setWebsiteInput('website'),
      immatriculationUpdatePage.setZoneCssInput('zoneCss'),
      immatriculationUpdatePage.setZoneIpresInput('zoneIpres'),
      immatriculationUpdatePage.setSectorCssInput('sectorCss'),
      immatriculationUpdatePage.setSectorIpresInput('sectorIpres'),
      immatriculationUpdatePage.setAgencyCssInput('agencyCss'),
      immatriculationUpdatePage.setAgencyIpresInput('agencyIpres'),
      immatriculationUpdatePage.setEmployerRegistrationFormIdInput('employerRegistrationFormId'),
      immatriculationUpdatePage.setEmployeeRegistrationFormIdInput('employeeRegistrationFormId'),
      immatriculationUpdatePage.setProcessFlowIdInput('processFlowId'),
      immatriculationUpdatePage.setStatutDossierInput('statutDossier'),
      immatriculationUpdatePage.representantLegalSelectLastOption(),
      immatriculationUpdatePage.userSelectLastOption()
    ]);

    expect(await immatriculationUpdatePage.getRegTypeInput()).to.eq('regType', 'Expected RegType value to be equals to regType');
    expect(await immatriculationUpdatePage.getEmployerTypeInput()).to.eq(
      'employerType',
      'Expected EmployerType value to be equals to employerType'
    );
    expect(await immatriculationUpdatePage.getTypeEtablissementInput()).to.eq(
      'typeEtablissement',
      'Expected TypeEtablissement value to be equals to typeEtablissement'
    );
    expect(await immatriculationUpdatePage.getEmployerNameInput()).to.eq(
      'employerName',
      'Expected EmployerName value to be equals to employerName'
    );
    expect(await immatriculationUpdatePage.getHqIdInput()).to.eq('hqId', 'Expected HqId value to be equals to hqId');
    expect(await immatriculationUpdatePage.getNineaNumberInput()).to.eq(
      'nineaNumber',
      'Expected NineaNumber value to be equals to nineaNumber'
    );
    expect(await immatriculationUpdatePage.getNinetNumberInput()).to.eq(
      'ninetNumber',
      'Expected NinetNumber value to be equals to ninetNumber'
    );
    expect(await immatriculationUpdatePage.getCompagnyOriginIdInput()).to.eq(
      'compagnyOriginId',
      'Expected CompagnyOriginId value to be equals to compagnyOriginId'
    );
    expect(await immatriculationUpdatePage.getLegalStatusInput()).to.eq(
      'legalStatus',
      'Expected LegalStatus value to be equals to legalStatus'
    );
    expect(await immatriculationUpdatePage.getTaxIdInput()).to.eq('taxId', 'Expected TaxId value to be equals to taxId');
    expect(await immatriculationUpdatePage.getTaxIdDateInput()).to.eq('2000-12-31', 'Expected taxIdDate value to be equals to 2000-12-31');
    expect(await immatriculationUpdatePage.getTradeRegisterNumberInput()).to.eq(
      'tradeRegisterNumber',
      'Expected TradeRegisterNumber value to be equals to tradeRegisterNumber'
    );
    expect(await immatriculationUpdatePage.getTradeRegisterDateInput()).to.eq(
      '2000-12-31',
      'Expected tradeRegisterDate value to be equals to 2000-12-31'
    );
    expect(await immatriculationUpdatePage.getDateOfInpsectionInput()).to.eq(
      '2000-12-31',
      'Expected dateOfInpsection value to be equals to 2000-12-31'
    );
    expect(await immatriculationUpdatePage.getDateOfFirtHireInput()).to.eq(
      '2000-12-31',
      'Expected dateOfFirtHire value to be equals to 2000-12-31'
    );
    expect(await immatriculationUpdatePage.getShortNameInput()).to.eq('shortName', 'Expected ShortName value to be equals to shortName');
    expect(await immatriculationUpdatePage.getBusinessSectorInput()).to.eq(
      'businessSector',
      'Expected BusinessSector value to be equals to businessSector'
    );
    expect(await immatriculationUpdatePage.getMainLineOfBusinessInput()).to.eq(
      'mainLineOfBusiness',
      'Expected MainLineOfBusiness value to be equals to mainLineOfBusiness'
    );
    expect(await immatriculationUpdatePage.getNoOfWorkersInGenSchemeInput()).to.eq(
      '5',
      'Expected noOfWorkersInGenScheme value to be equals to 5'
    );
    expect(await immatriculationUpdatePage.getNoOfWorkersInBasicSchemeInput()).to.eq(
      '5',
      'Expected noOfWorkersInBasicScheme value to be equals to 5'
    );
    expect(await immatriculationUpdatePage.getRegionInput()).to.eq('region', 'Expected Region value to be equals to region');
    expect(await immatriculationUpdatePage.getDepartmentInput()).to.eq(
      'department',
      'Expected Department value to be equals to department'
    );
    expect(await immatriculationUpdatePage.getArondissementInput()).to.eq(
      'arondissement',
      'Expected Arondissement value to be equals to arondissement'
    );
    expect(await immatriculationUpdatePage.getCommuneInput()).to.eq('commune', 'Expected Commune value to be equals to commune');
    expect(await immatriculationUpdatePage.getQartierInput()).to.eq('qartier', 'Expected Qartier value to be equals to qartier');
    expect(await immatriculationUpdatePage.getAddressInput()).to.eq('address', 'Expected Address value to be equals to address');
    expect(await immatriculationUpdatePage.getPostboxNoInput()).to.eq('postboxNo', 'Expected PostboxNo value to be equals to postboxNo');
    expect(await immatriculationUpdatePage.getTelephoneInput()).to.eq('telephone', 'Expected Telephone value to be equals to telephone');
    expect(await immatriculationUpdatePage.getEmailInput()).to.eq('email', 'Expected Email value to be equals to email');
    expect(await immatriculationUpdatePage.getWebsiteInput()).to.eq('website', 'Expected Website value to be equals to website');
    expect(await immatriculationUpdatePage.getZoneCssInput()).to.eq('zoneCss', 'Expected ZoneCss value to be equals to zoneCss');
    expect(await immatriculationUpdatePage.getZoneIpresInput()).to.eq('zoneIpres', 'Expected ZoneIpres value to be equals to zoneIpres');
    expect(await immatriculationUpdatePage.getSectorCssInput()).to.eq('sectorCss', 'Expected SectorCss value to be equals to sectorCss');
    expect(await immatriculationUpdatePage.getSectorIpresInput()).to.eq(
      'sectorIpres',
      'Expected SectorIpres value to be equals to sectorIpres'
    );
    expect(await immatriculationUpdatePage.getAgencyCssInput()).to.eq('agencyCss', 'Expected AgencyCss value to be equals to agencyCss');
    expect(await immatriculationUpdatePage.getAgencyIpresInput()).to.eq(
      'agencyIpres',
      'Expected AgencyIpres value to be equals to agencyIpres'
    );
    expect(await immatriculationUpdatePage.getEmployerRegistrationFormIdInput()).to.eq(
      'employerRegistrationFormId',
      'Expected EmployerRegistrationFormId value to be equals to employerRegistrationFormId'
    );
    expect(await immatriculationUpdatePage.getEmployeeRegistrationFormIdInput()).to.eq(
      'employeeRegistrationFormId',
      'Expected EmployeeRegistrationFormId value to be equals to employeeRegistrationFormId'
    );
    expect(await immatriculationUpdatePage.getProcessFlowIdInput()).to.eq(
      'processFlowId',
      'Expected ProcessFlowId value to be equals to processFlowId'
    );
    expect(await immatriculationUpdatePage.getStatutDossierInput()).to.eq(
      'statutDossier',
      'Expected StatutDossier value to be equals to statutDossier'
    );
    const selectedStatutImmatriculation = immatriculationUpdatePage.getStatutImmatriculationInput();
    if (await selectedStatutImmatriculation.isSelected()) {
      await immatriculationUpdatePage.getStatutImmatriculationInput().click();
      expect(
        await immatriculationUpdatePage.getStatutImmatriculationInput().isSelected(),
        'Expected statutImmatriculation not to be selected'
      ).to.be.false;
    } else {
      await immatriculationUpdatePage.getStatutImmatriculationInput().click();
      expect(await immatriculationUpdatePage.getStatutImmatriculationInput().isSelected(), 'Expected statutImmatriculation to be selected')
        .to.be.true;
    }

    await immatriculationUpdatePage.save();
    expect(await immatriculationUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await immatriculationComponentsPage.countDeleteButtons()).to.eq(
      nbButtonsBeforeCreate + 1,
      'Expected one more entry in the table'
    );
  });

  it('should delete last Immatriculation', async () => {
    const nbButtonsBeforeDelete = await immatriculationComponentsPage.countDeleteButtons();
    await immatriculationComponentsPage.clickOnLastDeleteButton();

    immatriculationDeleteDialog = new ImmatriculationDeleteDialog();
    expect(await immatriculationDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.immatriculation.delete.question');
    await immatriculationDeleteDialog.clickOnConfirmButton();

    expect(await immatriculationComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
