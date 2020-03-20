package com.secusociale.portail.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * A Employe.
 */
@Entity
@Table(name = "employe")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recherche_employe")
    private String rechercheEmploye;

    @NotNull
    @Column(name = "nom_employe", nullable = false)
    private String nomEmploye;

    @NotNull
    @Column(name = "prenom_employe", nullable = false)
    private String prenomEmploye;

    @NotNull
    @Column(name = "sexe", nullable = false)
    private String sexe;

    @NotNull
    @Column(name = "etat_civil", nullable = false)
    private String etatCivil;

    @NotNull
    @Column(name = "date_naissance", nullable = false)
    private LocalDate dateNaissance;

    @NotNull
    @Column(name = "num_reg_naiss", nullable = false)
    private String numRegNaiss;

    @Column(name = "nom_pere")
    private String nomPere;

    @Column(name = "prenom_pere")
    private String prenomPere;

    @Column(name = "nom_mere")
    private String nomMere;

    @Column(name = "prenom_mere")
    private String prenomMere;

    @NotNull
    @Column(name = "nationalite", nullable = false)
    private String nationalite;

    @Column(name = "type_piece_identite")
    private String typePieceIdentite;

    @Column(name = "nin")
    private String nin;

    @Column(name = "nin_cedeao")
    private String ninCedeao;

    @Column(name = "num_piece_identite")
    private String numPieceIdentite;

    @Column(name = "delivre_le")
    private String delivreLe;

    @Column(name = "lieu_delivrance")
    private String lieuDelivrance;

    @Column(name = "expire_le")
    private String expireLe;

    @Column(name = "ville_naissance")
    private String villeNaissance;

    @Column(name = "pays_naissance")
    private String paysNaissance;

    @Column(name = "employeur_prec")
    private String employeurPrec;

    @Column(name = "pays")
    private String pays;

    @Column(name = "region")
    private String region;

    @Column(name = "department")
    private String department;

    @Column(name = "arondissement")
    private String arondissement;

    @Column(name = "commune")
    private String commune;

    @Column(name = "qartier")
    private String qartier;

    @Column(name = "address")
    private String address;

    @Column(name = "boite_postale")
    private String boitePostale;

    @Column(name = "type_mouvement")
    private String typeMouvement;

    @Column(name = "nature_contrat")
    private String natureContrat;

    @Column(name = "date_debut_contrat")
    private LocalDate dateDebutContrat;

    @Column(name = "date_fin_contrat")
    private LocalDate dateFinContrat;

    @Column(name = "profession")
    private String profession;

    @Column(name = "emploi")
    private String emploi;

    @Column(name = "non_cadre")
    private String nonCadre;

    @Column(name = "oui_cadre")
    private String ouiCadre;

    @Column(name = "convention_applicable")
    private String conventionApplicable;

    @Column(name = "salaire_contractuel", precision = 21, scale = 2)
    private BigDecimal salaireContractuel;

    @Column(name = "temps_travail")
    private Integer tempsTravail;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "motif_sortie")
    private String motifSortie;

    @Column(name = "tot_sal_ass_css_pf_1", precision = 21, scale = 2)
    private BigDecimal totSalAssCssPf1;

    @Column(name = "tot_sal_ass_css_atmp_1", precision = 21, scale = 2)
    private BigDecimal totSalAssCssAtmp1;

    @Column(name = "tot_sal_ass_ipres_rg_1", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRg1;

    @Column(name = "tot_sal_ass_ipres_rcc_1", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRcc1;

    @Column(name = "salaire_brut_1", precision = 21, scale = 2)
    private BigDecimal salaireBrut1;

    @Column(name = "nombre_jours_1")
    private Integer nombreJours1;

    @Column(name = "nombre_heures_1")
    private Integer nombreHeures1;

    @Column(name = "temps_travail_1")
    private String tempsTravail1;

    @Column(name = "tranche_travail_1")
    private String trancheTravail1;

    @Column(name = "regime_general_1")
    private String regimeGeneral1;

    @Column(name = "regim_comp_cadre_1")
    private String regimCompCadre1;

    @Column(name = "date_effet_regime_cadre_1")
    private LocalDate dateEffetRegimeCadre1;

    @Column(name = "tot_sal_ass_css_pf_2", precision = 21, scale = 2)
    private BigDecimal totSalAssCssPf2;

    @Column(name = "tot_sal_ass_css_atmp_2", precision = 21, scale = 2)
    private BigDecimal totSalAssCssAtmp2;

    @Column(name = "tot_sal_ass_ipres_rg_2", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRg2;

    @Column(name = "tot_sal_ass_ipres_rcc_2", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRcc2;

    @Column(name = "salaire_brut_2", precision = 21, scale = 2)
    private BigDecimal salaireBrut2;

    @Column(name = "nombre_jours_2")
    private Integer nombreJours2;

    @Column(name = "nombre_heures_2")
    private Integer nombreHeures2;

    @Column(name = "temps_travail_2")
    private String tempsTravail2;

    @Column(name = "tranche_travail_2")
    private String trancheTravail2;

    @Column(name = "regime_general_2")
    private String regimeGeneral2;

    @Column(name = "regim_comp_cadre_2")
    private String regimCompCadre2;

    @Column(name = "date_effet_regime_cadre_2")
    private LocalDate dateEffetRegimeCadre2;

    @Column(name = "tot_sal_ass_css_pf_3", precision = 21, scale = 2)
    private BigDecimal totSalAssCssPf3;

    @Column(name = "tot_sal_ass_css_atmp_3", precision = 21, scale = 2)
    private BigDecimal totSalAssCssAtmp3;

    @Column(name = "tot_sal_ass_ipres_rg_3", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRg3;

    @Column(name = "tot_sal_ass_ipres_rcc_3", precision = 21, scale = 2)
    private BigDecimal totSalAssIpresRcc3;

    @Column(name = "salaire_brut_3", precision = 21, scale = 2)
    private BigDecimal salaireBrut3;

    @Column(name = "nombre_jours_3")
    private Integer nombreJours3;

    @Column(name = "nombre_heures_3")
    private Integer nombreHeures3;

    @Column(name = "temps_travail_3")
    private String tempsTravail3;

    @Column(name = "tranche_travail_3")
    private String trancheTravail3;

    @Column(name = "regime_general_3")
    private String regimeGeneral3;

    @Column(name = "regim_comp_cadre_3")
    private String regimCompCadre3;

    @Column(name = "date_effet_regime_cadre_3")
    private LocalDate dateEffetRegimeCadre3;

    @ManyToOne
    @JsonIgnoreProperties("employes")
    private Declaration declaration;

    @ManyToOne
    @JsonIgnoreProperties("employes")
    private Immatriculation employeur;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRechercheEmploye() {
        return rechercheEmploye;
    }

    public Employe rechercheEmploye(String rechercheEmploye) {
        this.rechercheEmploye = rechercheEmploye;
        return this;
    }

    public void setRechercheEmploye(String rechercheEmploye) {
        this.rechercheEmploye = rechercheEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public Employe nomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
        return this;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public Employe prenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
        return this;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getSexe() {
        return sexe;
    }

    public Employe sexe(String sexe) {
        this.sexe = sexe;
        return this;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEtatCivil() {
        return etatCivil;
    }

    public Employe etatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
        return this;
    }

    public void setEtatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public Employe dateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumRegNaiss() {
        return numRegNaiss;
    }

    public Employe numRegNaiss(String numRegNaiss) {
        this.numRegNaiss = numRegNaiss;
        return this;
    }

    public void setNumRegNaiss(String numRegNaiss) {
        this.numRegNaiss = numRegNaiss;
    }

    public String getNomPere() {
        return nomPere;
    }

    public Employe nomPere(String nomPere) {
        this.nomPere = nomPere;
        return this;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getPrenomPere() {
        return prenomPere;
    }

    public Employe prenomPere(String prenomPere) {
        this.prenomPere = prenomPere;
        return this;
    }

    public void setPrenomPere(String prenomPere) {
        this.prenomPere = prenomPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public Employe nomMere(String nomMere) {
        this.nomMere = nomMere;
        return this;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getPrenomMere() {
        return prenomMere;
    }

    public Employe prenomMere(String prenomMere) {
        this.prenomMere = prenomMere;
        return this;
    }

    public void setPrenomMere(String prenomMere) {
        this.prenomMere = prenomMere;
    }

    public String getNationalite() {
        return nationalite;
    }

    public Employe nationalite(String nationalite) {
        this.nationalite = nationalite;
        return this;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public Employe typePieceIdentite(String typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
        return this;
    }

    public void setTypePieceIdentite(String typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getNin() {
        return nin;
    }

    public Employe nin(String nin) {
        this.nin = nin;
        return this;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getNinCedeao() {
        return ninCedeao;
    }

    public Employe ninCedeao(String ninCedeao) {
        this.ninCedeao = ninCedeao;
        return this;
    }

    public void setNinCedeao(String ninCedeao) {
        this.ninCedeao = ninCedeao;
    }

    public String getNumPieceIdentite() {
        return numPieceIdentite;
    }

    public Employe numPieceIdentite(String numPieceIdentite) {
        this.numPieceIdentite = numPieceIdentite;
        return this;
    }

    public void setNumPieceIdentite(String numPieceIdentite) {
        this.numPieceIdentite = numPieceIdentite;
    }

    public String getDelivreLe() {
        return delivreLe;
    }

    public Employe delivreLe(String delivreLe) {
        this.delivreLe = delivreLe;
        return this;
    }

    public void setDelivreLe(String delivreLe) {
        this.delivreLe = delivreLe;
    }

    public String getLieuDelivrance() {
        return lieuDelivrance;
    }

    public Employe lieuDelivrance(String lieuDelivrance) {
        this.lieuDelivrance = lieuDelivrance;
        return this;
    }

    public void setLieuDelivrance(String lieuDelivrance) {
        this.lieuDelivrance = lieuDelivrance;
    }

    public String getExpireLe() {
        return expireLe;
    }

    public Employe expireLe(String expireLe) {
        this.expireLe = expireLe;
        return this;
    }

    public void setExpireLe(String expireLe) {
        this.expireLe = expireLe;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public Employe villeNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
        return this;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public String getPaysNaissance() {
        return paysNaissance;
    }

    public Employe paysNaissance(String paysNaissance) {
        this.paysNaissance = paysNaissance;
        return this;
    }

    public void setPaysNaissance(String paysNaissance) {
        this.paysNaissance = paysNaissance;
    }

    public String getEmployeurPrec() {
        return employeurPrec;
    }

    public Employe employeurPrec(String employeurPrec) {
        this.employeurPrec = employeurPrec;
        return this;
    }

    public void setEmployeurPrec(String employeurPrec) {
        this.employeurPrec = employeurPrec;
    }

    public String getPays() {
        return pays;
    }

    public Employe pays(String pays) {
        this.pays = pays;
        return this;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegion() {
        return region;
    }

    public Employe region(String region) {
        this.region = region;
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartment() {
        return department;
    }

    public Employe department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getArondissement() {
        return arondissement;
    }

    public Employe arondissement(String arondissement) {
        this.arondissement = arondissement;
        return this;
    }

    public void setArondissement(String arondissement) {
        this.arondissement = arondissement;
    }

    public String getCommune() {
        return commune;
    }

    public Employe commune(String commune) {
        this.commune = commune;
        return this;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getQartier() {
        return qartier;
    }

    public Employe qartier(String qartier) {
        this.qartier = qartier;
        return this;
    }

    public void setQartier(String qartier) {
        this.qartier = qartier;
    }

    public String getAddress() {
        return address;
    }

    public Employe address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBoitePostale() {
        return boitePostale;
    }

    public Employe boitePostale(String boitePostale) {
        this.boitePostale = boitePostale;
        return this;
    }

    public void setBoitePostale(String boitePostale) {
        this.boitePostale = boitePostale;
    }

    public String getTypeMouvement() {
        return typeMouvement;
    }

    public Employe typeMouvement(String typeMouvement) {
        this.typeMouvement = typeMouvement;
        return this;
    }

    public void setTypeMouvement(String typeMouvement) {
        this.typeMouvement = typeMouvement;
    }

    public String getNatureContrat() {
        return natureContrat;
    }

    public Employe natureContrat(String natureContrat) {
        this.natureContrat = natureContrat;
        return this;
    }

    public void setNatureContrat(String natureContrat) {
        this.natureContrat = natureContrat;
    }

    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }

    public Employe dateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
        return this;
    }

    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public Employe dateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
        return this;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public String getProfession() {
        return profession;
    }

    public Employe profession(String profession) {
        this.profession = profession;
        return this;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmploi() {
        return emploi;
    }

    public Employe emploi(String emploi) {
        this.emploi = emploi;
        return this;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public String getNonCadre() {
        return nonCadre;
    }

    public Employe nonCadre(String nonCadre) {
        this.nonCadre = nonCadre;
        return this;
    }

    public void setNonCadre(String nonCadre) {
        this.nonCadre = nonCadre;
    }

    public String getOuiCadre() {
        return ouiCadre;
    }

    public Employe ouiCadre(String ouiCadre) {
        this.ouiCadre = ouiCadre;
        return this;
    }

    public void setOuiCadre(String ouiCadre) {
        this.ouiCadre = ouiCadre;
    }

    public String getConventionApplicable() {
        return conventionApplicable;
    }

    public Employe conventionApplicable(String conventionApplicable) {
        this.conventionApplicable = conventionApplicable;
        return this;
    }

    public void setConventionApplicable(String conventionApplicable) {
        this.conventionApplicable = conventionApplicable;
    }

    public BigDecimal getSalaireContractuel() {
        return salaireContractuel;
    }

    public Employe salaireContractuel(BigDecimal salaireContractuel) {
        this.salaireContractuel = salaireContractuel;
        return this;
    }

    public void setSalaireContractuel(BigDecimal salaireContractuel) {
        this.salaireContractuel = salaireContractuel;
    }

    public Integer getTempsTravail() {
        return tempsTravail;
    }

    public Employe tempsTravail(Integer tempsTravail) {
        this.tempsTravail = tempsTravail;
        return this;
    }

    public void setTempsTravail(Integer tempsTravail) {
        this.tempsTravail = tempsTravail;
    }

    public String getCategorie() {
        return categorie;
    }

    public Employe categorie(String categorie) {
        this.categorie = categorie;
        return this;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getMotifSortie() {
        return motifSortie;
    }

    public Employe motifSortie(String motifSortie) {
        this.motifSortie = motifSortie;
        return this;
    }

    public void setMotifSortie(String motifSortie) {
        this.motifSortie = motifSortie;
    }

    public BigDecimal getTotSalAssCssPf1() {
        return totSalAssCssPf1;
    }

    public Employe totSalAssCssPf1(BigDecimal totSalAssCssPf1) {
        this.totSalAssCssPf1 = totSalAssCssPf1;
        return this;
    }

    public void setTotSalAssCssPf1(BigDecimal totSalAssCssPf1) {
        this.totSalAssCssPf1 = totSalAssCssPf1;
    }

    public BigDecimal getTotSalAssCssAtmp1() {
        return totSalAssCssAtmp1;
    }

    public Employe totSalAssCssAtmp1(BigDecimal totSalAssCssAtmp1) {
        this.totSalAssCssAtmp1 = totSalAssCssAtmp1;
        return this;
    }

    public void setTotSalAssCssAtmp1(BigDecimal totSalAssCssAtmp1) {
        this.totSalAssCssAtmp1 = totSalAssCssAtmp1;
    }

    public BigDecimal getTotSalAssIpresRg1() {
        return totSalAssIpresRg1;
    }

    public Employe totSalAssIpresRg1(BigDecimal totSalAssIpresRg1) {
        this.totSalAssIpresRg1 = totSalAssIpresRg1;
        return this;
    }

    public void setTotSalAssIpresRg1(BigDecimal totSalAssIpresRg1) {
        this.totSalAssIpresRg1 = totSalAssIpresRg1;
    }

    public BigDecimal getTotSalAssIpresRcc1() {
        return totSalAssIpresRcc1;
    }

    public Employe totSalAssIpresRcc1(BigDecimal totSalAssIpresRcc1) {
        this.totSalAssIpresRcc1 = totSalAssIpresRcc1;
        return this;
    }

    public void setTotSalAssIpresRcc1(BigDecimal totSalAssIpresRcc1) {
        this.totSalAssIpresRcc1 = totSalAssIpresRcc1;
    }

    public BigDecimal getSalaireBrut1() {
        return salaireBrut1;
    }

    public Employe salaireBrut1(BigDecimal salaireBrut1) {
        this.salaireBrut1 = salaireBrut1;
        return this;
    }

    public void setSalaireBrut1(BigDecimal salaireBrut1) {
        this.salaireBrut1 = salaireBrut1;
    }

    public Integer getNombreJours1() {
        return nombreJours1;
    }

    public Employe nombreJours1(Integer nombreJours1) {
        this.nombreJours1 = nombreJours1;
        return this;
    }

    public void setNombreJours1(Integer nombreJours1) {
        this.nombreJours1 = nombreJours1;
    }

    public Integer getNombreHeures1() {
        return nombreHeures1;
    }

    public Employe nombreHeures1(Integer nombreHeures1) {
        this.nombreHeures1 = nombreHeures1;
        return this;
    }

    public void setNombreHeures1(Integer nombreHeures1) {
        this.nombreHeures1 = nombreHeures1;
    }

    public String getTempsTravail1() {
        return tempsTravail1;
    }

    public Employe tempsTravail1(String tempsTravail1) {
        this.tempsTravail1 = tempsTravail1;
        return this;
    }

    public void setTempsTravail1(String tempsTravail1) {
        this.tempsTravail1 = tempsTravail1;
    }

    public String getTrancheTravail1() {
        return trancheTravail1;
    }

    public Employe trancheTravail1(String trancheTravail1) {
        this.trancheTravail1 = trancheTravail1;
        return this;
    }

    public void setTrancheTravail1(String trancheTravail1) {
        this.trancheTravail1 = trancheTravail1;
    }

    public String getRegimeGeneral1() {
        return regimeGeneral1;
    }

    public Employe regimeGeneral1(String regimeGeneral1) {
        this.regimeGeneral1 = regimeGeneral1;
        return this;
    }

    public void setRegimeGeneral1(String regimeGeneral1) {
        this.regimeGeneral1 = regimeGeneral1;
    }

    public String getRegimCompCadre1() {
        return regimCompCadre1;
    }

    public Employe regimCompCadre1(String regimCompCadre1) {
        this.regimCompCadre1 = regimCompCadre1;
        return this;
    }

    public void setRegimCompCadre1(String regimCompCadre1) {
        this.regimCompCadre1 = regimCompCadre1;
    }

    public LocalDate getDateEffetRegimeCadre1() {
        return dateEffetRegimeCadre1;
    }

    public Employe dateEffetRegimeCadre1(LocalDate dateEffetRegimeCadre1) {
        this.dateEffetRegimeCadre1 = dateEffetRegimeCadre1;
        return this;
    }

    public void setDateEffetRegimeCadre1(LocalDate dateEffetRegimeCadre1) {
        this.dateEffetRegimeCadre1 = dateEffetRegimeCadre1;
    }

    public BigDecimal getTotSalAssCssPf2() {
        return totSalAssCssPf2;
    }

    public Employe totSalAssCssPf2(BigDecimal totSalAssCssPf2) {
        this.totSalAssCssPf2 = totSalAssCssPf2;
        return this;
    }

    public void setTotSalAssCssPf2(BigDecimal totSalAssCssPf2) {
        this.totSalAssCssPf2 = totSalAssCssPf2;
    }

    public BigDecimal getTotSalAssCssAtmp2() {
        return totSalAssCssAtmp2;
    }

    public Employe totSalAssCssAtmp2(BigDecimal totSalAssCssAtmp2) {
        this.totSalAssCssAtmp2 = totSalAssCssAtmp2;
        return this;
    }

    public void setTotSalAssCssAtmp2(BigDecimal totSalAssCssAtmp2) {
        this.totSalAssCssAtmp2 = totSalAssCssAtmp2;
    }

    public BigDecimal getTotSalAssIpresRg2() {
        return totSalAssIpresRg2;
    }

    public Employe totSalAssIpresRg2(BigDecimal totSalAssIpresRg2) {
        this.totSalAssIpresRg2 = totSalAssIpresRg2;
        return this;
    }

    public void setTotSalAssIpresRg2(BigDecimal totSalAssIpresRg2) {
        this.totSalAssIpresRg2 = totSalAssIpresRg2;
    }

    public BigDecimal getTotSalAssIpresRcc2() {
        return totSalAssIpresRcc2;
    }

    public Employe totSalAssIpresRcc2(BigDecimal totSalAssIpresRcc2) {
        this.totSalAssIpresRcc2 = totSalAssIpresRcc2;
        return this;
    }

    public void setTotSalAssIpresRcc2(BigDecimal totSalAssIpresRcc2) {
        this.totSalAssIpresRcc2 = totSalAssIpresRcc2;
    }

    public BigDecimal getSalaireBrut2() {
        return salaireBrut2;
    }

    public Employe salaireBrut2(BigDecimal salaireBrut2) {
        this.salaireBrut2 = salaireBrut2;
        return this;
    }

    public void setSalaireBrut2(BigDecimal salaireBrut2) {
        this.salaireBrut2 = salaireBrut2;
    }

    public Integer getNombreJours2() {
        return nombreJours2;
    }

    public Employe nombreJours2(Integer nombreJours2) {
        this.nombreJours2 = nombreJours2;
        return this;
    }

    public void setNombreJours2(Integer nombreJours2) {
        this.nombreJours2 = nombreJours2;
    }

    public Integer getNombreHeures2() {
        return nombreHeures2;
    }

    public Employe nombreHeures2(Integer nombreHeures2) {
        this.nombreHeures2 = nombreHeures2;
        return this;
    }

    public void setNombreHeures2(Integer nombreHeures2) {
        this.nombreHeures2 = nombreHeures2;
    }

    public String getTempsTravail2() {
        return tempsTravail2;
    }

    public Employe tempsTravail2(String tempsTravail2) {
        this.tempsTravail2 = tempsTravail2;
        return this;
    }

    public void setTempsTravail2(String tempsTravail2) {
        this.tempsTravail2 = tempsTravail2;
    }

    public String getTrancheTravail2() {
        return trancheTravail2;
    }

    public Employe trancheTravail2(String trancheTravail2) {
        this.trancheTravail2 = trancheTravail2;
        return this;
    }

    public void setTrancheTravail2(String trancheTravail2) {
        this.trancheTravail2 = trancheTravail2;
    }

    public String getRegimeGeneral2() {
        return regimeGeneral2;
    }

    public Employe regimeGeneral2(String regimeGeneral2) {
        this.regimeGeneral2 = regimeGeneral2;
        return this;
    }

    public void setRegimeGeneral2(String regimeGeneral2) {
        this.regimeGeneral2 = regimeGeneral2;
    }

    public String getRegimCompCadre2() {
        return regimCompCadre2;
    }

    public Employe regimCompCadre2(String regimCompCadre2) {
        this.regimCompCadre2 = regimCompCadre2;
        return this;
    }

    public void setRegimCompCadre2(String regimCompCadre2) {
        this.regimCompCadre2 = regimCompCadre2;
    }

    public LocalDate getDateEffetRegimeCadre2() {
        return dateEffetRegimeCadre2;
    }

    public Employe dateEffetRegimeCadre2(LocalDate dateEffetRegimeCadre2) {
        this.dateEffetRegimeCadre2 = dateEffetRegimeCadre2;
        return this;
    }

    public void setDateEffetRegimeCadre2(LocalDate dateEffetRegimeCadre2) {
        this.dateEffetRegimeCadre2 = dateEffetRegimeCadre2;
    }

    public BigDecimal getTotSalAssCssPf3() {
        return totSalAssCssPf3;
    }

    public Employe totSalAssCssPf3(BigDecimal totSalAssCssPf3) {
        this.totSalAssCssPf3 = totSalAssCssPf3;
        return this;
    }

    public void setTotSalAssCssPf3(BigDecimal totSalAssCssPf3) {
        this.totSalAssCssPf3 = totSalAssCssPf3;
    }

    public BigDecimal getTotSalAssCssAtmp3() {
        return totSalAssCssAtmp3;
    }

    public Employe totSalAssCssAtmp3(BigDecimal totSalAssCssAtmp3) {
        this.totSalAssCssAtmp3 = totSalAssCssAtmp3;
        return this;
    }

    public void setTotSalAssCssAtmp3(BigDecimal totSalAssCssAtmp3) {
        this.totSalAssCssAtmp3 = totSalAssCssAtmp3;
    }

    public BigDecimal getTotSalAssIpresRg3() {
        return totSalAssIpresRg3;
    }

    public Employe totSalAssIpresRg3(BigDecimal totSalAssIpresRg3) {
        this.totSalAssIpresRg3 = totSalAssIpresRg3;
        return this;
    }

    public void setTotSalAssIpresRg3(BigDecimal totSalAssIpresRg3) {
        this.totSalAssIpresRg3 = totSalAssIpresRg3;
    }

    public BigDecimal getTotSalAssIpresRcc3() {
        return totSalAssIpresRcc3;
    }

    public Employe totSalAssIpresRcc3(BigDecimal totSalAssIpresRcc3) {
        this.totSalAssIpresRcc3 = totSalAssIpresRcc3;
        return this;
    }

    public void setTotSalAssIpresRcc3(BigDecimal totSalAssIpresRcc3) {
        this.totSalAssIpresRcc3 = totSalAssIpresRcc3;
    }

    public BigDecimal getSalaireBrut3() {
        return salaireBrut3;
    }

    public Employe salaireBrut3(BigDecimal salaireBrut3) {
        this.salaireBrut3 = salaireBrut3;
        return this;
    }

    public void setSalaireBrut3(BigDecimal salaireBrut3) {
        this.salaireBrut3 = salaireBrut3;
    }

    public Integer getNombreJours3() {
        return nombreJours3;
    }

    public Employe nombreJours3(Integer nombreJours3) {
        this.nombreJours3 = nombreJours3;
        return this;
    }

    public void setNombreJours3(Integer nombreJours3) {
        this.nombreJours3 = nombreJours3;
    }

    public Integer getNombreHeures3() {
        return nombreHeures3;
    }

    public Employe nombreHeures3(Integer nombreHeures3) {
        this.nombreHeures3 = nombreHeures3;
        return this;
    }

    public void setNombreHeures3(Integer nombreHeures3) {
        this.nombreHeures3 = nombreHeures3;
    }

    public String getTempsTravail3() {
        return tempsTravail3;
    }

    public Employe tempsTravail3(String tempsTravail3) {
        this.tempsTravail3 = tempsTravail3;
        return this;
    }

    public void setTempsTravail3(String tempsTravail3) {
        this.tempsTravail3 = tempsTravail3;
    }

    public String getTrancheTravail3() {
        return trancheTravail3;
    }

    public Employe trancheTravail3(String trancheTravail3) {
        this.trancheTravail3 = trancheTravail3;
        return this;
    }

    public void setTrancheTravail3(String trancheTravail3) {
        this.trancheTravail3 = trancheTravail3;
    }

    public String getRegimeGeneral3() {
        return regimeGeneral3;
    }

    public Employe regimeGeneral3(String regimeGeneral3) {
        this.regimeGeneral3 = regimeGeneral3;
        return this;
    }

    public void setRegimeGeneral3(String regimeGeneral3) {
        this.regimeGeneral3 = regimeGeneral3;
    }

    public String getRegimCompCadre3() {
        return regimCompCadre3;
    }

    public Employe regimCompCadre3(String regimCompCadre3) {
        this.regimCompCadre3 = regimCompCadre3;
        return this;
    }

    public void setRegimCompCadre3(String regimCompCadre3) {
        this.regimCompCadre3 = regimCompCadre3;
    }

    public LocalDate getDateEffetRegimeCadre3() {
        return dateEffetRegimeCadre3;
    }

    public Employe dateEffetRegimeCadre3(LocalDate dateEffetRegimeCadre3) {
        this.dateEffetRegimeCadre3 = dateEffetRegimeCadre3;
        return this;
    }

    public void setDateEffetRegimeCadre3(LocalDate dateEffetRegimeCadre3) {
        this.dateEffetRegimeCadre3 = dateEffetRegimeCadre3;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public Employe declaration(Declaration declaration) {
        this.declaration = declaration;
        return this;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public Immatriculation getEmployeur() {
        return employeur;
    }

    public Employe employeur(Immatriculation immatriculation) {
        this.employeur = immatriculation;
        return this;
    }

    public void setEmployeur(Immatriculation immatriculation) {
        this.employeur = immatriculation;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employe)) {
            return false;
        }
        return id != null && id.equals(((Employe) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Employe{" +
            "id=" + getId() +
            ", rechercheEmploye='" + getRechercheEmploye() + "'" +
            ", nomEmploye='" + getNomEmploye() + "'" +
            ", prenomEmploye='" + getPrenomEmploye() + "'" +
            ", sexe='" + getSexe() + "'" +
            ", etatCivil='" + getEtatCivil() + "'" +
            ", dateNaissance='" + getDateNaissance() + "'" +
            ", numRegNaiss='" + getNumRegNaiss() + "'" +
            ", nomPere='" + getNomPere() + "'" +
            ", prenomPere='" + getPrenomPere() + "'" +
            ", nomMere='" + getNomMere() + "'" +
            ", prenomMere='" + getPrenomMere() + "'" +
            ", nationalite='" + getNationalite() + "'" +
            ", typePieceIdentite='" + getTypePieceIdentite() + "'" +
            ", nin='" + getNin() + "'" +
            ", ninCedeao='" + getNinCedeao() + "'" +
            ", numPieceIdentite='" + getNumPieceIdentite() + "'" +
            ", delivreLe='" + getDelivreLe() + "'" +
            ", lieuDelivrance='" + getLieuDelivrance() + "'" +
            ", expireLe='" + getExpireLe() + "'" +
            ", villeNaissance='" + getVilleNaissance() + "'" +
            ", paysNaissance='" + getPaysNaissance() + "'" +
            ", employeurPrec='" + getEmployeurPrec() + "'" +
            ", pays='" + getPays() + "'" +
            ", region='" + getRegion() + "'" +
            ", department='" + getDepartment() + "'" +
            ", arondissement='" + getArondissement() + "'" +
            ", commune='" + getCommune() + "'" +
            ", qartier='" + getQartier() + "'" +
            ", address='" + getAddress() + "'" +
            ", boitePostale='" + getBoitePostale() + "'" +
            ", typeMouvement='" + getTypeMouvement() + "'" +
            ", natureContrat='" + getNatureContrat() + "'" +
            ", dateDebutContrat='" + getDateDebutContrat() + "'" +
            ", dateFinContrat='" + getDateFinContrat() + "'" +
            ", profession='" + getProfession() + "'" +
            ", emploi='" + getEmploi() + "'" +
            ", nonCadre='" + getNonCadre() + "'" +
            ", ouiCadre='" + getOuiCadre() + "'" +
            ", conventionApplicable='" + getConventionApplicable() + "'" +
            ", salaireContractuel=" + getSalaireContractuel() +
            ", tempsTravail=" + getTempsTravail() +
            ", categorie='" + getCategorie() + "'" +
            ", motifSortie='" + getMotifSortie() + "'" +
            ", totSalAssCssPf1=" + getTotSalAssCssPf1() +
            ", totSalAssCssAtmp1=" + getTotSalAssCssAtmp1() +
            ", totSalAssIpresRg1=" + getTotSalAssIpresRg1() +
            ", totSalAssIpresRcc1=" + getTotSalAssIpresRcc1() +
            ", salaireBrut1=" + getSalaireBrut1() +
            ", nombreJours1=" + getNombreJours1() +
            ", nombreHeures1=" + getNombreHeures1() +
            ", tempsTravail1='" + getTempsTravail1() + "'" +
            ", trancheTravail1='" + getTrancheTravail1() + "'" +
            ", regimeGeneral1='" + getRegimeGeneral1() + "'" +
            ", regimCompCadre1='" + getRegimCompCadre1() + "'" +
            ", dateEffetRegimeCadre1='" + getDateEffetRegimeCadre1() + "'" +
            ", totSalAssCssPf2=" + getTotSalAssCssPf2() +
            ", totSalAssCssAtmp2=" + getTotSalAssCssAtmp2() +
            ", totSalAssIpresRg2=" + getTotSalAssIpresRg2() +
            ", totSalAssIpresRcc2=" + getTotSalAssIpresRcc2() +
            ", salaireBrut2=" + getSalaireBrut2() +
            ", nombreJours2=" + getNombreJours2() +
            ", nombreHeures2=" + getNombreHeures2() +
            ", tempsTravail2='" + getTempsTravail2() + "'" +
            ", trancheTravail2='" + getTrancheTravail2() + "'" +
            ", regimeGeneral2='" + getRegimeGeneral2() + "'" +
            ", regimCompCadre2='" + getRegimCompCadre2() + "'" +
            ", dateEffetRegimeCadre2='" + getDateEffetRegimeCadre2() + "'" +
            ", totSalAssCssPf3=" + getTotSalAssCssPf3() +
            ", totSalAssCssAtmp3=" + getTotSalAssCssAtmp3() +
            ", totSalAssIpresRg3=" + getTotSalAssIpresRg3() +
            ", totSalAssIpresRcc3=" + getTotSalAssIpresRcc3() +
            ", salaireBrut3=" + getSalaireBrut3() +
            ", nombreJours3=" + getNombreJours3() +
            ", nombreHeures3=" + getNombreHeures3() +
            ", tempsTravail3='" + getTempsTravail3() + "'" +
            ", trancheTravail3='" + getTrancheTravail3() + "'" +
            ", regimeGeneral3='" + getRegimeGeneral3() + "'" +
            ", regimCompCadre3='" + getRegimCompCadre3() + "'" +
            ", dateEffetRegimeCadre3='" + getDateEffetRegimeCadre3() + "'" +
            "}";
    }
}
