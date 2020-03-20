import { element, by, ElementFinder } from 'protractor';

export class EmployeComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-employe div table .btn-danger'));
  title = element.all(by.css('jhi-employe div h2#page-heading span')).first();
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

export class EmployeUpdatePage {
  pageTitle = element(by.id('jhi-employe-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  rechercheEmployeInput = element(by.id('field_rechercheEmploye'));
  nomEmployeInput = element(by.id('field_nomEmploye'));
  prenomEmployeInput = element(by.id('field_prenomEmploye'));
  sexeInput = element(by.id('field_sexe'));
  etatCivilInput = element(by.id('field_etatCivil'));
  dateNaissanceInput = element(by.id('field_dateNaissance'));
  numRegNaissInput = element(by.id('field_numRegNaiss'));
  nomPereInput = element(by.id('field_nomPere'));
  prenomPereInput = element(by.id('field_prenomPere'));
  nomMereInput = element(by.id('field_nomMere'));
  prenomMereInput = element(by.id('field_prenomMere'));
  nationaliteInput = element(by.id('field_nationalite'));
  typePieceIdentiteInput = element(by.id('field_typePieceIdentite'));
  ninInput = element(by.id('field_nin'));
  ninCedeaoInput = element(by.id('field_ninCedeao'));
  numPieceIdentiteInput = element(by.id('field_numPieceIdentite'));
  delivreLeInput = element(by.id('field_delivreLe'));
  lieuDelivranceInput = element(by.id('field_lieuDelivrance'));
  expireLeInput = element(by.id('field_expireLe'));
  villeNaissanceInput = element(by.id('field_villeNaissance'));
  paysNaissanceInput = element(by.id('field_paysNaissance'));
  employeurPrecInput = element(by.id('field_employeurPrec'));
  paysInput = element(by.id('field_pays'));
  regionInput = element(by.id('field_region'));
  departmentInput = element(by.id('field_department'));
  arondissementInput = element(by.id('field_arondissement'));
  communeInput = element(by.id('field_commune'));
  qartierInput = element(by.id('field_qartier'));
  addressInput = element(by.id('field_address'));
  boitePostaleInput = element(by.id('field_boitePostale'));
  typeMouvementInput = element(by.id('field_typeMouvement'));
  natureContratInput = element(by.id('field_natureContrat'));
  dateDebutContratInput = element(by.id('field_dateDebutContrat'));
  dateFinContratInput = element(by.id('field_dateFinContrat'));
  professionInput = element(by.id('field_profession'));
  emploiInput = element(by.id('field_emploi'));
  nonCadreInput = element(by.id('field_nonCadre'));
  ouiCadreInput = element(by.id('field_ouiCadre'));
  conventionApplicableInput = element(by.id('field_conventionApplicable'));
  salaireContractuelInput = element(by.id('field_salaireContractuel'));
  tempsTravailInput = element(by.id('field_tempsTravail'));
  categorieInput = element(by.id('field_categorie'));
  motifSortieInput = element(by.id('field_motifSortie'));
  totSalAssCssPf1Input = element(by.id('field_totSalAssCssPf1'));
  totSalAssCssAtmp1Input = element(by.id('field_totSalAssCssAtmp1'));
  totSalAssIpresRg1Input = element(by.id('field_totSalAssIpresRg1'));
  totSalAssIpresRcc1Input = element(by.id('field_totSalAssIpresRcc1'));
  salaireBrut1Input = element(by.id('field_salaireBrut1'));
  nombreJours1Input = element(by.id('field_nombreJours1'));
  nombreHeures1Input = element(by.id('field_nombreHeures1'));
  tempsTravail1Input = element(by.id('field_tempsTravail1'));
  trancheTravail1Input = element(by.id('field_trancheTravail1'));
  regimeGeneral1Input = element(by.id('field_regimeGeneral1'));
  regimCompCadre1Input = element(by.id('field_regimCompCadre1'));
  dateEffetRegimeCadre1Input = element(by.id('field_dateEffetRegimeCadre1'));
  totSalAssCssPf2Input = element(by.id('field_totSalAssCssPf2'));
  totSalAssCssAtmp2Input = element(by.id('field_totSalAssCssAtmp2'));
  totSalAssIpresRg2Input = element(by.id('field_totSalAssIpresRg2'));
  totSalAssIpresRcc2Input = element(by.id('field_totSalAssIpresRcc2'));
  salaireBrut2Input = element(by.id('field_salaireBrut2'));
  nombreJours2Input = element(by.id('field_nombreJours2'));
  nombreHeures2Input = element(by.id('field_nombreHeures2'));
  tempsTravail2Input = element(by.id('field_tempsTravail2'));
  trancheTravail2Input = element(by.id('field_trancheTravail2'));
  regimeGeneral2Input = element(by.id('field_regimeGeneral2'));
  regimCompCadre2Input = element(by.id('field_regimCompCadre2'));
  dateEffetRegimeCadre2Input = element(by.id('field_dateEffetRegimeCadre2'));
  totSalAssCssPf3Input = element(by.id('field_totSalAssCssPf3'));
  totSalAssCssAtmp3Input = element(by.id('field_totSalAssCssAtmp3'));
  totSalAssIpresRg3Input = element(by.id('field_totSalAssIpresRg3'));
  totSalAssIpresRcc3Input = element(by.id('field_totSalAssIpresRcc3'));
  salaireBrut3Input = element(by.id('field_salaireBrut3'));
  nombreJours3Input = element(by.id('field_nombreJours3'));
  nombreHeures3Input = element(by.id('field_nombreHeures3'));
  tempsTravail3Input = element(by.id('field_tempsTravail3'));
  trancheTravail3Input = element(by.id('field_trancheTravail3'));
  regimeGeneral3Input = element(by.id('field_regimeGeneral3'));
  regimCompCadre3Input = element(by.id('field_regimCompCadre3'));
  dateEffetRegimeCadre3Input = element(by.id('field_dateEffetRegimeCadre3'));

  declarationSelect = element(by.id('field_declaration'));
  employeurSelect = element(by.id('field_employeur'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setRechercheEmployeInput(rechercheEmploye: string): Promise<void> {
    await this.rechercheEmployeInput.sendKeys(rechercheEmploye);
  }

  async getRechercheEmployeInput(): Promise<string> {
    return await this.rechercheEmployeInput.getAttribute('value');
  }

  async setNomEmployeInput(nomEmploye: string): Promise<void> {
    await this.nomEmployeInput.sendKeys(nomEmploye);
  }

  async getNomEmployeInput(): Promise<string> {
    return await this.nomEmployeInput.getAttribute('value');
  }

  async setPrenomEmployeInput(prenomEmploye: string): Promise<void> {
    await this.prenomEmployeInput.sendKeys(prenomEmploye);
  }

  async getPrenomEmployeInput(): Promise<string> {
    return await this.prenomEmployeInput.getAttribute('value');
  }

  async setSexeInput(sexe: string): Promise<void> {
    await this.sexeInput.sendKeys(sexe);
  }

  async getSexeInput(): Promise<string> {
    return await this.sexeInput.getAttribute('value');
  }

  async setEtatCivilInput(etatCivil: string): Promise<void> {
    await this.etatCivilInput.sendKeys(etatCivil);
  }

  async getEtatCivilInput(): Promise<string> {
    return await this.etatCivilInput.getAttribute('value');
  }

  async setDateNaissanceInput(dateNaissance: string): Promise<void> {
    await this.dateNaissanceInput.sendKeys(dateNaissance);
  }

  async getDateNaissanceInput(): Promise<string> {
    return await this.dateNaissanceInput.getAttribute('value');
  }

  async setNumRegNaissInput(numRegNaiss: string): Promise<void> {
    await this.numRegNaissInput.sendKeys(numRegNaiss);
  }

  async getNumRegNaissInput(): Promise<string> {
    return await this.numRegNaissInput.getAttribute('value');
  }

  async setNomPereInput(nomPere: string): Promise<void> {
    await this.nomPereInput.sendKeys(nomPere);
  }

  async getNomPereInput(): Promise<string> {
    return await this.nomPereInput.getAttribute('value');
  }

  async setPrenomPereInput(prenomPere: string): Promise<void> {
    await this.prenomPereInput.sendKeys(prenomPere);
  }

  async getPrenomPereInput(): Promise<string> {
    return await this.prenomPereInput.getAttribute('value');
  }

  async setNomMereInput(nomMere: string): Promise<void> {
    await this.nomMereInput.sendKeys(nomMere);
  }

  async getNomMereInput(): Promise<string> {
    return await this.nomMereInput.getAttribute('value');
  }

  async setPrenomMereInput(prenomMere: string): Promise<void> {
    await this.prenomMereInput.sendKeys(prenomMere);
  }

  async getPrenomMereInput(): Promise<string> {
    return await this.prenomMereInput.getAttribute('value');
  }

  async setNationaliteInput(nationalite: string): Promise<void> {
    await this.nationaliteInput.sendKeys(nationalite);
  }

  async getNationaliteInput(): Promise<string> {
    return await this.nationaliteInput.getAttribute('value');
  }

  async setTypePieceIdentiteInput(typePieceIdentite: string): Promise<void> {
    await this.typePieceIdentiteInput.sendKeys(typePieceIdentite);
  }

  async getTypePieceIdentiteInput(): Promise<string> {
    return await this.typePieceIdentiteInput.getAttribute('value');
  }

  async setNinInput(nin: string): Promise<void> {
    await this.ninInput.sendKeys(nin);
  }

  async getNinInput(): Promise<string> {
    return await this.ninInput.getAttribute('value');
  }

  async setNinCedeaoInput(ninCedeao: string): Promise<void> {
    await this.ninCedeaoInput.sendKeys(ninCedeao);
  }

  async getNinCedeaoInput(): Promise<string> {
    return await this.ninCedeaoInput.getAttribute('value');
  }

  async setNumPieceIdentiteInput(numPieceIdentite: string): Promise<void> {
    await this.numPieceIdentiteInput.sendKeys(numPieceIdentite);
  }

  async getNumPieceIdentiteInput(): Promise<string> {
    return await this.numPieceIdentiteInput.getAttribute('value');
  }

  async setDelivreLeInput(delivreLe: string): Promise<void> {
    await this.delivreLeInput.sendKeys(delivreLe);
  }

  async getDelivreLeInput(): Promise<string> {
    return await this.delivreLeInput.getAttribute('value');
  }

  async setLieuDelivranceInput(lieuDelivrance: string): Promise<void> {
    await this.lieuDelivranceInput.sendKeys(lieuDelivrance);
  }

  async getLieuDelivranceInput(): Promise<string> {
    return await this.lieuDelivranceInput.getAttribute('value');
  }

  async setExpireLeInput(expireLe: string): Promise<void> {
    await this.expireLeInput.sendKeys(expireLe);
  }

  async getExpireLeInput(): Promise<string> {
    return await this.expireLeInput.getAttribute('value');
  }

  async setVilleNaissanceInput(villeNaissance: string): Promise<void> {
    await this.villeNaissanceInput.sendKeys(villeNaissance);
  }

  async getVilleNaissanceInput(): Promise<string> {
    return await this.villeNaissanceInput.getAttribute('value');
  }

  async setPaysNaissanceInput(paysNaissance: string): Promise<void> {
    await this.paysNaissanceInput.sendKeys(paysNaissance);
  }

  async getPaysNaissanceInput(): Promise<string> {
    return await this.paysNaissanceInput.getAttribute('value');
  }

  async setEmployeurPrecInput(employeurPrec: string): Promise<void> {
    await this.employeurPrecInput.sendKeys(employeurPrec);
  }

  async getEmployeurPrecInput(): Promise<string> {
    return await this.employeurPrecInput.getAttribute('value');
  }

  async setPaysInput(pays: string): Promise<void> {
    await this.paysInput.sendKeys(pays);
  }

  async getPaysInput(): Promise<string> {
    return await this.paysInput.getAttribute('value');
  }

  async setRegionInput(region: string): Promise<void> {
    await this.regionInput.sendKeys(region);
  }

  async getRegionInput(): Promise<string> {
    return await this.regionInput.getAttribute('value');
  }

  async setDepartmentInput(department: string): Promise<void> {
    await this.departmentInput.sendKeys(department);
  }

  async getDepartmentInput(): Promise<string> {
    return await this.departmentInput.getAttribute('value');
  }

  async setArondissementInput(arondissement: string): Promise<void> {
    await this.arondissementInput.sendKeys(arondissement);
  }

  async getArondissementInput(): Promise<string> {
    return await this.arondissementInput.getAttribute('value');
  }

  async setCommuneInput(commune: string): Promise<void> {
    await this.communeInput.sendKeys(commune);
  }

  async getCommuneInput(): Promise<string> {
    return await this.communeInput.getAttribute('value');
  }

  async setQartierInput(qartier: string): Promise<void> {
    await this.qartierInput.sendKeys(qartier);
  }

  async getQartierInput(): Promise<string> {
    return await this.qartierInput.getAttribute('value');
  }

  async setAddressInput(address: string): Promise<void> {
    await this.addressInput.sendKeys(address);
  }

  async getAddressInput(): Promise<string> {
    return await this.addressInput.getAttribute('value');
  }

  async setBoitePostaleInput(boitePostale: string): Promise<void> {
    await this.boitePostaleInput.sendKeys(boitePostale);
  }

  async getBoitePostaleInput(): Promise<string> {
    return await this.boitePostaleInput.getAttribute('value');
  }

  async setTypeMouvementInput(typeMouvement: string): Promise<void> {
    await this.typeMouvementInput.sendKeys(typeMouvement);
  }

  async getTypeMouvementInput(): Promise<string> {
    return await this.typeMouvementInput.getAttribute('value');
  }

  async setNatureContratInput(natureContrat: string): Promise<void> {
    await this.natureContratInput.sendKeys(natureContrat);
  }

  async getNatureContratInput(): Promise<string> {
    return await this.natureContratInput.getAttribute('value');
  }

  async setDateDebutContratInput(dateDebutContrat: string): Promise<void> {
    await this.dateDebutContratInput.sendKeys(dateDebutContrat);
  }

  async getDateDebutContratInput(): Promise<string> {
    return await this.dateDebutContratInput.getAttribute('value');
  }

  async setDateFinContratInput(dateFinContrat: string): Promise<void> {
    await this.dateFinContratInput.sendKeys(dateFinContrat);
  }

  async getDateFinContratInput(): Promise<string> {
    return await this.dateFinContratInput.getAttribute('value');
  }

  async setProfessionInput(profession: string): Promise<void> {
    await this.professionInput.sendKeys(profession);
  }

  async getProfessionInput(): Promise<string> {
    return await this.professionInput.getAttribute('value');
  }

  async setEmploiInput(emploi: string): Promise<void> {
    await this.emploiInput.sendKeys(emploi);
  }

  async getEmploiInput(): Promise<string> {
    return await this.emploiInput.getAttribute('value');
  }

  async setNonCadreInput(nonCadre: string): Promise<void> {
    await this.nonCadreInput.sendKeys(nonCadre);
  }

  async getNonCadreInput(): Promise<string> {
    return await this.nonCadreInput.getAttribute('value');
  }

  async setOuiCadreInput(ouiCadre: string): Promise<void> {
    await this.ouiCadreInput.sendKeys(ouiCadre);
  }

  async getOuiCadreInput(): Promise<string> {
    return await this.ouiCadreInput.getAttribute('value');
  }

  async setConventionApplicableInput(conventionApplicable: string): Promise<void> {
    await this.conventionApplicableInput.sendKeys(conventionApplicable);
  }

  async getConventionApplicableInput(): Promise<string> {
    return await this.conventionApplicableInput.getAttribute('value');
  }

  async setSalaireContractuelInput(salaireContractuel: string): Promise<void> {
    await this.salaireContractuelInput.sendKeys(salaireContractuel);
  }

  async getSalaireContractuelInput(): Promise<string> {
    return await this.salaireContractuelInput.getAttribute('value');
  }

  async setTempsTravailInput(tempsTravail: string): Promise<void> {
    await this.tempsTravailInput.sendKeys(tempsTravail);
  }

  async getTempsTravailInput(): Promise<string> {
    return await this.tempsTravailInput.getAttribute('value');
  }

  async setCategorieInput(categorie: string): Promise<void> {
    await this.categorieInput.sendKeys(categorie);
  }

  async getCategorieInput(): Promise<string> {
    return await this.categorieInput.getAttribute('value');
  }

  async setMotifSortieInput(motifSortie: string): Promise<void> {
    await this.motifSortieInput.sendKeys(motifSortie);
  }

  async getMotifSortieInput(): Promise<string> {
    return await this.motifSortieInput.getAttribute('value');
  }

  async setTotSalAssCssPf1Input(totSalAssCssPf1: string): Promise<void> {
    await this.totSalAssCssPf1Input.sendKeys(totSalAssCssPf1);
  }

  async getTotSalAssCssPf1Input(): Promise<string> {
    return await this.totSalAssCssPf1Input.getAttribute('value');
  }

  async setTotSalAssCssAtmp1Input(totSalAssCssAtmp1: string): Promise<void> {
    await this.totSalAssCssAtmp1Input.sendKeys(totSalAssCssAtmp1);
  }

  async getTotSalAssCssAtmp1Input(): Promise<string> {
    return await this.totSalAssCssAtmp1Input.getAttribute('value');
  }

  async setTotSalAssIpresRg1Input(totSalAssIpresRg1: string): Promise<void> {
    await this.totSalAssIpresRg1Input.sendKeys(totSalAssIpresRg1);
  }

  async getTotSalAssIpresRg1Input(): Promise<string> {
    return await this.totSalAssIpresRg1Input.getAttribute('value');
  }

  async setTotSalAssIpresRcc1Input(totSalAssIpresRcc1: string): Promise<void> {
    await this.totSalAssIpresRcc1Input.sendKeys(totSalAssIpresRcc1);
  }

  async getTotSalAssIpresRcc1Input(): Promise<string> {
    return await this.totSalAssIpresRcc1Input.getAttribute('value');
  }

  async setSalaireBrut1Input(salaireBrut1: string): Promise<void> {
    await this.salaireBrut1Input.sendKeys(salaireBrut1);
  }

  async getSalaireBrut1Input(): Promise<string> {
    return await this.salaireBrut1Input.getAttribute('value');
  }

  async setNombreJours1Input(nombreJours1: string): Promise<void> {
    await this.nombreJours1Input.sendKeys(nombreJours1);
  }

  async getNombreJours1Input(): Promise<string> {
    return await this.nombreJours1Input.getAttribute('value');
  }

  async setNombreHeures1Input(nombreHeures1: string): Promise<void> {
    await this.nombreHeures1Input.sendKeys(nombreHeures1);
  }

  async getNombreHeures1Input(): Promise<string> {
    return await this.nombreHeures1Input.getAttribute('value');
  }

  async setTempsTravail1Input(tempsTravail1: string): Promise<void> {
    await this.tempsTravail1Input.sendKeys(tempsTravail1);
  }

  async getTempsTravail1Input(): Promise<string> {
    return await this.tempsTravail1Input.getAttribute('value');
  }

  async setTrancheTravail1Input(trancheTravail1: string): Promise<void> {
    await this.trancheTravail1Input.sendKeys(trancheTravail1);
  }

  async getTrancheTravail1Input(): Promise<string> {
    return await this.trancheTravail1Input.getAttribute('value');
  }

  async setRegimeGeneral1Input(regimeGeneral1: string): Promise<void> {
    await this.regimeGeneral1Input.sendKeys(regimeGeneral1);
  }

  async getRegimeGeneral1Input(): Promise<string> {
    return await this.regimeGeneral1Input.getAttribute('value');
  }

  async setRegimCompCadre1Input(regimCompCadre1: string): Promise<void> {
    await this.regimCompCadre1Input.sendKeys(regimCompCadre1);
  }

  async getRegimCompCadre1Input(): Promise<string> {
    return await this.regimCompCadre1Input.getAttribute('value');
  }

  async setDateEffetRegimeCadre1Input(dateEffetRegimeCadre1: string): Promise<void> {
    await this.dateEffetRegimeCadre1Input.sendKeys(dateEffetRegimeCadre1);
  }

  async getDateEffetRegimeCadre1Input(): Promise<string> {
    return await this.dateEffetRegimeCadre1Input.getAttribute('value');
  }

  async setTotSalAssCssPf2Input(totSalAssCssPf2: string): Promise<void> {
    await this.totSalAssCssPf2Input.sendKeys(totSalAssCssPf2);
  }

  async getTotSalAssCssPf2Input(): Promise<string> {
    return await this.totSalAssCssPf2Input.getAttribute('value');
  }

  async setTotSalAssCssAtmp2Input(totSalAssCssAtmp2: string): Promise<void> {
    await this.totSalAssCssAtmp2Input.sendKeys(totSalAssCssAtmp2);
  }

  async getTotSalAssCssAtmp2Input(): Promise<string> {
    return await this.totSalAssCssAtmp2Input.getAttribute('value');
  }

  async setTotSalAssIpresRg2Input(totSalAssIpresRg2: string): Promise<void> {
    await this.totSalAssIpresRg2Input.sendKeys(totSalAssIpresRg2);
  }

  async getTotSalAssIpresRg2Input(): Promise<string> {
    return await this.totSalAssIpresRg2Input.getAttribute('value');
  }

  async setTotSalAssIpresRcc2Input(totSalAssIpresRcc2: string): Promise<void> {
    await this.totSalAssIpresRcc2Input.sendKeys(totSalAssIpresRcc2);
  }

  async getTotSalAssIpresRcc2Input(): Promise<string> {
    return await this.totSalAssIpresRcc2Input.getAttribute('value');
  }

  async setSalaireBrut2Input(salaireBrut2: string): Promise<void> {
    await this.salaireBrut2Input.sendKeys(salaireBrut2);
  }

  async getSalaireBrut2Input(): Promise<string> {
    return await this.salaireBrut2Input.getAttribute('value');
  }

  async setNombreJours2Input(nombreJours2: string): Promise<void> {
    await this.nombreJours2Input.sendKeys(nombreJours2);
  }

  async getNombreJours2Input(): Promise<string> {
    return await this.nombreJours2Input.getAttribute('value');
  }

  async setNombreHeures2Input(nombreHeures2: string): Promise<void> {
    await this.nombreHeures2Input.sendKeys(nombreHeures2);
  }

  async getNombreHeures2Input(): Promise<string> {
    return await this.nombreHeures2Input.getAttribute('value');
  }

  async setTempsTravail2Input(tempsTravail2: string): Promise<void> {
    await this.tempsTravail2Input.sendKeys(tempsTravail2);
  }

  async getTempsTravail2Input(): Promise<string> {
    return await this.tempsTravail2Input.getAttribute('value');
  }

  async setTrancheTravail2Input(trancheTravail2: string): Promise<void> {
    await this.trancheTravail2Input.sendKeys(trancheTravail2);
  }

  async getTrancheTravail2Input(): Promise<string> {
    return await this.trancheTravail2Input.getAttribute('value');
  }

  async setRegimeGeneral2Input(regimeGeneral2: string): Promise<void> {
    await this.regimeGeneral2Input.sendKeys(regimeGeneral2);
  }

  async getRegimeGeneral2Input(): Promise<string> {
    return await this.regimeGeneral2Input.getAttribute('value');
  }

  async setRegimCompCadre2Input(regimCompCadre2: string): Promise<void> {
    await this.regimCompCadre2Input.sendKeys(regimCompCadre2);
  }

  async getRegimCompCadre2Input(): Promise<string> {
    return await this.regimCompCadre2Input.getAttribute('value');
  }

  async setDateEffetRegimeCadre2Input(dateEffetRegimeCadre2: string): Promise<void> {
    await this.dateEffetRegimeCadre2Input.sendKeys(dateEffetRegimeCadre2);
  }

  async getDateEffetRegimeCadre2Input(): Promise<string> {
    return await this.dateEffetRegimeCadre2Input.getAttribute('value');
  }

  async setTotSalAssCssPf3Input(totSalAssCssPf3: string): Promise<void> {
    await this.totSalAssCssPf3Input.sendKeys(totSalAssCssPf3);
  }

  async getTotSalAssCssPf3Input(): Promise<string> {
    return await this.totSalAssCssPf3Input.getAttribute('value');
  }

  async setTotSalAssCssAtmp3Input(totSalAssCssAtmp3: string): Promise<void> {
    await this.totSalAssCssAtmp3Input.sendKeys(totSalAssCssAtmp3);
  }

  async getTotSalAssCssAtmp3Input(): Promise<string> {
    return await this.totSalAssCssAtmp3Input.getAttribute('value');
  }

  async setTotSalAssIpresRg3Input(totSalAssIpresRg3: string): Promise<void> {
    await this.totSalAssIpresRg3Input.sendKeys(totSalAssIpresRg3);
  }

  async getTotSalAssIpresRg3Input(): Promise<string> {
    return await this.totSalAssIpresRg3Input.getAttribute('value');
  }

  async setTotSalAssIpresRcc3Input(totSalAssIpresRcc3: string): Promise<void> {
    await this.totSalAssIpresRcc3Input.sendKeys(totSalAssIpresRcc3);
  }

  async getTotSalAssIpresRcc3Input(): Promise<string> {
    return await this.totSalAssIpresRcc3Input.getAttribute('value');
  }

  async setSalaireBrut3Input(salaireBrut3: string): Promise<void> {
    await this.salaireBrut3Input.sendKeys(salaireBrut3);
  }

  async getSalaireBrut3Input(): Promise<string> {
    return await this.salaireBrut3Input.getAttribute('value');
  }

  async setNombreJours3Input(nombreJours3: string): Promise<void> {
    await this.nombreJours3Input.sendKeys(nombreJours3);
  }

  async getNombreJours3Input(): Promise<string> {
    return await this.nombreJours3Input.getAttribute('value');
  }

  async setNombreHeures3Input(nombreHeures3: string): Promise<void> {
    await this.nombreHeures3Input.sendKeys(nombreHeures3);
  }

  async getNombreHeures3Input(): Promise<string> {
    return await this.nombreHeures3Input.getAttribute('value');
  }

  async setTempsTravail3Input(tempsTravail3: string): Promise<void> {
    await this.tempsTravail3Input.sendKeys(tempsTravail3);
  }

  async getTempsTravail3Input(): Promise<string> {
    return await this.tempsTravail3Input.getAttribute('value');
  }

  async setTrancheTravail3Input(trancheTravail3: string): Promise<void> {
    await this.trancheTravail3Input.sendKeys(trancheTravail3);
  }

  async getTrancheTravail3Input(): Promise<string> {
    return await this.trancheTravail3Input.getAttribute('value');
  }

  async setRegimeGeneral3Input(regimeGeneral3: string): Promise<void> {
    await this.regimeGeneral3Input.sendKeys(regimeGeneral3);
  }

  async getRegimeGeneral3Input(): Promise<string> {
    return await this.regimeGeneral3Input.getAttribute('value');
  }

  async setRegimCompCadre3Input(regimCompCadre3: string): Promise<void> {
    await this.regimCompCadre3Input.sendKeys(regimCompCadre3);
  }

  async getRegimCompCadre3Input(): Promise<string> {
    return await this.regimCompCadre3Input.getAttribute('value');
  }

  async setDateEffetRegimeCadre3Input(dateEffetRegimeCadre3: string): Promise<void> {
    await this.dateEffetRegimeCadre3Input.sendKeys(dateEffetRegimeCadre3);
  }

  async getDateEffetRegimeCadre3Input(): Promise<string> {
    return await this.dateEffetRegimeCadre3Input.getAttribute('value');
  }

  async declarationSelectLastOption(): Promise<void> {
    await this.declarationSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async declarationSelectOption(option: string): Promise<void> {
    await this.declarationSelect.sendKeys(option);
  }

  getDeclarationSelect(): ElementFinder {
    return this.declarationSelect;
  }

  async getDeclarationSelectedOption(): Promise<string> {
    return await this.declarationSelect.element(by.css('option:checked')).getText();
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

export class EmployeDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-employe-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-employe'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
