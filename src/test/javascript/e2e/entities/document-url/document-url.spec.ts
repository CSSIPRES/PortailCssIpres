import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { DocumentUrlComponentsPage, DocumentUrlDeleteDialog, DocumentUrlUpdatePage } from './document-url.page-object';
import * as path from 'path';

const expect = chai.expect;

describe('DocumentUrl e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let documentUrlComponentsPage: DocumentUrlComponentsPage;
  let documentUrlUpdatePage: DocumentUrlUpdatePage;
  let documentUrlDeleteDialog: DocumentUrlDeleteDialog;
  const fileNameToUpload = 'logo-jhipster.png';
  const fileToUpload = '../../../../../../src/main/webapp/content/images/' + fileNameToUpload;
  const absolutePath = path.resolve(__dirname, fileToUpload);

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load DocumentUrls', async () => {
    await navBarPage.goToEntity('document-url');
    documentUrlComponentsPage = new DocumentUrlComponentsPage();
    await browser.wait(ec.visibilityOf(documentUrlComponentsPage.title), 5000);
    expect(await documentUrlComponentsPage.getTitle()).to.eq('portailCssIpresApp.documentUrl.home.title');
    await browser.wait(
      ec.or(ec.visibilityOf(documentUrlComponentsPage.entities), ec.visibilityOf(documentUrlComponentsPage.noResult)),
      1000
    );
  });

  it('should load create DocumentUrl page', async () => {
    await documentUrlComponentsPage.clickOnCreateButton();
    documentUrlUpdatePage = new DocumentUrlUpdatePage();
    expect(await documentUrlUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.documentUrl.home.createOrEditLabel');
    await documentUrlUpdatePage.cancel();
  });

  it('should create and save DocumentUrls', async () => {
    const nbButtonsBeforeCreate = await documentUrlComponentsPage.countDeleteButtons();

    await documentUrlComponentsPage.clickOnCreateButton();

    await promise.all([
      documentUrlUpdatePage.setNameInput('name'),
      documentUrlUpdatePage.setUrlInput('url'),
      documentUrlUpdatePage.setDocumentInput(absolutePath),
      documentUrlUpdatePage.employeurSelectLastOption()
    ]);

    expect(await documentUrlUpdatePage.getNameInput()).to.eq('name', 'Expected Name value to be equals to name');
    expect(await documentUrlUpdatePage.getUrlInput()).to.eq('url', 'Expected Url value to be equals to url');
    expect(await documentUrlUpdatePage.getDocumentInput()).to.endsWith(
      fileNameToUpload,
      'Expected Document value to be end with ' + fileNameToUpload
    );

    await documentUrlUpdatePage.save();
    expect(await documentUrlUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await documentUrlComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last DocumentUrl', async () => {
    const nbButtonsBeforeDelete = await documentUrlComponentsPage.countDeleteButtons();
    await documentUrlComponentsPage.clickOnLastDeleteButton();

    documentUrlDeleteDialog = new DocumentUrlDeleteDialog();
    expect(await documentUrlDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.documentUrl.delete.question');
    await documentUrlDeleteDialog.clickOnConfirmButton();

    expect(await documentUrlComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
