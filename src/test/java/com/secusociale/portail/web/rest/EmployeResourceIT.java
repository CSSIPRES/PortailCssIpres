package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.Employe;
import com.secusociale.portail.repository.EmployeRepository;
import com.secusociale.portail.service.EmployeService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link EmployeResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class EmployeResourceIT {

    private static final String DEFAULT_RECHERCHE_EMPLOYE = "AAAAAAAAAA";
    private static final String UPDATED_RECHERCHE_EMPLOYE = "BBBBBBBBBB";

    private static final String DEFAULT_NOM_EMPLOYE = "AAAAAAAAAA";
    private static final String UPDATED_NOM_EMPLOYE = "BBBBBBBBBB";

    private static final String DEFAULT_PRENOM_EMPLOYE = "AAAAAAAAAA";
    private static final String UPDATED_PRENOM_EMPLOYE = "BBBBBBBBBB";

    private static final String DEFAULT_SEXE = "AAAAAAAAAA";
    private static final String UPDATED_SEXE = "BBBBBBBBBB";

    private static final String DEFAULT_ETAT_CIVIL = "AAAAAAAAAA";
    private static final String UPDATED_ETAT_CIVIL = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_NAISSANCE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_NAISSANCE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_NUM_REG_NAISS = "AAAAAAAAAA";
    private static final String UPDATED_NUM_REG_NAISS = "BBBBBBBBBB";

    private static final String DEFAULT_NOM_PERE = "AAAAAAAAAA";
    private static final String UPDATED_NOM_PERE = "BBBBBBBBBB";

    private static final String DEFAULT_PRENOM_PERE = "AAAAAAAAAA";
    private static final String UPDATED_PRENOM_PERE = "BBBBBBBBBB";

    private static final String DEFAULT_NOM_MERE = "AAAAAAAAAA";
    private static final String UPDATED_NOM_MERE = "BBBBBBBBBB";

    private static final String DEFAULT_PRENOM_MERE = "AAAAAAAAAA";
    private static final String UPDATED_PRENOM_MERE = "BBBBBBBBBB";

    private static final String DEFAULT_NATIONALITE = "AAAAAAAAAA";
    private static final String UPDATED_NATIONALITE = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_PIECE_IDENTITE = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_PIECE_IDENTITE = "BBBBBBBBBB";

    private static final String DEFAULT_NIN = "AAAAAAAAAA";
    private static final String UPDATED_NIN = "BBBBBBBBBB";

    private static final String DEFAULT_NIN_CEDEAO = "AAAAAAAAAA";
    private static final String UPDATED_NIN_CEDEAO = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_PIECE_IDENTITE = "AAAAAAAAAA";
    private static final String UPDATED_NUM_PIECE_IDENTITE = "BBBBBBBBBB";

    private static final String DEFAULT_DELIVRE_LE = "AAAAAAAAAA";
    private static final String UPDATED_DELIVRE_LE = "BBBBBBBBBB";

    private static final String DEFAULT_LIEU_DELIVRANCE = "AAAAAAAAAA";
    private static final String UPDATED_LIEU_DELIVRANCE = "BBBBBBBBBB";

    private static final String DEFAULT_EXPIRE_LE = "AAAAAAAAAA";
    private static final String UPDATED_EXPIRE_LE = "BBBBBBBBBB";

    private static final String DEFAULT_VILLE_NAISSANCE = "AAAAAAAAAA";
    private static final String UPDATED_VILLE_NAISSANCE = "BBBBBBBBBB";

    private static final String DEFAULT_PAYS_NAISSANCE = "AAAAAAAAAA";
    private static final String UPDATED_PAYS_NAISSANCE = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOYEUR_PREC = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYEUR_PREC = "BBBBBBBBBB";

    private static final String DEFAULT_PAYS = "AAAAAAAAAA";
    private static final String UPDATED_PAYS = "BBBBBBBBBB";

    private static final String DEFAULT_REGION = "AAAAAAAAAA";
    private static final String UPDATED_REGION = "BBBBBBBBBB";

    private static final String DEFAULT_DEPARTMENT = "AAAAAAAAAA";
    private static final String UPDATED_DEPARTMENT = "BBBBBBBBBB";

    private static final String DEFAULT_ARONDISSEMENT = "AAAAAAAAAA";
    private static final String UPDATED_ARONDISSEMENT = "BBBBBBBBBB";

    private static final String DEFAULT_COMMUNE = "AAAAAAAAAA";
    private static final String UPDATED_COMMUNE = "BBBBBBBBBB";

    private static final String DEFAULT_QARTIER = "AAAAAAAAAA";
    private static final String UPDATED_QARTIER = "BBBBBBBBBB";

    private static final String DEFAULT_ADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_ADDRESS = "BBBBBBBBBB";

    private static final String DEFAULT_BOITE_POSTALE = "AAAAAAAAAA";
    private static final String UPDATED_BOITE_POSTALE = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_MOUVEMENT = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_MOUVEMENT = "BBBBBBBBBB";

    private static final String DEFAULT_NATURE_CONTRAT = "AAAAAAAAAA";
    private static final String UPDATED_NATURE_CONTRAT = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DEBUT_CONTRAT = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DEBUT_CONTRAT = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_FIN_CONTRAT = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_FIN_CONTRAT = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_PROFESSION = "AAAAAAAAAA";
    private static final String UPDATED_PROFESSION = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOI = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOI = "BBBBBBBBBB";

    private static final String DEFAULT_NON_CADRE = "AAAAAAAAAA";
    private static final String UPDATED_NON_CADRE = "BBBBBBBBBB";

    private static final String DEFAULT_OUI_CADRE = "AAAAAAAAAA";
    private static final String UPDATED_OUI_CADRE = "BBBBBBBBBB";

    private static final String DEFAULT_CONVENTION_APPLICABLE = "AAAAAAAAAA";
    private static final String UPDATED_CONVENTION_APPLICABLE = "BBBBBBBBBB";

    private static final BigDecimal DEFAULT_SALAIRE_CONTRACTUEL = new BigDecimal(1);
    private static final BigDecimal UPDATED_SALAIRE_CONTRACTUEL = new BigDecimal(2);

    private static final Integer DEFAULT_TEMPS_TRAVAIL = 1;
    private static final Integer UPDATED_TEMPS_TRAVAIL = 2;

    private static final String DEFAULT_CATEGORIE = "AAAAAAAAAA";
    private static final String UPDATED_CATEGORIE = "BBBBBBBBBB";

    private static final String DEFAULT_MOTIF_SORTIE = "AAAAAAAAAA";
    private static final String UPDATED_MOTIF_SORTIE = "BBBBBBBBBB";

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_PF_1 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_PF_1 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_ATMP_1 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_ATMP_1 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RG_1 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RG_1 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RCC_1 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RCC_1 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_SALAIRE_BRUT_1 = new BigDecimal(1);
    private static final BigDecimal UPDATED_SALAIRE_BRUT_1 = new BigDecimal(2);

    private static final Integer DEFAULT_NOMBRE_JOURS_1 = 1;
    private static final Integer UPDATED_NOMBRE_JOURS_1 = 2;

    private static final Integer DEFAULT_NOMBRE_HEURES_1 = 1;
    private static final Integer UPDATED_NOMBRE_HEURES_1 = 2;

    private static final String DEFAULT_TEMPS_TRAVAIL_1 = "AAAAAAAAAA";
    private static final String UPDATED_TEMPS_TRAVAIL_1 = "BBBBBBBBBB";

    private static final String DEFAULT_TRANCHE_TRAVAIL_1 = "AAAAAAAAAA";
    private static final String UPDATED_TRANCHE_TRAVAIL_1 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIME_GENERAL_1 = "AAAAAAAAAA";
    private static final String UPDATED_REGIME_GENERAL_1 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIM_COMP_CADRE_1 = "AAAAAAAAAA";
    private static final String UPDATED_REGIM_COMP_CADRE_1 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_EFFET_REGIME_CADRE_1 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_EFFET_REGIME_CADRE_1 = LocalDate.now(ZoneId.systemDefault());

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_PF_2 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_PF_2 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_ATMP_2 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_ATMP_2 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RG_2 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RG_2 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RCC_2 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RCC_2 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_SALAIRE_BRUT_2 = new BigDecimal(1);
    private static final BigDecimal UPDATED_SALAIRE_BRUT_2 = new BigDecimal(2);

    private static final Integer DEFAULT_NOMBRE_JOURS_2 = 1;
    private static final Integer UPDATED_NOMBRE_JOURS_2 = 2;

    private static final Integer DEFAULT_NOMBRE_HEURES_2 = 1;
    private static final Integer UPDATED_NOMBRE_HEURES_2 = 2;

    private static final String DEFAULT_TEMPS_TRAVAIL_2 = "AAAAAAAAAA";
    private static final String UPDATED_TEMPS_TRAVAIL_2 = "BBBBBBBBBB";

    private static final String DEFAULT_TRANCHE_TRAVAIL_2 = "AAAAAAAAAA";
    private static final String UPDATED_TRANCHE_TRAVAIL_2 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIME_GENERAL_2 = "AAAAAAAAAA";
    private static final String UPDATED_REGIME_GENERAL_2 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIM_COMP_CADRE_2 = "AAAAAAAAAA";
    private static final String UPDATED_REGIM_COMP_CADRE_2 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_EFFET_REGIME_CADRE_2 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_EFFET_REGIME_CADRE_2 = LocalDate.now(ZoneId.systemDefault());

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_PF_3 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_PF_3 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_CSS_ATMP_3 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_CSS_ATMP_3 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RG_3 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RG_3 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOT_SAL_ASS_IPRES_RCC_3 = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOT_SAL_ASS_IPRES_RCC_3 = new BigDecimal(2);

    private static final BigDecimal DEFAULT_SALAIRE_BRUT_3 = new BigDecimal(1);
    private static final BigDecimal UPDATED_SALAIRE_BRUT_3 = new BigDecimal(2);

    private static final Integer DEFAULT_NOMBRE_JOURS_3 = 1;
    private static final Integer UPDATED_NOMBRE_JOURS_3 = 2;

    private static final Integer DEFAULT_NOMBRE_HEURES_3 = 1;
    private static final Integer UPDATED_NOMBRE_HEURES_3 = 2;

    private static final String DEFAULT_TEMPS_TRAVAIL_3 = "AAAAAAAAAA";
    private static final String UPDATED_TEMPS_TRAVAIL_3 = "BBBBBBBBBB";

    private static final String DEFAULT_TRANCHE_TRAVAIL_3 = "AAAAAAAAAA";
    private static final String UPDATED_TRANCHE_TRAVAIL_3 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIME_GENERAL_3 = "AAAAAAAAAA";
    private static final String UPDATED_REGIME_GENERAL_3 = "BBBBBBBBBB";

    private static final String DEFAULT_REGIM_COMP_CADRE_3 = "AAAAAAAAAA";
    private static final String UPDATED_REGIM_COMP_CADRE_3 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_EFFET_REGIME_CADRE_3 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_EFFET_REGIME_CADRE_3 = LocalDate.now(ZoneId.systemDefault());

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private EmployeService employeService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restEmployeMockMvc;

    private Employe employe;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Employe createEntity(EntityManager em) {
        Employe employe = new Employe()
            .rechercheEmploye(DEFAULT_RECHERCHE_EMPLOYE)
            .nomEmploye(DEFAULT_NOM_EMPLOYE)
            .prenomEmploye(DEFAULT_PRENOM_EMPLOYE)
            .sexe(DEFAULT_SEXE)
            .etatCivil(DEFAULT_ETAT_CIVIL)
            .dateNaissance(DEFAULT_DATE_NAISSANCE)
            .numRegNaiss(DEFAULT_NUM_REG_NAISS)
            .nomPere(DEFAULT_NOM_PERE)
            .prenomPere(DEFAULT_PRENOM_PERE)
            .nomMere(DEFAULT_NOM_MERE)
            .prenomMere(DEFAULT_PRENOM_MERE)
            .nationalite(DEFAULT_NATIONALITE)
            .typePieceIdentite(DEFAULT_TYPE_PIECE_IDENTITE)
            .nin(DEFAULT_NIN)
            .ninCedeao(DEFAULT_NIN_CEDEAO)
            .numPieceIdentite(DEFAULT_NUM_PIECE_IDENTITE)
            .delivreLe(DEFAULT_DELIVRE_LE)
            .lieuDelivrance(DEFAULT_LIEU_DELIVRANCE)
            .expireLe(DEFAULT_EXPIRE_LE)
            .villeNaissance(DEFAULT_VILLE_NAISSANCE)
            .paysNaissance(DEFAULT_PAYS_NAISSANCE)
            .employeurPrec(DEFAULT_EMPLOYEUR_PREC)
            .pays(DEFAULT_PAYS)
            .region(DEFAULT_REGION)
            .department(DEFAULT_DEPARTMENT)
            .arondissement(DEFAULT_ARONDISSEMENT)
            .commune(DEFAULT_COMMUNE)
            .qartier(DEFAULT_QARTIER)
            .address(DEFAULT_ADDRESS)
            .boitePostale(DEFAULT_BOITE_POSTALE)
            .typeMouvement(DEFAULT_TYPE_MOUVEMENT)
            .natureContrat(DEFAULT_NATURE_CONTRAT)
            .dateDebutContrat(DEFAULT_DATE_DEBUT_CONTRAT)
            .dateFinContrat(DEFAULT_DATE_FIN_CONTRAT)
            .profession(DEFAULT_PROFESSION)
            .emploi(DEFAULT_EMPLOI)
            .nonCadre(DEFAULT_NON_CADRE)
            .ouiCadre(DEFAULT_OUI_CADRE)
            .conventionApplicable(DEFAULT_CONVENTION_APPLICABLE)
            .salaireContractuel(DEFAULT_SALAIRE_CONTRACTUEL)
            .tempsTravail(DEFAULT_TEMPS_TRAVAIL)
            .categorie(DEFAULT_CATEGORIE)
            .motifSortie(DEFAULT_MOTIF_SORTIE)
            .totSalAssCssPf1(DEFAULT_TOT_SAL_ASS_CSS_PF_1)
            .totSalAssCssAtmp1(DEFAULT_TOT_SAL_ASS_CSS_ATMP_1)
            .totSalAssIpresRg1(DEFAULT_TOT_SAL_ASS_IPRES_RG_1)
            .totSalAssIpresRcc1(DEFAULT_TOT_SAL_ASS_IPRES_RCC_1)
            .salaireBrut1(DEFAULT_SALAIRE_BRUT_1)
            .nombreJours1(DEFAULT_NOMBRE_JOURS_1)
            .nombreHeures1(DEFAULT_NOMBRE_HEURES_1)
            .tempsTravail1(DEFAULT_TEMPS_TRAVAIL_1)
            .trancheTravail1(DEFAULT_TRANCHE_TRAVAIL_1)
            .regimeGeneral1(DEFAULT_REGIME_GENERAL_1)
            .regimCompCadre1(DEFAULT_REGIM_COMP_CADRE_1)
            .dateEffetRegimeCadre1(DEFAULT_DATE_EFFET_REGIME_CADRE_1)
            .totSalAssCssPf2(DEFAULT_TOT_SAL_ASS_CSS_PF_2)
            .totSalAssCssAtmp2(DEFAULT_TOT_SAL_ASS_CSS_ATMP_2)
            .totSalAssIpresRg2(DEFAULT_TOT_SAL_ASS_IPRES_RG_2)
            .totSalAssIpresRcc2(DEFAULT_TOT_SAL_ASS_IPRES_RCC_2)
            .salaireBrut2(DEFAULT_SALAIRE_BRUT_2)
            .nombreJours2(DEFAULT_NOMBRE_JOURS_2)
            .nombreHeures2(DEFAULT_NOMBRE_HEURES_2)
            .tempsTravail2(DEFAULT_TEMPS_TRAVAIL_2)
            .trancheTravail2(DEFAULT_TRANCHE_TRAVAIL_2)
            .regimeGeneral2(DEFAULT_REGIME_GENERAL_2)
            .regimCompCadre2(DEFAULT_REGIM_COMP_CADRE_2)
            .dateEffetRegimeCadre2(DEFAULT_DATE_EFFET_REGIME_CADRE_2)
            .totSalAssCssPf3(DEFAULT_TOT_SAL_ASS_CSS_PF_3)
            .totSalAssCssAtmp3(DEFAULT_TOT_SAL_ASS_CSS_ATMP_3)
            .totSalAssIpresRg3(DEFAULT_TOT_SAL_ASS_IPRES_RG_3)
            .totSalAssIpresRcc3(DEFAULT_TOT_SAL_ASS_IPRES_RCC_3)
            .salaireBrut3(DEFAULT_SALAIRE_BRUT_3)
            .nombreJours3(DEFAULT_NOMBRE_JOURS_3)
            .nombreHeures3(DEFAULT_NOMBRE_HEURES_3)
            .tempsTravail3(DEFAULT_TEMPS_TRAVAIL_3)
            .trancheTravail3(DEFAULT_TRANCHE_TRAVAIL_3)
            .regimeGeneral3(DEFAULT_REGIME_GENERAL_3)
            .regimCompCadre3(DEFAULT_REGIM_COMP_CADRE_3)
            .dateEffetRegimeCadre3(DEFAULT_DATE_EFFET_REGIME_CADRE_3);
        return employe;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Employe createUpdatedEntity(EntityManager em) {
        Employe employe = new Employe()
            .rechercheEmploye(UPDATED_RECHERCHE_EMPLOYE)
            .nomEmploye(UPDATED_NOM_EMPLOYE)
            .prenomEmploye(UPDATED_PRENOM_EMPLOYE)
            .sexe(UPDATED_SEXE)
            .etatCivil(UPDATED_ETAT_CIVIL)
            .dateNaissance(UPDATED_DATE_NAISSANCE)
            .numRegNaiss(UPDATED_NUM_REG_NAISS)
            .nomPere(UPDATED_NOM_PERE)
            .prenomPere(UPDATED_PRENOM_PERE)
            .nomMere(UPDATED_NOM_MERE)
            .prenomMere(UPDATED_PRENOM_MERE)
            .nationalite(UPDATED_NATIONALITE)
            .typePieceIdentite(UPDATED_TYPE_PIECE_IDENTITE)
            .nin(UPDATED_NIN)
            .ninCedeao(UPDATED_NIN_CEDEAO)
            .numPieceIdentite(UPDATED_NUM_PIECE_IDENTITE)
            .delivreLe(UPDATED_DELIVRE_LE)
            .lieuDelivrance(UPDATED_LIEU_DELIVRANCE)
            .expireLe(UPDATED_EXPIRE_LE)
            .villeNaissance(UPDATED_VILLE_NAISSANCE)
            .paysNaissance(UPDATED_PAYS_NAISSANCE)
            .employeurPrec(UPDATED_EMPLOYEUR_PREC)
            .pays(UPDATED_PAYS)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .boitePostale(UPDATED_BOITE_POSTALE)
            .typeMouvement(UPDATED_TYPE_MOUVEMENT)
            .natureContrat(UPDATED_NATURE_CONTRAT)
            .dateDebutContrat(UPDATED_DATE_DEBUT_CONTRAT)
            .dateFinContrat(UPDATED_DATE_FIN_CONTRAT)
            .profession(UPDATED_PROFESSION)
            .emploi(UPDATED_EMPLOI)
            .nonCadre(UPDATED_NON_CADRE)
            .ouiCadre(UPDATED_OUI_CADRE)
            .conventionApplicable(UPDATED_CONVENTION_APPLICABLE)
            .salaireContractuel(UPDATED_SALAIRE_CONTRACTUEL)
            .tempsTravail(UPDATED_TEMPS_TRAVAIL)
            .categorie(UPDATED_CATEGORIE)
            .motifSortie(UPDATED_MOTIF_SORTIE)
            .totSalAssCssPf1(UPDATED_TOT_SAL_ASS_CSS_PF_1)
            .totSalAssCssAtmp1(UPDATED_TOT_SAL_ASS_CSS_ATMP_1)
            .totSalAssIpresRg1(UPDATED_TOT_SAL_ASS_IPRES_RG_1)
            .totSalAssIpresRcc1(UPDATED_TOT_SAL_ASS_IPRES_RCC_1)
            .salaireBrut1(UPDATED_SALAIRE_BRUT_1)
            .nombreJours1(UPDATED_NOMBRE_JOURS_1)
            .nombreHeures1(UPDATED_NOMBRE_HEURES_1)
            .tempsTravail1(UPDATED_TEMPS_TRAVAIL_1)
            .trancheTravail1(UPDATED_TRANCHE_TRAVAIL_1)
            .regimeGeneral1(UPDATED_REGIME_GENERAL_1)
            .regimCompCadre1(UPDATED_REGIM_COMP_CADRE_1)
            .dateEffetRegimeCadre1(UPDATED_DATE_EFFET_REGIME_CADRE_1)
            .totSalAssCssPf2(UPDATED_TOT_SAL_ASS_CSS_PF_2)
            .totSalAssCssAtmp2(UPDATED_TOT_SAL_ASS_CSS_ATMP_2)
            .totSalAssIpresRg2(UPDATED_TOT_SAL_ASS_IPRES_RG_2)
            .totSalAssIpresRcc2(UPDATED_TOT_SAL_ASS_IPRES_RCC_2)
            .salaireBrut2(UPDATED_SALAIRE_BRUT_2)
            .nombreJours2(UPDATED_NOMBRE_JOURS_2)
            .nombreHeures2(UPDATED_NOMBRE_HEURES_2)
            .tempsTravail2(UPDATED_TEMPS_TRAVAIL_2)
            .trancheTravail2(UPDATED_TRANCHE_TRAVAIL_2)
            .regimeGeneral2(UPDATED_REGIME_GENERAL_2)
            .regimCompCadre2(UPDATED_REGIM_COMP_CADRE_2)
            .dateEffetRegimeCadre2(UPDATED_DATE_EFFET_REGIME_CADRE_2)
            .totSalAssCssPf3(UPDATED_TOT_SAL_ASS_CSS_PF_3)
            .totSalAssCssAtmp3(UPDATED_TOT_SAL_ASS_CSS_ATMP_3)
            .totSalAssIpresRg3(UPDATED_TOT_SAL_ASS_IPRES_RG_3)
            .totSalAssIpresRcc3(UPDATED_TOT_SAL_ASS_IPRES_RCC_3)
            .salaireBrut3(UPDATED_SALAIRE_BRUT_3)
            .nombreJours3(UPDATED_NOMBRE_JOURS_3)
            .nombreHeures3(UPDATED_NOMBRE_HEURES_3)
            .tempsTravail3(UPDATED_TEMPS_TRAVAIL_3)
            .trancheTravail3(UPDATED_TRANCHE_TRAVAIL_3)
            .regimeGeneral3(UPDATED_REGIME_GENERAL_3)
            .regimCompCadre3(UPDATED_REGIM_COMP_CADRE_3)
            .dateEffetRegimeCadre3(UPDATED_DATE_EFFET_REGIME_CADRE_3);
        return employe;
    }

    @BeforeEach
    public void initTest() {
        employe = createEntity(em);
    }

    @Test
    @Transactional
    public void createEmploye() throws Exception {
        int databaseSizeBeforeCreate = employeRepository.findAll().size();

        // Create the Employe
        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isCreated());

        // Validate the Employe in the database
        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeCreate + 1);
        Employe testEmploye = employeList.get(employeList.size() - 1);
        assertThat(testEmploye.getRechercheEmploye()).isEqualTo(DEFAULT_RECHERCHE_EMPLOYE);
        assertThat(testEmploye.getNomEmploye()).isEqualTo(DEFAULT_NOM_EMPLOYE);
        assertThat(testEmploye.getPrenomEmploye()).isEqualTo(DEFAULT_PRENOM_EMPLOYE);
        assertThat(testEmploye.getSexe()).isEqualTo(DEFAULT_SEXE);
        assertThat(testEmploye.getEtatCivil()).isEqualTo(DEFAULT_ETAT_CIVIL);
        assertThat(testEmploye.getDateNaissance()).isEqualTo(DEFAULT_DATE_NAISSANCE);
        assertThat(testEmploye.getNumRegNaiss()).isEqualTo(DEFAULT_NUM_REG_NAISS);
        assertThat(testEmploye.getNomPere()).isEqualTo(DEFAULT_NOM_PERE);
        assertThat(testEmploye.getPrenomPere()).isEqualTo(DEFAULT_PRENOM_PERE);
        assertThat(testEmploye.getNomMere()).isEqualTo(DEFAULT_NOM_MERE);
        assertThat(testEmploye.getPrenomMere()).isEqualTo(DEFAULT_PRENOM_MERE);
        assertThat(testEmploye.getNationalite()).isEqualTo(DEFAULT_NATIONALITE);
        assertThat(testEmploye.getTypePieceIdentite()).isEqualTo(DEFAULT_TYPE_PIECE_IDENTITE);
        assertThat(testEmploye.getNin()).isEqualTo(DEFAULT_NIN);
        assertThat(testEmploye.getNinCedeao()).isEqualTo(DEFAULT_NIN_CEDEAO);
        assertThat(testEmploye.getNumPieceIdentite()).isEqualTo(DEFAULT_NUM_PIECE_IDENTITE);
        assertThat(testEmploye.getDelivreLe()).isEqualTo(DEFAULT_DELIVRE_LE);
        assertThat(testEmploye.getLieuDelivrance()).isEqualTo(DEFAULT_LIEU_DELIVRANCE);
        assertThat(testEmploye.getExpireLe()).isEqualTo(DEFAULT_EXPIRE_LE);
        assertThat(testEmploye.getVilleNaissance()).isEqualTo(DEFAULT_VILLE_NAISSANCE);
        assertThat(testEmploye.getPaysNaissance()).isEqualTo(DEFAULT_PAYS_NAISSANCE);
        assertThat(testEmploye.getEmployeurPrec()).isEqualTo(DEFAULT_EMPLOYEUR_PREC);
        assertThat(testEmploye.getPays()).isEqualTo(DEFAULT_PAYS);
        assertThat(testEmploye.getRegion()).isEqualTo(DEFAULT_REGION);
        assertThat(testEmploye.getDepartment()).isEqualTo(DEFAULT_DEPARTMENT);
        assertThat(testEmploye.getArondissement()).isEqualTo(DEFAULT_ARONDISSEMENT);
        assertThat(testEmploye.getCommune()).isEqualTo(DEFAULT_COMMUNE);
        assertThat(testEmploye.getQartier()).isEqualTo(DEFAULT_QARTIER);
        assertThat(testEmploye.getAddress()).isEqualTo(DEFAULT_ADDRESS);
        assertThat(testEmploye.getBoitePostale()).isEqualTo(DEFAULT_BOITE_POSTALE);
        assertThat(testEmploye.getTypeMouvement()).isEqualTo(DEFAULT_TYPE_MOUVEMENT);
        assertThat(testEmploye.getNatureContrat()).isEqualTo(DEFAULT_NATURE_CONTRAT);
        assertThat(testEmploye.getDateDebutContrat()).isEqualTo(DEFAULT_DATE_DEBUT_CONTRAT);
        assertThat(testEmploye.getDateFinContrat()).isEqualTo(DEFAULT_DATE_FIN_CONTRAT);
        assertThat(testEmploye.getProfession()).isEqualTo(DEFAULT_PROFESSION);
        assertThat(testEmploye.getEmploi()).isEqualTo(DEFAULT_EMPLOI);
        assertThat(testEmploye.getNonCadre()).isEqualTo(DEFAULT_NON_CADRE);
        assertThat(testEmploye.getOuiCadre()).isEqualTo(DEFAULT_OUI_CADRE);
        assertThat(testEmploye.getConventionApplicable()).isEqualTo(DEFAULT_CONVENTION_APPLICABLE);
        assertThat(testEmploye.getSalaireContractuel()).isEqualTo(DEFAULT_SALAIRE_CONTRACTUEL);
        assertThat(testEmploye.getTempsTravail()).isEqualTo(DEFAULT_TEMPS_TRAVAIL);
        assertThat(testEmploye.getCategorie()).isEqualTo(DEFAULT_CATEGORIE);
        assertThat(testEmploye.getMotifSortie()).isEqualTo(DEFAULT_MOTIF_SORTIE);
        assertThat(testEmploye.getTotSalAssCssPf1()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_PF_1);
        assertThat(testEmploye.getTotSalAssCssAtmp1()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_ATMP_1);
        assertThat(testEmploye.getTotSalAssIpresRg1()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RG_1);
        assertThat(testEmploye.getTotSalAssIpresRcc1()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RCC_1);
        assertThat(testEmploye.getSalaireBrut1()).isEqualTo(DEFAULT_SALAIRE_BRUT_1);
        assertThat(testEmploye.getNombreJours1()).isEqualTo(DEFAULT_NOMBRE_JOURS_1);
        assertThat(testEmploye.getNombreHeures1()).isEqualTo(DEFAULT_NOMBRE_HEURES_1);
        assertThat(testEmploye.getTempsTravail1()).isEqualTo(DEFAULT_TEMPS_TRAVAIL_1);
        assertThat(testEmploye.getTrancheTravail1()).isEqualTo(DEFAULT_TRANCHE_TRAVAIL_1);
        assertThat(testEmploye.getRegimeGeneral1()).isEqualTo(DEFAULT_REGIME_GENERAL_1);
        assertThat(testEmploye.getRegimCompCadre1()).isEqualTo(DEFAULT_REGIM_COMP_CADRE_1);
        assertThat(testEmploye.getDateEffetRegimeCadre1()).isEqualTo(DEFAULT_DATE_EFFET_REGIME_CADRE_1);
        assertThat(testEmploye.getTotSalAssCssPf2()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_PF_2);
        assertThat(testEmploye.getTotSalAssCssAtmp2()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_ATMP_2);
        assertThat(testEmploye.getTotSalAssIpresRg2()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RG_2);
        assertThat(testEmploye.getTotSalAssIpresRcc2()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RCC_2);
        assertThat(testEmploye.getSalaireBrut2()).isEqualTo(DEFAULT_SALAIRE_BRUT_2);
        assertThat(testEmploye.getNombreJours2()).isEqualTo(DEFAULT_NOMBRE_JOURS_2);
        assertThat(testEmploye.getNombreHeures2()).isEqualTo(DEFAULT_NOMBRE_HEURES_2);
        assertThat(testEmploye.getTempsTravail2()).isEqualTo(DEFAULT_TEMPS_TRAVAIL_2);
        assertThat(testEmploye.getTrancheTravail2()).isEqualTo(DEFAULT_TRANCHE_TRAVAIL_2);
        assertThat(testEmploye.getRegimeGeneral2()).isEqualTo(DEFAULT_REGIME_GENERAL_2);
        assertThat(testEmploye.getRegimCompCadre2()).isEqualTo(DEFAULT_REGIM_COMP_CADRE_2);
        assertThat(testEmploye.getDateEffetRegimeCadre2()).isEqualTo(DEFAULT_DATE_EFFET_REGIME_CADRE_2);
        assertThat(testEmploye.getTotSalAssCssPf3()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_PF_3);
        assertThat(testEmploye.getTotSalAssCssAtmp3()).isEqualTo(DEFAULT_TOT_SAL_ASS_CSS_ATMP_3);
        assertThat(testEmploye.getTotSalAssIpresRg3()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RG_3);
        assertThat(testEmploye.getTotSalAssIpresRcc3()).isEqualTo(DEFAULT_TOT_SAL_ASS_IPRES_RCC_3);
        assertThat(testEmploye.getSalaireBrut3()).isEqualTo(DEFAULT_SALAIRE_BRUT_3);
        assertThat(testEmploye.getNombreJours3()).isEqualTo(DEFAULT_NOMBRE_JOURS_3);
        assertThat(testEmploye.getNombreHeures3()).isEqualTo(DEFAULT_NOMBRE_HEURES_3);
        assertThat(testEmploye.getTempsTravail3()).isEqualTo(DEFAULT_TEMPS_TRAVAIL_3);
        assertThat(testEmploye.getTrancheTravail3()).isEqualTo(DEFAULT_TRANCHE_TRAVAIL_3);
        assertThat(testEmploye.getRegimeGeneral3()).isEqualTo(DEFAULT_REGIME_GENERAL_3);
        assertThat(testEmploye.getRegimCompCadre3()).isEqualTo(DEFAULT_REGIM_COMP_CADRE_3);
        assertThat(testEmploye.getDateEffetRegimeCadre3()).isEqualTo(DEFAULT_DATE_EFFET_REGIME_CADRE_3);
    }

    @Test
    @Transactional
    public void createEmployeWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = employeRepository.findAll().size();

        // Create the Employe with an existing ID
        employe.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        // Validate the Employe in the database
        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkNomEmployeIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setNomEmploye(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkPrenomEmployeIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setPrenomEmploye(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkSexeIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setSexe(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkEtatCivilIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setEtatCivil(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkDateNaissanceIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setDateNaissance(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNumRegNaissIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setNumRegNaiss(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNationaliteIsRequired() throws Exception {
        int databaseSizeBeforeTest = employeRepository.findAll().size();
        // set the field null
        employe.setNationalite(null);

        // Create the Employe, which fails.

        restEmployeMockMvc.perform(post("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllEmployes() throws Exception {
        // Initialize the database
        employeRepository.saveAndFlush(employe);

        // Get all the employeList
        restEmployeMockMvc.perform(get("/api/employes?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(employe.getId().intValue())))
            .andExpect(jsonPath("$.[*].rechercheEmploye").value(hasItem(DEFAULT_RECHERCHE_EMPLOYE)))
            .andExpect(jsonPath("$.[*].nomEmploye").value(hasItem(DEFAULT_NOM_EMPLOYE)))
            .andExpect(jsonPath("$.[*].prenomEmploye").value(hasItem(DEFAULT_PRENOM_EMPLOYE)))
            .andExpect(jsonPath("$.[*].sexe").value(hasItem(DEFAULT_SEXE)))
            .andExpect(jsonPath("$.[*].etatCivil").value(hasItem(DEFAULT_ETAT_CIVIL)))
            .andExpect(jsonPath("$.[*].dateNaissance").value(hasItem(DEFAULT_DATE_NAISSANCE.toString())))
            .andExpect(jsonPath("$.[*].numRegNaiss").value(hasItem(DEFAULT_NUM_REG_NAISS)))
            .andExpect(jsonPath("$.[*].nomPere").value(hasItem(DEFAULT_NOM_PERE)))
            .andExpect(jsonPath("$.[*].prenomPere").value(hasItem(DEFAULT_PRENOM_PERE)))
            .andExpect(jsonPath("$.[*].nomMere").value(hasItem(DEFAULT_NOM_MERE)))
            .andExpect(jsonPath("$.[*].prenomMere").value(hasItem(DEFAULT_PRENOM_MERE)))
            .andExpect(jsonPath("$.[*].nationalite").value(hasItem(DEFAULT_NATIONALITE)))
            .andExpect(jsonPath("$.[*].typePieceIdentite").value(hasItem(DEFAULT_TYPE_PIECE_IDENTITE)))
            .andExpect(jsonPath("$.[*].nin").value(hasItem(DEFAULT_NIN)))
            .andExpect(jsonPath("$.[*].ninCedeao").value(hasItem(DEFAULT_NIN_CEDEAO)))
            .andExpect(jsonPath("$.[*].numPieceIdentite").value(hasItem(DEFAULT_NUM_PIECE_IDENTITE)))
            .andExpect(jsonPath("$.[*].delivreLe").value(hasItem(DEFAULT_DELIVRE_LE)))
            .andExpect(jsonPath("$.[*].lieuDelivrance").value(hasItem(DEFAULT_LIEU_DELIVRANCE)))
            .andExpect(jsonPath("$.[*].expireLe").value(hasItem(DEFAULT_EXPIRE_LE)))
            .andExpect(jsonPath("$.[*].villeNaissance").value(hasItem(DEFAULT_VILLE_NAISSANCE)))
            .andExpect(jsonPath("$.[*].paysNaissance").value(hasItem(DEFAULT_PAYS_NAISSANCE)))
            .andExpect(jsonPath("$.[*].employeurPrec").value(hasItem(DEFAULT_EMPLOYEUR_PREC)))
            .andExpect(jsonPath("$.[*].pays").value(hasItem(DEFAULT_PAYS)))
            .andExpect(jsonPath("$.[*].region").value(hasItem(DEFAULT_REGION)))
            .andExpect(jsonPath("$.[*].department").value(hasItem(DEFAULT_DEPARTMENT)))
            .andExpect(jsonPath("$.[*].arondissement").value(hasItem(DEFAULT_ARONDISSEMENT)))
            .andExpect(jsonPath("$.[*].commune").value(hasItem(DEFAULT_COMMUNE)))
            .andExpect(jsonPath("$.[*].qartier").value(hasItem(DEFAULT_QARTIER)))
            .andExpect(jsonPath("$.[*].address").value(hasItem(DEFAULT_ADDRESS)))
            .andExpect(jsonPath("$.[*].boitePostale").value(hasItem(DEFAULT_BOITE_POSTALE)))
            .andExpect(jsonPath("$.[*].typeMouvement").value(hasItem(DEFAULT_TYPE_MOUVEMENT)))
            .andExpect(jsonPath("$.[*].natureContrat").value(hasItem(DEFAULT_NATURE_CONTRAT)))
            .andExpect(jsonPath("$.[*].dateDebutContrat").value(hasItem(DEFAULT_DATE_DEBUT_CONTRAT.toString())))
            .andExpect(jsonPath("$.[*].dateFinContrat").value(hasItem(DEFAULT_DATE_FIN_CONTRAT.toString())))
            .andExpect(jsonPath("$.[*].profession").value(hasItem(DEFAULT_PROFESSION)))
            .andExpect(jsonPath("$.[*].emploi").value(hasItem(DEFAULT_EMPLOI)))
            .andExpect(jsonPath("$.[*].nonCadre").value(hasItem(DEFAULT_NON_CADRE)))
            .andExpect(jsonPath("$.[*].ouiCadre").value(hasItem(DEFAULT_OUI_CADRE)))
            .andExpect(jsonPath("$.[*].conventionApplicable").value(hasItem(DEFAULT_CONVENTION_APPLICABLE)))
            .andExpect(jsonPath("$.[*].salaireContractuel").value(hasItem(DEFAULT_SALAIRE_CONTRACTUEL.intValue())))
            .andExpect(jsonPath("$.[*].tempsTravail").value(hasItem(DEFAULT_TEMPS_TRAVAIL)))
            .andExpect(jsonPath("$.[*].categorie").value(hasItem(DEFAULT_CATEGORIE)))
            .andExpect(jsonPath("$.[*].motifSortie").value(hasItem(DEFAULT_MOTIF_SORTIE)))
            .andExpect(jsonPath("$.[*].totSalAssCssPf1").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_PF_1.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssCssAtmp1").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_ATMP_1.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRg1").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RG_1.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRcc1").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RCC_1.intValue())))
            .andExpect(jsonPath("$.[*].salaireBrut1").value(hasItem(DEFAULT_SALAIRE_BRUT_1.intValue())))
            .andExpect(jsonPath("$.[*].nombreJours1").value(hasItem(DEFAULT_NOMBRE_JOURS_1)))
            .andExpect(jsonPath("$.[*].nombreHeures1").value(hasItem(DEFAULT_NOMBRE_HEURES_1)))
            .andExpect(jsonPath("$.[*].tempsTravail1").value(hasItem(DEFAULT_TEMPS_TRAVAIL_1)))
            .andExpect(jsonPath("$.[*].trancheTravail1").value(hasItem(DEFAULT_TRANCHE_TRAVAIL_1)))
            .andExpect(jsonPath("$.[*].regimeGeneral1").value(hasItem(DEFAULT_REGIME_GENERAL_1)))
            .andExpect(jsonPath("$.[*].regimCompCadre1").value(hasItem(DEFAULT_REGIM_COMP_CADRE_1)))
            .andExpect(jsonPath("$.[*].dateEffetRegimeCadre1").value(hasItem(DEFAULT_DATE_EFFET_REGIME_CADRE_1.toString())))
            .andExpect(jsonPath("$.[*].totSalAssCssPf2").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_PF_2.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssCssAtmp2").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_ATMP_2.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRg2").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RG_2.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRcc2").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RCC_2.intValue())))
            .andExpect(jsonPath("$.[*].salaireBrut2").value(hasItem(DEFAULT_SALAIRE_BRUT_2.intValue())))
            .andExpect(jsonPath("$.[*].nombreJours2").value(hasItem(DEFAULT_NOMBRE_JOURS_2)))
            .andExpect(jsonPath("$.[*].nombreHeures2").value(hasItem(DEFAULT_NOMBRE_HEURES_2)))
            .andExpect(jsonPath("$.[*].tempsTravail2").value(hasItem(DEFAULT_TEMPS_TRAVAIL_2)))
            .andExpect(jsonPath("$.[*].trancheTravail2").value(hasItem(DEFAULT_TRANCHE_TRAVAIL_2)))
            .andExpect(jsonPath("$.[*].regimeGeneral2").value(hasItem(DEFAULT_REGIME_GENERAL_2)))
            .andExpect(jsonPath("$.[*].regimCompCadre2").value(hasItem(DEFAULT_REGIM_COMP_CADRE_2)))
            .andExpect(jsonPath("$.[*].dateEffetRegimeCadre2").value(hasItem(DEFAULT_DATE_EFFET_REGIME_CADRE_2.toString())))
            .andExpect(jsonPath("$.[*].totSalAssCssPf3").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_PF_3.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssCssAtmp3").value(hasItem(DEFAULT_TOT_SAL_ASS_CSS_ATMP_3.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRg3").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RG_3.intValue())))
            .andExpect(jsonPath("$.[*].totSalAssIpresRcc3").value(hasItem(DEFAULT_TOT_SAL_ASS_IPRES_RCC_3.intValue())))
            .andExpect(jsonPath("$.[*].salaireBrut3").value(hasItem(DEFAULT_SALAIRE_BRUT_3.intValue())))
            .andExpect(jsonPath("$.[*].nombreJours3").value(hasItem(DEFAULT_NOMBRE_JOURS_3)))
            .andExpect(jsonPath("$.[*].nombreHeures3").value(hasItem(DEFAULT_NOMBRE_HEURES_3)))
            .andExpect(jsonPath("$.[*].tempsTravail3").value(hasItem(DEFAULT_TEMPS_TRAVAIL_3)))
            .andExpect(jsonPath("$.[*].trancheTravail3").value(hasItem(DEFAULT_TRANCHE_TRAVAIL_3)))
            .andExpect(jsonPath("$.[*].regimeGeneral3").value(hasItem(DEFAULT_REGIME_GENERAL_3)))
            .andExpect(jsonPath("$.[*].regimCompCadre3").value(hasItem(DEFAULT_REGIM_COMP_CADRE_3)))
            .andExpect(jsonPath("$.[*].dateEffetRegimeCadre3").value(hasItem(DEFAULT_DATE_EFFET_REGIME_CADRE_3.toString())));
    }
    
    @Test
    @Transactional
    public void getEmploye() throws Exception {
        // Initialize the database
        employeRepository.saveAndFlush(employe);

        // Get the employe
        restEmployeMockMvc.perform(get("/api/employes/{id}", employe.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(employe.getId().intValue()))
            .andExpect(jsonPath("$.rechercheEmploye").value(DEFAULT_RECHERCHE_EMPLOYE))
            .andExpect(jsonPath("$.nomEmploye").value(DEFAULT_NOM_EMPLOYE))
            .andExpect(jsonPath("$.prenomEmploye").value(DEFAULT_PRENOM_EMPLOYE))
            .andExpect(jsonPath("$.sexe").value(DEFAULT_SEXE))
            .andExpect(jsonPath("$.etatCivil").value(DEFAULT_ETAT_CIVIL))
            .andExpect(jsonPath("$.dateNaissance").value(DEFAULT_DATE_NAISSANCE.toString()))
            .andExpect(jsonPath("$.numRegNaiss").value(DEFAULT_NUM_REG_NAISS))
            .andExpect(jsonPath("$.nomPere").value(DEFAULT_NOM_PERE))
            .andExpect(jsonPath("$.prenomPere").value(DEFAULT_PRENOM_PERE))
            .andExpect(jsonPath("$.nomMere").value(DEFAULT_NOM_MERE))
            .andExpect(jsonPath("$.prenomMere").value(DEFAULT_PRENOM_MERE))
            .andExpect(jsonPath("$.nationalite").value(DEFAULT_NATIONALITE))
            .andExpect(jsonPath("$.typePieceIdentite").value(DEFAULT_TYPE_PIECE_IDENTITE))
            .andExpect(jsonPath("$.nin").value(DEFAULT_NIN))
            .andExpect(jsonPath("$.ninCedeao").value(DEFAULT_NIN_CEDEAO))
            .andExpect(jsonPath("$.numPieceIdentite").value(DEFAULT_NUM_PIECE_IDENTITE))
            .andExpect(jsonPath("$.delivreLe").value(DEFAULT_DELIVRE_LE))
            .andExpect(jsonPath("$.lieuDelivrance").value(DEFAULT_LIEU_DELIVRANCE))
            .andExpect(jsonPath("$.expireLe").value(DEFAULT_EXPIRE_LE))
            .andExpect(jsonPath("$.villeNaissance").value(DEFAULT_VILLE_NAISSANCE))
            .andExpect(jsonPath("$.paysNaissance").value(DEFAULT_PAYS_NAISSANCE))
            .andExpect(jsonPath("$.employeurPrec").value(DEFAULT_EMPLOYEUR_PREC))
            .andExpect(jsonPath("$.pays").value(DEFAULT_PAYS))
            .andExpect(jsonPath("$.region").value(DEFAULT_REGION))
            .andExpect(jsonPath("$.department").value(DEFAULT_DEPARTMENT))
            .andExpect(jsonPath("$.arondissement").value(DEFAULT_ARONDISSEMENT))
            .andExpect(jsonPath("$.commune").value(DEFAULT_COMMUNE))
            .andExpect(jsonPath("$.qartier").value(DEFAULT_QARTIER))
            .andExpect(jsonPath("$.address").value(DEFAULT_ADDRESS))
            .andExpect(jsonPath("$.boitePostale").value(DEFAULT_BOITE_POSTALE))
            .andExpect(jsonPath("$.typeMouvement").value(DEFAULT_TYPE_MOUVEMENT))
            .andExpect(jsonPath("$.natureContrat").value(DEFAULT_NATURE_CONTRAT))
            .andExpect(jsonPath("$.dateDebutContrat").value(DEFAULT_DATE_DEBUT_CONTRAT.toString()))
            .andExpect(jsonPath("$.dateFinContrat").value(DEFAULT_DATE_FIN_CONTRAT.toString()))
            .andExpect(jsonPath("$.profession").value(DEFAULT_PROFESSION))
            .andExpect(jsonPath("$.emploi").value(DEFAULT_EMPLOI))
            .andExpect(jsonPath("$.nonCadre").value(DEFAULT_NON_CADRE))
            .andExpect(jsonPath("$.ouiCadre").value(DEFAULT_OUI_CADRE))
            .andExpect(jsonPath("$.conventionApplicable").value(DEFAULT_CONVENTION_APPLICABLE))
            .andExpect(jsonPath("$.salaireContractuel").value(DEFAULT_SALAIRE_CONTRACTUEL.intValue()))
            .andExpect(jsonPath("$.tempsTravail").value(DEFAULT_TEMPS_TRAVAIL))
            .andExpect(jsonPath("$.categorie").value(DEFAULT_CATEGORIE))
            .andExpect(jsonPath("$.motifSortie").value(DEFAULT_MOTIF_SORTIE))
            .andExpect(jsonPath("$.totSalAssCssPf1").value(DEFAULT_TOT_SAL_ASS_CSS_PF_1.intValue()))
            .andExpect(jsonPath("$.totSalAssCssAtmp1").value(DEFAULT_TOT_SAL_ASS_CSS_ATMP_1.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRg1").value(DEFAULT_TOT_SAL_ASS_IPRES_RG_1.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRcc1").value(DEFAULT_TOT_SAL_ASS_IPRES_RCC_1.intValue()))
            .andExpect(jsonPath("$.salaireBrut1").value(DEFAULT_SALAIRE_BRUT_1.intValue()))
            .andExpect(jsonPath("$.nombreJours1").value(DEFAULT_NOMBRE_JOURS_1))
            .andExpect(jsonPath("$.nombreHeures1").value(DEFAULT_NOMBRE_HEURES_1))
            .andExpect(jsonPath("$.tempsTravail1").value(DEFAULT_TEMPS_TRAVAIL_1))
            .andExpect(jsonPath("$.trancheTravail1").value(DEFAULT_TRANCHE_TRAVAIL_1))
            .andExpect(jsonPath("$.regimeGeneral1").value(DEFAULT_REGIME_GENERAL_1))
            .andExpect(jsonPath("$.regimCompCadre1").value(DEFAULT_REGIM_COMP_CADRE_1))
            .andExpect(jsonPath("$.dateEffetRegimeCadre1").value(DEFAULT_DATE_EFFET_REGIME_CADRE_1.toString()))
            .andExpect(jsonPath("$.totSalAssCssPf2").value(DEFAULT_TOT_SAL_ASS_CSS_PF_2.intValue()))
            .andExpect(jsonPath("$.totSalAssCssAtmp2").value(DEFAULT_TOT_SAL_ASS_CSS_ATMP_2.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRg2").value(DEFAULT_TOT_SAL_ASS_IPRES_RG_2.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRcc2").value(DEFAULT_TOT_SAL_ASS_IPRES_RCC_2.intValue()))
            .andExpect(jsonPath("$.salaireBrut2").value(DEFAULT_SALAIRE_BRUT_2.intValue()))
            .andExpect(jsonPath("$.nombreJours2").value(DEFAULT_NOMBRE_JOURS_2))
            .andExpect(jsonPath("$.nombreHeures2").value(DEFAULT_NOMBRE_HEURES_2))
            .andExpect(jsonPath("$.tempsTravail2").value(DEFAULT_TEMPS_TRAVAIL_2))
            .andExpect(jsonPath("$.trancheTravail2").value(DEFAULT_TRANCHE_TRAVAIL_2))
            .andExpect(jsonPath("$.regimeGeneral2").value(DEFAULT_REGIME_GENERAL_2))
            .andExpect(jsonPath("$.regimCompCadre2").value(DEFAULT_REGIM_COMP_CADRE_2))
            .andExpect(jsonPath("$.dateEffetRegimeCadre2").value(DEFAULT_DATE_EFFET_REGIME_CADRE_2.toString()))
            .andExpect(jsonPath("$.totSalAssCssPf3").value(DEFAULT_TOT_SAL_ASS_CSS_PF_3.intValue()))
            .andExpect(jsonPath("$.totSalAssCssAtmp3").value(DEFAULT_TOT_SAL_ASS_CSS_ATMP_3.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRg3").value(DEFAULT_TOT_SAL_ASS_IPRES_RG_3.intValue()))
            .andExpect(jsonPath("$.totSalAssIpresRcc3").value(DEFAULT_TOT_SAL_ASS_IPRES_RCC_3.intValue()))
            .andExpect(jsonPath("$.salaireBrut3").value(DEFAULT_SALAIRE_BRUT_3.intValue()))
            .andExpect(jsonPath("$.nombreJours3").value(DEFAULT_NOMBRE_JOURS_3))
            .andExpect(jsonPath("$.nombreHeures3").value(DEFAULT_NOMBRE_HEURES_3))
            .andExpect(jsonPath("$.tempsTravail3").value(DEFAULT_TEMPS_TRAVAIL_3))
            .andExpect(jsonPath("$.trancheTravail3").value(DEFAULT_TRANCHE_TRAVAIL_3))
            .andExpect(jsonPath("$.regimeGeneral3").value(DEFAULT_REGIME_GENERAL_3))
            .andExpect(jsonPath("$.regimCompCadre3").value(DEFAULT_REGIM_COMP_CADRE_3))
            .andExpect(jsonPath("$.dateEffetRegimeCadre3").value(DEFAULT_DATE_EFFET_REGIME_CADRE_3.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingEmploye() throws Exception {
        // Get the employe
        restEmployeMockMvc.perform(get("/api/employes/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateEmploye() throws Exception {
        // Initialize the database
        employeService.save(employe);

        int databaseSizeBeforeUpdate = employeRepository.findAll().size();

        // Update the employe
        Employe updatedEmploye = employeRepository.findById(employe.getId()).get();
        // Disconnect from session so that the updates on updatedEmploye are not directly saved in db
        em.detach(updatedEmploye);
        updatedEmploye
            .rechercheEmploye(UPDATED_RECHERCHE_EMPLOYE)
            .nomEmploye(UPDATED_NOM_EMPLOYE)
            .prenomEmploye(UPDATED_PRENOM_EMPLOYE)
            .sexe(UPDATED_SEXE)
            .etatCivil(UPDATED_ETAT_CIVIL)
            .dateNaissance(UPDATED_DATE_NAISSANCE)
            .numRegNaiss(UPDATED_NUM_REG_NAISS)
            .nomPere(UPDATED_NOM_PERE)
            .prenomPere(UPDATED_PRENOM_PERE)
            .nomMere(UPDATED_NOM_MERE)
            .prenomMere(UPDATED_PRENOM_MERE)
            .nationalite(UPDATED_NATIONALITE)
            .typePieceIdentite(UPDATED_TYPE_PIECE_IDENTITE)
            .nin(UPDATED_NIN)
            .ninCedeao(UPDATED_NIN_CEDEAO)
            .numPieceIdentite(UPDATED_NUM_PIECE_IDENTITE)
            .delivreLe(UPDATED_DELIVRE_LE)
            .lieuDelivrance(UPDATED_LIEU_DELIVRANCE)
            .expireLe(UPDATED_EXPIRE_LE)
            .villeNaissance(UPDATED_VILLE_NAISSANCE)
            .paysNaissance(UPDATED_PAYS_NAISSANCE)
            .employeurPrec(UPDATED_EMPLOYEUR_PREC)
            .pays(UPDATED_PAYS)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .boitePostale(UPDATED_BOITE_POSTALE)
            .typeMouvement(UPDATED_TYPE_MOUVEMENT)
            .natureContrat(UPDATED_NATURE_CONTRAT)
            .dateDebutContrat(UPDATED_DATE_DEBUT_CONTRAT)
            .dateFinContrat(UPDATED_DATE_FIN_CONTRAT)
            .profession(UPDATED_PROFESSION)
            .emploi(UPDATED_EMPLOI)
            .nonCadre(UPDATED_NON_CADRE)
            .ouiCadre(UPDATED_OUI_CADRE)
            .conventionApplicable(UPDATED_CONVENTION_APPLICABLE)
            .salaireContractuel(UPDATED_SALAIRE_CONTRACTUEL)
            .tempsTravail(UPDATED_TEMPS_TRAVAIL)
            .categorie(UPDATED_CATEGORIE)
            .motifSortie(UPDATED_MOTIF_SORTIE)
            .totSalAssCssPf1(UPDATED_TOT_SAL_ASS_CSS_PF_1)
            .totSalAssCssAtmp1(UPDATED_TOT_SAL_ASS_CSS_ATMP_1)
            .totSalAssIpresRg1(UPDATED_TOT_SAL_ASS_IPRES_RG_1)
            .totSalAssIpresRcc1(UPDATED_TOT_SAL_ASS_IPRES_RCC_1)
            .salaireBrut1(UPDATED_SALAIRE_BRUT_1)
            .nombreJours1(UPDATED_NOMBRE_JOURS_1)
            .nombreHeures1(UPDATED_NOMBRE_HEURES_1)
            .tempsTravail1(UPDATED_TEMPS_TRAVAIL_1)
            .trancheTravail1(UPDATED_TRANCHE_TRAVAIL_1)
            .regimeGeneral1(UPDATED_REGIME_GENERAL_1)
            .regimCompCadre1(UPDATED_REGIM_COMP_CADRE_1)
            .dateEffetRegimeCadre1(UPDATED_DATE_EFFET_REGIME_CADRE_1)
            .totSalAssCssPf2(UPDATED_TOT_SAL_ASS_CSS_PF_2)
            .totSalAssCssAtmp2(UPDATED_TOT_SAL_ASS_CSS_ATMP_2)
            .totSalAssIpresRg2(UPDATED_TOT_SAL_ASS_IPRES_RG_2)
            .totSalAssIpresRcc2(UPDATED_TOT_SAL_ASS_IPRES_RCC_2)
            .salaireBrut2(UPDATED_SALAIRE_BRUT_2)
            .nombreJours2(UPDATED_NOMBRE_JOURS_2)
            .nombreHeures2(UPDATED_NOMBRE_HEURES_2)
            .tempsTravail2(UPDATED_TEMPS_TRAVAIL_2)
            .trancheTravail2(UPDATED_TRANCHE_TRAVAIL_2)
            .regimeGeneral2(UPDATED_REGIME_GENERAL_2)
            .regimCompCadre2(UPDATED_REGIM_COMP_CADRE_2)
            .dateEffetRegimeCadre2(UPDATED_DATE_EFFET_REGIME_CADRE_2)
            .totSalAssCssPf3(UPDATED_TOT_SAL_ASS_CSS_PF_3)
            .totSalAssCssAtmp3(UPDATED_TOT_SAL_ASS_CSS_ATMP_3)
            .totSalAssIpresRg3(UPDATED_TOT_SAL_ASS_IPRES_RG_3)
            .totSalAssIpresRcc3(UPDATED_TOT_SAL_ASS_IPRES_RCC_3)
            .salaireBrut3(UPDATED_SALAIRE_BRUT_3)
            .nombreJours3(UPDATED_NOMBRE_JOURS_3)
            .nombreHeures3(UPDATED_NOMBRE_HEURES_3)
            .tempsTravail3(UPDATED_TEMPS_TRAVAIL_3)
            .trancheTravail3(UPDATED_TRANCHE_TRAVAIL_3)
            .regimeGeneral3(UPDATED_REGIME_GENERAL_3)
            .regimCompCadre3(UPDATED_REGIM_COMP_CADRE_3)
            .dateEffetRegimeCadre3(UPDATED_DATE_EFFET_REGIME_CADRE_3);

        restEmployeMockMvc.perform(put("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedEmploye)))
            .andExpect(status().isOk());

        // Validate the Employe in the database
        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeUpdate);
        Employe testEmploye = employeList.get(employeList.size() - 1);
        assertThat(testEmploye.getRechercheEmploye()).isEqualTo(UPDATED_RECHERCHE_EMPLOYE);
        assertThat(testEmploye.getNomEmploye()).isEqualTo(UPDATED_NOM_EMPLOYE);
        assertThat(testEmploye.getPrenomEmploye()).isEqualTo(UPDATED_PRENOM_EMPLOYE);
        assertThat(testEmploye.getSexe()).isEqualTo(UPDATED_SEXE);
        assertThat(testEmploye.getEtatCivil()).isEqualTo(UPDATED_ETAT_CIVIL);
        assertThat(testEmploye.getDateNaissance()).isEqualTo(UPDATED_DATE_NAISSANCE);
        assertThat(testEmploye.getNumRegNaiss()).isEqualTo(UPDATED_NUM_REG_NAISS);
        assertThat(testEmploye.getNomPere()).isEqualTo(UPDATED_NOM_PERE);
        assertThat(testEmploye.getPrenomPere()).isEqualTo(UPDATED_PRENOM_PERE);
        assertThat(testEmploye.getNomMere()).isEqualTo(UPDATED_NOM_MERE);
        assertThat(testEmploye.getPrenomMere()).isEqualTo(UPDATED_PRENOM_MERE);
        assertThat(testEmploye.getNationalite()).isEqualTo(UPDATED_NATIONALITE);
        assertThat(testEmploye.getTypePieceIdentite()).isEqualTo(UPDATED_TYPE_PIECE_IDENTITE);
        assertThat(testEmploye.getNin()).isEqualTo(UPDATED_NIN);
        assertThat(testEmploye.getNinCedeao()).isEqualTo(UPDATED_NIN_CEDEAO);
        assertThat(testEmploye.getNumPieceIdentite()).isEqualTo(UPDATED_NUM_PIECE_IDENTITE);
        assertThat(testEmploye.getDelivreLe()).isEqualTo(UPDATED_DELIVRE_LE);
        assertThat(testEmploye.getLieuDelivrance()).isEqualTo(UPDATED_LIEU_DELIVRANCE);
        assertThat(testEmploye.getExpireLe()).isEqualTo(UPDATED_EXPIRE_LE);
        assertThat(testEmploye.getVilleNaissance()).isEqualTo(UPDATED_VILLE_NAISSANCE);
        assertThat(testEmploye.getPaysNaissance()).isEqualTo(UPDATED_PAYS_NAISSANCE);
        assertThat(testEmploye.getEmployeurPrec()).isEqualTo(UPDATED_EMPLOYEUR_PREC);
        assertThat(testEmploye.getPays()).isEqualTo(UPDATED_PAYS);
        assertThat(testEmploye.getRegion()).isEqualTo(UPDATED_REGION);
        assertThat(testEmploye.getDepartment()).isEqualTo(UPDATED_DEPARTMENT);
        assertThat(testEmploye.getArondissement()).isEqualTo(UPDATED_ARONDISSEMENT);
        assertThat(testEmploye.getCommune()).isEqualTo(UPDATED_COMMUNE);
        assertThat(testEmploye.getQartier()).isEqualTo(UPDATED_QARTIER);
        assertThat(testEmploye.getAddress()).isEqualTo(UPDATED_ADDRESS);
        assertThat(testEmploye.getBoitePostale()).isEqualTo(UPDATED_BOITE_POSTALE);
        assertThat(testEmploye.getTypeMouvement()).isEqualTo(UPDATED_TYPE_MOUVEMENT);
        assertThat(testEmploye.getNatureContrat()).isEqualTo(UPDATED_NATURE_CONTRAT);
        assertThat(testEmploye.getDateDebutContrat()).isEqualTo(UPDATED_DATE_DEBUT_CONTRAT);
        assertThat(testEmploye.getDateFinContrat()).isEqualTo(UPDATED_DATE_FIN_CONTRAT);
        assertThat(testEmploye.getProfession()).isEqualTo(UPDATED_PROFESSION);
        assertThat(testEmploye.getEmploi()).isEqualTo(UPDATED_EMPLOI);
        assertThat(testEmploye.getNonCadre()).isEqualTo(UPDATED_NON_CADRE);
        assertThat(testEmploye.getOuiCadre()).isEqualTo(UPDATED_OUI_CADRE);
        assertThat(testEmploye.getConventionApplicable()).isEqualTo(UPDATED_CONVENTION_APPLICABLE);
        assertThat(testEmploye.getSalaireContractuel()).isEqualTo(UPDATED_SALAIRE_CONTRACTUEL);
        assertThat(testEmploye.getTempsTravail()).isEqualTo(UPDATED_TEMPS_TRAVAIL);
        assertThat(testEmploye.getCategorie()).isEqualTo(UPDATED_CATEGORIE);
        assertThat(testEmploye.getMotifSortie()).isEqualTo(UPDATED_MOTIF_SORTIE);
        assertThat(testEmploye.getTotSalAssCssPf1()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_PF_1);
        assertThat(testEmploye.getTotSalAssCssAtmp1()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_ATMP_1);
        assertThat(testEmploye.getTotSalAssIpresRg1()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RG_1);
        assertThat(testEmploye.getTotSalAssIpresRcc1()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RCC_1);
        assertThat(testEmploye.getSalaireBrut1()).isEqualTo(UPDATED_SALAIRE_BRUT_1);
        assertThat(testEmploye.getNombreJours1()).isEqualTo(UPDATED_NOMBRE_JOURS_1);
        assertThat(testEmploye.getNombreHeures1()).isEqualTo(UPDATED_NOMBRE_HEURES_1);
        assertThat(testEmploye.getTempsTravail1()).isEqualTo(UPDATED_TEMPS_TRAVAIL_1);
        assertThat(testEmploye.getTrancheTravail1()).isEqualTo(UPDATED_TRANCHE_TRAVAIL_1);
        assertThat(testEmploye.getRegimeGeneral1()).isEqualTo(UPDATED_REGIME_GENERAL_1);
        assertThat(testEmploye.getRegimCompCadre1()).isEqualTo(UPDATED_REGIM_COMP_CADRE_1);
        assertThat(testEmploye.getDateEffetRegimeCadre1()).isEqualTo(UPDATED_DATE_EFFET_REGIME_CADRE_1);
        assertThat(testEmploye.getTotSalAssCssPf2()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_PF_2);
        assertThat(testEmploye.getTotSalAssCssAtmp2()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_ATMP_2);
        assertThat(testEmploye.getTotSalAssIpresRg2()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RG_2);
        assertThat(testEmploye.getTotSalAssIpresRcc2()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RCC_2);
        assertThat(testEmploye.getSalaireBrut2()).isEqualTo(UPDATED_SALAIRE_BRUT_2);
        assertThat(testEmploye.getNombreJours2()).isEqualTo(UPDATED_NOMBRE_JOURS_2);
        assertThat(testEmploye.getNombreHeures2()).isEqualTo(UPDATED_NOMBRE_HEURES_2);
        assertThat(testEmploye.getTempsTravail2()).isEqualTo(UPDATED_TEMPS_TRAVAIL_2);
        assertThat(testEmploye.getTrancheTravail2()).isEqualTo(UPDATED_TRANCHE_TRAVAIL_2);
        assertThat(testEmploye.getRegimeGeneral2()).isEqualTo(UPDATED_REGIME_GENERAL_2);
        assertThat(testEmploye.getRegimCompCadre2()).isEqualTo(UPDATED_REGIM_COMP_CADRE_2);
        assertThat(testEmploye.getDateEffetRegimeCadre2()).isEqualTo(UPDATED_DATE_EFFET_REGIME_CADRE_2);
        assertThat(testEmploye.getTotSalAssCssPf3()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_PF_3);
        assertThat(testEmploye.getTotSalAssCssAtmp3()).isEqualTo(UPDATED_TOT_SAL_ASS_CSS_ATMP_3);
        assertThat(testEmploye.getTotSalAssIpresRg3()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RG_3);
        assertThat(testEmploye.getTotSalAssIpresRcc3()).isEqualTo(UPDATED_TOT_SAL_ASS_IPRES_RCC_3);
        assertThat(testEmploye.getSalaireBrut3()).isEqualTo(UPDATED_SALAIRE_BRUT_3);
        assertThat(testEmploye.getNombreJours3()).isEqualTo(UPDATED_NOMBRE_JOURS_3);
        assertThat(testEmploye.getNombreHeures3()).isEqualTo(UPDATED_NOMBRE_HEURES_3);
        assertThat(testEmploye.getTempsTravail3()).isEqualTo(UPDATED_TEMPS_TRAVAIL_3);
        assertThat(testEmploye.getTrancheTravail3()).isEqualTo(UPDATED_TRANCHE_TRAVAIL_3);
        assertThat(testEmploye.getRegimeGeneral3()).isEqualTo(UPDATED_REGIME_GENERAL_3);
        assertThat(testEmploye.getRegimCompCadre3()).isEqualTo(UPDATED_REGIM_COMP_CADRE_3);
        assertThat(testEmploye.getDateEffetRegimeCadre3()).isEqualTo(UPDATED_DATE_EFFET_REGIME_CADRE_3);
    }

    @Test
    @Transactional
    public void updateNonExistingEmploye() throws Exception {
        int databaseSizeBeforeUpdate = employeRepository.findAll().size();

        // Create the Employe

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restEmployeMockMvc.perform(put("/api/employes")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employe)))
            .andExpect(status().isBadRequest());

        // Validate the Employe in the database
        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteEmploye() throws Exception {
        // Initialize the database
        employeService.save(employe);

        int databaseSizeBeforeDelete = employeRepository.findAll().size();

        // Delete the employe
        restEmployeMockMvc.perform(delete("/api/employes/{id}", employe.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Employe> employeList = employeRepository.findAll();
        assertThat(employeList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
