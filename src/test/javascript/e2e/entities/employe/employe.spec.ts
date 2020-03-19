import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { EmployeComponentsPage, EmployeDeleteDialog, EmployeUpdatePage } from './employe.page-object';

const expect = chai.expect;

describe('Employe e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let employeComponentsPage: EmployeComponentsPage;
  let employeUpdatePage: EmployeUpdatePage;
  let employeDeleteDialog: EmployeDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Employes', async () => {
    await navBarPage.goToEntity('employe');
    employeComponentsPage = new EmployeComponentsPage();
    await browser.wait(ec.visibilityOf(employeComponentsPage.title), 5000);
    expect(await employeComponentsPage.getTitle()).to.eq('portailCssIpresApp.employe.home.title');
    await browser.wait(ec.or(ec.visibilityOf(employeComponentsPage.entities), ec.visibilityOf(employeComponentsPage.noResult)), 1000);
  });

  it('should load create Employe page', async () => {
    await employeComponentsPage.clickOnCreateButton();
    employeUpdatePage = new EmployeUpdatePage();
    expect(await employeUpdatePage.getPageTitle()).to.eq('portailCssIpresApp.employe.home.createOrEditLabel');
    await employeUpdatePage.cancel();
  });

  it('should create and save Employes', async () => {
    const nbButtonsBeforeCreate = await employeComponentsPage.countDeleteButtons();

    await employeComponentsPage.clickOnCreateButton();

    await promise.all([
      employeUpdatePage.setRechercheEmployeInput('rechercheEmploye'),
      employeUpdatePage.setNomEmployeInput('nomEmploye'),
      employeUpdatePage.setPrenomEmployeInput('prenomEmploye'),
      employeUpdatePage.setSexeInput('sexe'),
      employeUpdatePage.setEtatCivilInput('etatCivil'),
      employeUpdatePage.setDateNaissanceInput('2000-12-31'),
      employeUpdatePage.setNumRegNaissInput('numRegNaiss'),
      employeUpdatePage.setNomPereInput('nomPere'),
      employeUpdatePage.setPrenomPereInput('prenomPere'),
      employeUpdatePage.setNomMereInput('nomMere'),
      employeUpdatePage.setPrenomMereInput('prenomMere'),
      employeUpdatePage.setNationaliteInput('nationalite'),
      employeUpdatePage.setTypePieceIdentiteInput('typePieceIdentite'),
      employeUpdatePage.setNinInput('nin'),
      employeUpdatePage.setNinCedeaoInput('ninCedeao'),
      employeUpdatePage.setNumPieceIdentiteInput('numPieceIdentite'),
      employeUpdatePage.setDelivreLeInput('delivreLe'),
      employeUpdatePage.setLieuDelivranceInput('lieuDelivrance'),
      employeUpdatePage.setExpireLeInput('expireLe'),
      employeUpdatePage.setVilleNaissanceInput('villeNaissance'),
      employeUpdatePage.setPaysNaissanceInput('paysNaissance'),
      employeUpdatePage.setEmployeurPrecInput('employeurPrec'),
      employeUpdatePage.setPaysInput('pays'),
      employeUpdatePage.setRegionInput('region'),
      employeUpdatePage.setDepartmentInput('department'),
      employeUpdatePage.setArondissementInput('arondissement'),
      employeUpdatePage.setCommuneInput('commune'),
      employeUpdatePage.setQartierInput('qartier'),
      employeUpdatePage.setAddressInput('address'),
      employeUpdatePage.setBoitePostaleInput('boitePostale'),
      employeUpdatePage.setTypeMouvementInput('typeMouvement'),
      employeUpdatePage.setNatureContratInput('natureContrat'),
      employeUpdatePage.setDateDebutContratInput('2000-12-31'),
      employeUpdatePage.setDateFinContratInput('2000-12-31'),
      employeUpdatePage.setProfessionInput('profession'),
      employeUpdatePage.setEmploiInput('emploi'),
      employeUpdatePage.setNonCadreInput('nonCadre'),
      employeUpdatePage.setOuiCadreInput('ouiCadre'),
      employeUpdatePage.setConventionApplicableInput('conventionApplicable'),
      employeUpdatePage.setSalaireContractuelInput('5'),
      employeUpdatePage.setTempsTravailInput('5'),
      employeUpdatePage.setCategorieInput('categorie'),
      employeUpdatePage.setMotifSortieInput('motifSortie'),
      employeUpdatePage.setTotSalAssCssPf1Input('5'),
      employeUpdatePage.setTotSalAssCssAtmp1Input('5'),
      employeUpdatePage.setTotSalAssIpresRg1Input('5'),
      employeUpdatePage.setTotSalAssIpresRcc1Input('5'),
      employeUpdatePage.setSalaireBrut1Input('5'),
      employeUpdatePage.setNombreJours1Input('5'),
      employeUpdatePage.setNombreHeures1Input('5'),
      employeUpdatePage.setTempsTravail1Input('tempsTravail1'),
      employeUpdatePage.setTrancheTravail1Input('trancheTravail1'),
      employeUpdatePage.setRegimeGeneral1Input('regimeGeneral1'),
      employeUpdatePage.setRegimCompCadre1Input('regimCompCadre1'),
      employeUpdatePage.setDateEffetRegimeCadre1Input('2000-12-31'),
      employeUpdatePage.setTotSalAssCssPf2Input('5'),
      employeUpdatePage.setTotSalAssCssAtmp2Input('5'),
      employeUpdatePage.setTotSalAssIpresRg2Input('5'),
      employeUpdatePage.setTotSalAssIpresRcc2Input('5'),
      employeUpdatePage.setSalaireBrut2Input('5'),
      employeUpdatePage.setNombreJours2Input('5'),
      employeUpdatePage.setNombreHeures2Input('5'),
      employeUpdatePage.setTempsTravail2Input('tempsTravail2'),
      employeUpdatePage.setTrancheTravail2Input('trancheTravail2'),
      employeUpdatePage.setRegimeGeneral2Input('regimeGeneral2'),
      employeUpdatePage.setRegimCompCadre2Input('regimCompCadre2'),
      employeUpdatePage.setDateEffetRegimeCadre2Input('2000-12-31'),
      employeUpdatePage.setTotSalAssCssPf3Input('5'),
      employeUpdatePage.setTotSalAssCssAtmp3Input('5'),
      employeUpdatePage.setTotSalAssIpresRg3Input('5'),
      employeUpdatePage.setTotSalAssIpresRcc3Input('5'),
      employeUpdatePage.setSalaireBrut3Input('5'),
      employeUpdatePage.setNombreJours3Input('5'),
      employeUpdatePage.setNombreHeures3Input('5'),
      employeUpdatePage.setTempsTravail3Input('tempsTravail3'),
      employeUpdatePage.setTrancheTravail3Input('trancheTravail3'),
      employeUpdatePage.setRegimeGeneral3Input('regimeGeneral3'),
      employeUpdatePage.setRegimCompCadre3Input('regimCompCadre3'),
      employeUpdatePage.setDateEffetRegimeCadre3Input('2000-12-31'),
      employeUpdatePage.declarationSelectLastOption(),
      employeUpdatePage.employeurSelectLastOption()
    ]);

    expect(await employeUpdatePage.getRechercheEmployeInput()).to.eq(
      'rechercheEmploye',
      'Expected RechercheEmploye value to be equals to rechercheEmploye'
    );
    expect(await employeUpdatePage.getNomEmployeInput()).to.eq('nomEmploye', 'Expected NomEmploye value to be equals to nomEmploye');
    expect(await employeUpdatePage.getPrenomEmployeInput()).to.eq(
      'prenomEmploye',
      'Expected PrenomEmploye value to be equals to prenomEmploye'
    );
    expect(await employeUpdatePage.getSexeInput()).to.eq('sexe', 'Expected Sexe value to be equals to sexe');
    expect(await employeUpdatePage.getEtatCivilInput()).to.eq('etatCivil', 'Expected EtatCivil value to be equals to etatCivil');
    expect(await employeUpdatePage.getDateNaissanceInput()).to.eq('2000-12-31', 'Expected dateNaissance value to be equals to 2000-12-31');
    expect(await employeUpdatePage.getNumRegNaissInput()).to.eq('numRegNaiss', 'Expected NumRegNaiss value to be equals to numRegNaiss');
    expect(await employeUpdatePage.getNomPereInput()).to.eq('nomPere', 'Expected NomPere value to be equals to nomPere');
    expect(await employeUpdatePage.getPrenomPereInput()).to.eq('prenomPere', 'Expected PrenomPere value to be equals to prenomPere');
    expect(await employeUpdatePage.getNomMereInput()).to.eq('nomMere', 'Expected NomMere value to be equals to nomMere');
    expect(await employeUpdatePage.getPrenomMereInput()).to.eq('prenomMere', 'Expected PrenomMere value to be equals to prenomMere');
    expect(await employeUpdatePage.getNationaliteInput()).to.eq('nationalite', 'Expected Nationalite value to be equals to nationalite');
    expect(await employeUpdatePage.getTypePieceIdentiteInput()).to.eq(
      'typePieceIdentite',
      'Expected TypePieceIdentite value to be equals to typePieceIdentite'
    );
    expect(await employeUpdatePage.getNinInput()).to.eq('nin', 'Expected Nin value to be equals to nin');
    expect(await employeUpdatePage.getNinCedeaoInput()).to.eq('ninCedeao', 'Expected NinCedeao value to be equals to ninCedeao');
    expect(await employeUpdatePage.getNumPieceIdentiteInput()).to.eq(
      'numPieceIdentite',
      'Expected NumPieceIdentite value to be equals to numPieceIdentite'
    );
    expect(await employeUpdatePage.getDelivreLeInput()).to.eq('delivreLe', 'Expected DelivreLe value to be equals to delivreLe');
    expect(await employeUpdatePage.getLieuDelivranceInput()).to.eq(
      'lieuDelivrance',
      'Expected LieuDelivrance value to be equals to lieuDelivrance'
    );
    expect(await employeUpdatePage.getExpireLeInput()).to.eq('expireLe', 'Expected ExpireLe value to be equals to expireLe');
    expect(await employeUpdatePage.getVilleNaissanceInput()).to.eq(
      'villeNaissance',
      'Expected VilleNaissance value to be equals to villeNaissance'
    );
    expect(await employeUpdatePage.getPaysNaissanceInput()).to.eq(
      'paysNaissance',
      'Expected PaysNaissance value to be equals to paysNaissance'
    );
    expect(await employeUpdatePage.getEmployeurPrecInput()).to.eq(
      'employeurPrec',
      'Expected EmployeurPrec value to be equals to employeurPrec'
    );
    expect(await employeUpdatePage.getPaysInput()).to.eq('pays', 'Expected Pays value to be equals to pays');
    expect(await employeUpdatePage.getRegionInput()).to.eq('region', 'Expected Region value to be equals to region');
    expect(await employeUpdatePage.getDepartmentInput()).to.eq('department', 'Expected Department value to be equals to department');
    expect(await employeUpdatePage.getArondissementInput()).to.eq(
      'arondissement',
      'Expected Arondissement value to be equals to arondissement'
    );
    expect(await employeUpdatePage.getCommuneInput()).to.eq('commune', 'Expected Commune value to be equals to commune');
    expect(await employeUpdatePage.getQartierInput()).to.eq('qartier', 'Expected Qartier value to be equals to qartier');
    expect(await employeUpdatePage.getAddressInput()).to.eq('address', 'Expected Address value to be equals to address');
    expect(await employeUpdatePage.getBoitePostaleInput()).to.eq(
      'boitePostale',
      'Expected BoitePostale value to be equals to boitePostale'
    );
    expect(await employeUpdatePage.getTypeMouvementInput()).to.eq(
      'typeMouvement',
      'Expected TypeMouvement value to be equals to typeMouvement'
    );
    expect(await employeUpdatePage.getNatureContratInput()).to.eq(
      'natureContrat',
      'Expected NatureContrat value to be equals to natureContrat'
    );
    expect(await employeUpdatePage.getDateDebutContratInput()).to.eq(
      '2000-12-31',
      'Expected dateDebutContrat value to be equals to 2000-12-31'
    );
    expect(await employeUpdatePage.getDateFinContratInput()).to.eq(
      '2000-12-31',
      'Expected dateFinContrat value to be equals to 2000-12-31'
    );
    expect(await employeUpdatePage.getProfessionInput()).to.eq('profession', 'Expected Profession value to be equals to profession');
    expect(await employeUpdatePage.getEmploiInput()).to.eq('emploi', 'Expected Emploi value to be equals to emploi');
    expect(await employeUpdatePage.getNonCadreInput()).to.eq('nonCadre', 'Expected NonCadre value to be equals to nonCadre');
    expect(await employeUpdatePage.getOuiCadreInput()).to.eq('ouiCadre', 'Expected OuiCadre value to be equals to ouiCadre');
    expect(await employeUpdatePage.getConventionApplicableInput()).to.eq(
      'conventionApplicable',
      'Expected ConventionApplicable value to be equals to conventionApplicable'
    );
    expect(await employeUpdatePage.getSalaireContractuelInput()).to.eq('5', 'Expected salaireContractuel value to be equals to 5');
    expect(await employeUpdatePage.getTempsTravailInput()).to.eq('5', 'Expected tempsTravail value to be equals to 5');
    expect(await employeUpdatePage.getCategorieInput()).to.eq('categorie', 'Expected Categorie value to be equals to categorie');
    expect(await employeUpdatePage.getMotifSortieInput()).to.eq('motifSortie', 'Expected MotifSortie value to be equals to motifSortie');
    expect(await employeUpdatePage.getTotSalAssCssPf1Input()).to.eq('5', 'Expected totSalAssCssPf1 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssCssAtmp1Input()).to.eq('5', 'Expected totSalAssCssAtmp1 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRg1Input()).to.eq('5', 'Expected totSalAssIpresRg1 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRcc1Input()).to.eq('5', 'Expected totSalAssIpresRcc1 value to be equals to 5');
    expect(await employeUpdatePage.getSalaireBrut1Input()).to.eq('5', 'Expected salaireBrut1 value to be equals to 5');
    expect(await employeUpdatePage.getNombreJours1Input()).to.eq('5', 'Expected nombreJours1 value to be equals to 5');
    expect(await employeUpdatePage.getNombreHeures1Input()).to.eq('5', 'Expected nombreHeures1 value to be equals to 5');
    expect(await employeUpdatePage.getTempsTravail1Input()).to.eq(
      'tempsTravail1',
      'Expected TempsTravail1 value to be equals to tempsTravail1'
    );
    expect(await employeUpdatePage.getTrancheTravail1Input()).to.eq(
      'trancheTravail1',
      'Expected TrancheTravail1 value to be equals to trancheTravail1'
    );
    expect(await employeUpdatePage.getRegimeGeneral1Input()).to.eq(
      'regimeGeneral1',
      'Expected RegimeGeneral1 value to be equals to regimeGeneral1'
    );
    expect(await employeUpdatePage.getRegimCompCadre1Input()).to.eq(
      'regimCompCadre1',
      'Expected RegimCompCadre1 value to be equals to regimCompCadre1'
    );
    expect(await employeUpdatePage.getDateEffetRegimeCadre1Input()).to.eq(
      '2000-12-31',
      'Expected dateEffetRegimeCadre1 value to be equals to 2000-12-31'
    );
    expect(await employeUpdatePage.getTotSalAssCssPf2Input()).to.eq('5', 'Expected totSalAssCssPf2 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssCssAtmp2Input()).to.eq('5', 'Expected totSalAssCssAtmp2 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRg2Input()).to.eq('5', 'Expected totSalAssIpresRg2 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRcc2Input()).to.eq('5', 'Expected totSalAssIpresRcc2 value to be equals to 5');
    expect(await employeUpdatePage.getSalaireBrut2Input()).to.eq('5', 'Expected salaireBrut2 value to be equals to 5');
    expect(await employeUpdatePage.getNombreJours2Input()).to.eq('5', 'Expected nombreJours2 value to be equals to 5');
    expect(await employeUpdatePage.getNombreHeures2Input()).to.eq('5', 'Expected nombreHeures2 value to be equals to 5');
    expect(await employeUpdatePage.getTempsTravail2Input()).to.eq(
      'tempsTravail2',
      'Expected TempsTravail2 value to be equals to tempsTravail2'
    );
    expect(await employeUpdatePage.getTrancheTravail2Input()).to.eq(
      'trancheTravail2',
      'Expected TrancheTravail2 value to be equals to trancheTravail2'
    );
    expect(await employeUpdatePage.getRegimeGeneral2Input()).to.eq(
      'regimeGeneral2',
      'Expected RegimeGeneral2 value to be equals to regimeGeneral2'
    );
    expect(await employeUpdatePage.getRegimCompCadre2Input()).to.eq(
      'regimCompCadre2',
      'Expected RegimCompCadre2 value to be equals to regimCompCadre2'
    );
    expect(await employeUpdatePage.getDateEffetRegimeCadre2Input()).to.eq(
      '2000-12-31',
      'Expected dateEffetRegimeCadre2 value to be equals to 2000-12-31'
    );
    expect(await employeUpdatePage.getTotSalAssCssPf3Input()).to.eq('5', 'Expected totSalAssCssPf3 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssCssAtmp3Input()).to.eq('5', 'Expected totSalAssCssAtmp3 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRg3Input()).to.eq('5', 'Expected totSalAssIpresRg3 value to be equals to 5');
    expect(await employeUpdatePage.getTotSalAssIpresRcc3Input()).to.eq('5', 'Expected totSalAssIpresRcc3 value to be equals to 5');
    expect(await employeUpdatePage.getSalaireBrut3Input()).to.eq('5', 'Expected salaireBrut3 value to be equals to 5');
    expect(await employeUpdatePage.getNombreJours3Input()).to.eq('5', 'Expected nombreJours3 value to be equals to 5');
    expect(await employeUpdatePage.getNombreHeures3Input()).to.eq('5', 'Expected nombreHeures3 value to be equals to 5');
    expect(await employeUpdatePage.getTempsTravail3Input()).to.eq(
      'tempsTravail3',
      'Expected TempsTravail3 value to be equals to tempsTravail3'
    );
    expect(await employeUpdatePage.getTrancheTravail3Input()).to.eq(
      'trancheTravail3',
      'Expected TrancheTravail3 value to be equals to trancheTravail3'
    );
    expect(await employeUpdatePage.getRegimeGeneral3Input()).to.eq(
      'regimeGeneral3',
      'Expected RegimeGeneral3 value to be equals to regimeGeneral3'
    );
    expect(await employeUpdatePage.getRegimCompCadre3Input()).to.eq(
      'regimCompCadre3',
      'Expected RegimCompCadre3 value to be equals to regimCompCadre3'
    );
    expect(await employeUpdatePage.getDateEffetRegimeCadre3Input()).to.eq(
      '2000-12-31',
      'Expected dateEffetRegimeCadre3 value to be equals to 2000-12-31'
    );

    await employeUpdatePage.save();
    expect(await employeUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await employeComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last Employe', async () => {
    const nbButtonsBeforeDelete = await employeComponentsPage.countDeleteButtons();
    await employeComponentsPage.clickOnLastDeleteButton();

    employeDeleteDialog = new EmployeDeleteDialog();
    expect(await employeDeleteDialog.getDialogTitle()).to.eq('portailCssIpresApp.employe.delete.question');
    await employeDeleteDialog.clickOnConfirmButton();

    expect(await employeComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
