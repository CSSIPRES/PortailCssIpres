import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import {
  RepresentantLegalComponentsPage,
  RepresentantLegalDeleteDialog,
  RepresentantLegalUpdatePage
} from './representant-legal.page-object';

const expect = chai.expect;

describe('RepresentantLegal e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let representantLegalComponentsPage: RepresentantLegalComponentsPage;
  let representantLegalUpdatePage: RepresentantLegalUpdatePage;
  let representantLegalDeleteDialog: RepresentantLegalDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load RepresentantLegals', async () => {
    await navBarPage.goToEntity('representant-legal');
    representantLegalComponentsPage = new RepresentantLegalComponentsPage();
    await browser.wait(ec.visibilityOf(representantLegalComponentsPage.title), 5000);
    expect(await representantLegalComponentsPage.getTitle()).to.eq('portailCssIpresApp.representantLegal.home.title');
    await browser.wait(
      ec.or(ec.visibilityOf(representantLegalComponentsPage.entities), ec.visibilityOf(representantLegalComponentsPage.noResult)),
      1000
    );
  });

  it('should load create RepresentantLegal page', async () => {
    await representantLegalComponentsPage.clickOnCreateButton();
    representantLegalUpdatePage = new RepresentantLegalUpdatePage();
    expect(await representantLegalUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.representantLegal.home.createOrEditLabel');
    await representantLegalUpdatePage.cancel();
  });

  it('should create and save RepresentantLegals', async () => {
    const nbButtonsBeforeCreate = await representantLegalComponentsPage.countDeleteButtons();

    await representantLegalComponentsPage.clickOnCreateButton();

    await promise.all([
      representantLegalUpdatePage.setLegalRepPersonInput('legalRepPerson'),
      representantLegalUpdatePage.setLastNameInput('lastName'),
      representantLegalUpdatePage.setFirstNameInput('firstName'),
      representantLegalUpdatePage.setBirthdateInput('2000-12-31'),
      representantLegalUpdatePage.setNationalityInput('nationality'),
      representantLegalUpdatePage.setNinInput('nin'),
      representantLegalUpdatePage.setPlaceOfBirthInput('placeOfBirth'),
      representantLegalUpdatePage.setCityOfBirthInput('cityOfBirth'),
      representantLegalUpdatePage.setTypeOfIdentityInput('typeOfIdentity'),
      representantLegalUpdatePage.setIdentityIdNumberInput('identityIdNumber'),
      representantLegalUpdatePage.setNinCedeoInput('ninCedeo'),
      representantLegalUpdatePage.setIssuedDateInput('issuedDate'),
      representantLegalUpdatePage.setExpiryDateInput('expiryDate'),
      representantLegalUpdatePage.setRegionInput('region'),
      representantLegalUpdatePage.setDepartmentInput('department'),
      representantLegalUpdatePage.setArondissementInput('arondissement'),
      representantLegalUpdatePage.setCommuneInput('commune'),
      representantLegalUpdatePage.setQartierInput('qartier'),
      representantLegalUpdatePage.setAddressInput('address'),
      representantLegalUpdatePage.setLandLineNumberInput('landLineNumber'),
      representantLegalUpdatePage.setMobileNumberInput('mobileNumber'),
      representantLegalUpdatePage.setEmailInput('email')
    ]);

    expect(await representantLegalUpdatePage.getLegalRepPersonInput()).to.eq(
      'legalRepPerson',
      'Expected LegalRepPerson value to be equals to legalRepPerson'
    );
    expect(await representantLegalUpdatePage.getLastNameInput()).to.eq('lastName', 'Expected LastName value to be equals to lastName');
    expect(await representantLegalUpdatePage.getFirstNameInput()).to.eq('firstName', 'Expected FirstName value to be equals to firstName');
    expect(await representantLegalUpdatePage.getBirthdateInput()).to.eq(
      '2000-12-31',
      'Expected birthdate value to be equals to 2000-12-31'
    );
    expect(await representantLegalUpdatePage.getNationalityInput()).to.eq(
      'nationality',
      'Expected Nationality value to be equals to nationality'
    );
    expect(await representantLegalUpdatePage.getNinInput()).to.eq('nin', 'Expected Nin value to be equals to nin');
    expect(await representantLegalUpdatePage.getPlaceOfBirthInput()).to.eq(
      'placeOfBirth',
      'Expected PlaceOfBirth value to be equals to placeOfBirth'
    );
    expect(await representantLegalUpdatePage.getCityOfBirthInput()).to.eq(
      'cityOfBirth',
      'Expected CityOfBirth value to be equals to cityOfBirth'
    );
    expect(await representantLegalUpdatePage.getTypeOfIdentityInput()).to.eq(
      'typeOfIdentity',
      'Expected TypeOfIdentity value to be equals to typeOfIdentity'
    );
    expect(await representantLegalUpdatePage.getIdentityIdNumberInput()).to.eq(
      'identityIdNumber',
      'Expected IdentityIdNumber value to be equals to identityIdNumber'
    );
    expect(await representantLegalUpdatePage.getNinCedeoInput()).to.eq('ninCedeo', 'Expected NinCedeo value to be equals to ninCedeo');
    expect(await representantLegalUpdatePage.getIssuedDateInput()).to.eq(
      'issuedDate',
      'Expected IssuedDate value to be equals to issuedDate'
    );
    expect(await representantLegalUpdatePage.getExpiryDateInput()).to.eq(
      'expiryDate',
      'Expected ExpiryDate value to be equals to expiryDate'
    );
    expect(await representantLegalUpdatePage.getRegionInput()).to.eq('region', 'Expected Region value to be equals to region');
    expect(await representantLegalUpdatePage.getDepartmentInput()).to.eq(
      'department',
      'Expected Department value to be equals to department'
    );
    expect(await representantLegalUpdatePage.getArondissementInput()).to.eq(
      'arondissement',
      'Expected Arondissement value to be equals to arondissement'
    );
    expect(await representantLegalUpdatePage.getCommuneInput()).to.eq('commune', 'Expected Commune value to be equals to commune');
    expect(await representantLegalUpdatePage.getQartierInput()).to.eq('qartier', 'Expected Qartier value to be equals to qartier');
    expect(await representantLegalUpdatePage.getAddressInput()).to.eq('address', 'Expected Address value to be equals to address');
    expect(await representantLegalUpdatePage.getLandLineNumberInput()).to.eq(
      'landLineNumber',
      'Expected LandLineNumber value to be equals to landLineNumber'
    );
    expect(await representantLegalUpdatePage.getMobileNumberInput()).to.eq(
      'mobileNumber',
      'Expected MobileNumber value to be equals to mobileNumber'
    );
    expect(await representantLegalUpdatePage.getEmailInput()).to.eq('email', 'Expected Email value to be equals to email');

    await representantLegalUpdatePage.save();
    expect(await representantLegalUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await representantLegalComponentsPage.countDeleteButtons()).to.eq(
      nbButtonsBeforeCreate + 1,
      'Expected one more entry in the table'
    );
  });

  it('should delete last RepresentantLegal', async () => {
    const nbButtonsBeforeDelete = await representantLegalComponentsPage.countDeleteButtons();
    await representantLegalComponentsPage.clickOnLastDeleteButton();

    representantLegalDeleteDialog = new RepresentantLegalDeleteDialog();
    expect(await representantLegalDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.representantLegal.delete.question');
    await representantLegalDeleteDialog.clickOnConfirmButton();

    expect(await representantLegalComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
