package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.Declaration;
import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.repository.DeclarationRepository;
import com.secusociale.portail.service.DeclarationService;

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
 * Integration tests for the {@link DeclarationResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class DeclarationResourceIT {

    private static final String DEFAULT_ID_IDENTIFIANT = "AAAAAAAAAA";
    private static final String UPDATED_ID_IDENTIFIANT = "BBBBBBBBBB";

    private static final String DEFAULT_RAISON_SOCIALE = "AAAAAAAAAA";
    private static final String UPDATED_RAISON_SOCIALE = "BBBBBBBBBB";

    private static final String DEFAULT_ADRESSE = "AAAAAAAAAA";
    private static final String UPDATED_ADRESSE = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_DECLARATION = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_DECLARATION = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DEBUT_COTISATION = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DEBUT_COTISATION = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_TOTAL_NOUV_SALARIES = 1;
    private static final Integer UPDATED_TOTAL_NOUV_SALARIES = 2;

    private static final Integer DEFAULT_TOTAL_SALARIES = 1;
    private static final Integer UPDATED_TOTAL_SALARIES = 2;

    private static final BigDecimal DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RG = new BigDecimal(1);
    private static final BigDecimal UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RG = new BigDecimal(2);

    private static final BigDecimal DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RCC = new BigDecimal(1);
    private static final BigDecimal UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RCC = new BigDecimal(2);

    private static final BigDecimal DEFAULT_CUMUL_TOT_SAL_ASS_CSS_PF = new BigDecimal(1);
    private static final BigDecimal UPDATED_CUMUL_TOT_SAL_ASS_CSS_PF = new BigDecimal(2);

    private static final BigDecimal DEFAULT_CUMUL_TOT_SAL_ASS_CSS_ATMP = new BigDecimal(1);
    private static final BigDecimal UPDATED_CUMUL_TOT_SAL_ASS_CSS_ATMP = new BigDecimal(2);

    private static final BigDecimal DEFAULT_TOTAL_SAL_VERSES = new BigDecimal(1);
    private static final BigDecimal UPDATED_TOTAL_SAL_VERSES = new BigDecimal(2);

    private static final BigDecimal DEFAULT_MNT_COT_PF_CALC_PAR_EMPLOYEUR = new BigDecimal(1);
    private static final BigDecimal UPDATED_MNT_COT_PF_CALC_PAR_EMPLOYEUR = new BigDecimal(2);

    private static final BigDecimal DEFAULT_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR = new BigDecimal(1);
    private static final BigDecimal UPDATED_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR = new BigDecimal(2);

    private static final BigDecimal DEFAULT_MNT_COT_RG_CALC_PAR_EMPLOYEUR = new BigDecimal(1);
    private static final BigDecimal UPDATED_MNT_COT_RG_CALC_PAR_EMPLOYEUR = new BigDecimal(2);

    private static final BigDecimal DEFAULT_MNT_COT_RCC_CALC_PAR_EMPLOYEUR = new BigDecimal(1);
    private static final BigDecimal UPDATED_MNT_COT_RCC_CALC_PAR_EMPLOYEUR = new BigDecimal(2);

    @Autowired
    private DeclarationRepository declarationRepository;

    @Autowired
    private DeclarationService declarationService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restDeclarationMockMvc;

    private Declaration declaration;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Declaration createEntity(EntityManager em) {
        Declaration declaration = new Declaration()
            .idIdentifiant(DEFAULT_ID_IDENTIFIANT)
            .raisonSociale(DEFAULT_RAISON_SOCIALE)
            .adresse(DEFAULT_ADRESSE)
            .typeDeclaration(DEFAULT_TYPE_DECLARATION)
            .dateDebutCotisation(DEFAULT_DATE_DEBUT_COTISATION)
            .totalNouvSalaries(DEFAULT_TOTAL_NOUV_SALARIES)
            .totalSalaries(DEFAULT_TOTAL_SALARIES)
            .cumulTotSalAssIpresRg(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RG)
            .cumulTotSalAssIpresRcc(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RCC)
            .cumulTotSalAssCssPf(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_PF)
            .cumulTotSalAssCssAtmp(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_ATMP)
            .totalSalVerses(DEFAULT_TOTAL_SAL_VERSES)
            .mntCotPfCalcParEmployeur(DEFAULT_MNT_COT_PF_CALC_PAR_EMPLOYEUR)
            .mntCotAtMpCalcParEmployeur(DEFAULT_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR)
            .mntCotRgCalcParEmployeur(DEFAULT_MNT_COT_RG_CALC_PAR_EMPLOYEUR)
            .mntCotRccCalcParEmployeur(DEFAULT_MNT_COT_RCC_CALC_PAR_EMPLOYEUR);
        // Add required entity
        Immatriculation immatriculation;
        if (TestUtil.findAll(em, Immatriculation.class).isEmpty()) {
            immatriculation = ImmatriculationResourceIT.createEntity(em);
            em.persist(immatriculation);
            em.flush();
        } else {
            immatriculation = TestUtil.findAll(em, Immatriculation.class).get(0);
        }
        declaration.setEmployeur(immatriculation);
        return declaration;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Declaration createUpdatedEntity(EntityManager em) {
        Declaration declaration = new Declaration()
            .idIdentifiant(UPDATED_ID_IDENTIFIANT)
            .raisonSociale(UPDATED_RAISON_SOCIALE)
            .adresse(UPDATED_ADRESSE)
            .typeDeclaration(UPDATED_TYPE_DECLARATION)
            .dateDebutCotisation(UPDATED_DATE_DEBUT_COTISATION)
            .totalNouvSalaries(UPDATED_TOTAL_NOUV_SALARIES)
            .totalSalaries(UPDATED_TOTAL_SALARIES)
            .cumulTotSalAssIpresRg(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RG)
            .cumulTotSalAssIpresRcc(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RCC)
            .cumulTotSalAssCssPf(UPDATED_CUMUL_TOT_SAL_ASS_CSS_PF)
            .cumulTotSalAssCssAtmp(UPDATED_CUMUL_TOT_SAL_ASS_CSS_ATMP)
            .totalSalVerses(UPDATED_TOTAL_SAL_VERSES)
            .mntCotPfCalcParEmployeur(UPDATED_MNT_COT_PF_CALC_PAR_EMPLOYEUR)
            .mntCotAtMpCalcParEmployeur(UPDATED_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR)
            .mntCotRgCalcParEmployeur(UPDATED_MNT_COT_RG_CALC_PAR_EMPLOYEUR)
            .mntCotRccCalcParEmployeur(UPDATED_MNT_COT_RCC_CALC_PAR_EMPLOYEUR);
        // Add required entity
        Immatriculation immatriculation;
        if (TestUtil.findAll(em, Immatriculation.class).isEmpty()) {
            immatriculation = ImmatriculationResourceIT.createUpdatedEntity(em);
            em.persist(immatriculation);
            em.flush();
        } else {
            immatriculation = TestUtil.findAll(em, Immatriculation.class).get(0);
        }
        declaration.setEmployeur(immatriculation);
        return declaration;
    }

    @BeforeEach
    public void initTest() {
        declaration = createEntity(em);
    }

    @Test
    @Transactional
    public void createDeclaration() throws Exception {
        int databaseSizeBeforeCreate = declarationRepository.findAll().size();

        // Create the Declaration
        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isCreated());

        // Validate the Declaration in the database
        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeCreate + 1);
        Declaration testDeclaration = declarationList.get(declarationList.size() - 1);
        assertThat(testDeclaration.getIdIdentifiant()).isEqualTo(DEFAULT_ID_IDENTIFIANT);
        assertThat(testDeclaration.getRaisonSociale()).isEqualTo(DEFAULT_RAISON_SOCIALE);
        assertThat(testDeclaration.getAdresse()).isEqualTo(DEFAULT_ADRESSE);
        assertThat(testDeclaration.getTypeDeclaration()).isEqualTo(DEFAULT_TYPE_DECLARATION);
        assertThat(testDeclaration.getDateDebutCotisation()).isEqualTo(DEFAULT_DATE_DEBUT_COTISATION);
        assertThat(testDeclaration.getTotalNouvSalaries()).isEqualTo(DEFAULT_TOTAL_NOUV_SALARIES);
        assertThat(testDeclaration.getTotalSalaries()).isEqualTo(DEFAULT_TOTAL_SALARIES);
        assertThat(testDeclaration.getCumulTotSalAssIpresRg()).isEqualTo(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RG);
        assertThat(testDeclaration.getCumulTotSalAssIpresRcc()).isEqualTo(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RCC);
        assertThat(testDeclaration.getCumulTotSalAssCssPf()).isEqualTo(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_PF);
        assertThat(testDeclaration.getCumulTotSalAssCssAtmp()).isEqualTo(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_ATMP);
        assertThat(testDeclaration.getTotalSalVerses()).isEqualTo(DEFAULT_TOTAL_SAL_VERSES);
        assertThat(testDeclaration.getMntCotPfCalcParEmployeur()).isEqualTo(DEFAULT_MNT_COT_PF_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotAtMpCalcParEmployeur()).isEqualTo(DEFAULT_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotRgCalcParEmployeur()).isEqualTo(DEFAULT_MNT_COT_RG_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotRccCalcParEmployeur()).isEqualTo(DEFAULT_MNT_COT_RCC_CALC_PAR_EMPLOYEUR);
    }

    @Test
    @Transactional
    public void createDeclarationWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = declarationRepository.findAll().size();

        // Create the Declaration with an existing ID
        declaration.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        // Validate the Declaration in the database
        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkIdIdentifiantIsRequired() throws Exception {
        int databaseSizeBeforeTest = declarationRepository.findAll().size();
        // set the field null
        declaration.setIdIdentifiant(null);

        // Create the Declaration, which fails.

        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkRaisonSocialeIsRequired() throws Exception {
        int databaseSizeBeforeTest = declarationRepository.findAll().size();
        // set the field null
        declaration.setRaisonSociale(null);

        // Create the Declaration, which fails.

        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkTypeDeclarationIsRequired() throws Exception {
        int databaseSizeBeforeTest = declarationRepository.findAll().size();
        // set the field null
        declaration.setTypeDeclaration(null);

        // Create the Declaration, which fails.

        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkDateDebutCotisationIsRequired() throws Exception {
        int databaseSizeBeforeTest = declarationRepository.findAll().size();
        // set the field null
        declaration.setDateDebutCotisation(null);

        // Create the Declaration, which fails.

        restDeclarationMockMvc.perform(post("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllDeclarations() throws Exception {
        // Initialize the database
        declarationRepository.saveAndFlush(declaration);

        // Get all the declarationList
        restDeclarationMockMvc.perform(get("/api/declarations?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(declaration.getId().intValue())))
            .andExpect(jsonPath("$.[*].idIdentifiant").value(hasItem(DEFAULT_ID_IDENTIFIANT)))
            .andExpect(jsonPath("$.[*].raisonSociale").value(hasItem(DEFAULT_RAISON_SOCIALE)))
            .andExpect(jsonPath("$.[*].adresse").value(hasItem(DEFAULT_ADRESSE)))
            .andExpect(jsonPath("$.[*].typeDeclaration").value(hasItem(DEFAULT_TYPE_DECLARATION)))
            .andExpect(jsonPath("$.[*].dateDebutCotisation").value(hasItem(DEFAULT_DATE_DEBUT_COTISATION.toString())))
            .andExpect(jsonPath("$.[*].totalNouvSalaries").value(hasItem(DEFAULT_TOTAL_NOUV_SALARIES)))
            .andExpect(jsonPath("$.[*].totalSalaries").value(hasItem(DEFAULT_TOTAL_SALARIES)))
            .andExpect(jsonPath("$.[*].cumulTotSalAssIpresRg").value(hasItem(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RG.intValue())))
            .andExpect(jsonPath("$.[*].cumulTotSalAssIpresRcc").value(hasItem(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RCC.intValue())))
            .andExpect(jsonPath("$.[*].cumulTotSalAssCssPf").value(hasItem(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_PF.intValue())))
            .andExpect(jsonPath("$.[*].cumulTotSalAssCssAtmp").value(hasItem(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_ATMP.intValue())))
            .andExpect(jsonPath("$.[*].totalSalVerses").value(hasItem(DEFAULT_TOTAL_SAL_VERSES.intValue())))
            .andExpect(jsonPath("$.[*].mntCotPfCalcParEmployeur").value(hasItem(DEFAULT_MNT_COT_PF_CALC_PAR_EMPLOYEUR.intValue())))
            .andExpect(jsonPath("$.[*].mntCotAtMpCalcParEmployeur").value(hasItem(DEFAULT_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR.intValue())))
            .andExpect(jsonPath("$.[*].mntCotRgCalcParEmployeur").value(hasItem(DEFAULT_MNT_COT_RG_CALC_PAR_EMPLOYEUR.intValue())))
            .andExpect(jsonPath("$.[*].mntCotRccCalcParEmployeur").value(hasItem(DEFAULT_MNT_COT_RCC_CALC_PAR_EMPLOYEUR.intValue())));
    }
    
    @Test
    @Transactional
    public void getDeclaration() throws Exception {
        // Initialize the database
        declarationRepository.saveAndFlush(declaration);

        // Get the declaration
        restDeclarationMockMvc.perform(get("/api/declarations/{id}", declaration.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(declaration.getId().intValue()))
            .andExpect(jsonPath("$.idIdentifiant").value(DEFAULT_ID_IDENTIFIANT))
            .andExpect(jsonPath("$.raisonSociale").value(DEFAULT_RAISON_SOCIALE))
            .andExpect(jsonPath("$.adresse").value(DEFAULT_ADRESSE))
            .andExpect(jsonPath("$.typeDeclaration").value(DEFAULT_TYPE_DECLARATION))
            .andExpect(jsonPath("$.dateDebutCotisation").value(DEFAULT_DATE_DEBUT_COTISATION.toString()))
            .andExpect(jsonPath("$.totalNouvSalaries").value(DEFAULT_TOTAL_NOUV_SALARIES))
            .andExpect(jsonPath("$.totalSalaries").value(DEFAULT_TOTAL_SALARIES))
            .andExpect(jsonPath("$.cumulTotSalAssIpresRg").value(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RG.intValue()))
            .andExpect(jsonPath("$.cumulTotSalAssIpresRcc").value(DEFAULT_CUMUL_TOT_SAL_ASS_IPRES_RCC.intValue()))
            .andExpect(jsonPath("$.cumulTotSalAssCssPf").value(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_PF.intValue()))
            .andExpect(jsonPath("$.cumulTotSalAssCssAtmp").value(DEFAULT_CUMUL_TOT_SAL_ASS_CSS_ATMP.intValue()))
            .andExpect(jsonPath("$.totalSalVerses").value(DEFAULT_TOTAL_SAL_VERSES.intValue()))
            .andExpect(jsonPath("$.mntCotPfCalcParEmployeur").value(DEFAULT_MNT_COT_PF_CALC_PAR_EMPLOYEUR.intValue()))
            .andExpect(jsonPath("$.mntCotAtMpCalcParEmployeur").value(DEFAULT_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR.intValue()))
            .andExpect(jsonPath("$.mntCotRgCalcParEmployeur").value(DEFAULT_MNT_COT_RG_CALC_PAR_EMPLOYEUR.intValue()))
            .andExpect(jsonPath("$.mntCotRccCalcParEmployeur").value(DEFAULT_MNT_COT_RCC_CALC_PAR_EMPLOYEUR.intValue()));
    }

    @Test
    @Transactional
    public void getNonExistingDeclaration() throws Exception {
        // Get the declaration
        restDeclarationMockMvc.perform(get("/api/declarations/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateDeclaration() throws Exception {
        // Initialize the database
        declarationService.save(declaration);

        int databaseSizeBeforeUpdate = declarationRepository.findAll().size();

        // Update the declaration
        Declaration updatedDeclaration = declarationRepository.findById(declaration.getId()).get();
        // Disconnect from session so that the updates on updatedDeclaration are not directly saved in db
        em.detach(updatedDeclaration);
        updatedDeclaration
            .idIdentifiant(UPDATED_ID_IDENTIFIANT)
            .raisonSociale(UPDATED_RAISON_SOCIALE)
            .adresse(UPDATED_ADRESSE)
            .typeDeclaration(UPDATED_TYPE_DECLARATION)
            .dateDebutCotisation(UPDATED_DATE_DEBUT_COTISATION)
            .totalNouvSalaries(UPDATED_TOTAL_NOUV_SALARIES)
            .totalSalaries(UPDATED_TOTAL_SALARIES)
            .cumulTotSalAssIpresRg(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RG)
            .cumulTotSalAssIpresRcc(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RCC)
            .cumulTotSalAssCssPf(UPDATED_CUMUL_TOT_SAL_ASS_CSS_PF)
            .cumulTotSalAssCssAtmp(UPDATED_CUMUL_TOT_SAL_ASS_CSS_ATMP)
            .totalSalVerses(UPDATED_TOTAL_SAL_VERSES)
            .mntCotPfCalcParEmployeur(UPDATED_MNT_COT_PF_CALC_PAR_EMPLOYEUR)
            .mntCotAtMpCalcParEmployeur(UPDATED_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR)
            .mntCotRgCalcParEmployeur(UPDATED_MNT_COT_RG_CALC_PAR_EMPLOYEUR)
            .mntCotRccCalcParEmployeur(UPDATED_MNT_COT_RCC_CALC_PAR_EMPLOYEUR);

        restDeclarationMockMvc.perform(put("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedDeclaration)))
            .andExpect(status().isOk());

        // Validate the Declaration in the database
        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeUpdate);
        Declaration testDeclaration = declarationList.get(declarationList.size() - 1);
        assertThat(testDeclaration.getIdIdentifiant()).isEqualTo(UPDATED_ID_IDENTIFIANT);
        assertThat(testDeclaration.getRaisonSociale()).isEqualTo(UPDATED_RAISON_SOCIALE);
        assertThat(testDeclaration.getAdresse()).isEqualTo(UPDATED_ADRESSE);
        assertThat(testDeclaration.getTypeDeclaration()).isEqualTo(UPDATED_TYPE_DECLARATION);
        assertThat(testDeclaration.getDateDebutCotisation()).isEqualTo(UPDATED_DATE_DEBUT_COTISATION);
        assertThat(testDeclaration.getTotalNouvSalaries()).isEqualTo(UPDATED_TOTAL_NOUV_SALARIES);
        assertThat(testDeclaration.getTotalSalaries()).isEqualTo(UPDATED_TOTAL_SALARIES);
        assertThat(testDeclaration.getCumulTotSalAssIpresRg()).isEqualTo(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RG);
        assertThat(testDeclaration.getCumulTotSalAssIpresRcc()).isEqualTo(UPDATED_CUMUL_TOT_SAL_ASS_IPRES_RCC);
        assertThat(testDeclaration.getCumulTotSalAssCssPf()).isEqualTo(UPDATED_CUMUL_TOT_SAL_ASS_CSS_PF);
        assertThat(testDeclaration.getCumulTotSalAssCssAtmp()).isEqualTo(UPDATED_CUMUL_TOT_SAL_ASS_CSS_ATMP);
        assertThat(testDeclaration.getTotalSalVerses()).isEqualTo(UPDATED_TOTAL_SAL_VERSES);
        assertThat(testDeclaration.getMntCotPfCalcParEmployeur()).isEqualTo(UPDATED_MNT_COT_PF_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotAtMpCalcParEmployeur()).isEqualTo(UPDATED_MNT_COT_AT_MP_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotRgCalcParEmployeur()).isEqualTo(UPDATED_MNT_COT_RG_CALC_PAR_EMPLOYEUR);
        assertThat(testDeclaration.getMntCotRccCalcParEmployeur()).isEqualTo(UPDATED_MNT_COT_RCC_CALC_PAR_EMPLOYEUR);
    }

    @Test
    @Transactional
    public void updateNonExistingDeclaration() throws Exception {
        int databaseSizeBeforeUpdate = declarationRepository.findAll().size();

        // Create the Declaration

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDeclarationMockMvc.perform(put("/api/declarations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(declaration)))
            .andExpect(status().isBadRequest());

        // Validate the Declaration in the database
        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteDeclaration() throws Exception {
        // Initialize the database
        declarationService.save(declaration);

        int databaseSizeBeforeDelete = declarationRepository.findAll().size();

        // Delete the declaration
        restDeclarationMockMvc.perform(delete("/api/declarations/{id}", declaration.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Declaration> declarationList = declarationRepository.findAll();
        assertThat(declarationList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
