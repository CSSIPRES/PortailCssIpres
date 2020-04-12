package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.Employeur;
import com.secusociale.portail.repository.EmployeurRepository;
import com.secusociale.portail.service.EmployeurService;

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
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link EmployeurResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class EmployeurResourceIT {

    private static final String DEFAULT_EMPLOYER_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYER_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_ETABLISSEMENT = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_ETABLISSEMENT = "BBBBBBBBBB";

    private static final String DEFAULT_RAISON_SOCIALE = "AAAAAAAAAA";
    private static final String UPDATED_RAISON_SOCIALE = "BBBBBBBBBB";

    private static final String DEFAULT_MAISON_MERE = "AAAAAAAAAA";
    private static final String UPDATED_MAISON_MERE = "BBBBBBBBBB";

    private static final String DEFAULT_PRENOM = "AAAAAAAAAA";
    private static final String UPDATED_PRENOM = "BBBBBBBBBB";

    private static final String DEFAULT_NOM = "AAAAAAAAAA";
    private static final String UPDATED_NOM = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_IDENTIFIANT = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_IDENTIFIANT = "BBBBBBBBBB";

    private static final String DEFAULT_NUMERO_IDENTIFIANT = "AAAAAAAAAA";
    private static final String UPDATED_NUMERO_IDENTIFIANT = "BBBBBBBBBB";

    private static final String DEFAULT_LEGAL_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_LEGAL_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_SHORT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_SHORT_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_BUSINESS_SECTOR = "AAAAAAAAAA";
    private static final String UPDATED_BUSINESS_SECTOR = "BBBBBBBBBB";

    private static final String DEFAULT_MAIN_LINE_OF_BUSINESS = "AAAAAAAAAA";
    private static final String UPDATED_MAIN_LINE_OF_BUSINESS = "BBBBBBBBBB";

    private static final Integer DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME = 1;
    private static final Integer UPDATED_NO_OF_WORKERS_IN_GEN_SCHEME = 2;

    private static final Integer DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME = 1;
    private static final Integer UPDATED_NO_OF_WORKERS_IN_BASIC_SCHEME = 2;

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

    private static final String DEFAULT_POSTBOX_NO = "AAAAAAAAAA";
    private static final String UPDATED_POSTBOX_NO = "BBBBBBBBBB";

    private static final String DEFAULT_TELEPHONE = "AAAAAAAAAA";
    private static final String UPDATED_TELEPHONE = "BBBBBBBBBB";

    private static final String DEFAULT_EMAIL = "AAAAAAAAAA";
    private static final String UPDATED_EMAIL = "BBBBBBBBBB";

    private static final String DEFAULT_WEBSITE = "AAAAAAAAAA";
    private static final String UPDATED_WEBSITE = "BBBBBBBBBB";

    private static final String DEFAULT_ZONE_CSS = "AAAAAAAAAA";
    private static final String UPDATED_ZONE_CSS = "BBBBBBBBBB";

    private static final String DEFAULT_ZONE_IPRES = "AAAAAAAAAA";
    private static final String UPDATED_ZONE_IPRES = "BBBBBBBBBB";

    private static final String DEFAULT_SECTOR_CSS = "AAAAAAAAAA";
    private static final String UPDATED_SECTOR_CSS = "BBBBBBBBBB";

    private static final String DEFAULT_SECTOR_IPRES = "AAAAAAAAAA";
    private static final String UPDATED_SECTOR_IPRES = "BBBBBBBBBB";

    private static final String DEFAULT_AGENCY_CSS = "AAAAAAAAAA";
    private static final String UPDATED_AGENCY_CSS = "BBBBBBBBBB";

    private static final String DEFAULT_AGENCY_IPRES = "AAAAAAAAAA";
    private static final String UPDATED_AGENCY_IPRES = "BBBBBBBBBB";

    private static final String DEFAULT_PROCESS_FLOW_ID = "AAAAAAAAAA";
    private static final String UPDATED_PROCESS_FLOW_ID = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DOSSIER = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DOSSIER = "BBBBBBBBBB";

    private static final Boolean DEFAULT_STATUT_IMMATRICULATION = false;
    private static final Boolean UPDATED_STATUT_IMMATRICULATION = true;

    @Autowired
    private EmployeurRepository employeurRepository;

    @Autowired
    private EmployeurService employeurService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restEmployeurMockMvc;

    private Employeur employeur;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Employeur createEntity(EntityManager em) {
        Employeur employeur = new Employeur()
            .employerType(DEFAULT_EMPLOYER_TYPE)
            .typeEtablissement(DEFAULT_TYPE_ETABLISSEMENT)
            .raisonSociale(DEFAULT_RAISON_SOCIALE)
            .maisonMere(DEFAULT_MAISON_MERE)
            .prenom(DEFAULT_PRENOM)
            .nom(DEFAULT_NOM)
            .typeIdentifiant(DEFAULT_TYPE_IDENTIFIANT)
            .numeroIdentifiant(DEFAULT_NUMERO_IDENTIFIANT)
            .legalStatus(DEFAULT_LEGAL_STATUS)
            .shortName(DEFAULT_SHORT_NAME)
            .businessSector(DEFAULT_BUSINESS_SECTOR)
            .mainLineOfBusiness(DEFAULT_MAIN_LINE_OF_BUSINESS)
            .noOfWorkersInGenScheme(DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME)
            .noOfWorkersInBasicScheme(DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME)
            .region(DEFAULT_REGION)
            .department(DEFAULT_DEPARTMENT)
            .arondissement(DEFAULT_ARONDISSEMENT)
            .commune(DEFAULT_COMMUNE)
            .qartier(DEFAULT_QARTIER)
            .address(DEFAULT_ADDRESS)
            .postboxNo(DEFAULT_POSTBOX_NO)
            .telephone(DEFAULT_TELEPHONE)
            .email(DEFAULT_EMAIL)
            .website(DEFAULT_WEBSITE)
            .zoneCss(DEFAULT_ZONE_CSS)
            .zoneIpres(DEFAULT_ZONE_IPRES)
            .sectorCss(DEFAULT_SECTOR_CSS)
            .sectorIpres(DEFAULT_SECTOR_IPRES)
            .agencyCss(DEFAULT_AGENCY_CSS)
            .agencyIpres(DEFAULT_AGENCY_IPRES)
            .processFlowId(DEFAULT_PROCESS_FLOW_ID)
            .statutDossier(DEFAULT_STATUT_DOSSIER)
            .statutImmatriculation(DEFAULT_STATUT_IMMATRICULATION);
        return employeur;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Employeur createUpdatedEntity(EntityManager em) {
        Employeur employeur = new Employeur()
            .employerType(UPDATED_EMPLOYER_TYPE)
            .typeEtablissement(UPDATED_TYPE_ETABLISSEMENT)
            .raisonSociale(UPDATED_RAISON_SOCIALE)
            .maisonMere(UPDATED_MAISON_MERE)
            .prenom(UPDATED_PRENOM)
            .nom(UPDATED_NOM)
            .typeIdentifiant(UPDATED_TYPE_IDENTIFIANT)
            .numeroIdentifiant(UPDATED_NUMERO_IDENTIFIANT)
            .legalStatus(UPDATED_LEGAL_STATUS)
            .shortName(UPDATED_SHORT_NAME)
            .businessSector(UPDATED_BUSINESS_SECTOR)
            .mainLineOfBusiness(UPDATED_MAIN_LINE_OF_BUSINESS)
            .noOfWorkersInGenScheme(UPDATED_NO_OF_WORKERS_IN_GEN_SCHEME)
            .noOfWorkersInBasicScheme(UPDATED_NO_OF_WORKERS_IN_BASIC_SCHEME)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .postboxNo(UPDATED_POSTBOX_NO)
            .telephone(UPDATED_TELEPHONE)
            .email(UPDATED_EMAIL)
            .website(UPDATED_WEBSITE)
            .zoneCss(UPDATED_ZONE_CSS)
            .zoneIpres(UPDATED_ZONE_IPRES)
            .sectorCss(UPDATED_SECTOR_CSS)
            .sectorIpres(UPDATED_SECTOR_IPRES)
            .agencyCss(UPDATED_AGENCY_CSS)
            .agencyIpres(UPDATED_AGENCY_IPRES)
            .processFlowId(UPDATED_PROCESS_FLOW_ID)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .statutImmatriculation(UPDATED_STATUT_IMMATRICULATION);
        return employeur;
    }

    @BeforeEach
    public void initTest() {
        employeur = createEntity(em);
    }

    @Test
    @Transactional
    public void createEmployeur() throws Exception {
        int databaseSizeBeforeCreate = employeurRepository.findAll().size();

        // Create the Employeur
        restEmployeurMockMvc.perform(post("/api/employeurs")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employeur)))
            .andExpect(status().isCreated());

        // Validate the Employeur in the database
        List<Employeur> employeurList = employeurRepository.findAll();
        assertThat(employeurList).hasSize(databaseSizeBeforeCreate + 1);
        Employeur testEmployeur = employeurList.get(employeurList.size() - 1);
        assertThat(testEmployeur.getEmployerType()).isEqualTo(DEFAULT_EMPLOYER_TYPE);
        assertThat(testEmployeur.getTypeEtablissement()).isEqualTo(DEFAULT_TYPE_ETABLISSEMENT);
        assertThat(testEmployeur.getRaisonSociale()).isEqualTo(DEFAULT_RAISON_SOCIALE);
        assertThat(testEmployeur.getMaisonMere()).isEqualTo(DEFAULT_MAISON_MERE);
        assertThat(testEmployeur.getPrenom()).isEqualTo(DEFAULT_PRENOM);
        assertThat(testEmployeur.getNom()).isEqualTo(DEFAULT_NOM);
        assertThat(testEmployeur.getTypeIdentifiant()).isEqualTo(DEFAULT_TYPE_IDENTIFIANT);
        assertThat(testEmployeur.getNumeroIdentifiant()).isEqualTo(DEFAULT_NUMERO_IDENTIFIANT);
        assertThat(testEmployeur.getLegalStatus()).isEqualTo(DEFAULT_LEGAL_STATUS);
        assertThat(testEmployeur.getShortName()).isEqualTo(DEFAULT_SHORT_NAME);
        assertThat(testEmployeur.getBusinessSector()).isEqualTo(DEFAULT_BUSINESS_SECTOR);
        assertThat(testEmployeur.getMainLineOfBusiness()).isEqualTo(DEFAULT_MAIN_LINE_OF_BUSINESS);
        assertThat(testEmployeur.getNoOfWorkersInGenScheme()).isEqualTo(DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME);
        assertThat(testEmployeur.getNoOfWorkersInBasicScheme()).isEqualTo(DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME);
        assertThat(testEmployeur.getRegion()).isEqualTo(DEFAULT_REGION);
        assertThat(testEmployeur.getDepartment()).isEqualTo(DEFAULT_DEPARTMENT);
        assertThat(testEmployeur.getArondissement()).isEqualTo(DEFAULT_ARONDISSEMENT);
        assertThat(testEmployeur.getCommune()).isEqualTo(DEFAULT_COMMUNE);
        assertThat(testEmployeur.getQartier()).isEqualTo(DEFAULT_QARTIER);
        assertThat(testEmployeur.getAddress()).isEqualTo(DEFAULT_ADDRESS);
        assertThat(testEmployeur.getPostboxNo()).isEqualTo(DEFAULT_POSTBOX_NO);
        assertThat(testEmployeur.getTelephone()).isEqualTo(DEFAULT_TELEPHONE);
        assertThat(testEmployeur.getEmail()).isEqualTo(DEFAULT_EMAIL);
        assertThat(testEmployeur.getWebsite()).isEqualTo(DEFAULT_WEBSITE);
        assertThat(testEmployeur.getZoneCss()).isEqualTo(DEFAULT_ZONE_CSS);
        assertThat(testEmployeur.getZoneIpres()).isEqualTo(DEFAULT_ZONE_IPRES);
        assertThat(testEmployeur.getSectorCss()).isEqualTo(DEFAULT_SECTOR_CSS);
        assertThat(testEmployeur.getSectorIpres()).isEqualTo(DEFAULT_SECTOR_IPRES);
        assertThat(testEmployeur.getAgencyCss()).isEqualTo(DEFAULT_AGENCY_CSS);
        assertThat(testEmployeur.getAgencyIpres()).isEqualTo(DEFAULT_AGENCY_IPRES);
        assertThat(testEmployeur.getProcessFlowId()).isEqualTo(DEFAULT_PROCESS_FLOW_ID);
        assertThat(testEmployeur.getStatutDossier()).isEqualTo(DEFAULT_STATUT_DOSSIER);
        assertThat(testEmployeur.isStatutImmatriculation()).isEqualTo(DEFAULT_STATUT_IMMATRICULATION);
    }

    @Test
    @Transactional
    public void createEmployeurWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = employeurRepository.findAll().size();

        // Create the Employeur with an existing ID
        employeur.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restEmployeurMockMvc.perform(post("/api/employeurs")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employeur)))
            .andExpect(status().isBadRequest());

        // Validate the Employeur in the database
        List<Employeur> employeurList = employeurRepository.findAll();
        assertThat(employeurList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllEmployeurs() throws Exception {
        // Initialize the database
        employeurRepository.saveAndFlush(employeur);

        // Get all the employeurList
        restEmployeurMockMvc.perform(get("/api/employeurs?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(employeur.getId().intValue())))
            .andExpect(jsonPath("$.[*].employerType").value(hasItem(DEFAULT_EMPLOYER_TYPE)))
            .andExpect(jsonPath("$.[*].typeEtablissement").value(hasItem(DEFAULT_TYPE_ETABLISSEMENT)))
            .andExpect(jsonPath("$.[*].raisonSociale").value(hasItem(DEFAULT_RAISON_SOCIALE)))
            .andExpect(jsonPath("$.[*].maisonMere").value(hasItem(DEFAULT_MAISON_MERE)))
            .andExpect(jsonPath("$.[*].prenom").value(hasItem(DEFAULT_PRENOM)))
            .andExpect(jsonPath("$.[*].nom").value(hasItem(DEFAULT_NOM)))
            .andExpect(jsonPath("$.[*].typeIdentifiant").value(hasItem(DEFAULT_TYPE_IDENTIFIANT)))
            .andExpect(jsonPath("$.[*].numeroIdentifiant").value(hasItem(DEFAULT_NUMERO_IDENTIFIANT)))
            .andExpect(jsonPath("$.[*].legalStatus").value(hasItem(DEFAULT_LEGAL_STATUS)))
            .andExpect(jsonPath("$.[*].shortName").value(hasItem(DEFAULT_SHORT_NAME)))
            .andExpect(jsonPath("$.[*].businessSector").value(hasItem(DEFAULT_BUSINESS_SECTOR)))
            .andExpect(jsonPath("$.[*].mainLineOfBusiness").value(hasItem(DEFAULT_MAIN_LINE_OF_BUSINESS)))
            .andExpect(jsonPath("$.[*].noOfWorkersInGenScheme").value(hasItem(DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME)))
            .andExpect(jsonPath("$.[*].noOfWorkersInBasicScheme").value(hasItem(DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME)))
            .andExpect(jsonPath("$.[*].region").value(hasItem(DEFAULT_REGION)))
            .andExpect(jsonPath("$.[*].department").value(hasItem(DEFAULT_DEPARTMENT)))
            .andExpect(jsonPath("$.[*].arondissement").value(hasItem(DEFAULT_ARONDISSEMENT)))
            .andExpect(jsonPath("$.[*].commune").value(hasItem(DEFAULT_COMMUNE)))
            .andExpect(jsonPath("$.[*].qartier").value(hasItem(DEFAULT_QARTIER)))
            .andExpect(jsonPath("$.[*].address").value(hasItem(DEFAULT_ADDRESS)))
            .andExpect(jsonPath("$.[*].postboxNo").value(hasItem(DEFAULT_POSTBOX_NO)))
            .andExpect(jsonPath("$.[*].telephone").value(hasItem(DEFAULT_TELEPHONE)))
            .andExpect(jsonPath("$.[*].email").value(hasItem(DEFAULT_EMAIL)))
            .andExpect(jsonPath("$.[*].website").value(hasItem(DEFAULT_WEBSITE)))
            .andExpect(jsonPath("$.[*].zoneCss").value(hasItem(DEFAULT_ZONE_CSS)))
            .andExpect(jsonPath("$.[*].zoneIpres").value(hasItem(DEFAULT_ZONE_IPRES)))
            .andExpect(jsonPath("$.[*].sectorCss").value(hasItem(DEFAULT_SECTOR_CSS)))
            .andExpect(jsonPath("$.[*].sectorIpres").value(hasItem(DEFAULT_SECTOR_IPRES)))
            .andExpect(jsonPath("$.[*].agencyCss").value(hasItem(DEFAULT_AGENCY_CSS)))
            .andExpect(jsonPath("$.[*].agencyIpres").value(hasItem(DEFAULT_AGENCY_IPRES)))
            .andExpect(jsonPath("$.[*].processFlowId").value(hasItem(DEFAULT_PROCESS_FLOW_ID)))
            .andExpect(jsonPath("$.[*].statutDossier").value(hasItem(DEFAULT_STATUT_DOSSIER)))
            .andExpect(jsonPath("$.[*].statutImmatriculation").value(hasItem(DEFAULT_STATUT_IMMATRICULATION.booleanValue())));
    }
    
    @Test
    @Transactional
    public void getEmployeur() throws Exception {
        // Initialize the database
        employeurRepository.saveAndFlush(employeur);

        // Get the employeur
        restEmployeurMockMvc.perform(get("/api/employeurs/{id}", employeur.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(employeur.getId().intValue()))
            .andExpect(jsonPath("$.employerType").value(DEFAULT_EMPLOYER_TYPE))
            .andExpect(jsonPath("$.typeEtablissement").value(DEFAULT_TYPE_ETABLISSEMENT))
            .andExpect(jsonPath("$.raisonSociale").value(DEFAULT_RAISON_SOCIALE))
            .andExpect(jsonPath("$.maisonMere").value(DEFAULT_MAISON_MERE))
            .andExpect(jsonPath("$.prenom").value(DEFAULT_PRENOM))
            .andExpect(jsonPath("$.nom").value(DEFAULT_NOM))
            .andExpect(jsonPath("$.typeIdentifiant").value(DEFAULT_TYPE_IDENTIFIANT))
            .andExpect(jsonPath("$.numeroIdentifiant").value(DEFAULT_NUMERO_IDENTIFIANT))
            .andExpect(jsonPath("$.legalStatus").value(DEFAULT_LEGAL_STATUS))
            .andExpect(jsonPath("$.shortName").value(DEFAULT_SHORT_NAME))
            .andExpect(jsonPath("$.businessSector").value(DEFAULT_BUSINESS_SECTOR))
            .andExpect(jsonPath("$.mainLineOfBusiness").value(DEFAULT_MAIN_LINE_OF_BUSINESS))
            .andExpect(jsonPath("$.noOfWorkersInGenScheme").value(DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME))
            .andExpect(jsonPath("$.noOfWorkersInBasicScheme").value(DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME))
            .andExpect(jsonPath("$.region").value(DEFAULT_REGION))
            .andExpect(jsonPath("$.department").value(DEFAULT_DEPARTMENT))
            .andExpect(jsonPath("$.arondissement").value(DEFAULT_ARONDISSEMENT))
            .andExpect(jsonPath("$.commune").value(DEFAULT_COMMUNE))
            .andExpect(jsonPath("$.qartier").value(DEFAULT_QARTIER))
            .andExpect(jsonPath("$.address").value(DEFAULT_ADDRESS))
            .andExpect(jsonPath("$.postboxNo").value(DEFAULT_POSTBOX_NO))
            .andExpect(jsonPath("$.telephone").value(DEFAULT_TELEPHONE))
            .andExpect(jsonPath("$.email").value(DEFAULT_EMAIL))
            .andExpect(jsonPath("$.website").value(DEFAULT_WEBSITE))
            .andExpect(jsonPath("$.zoneCss").value(DEFAULT_ZONE_CSS))
            .andExpect(jsonPath("$.zoneIpres").value(DEFAULT_ZONE_IPRES))
            .andExpect(jsonPath("$.sectorCss").value(DEFAULT_SECTOR_CSS))
            .andExpect(jsonPath("$.sectorIpres").value(DEFAULT_SECTOR_IPRES))
            .andExpect(jsonPath("$.agencyCss").value(DEFAULT_AGENCY_CSS))
            .andExpect(jsonPath("$.agencyIpres").value(DEFAULT_AGENCY_IPRES))
            .andExpect(jsonPath("$.processFlowId").value(DEFAULT_PROCESS_FLOW_ID))
            .andExpect(jsonPath("$.statutDossier").value(DEFAULT_STATUT_DOSSIER))
            .andExpect(jsonPath("$.statutImmatriculation").value(DEFAULT_STATUT_IMMATRICULATION.booleanValue()));
    }

    @Test
    @Transactional
    public void getNonExistingEmployeur() throws Exception {
        // Get the employeur
        restEmployeurMockMvc.perform(get("/api/employeurs/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateEmployeur() throws Exception {
        // Initialize the database
        employeurService.save(employeur);

        int databaseSizeBeforeUpdate = employeurRepository.findAll().size();

        // Update the employeur
        Employeur updatedEmployeur = employeurRepository.findById(employeur.getId()).get();
        // Disconnect from session so that the updates on updatedEmployeur are not directly saved in db
        em.detach(updatedEmployeur);
        updatedEmployeur
            .employerType(UPDATED_EMPLOYER_TYPE)
            .typeEtablissement(UPDATED_TYPE_ETABLISSEMENT)
            .raisonSociale(UPDATED_RAISON_SOCIALE)
            .maisonMere(UPDATED_MAISON_MERE)
            .prenom(UPDATED_PRENOM)
            .nom(UPDATED_NOM)
            .typeIdentifiant(UPDATED_TYPE_IDENTIFIANT)
            .numeroIdentifiant(UPDATED_NUMERO_IDENTIFIANT)
            .legalStatus(UPDATED_LEGAL_STATUS)
            .shortName(UPDATED_SHORT_NAME)
            .businessSector(UPDATED_BUSINESS_SECTOR)
            .mainLineOfBusiness(UPDATED_MAIN_LINE_OF_BUSINESS)
            .noOfWorkersInGenScheme(UPDATED_NO_OF_WORKERS_IN_GEN_SCHEME)
            .noOfWorkersInBasicScheme(UPDATED_NO_OF_WORKERS_IN_BASIC_SCHEME)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .postboxNo(UPDATED_POSTBOX_NO)
            .telephone(UPDATED_TELEPHONE)
            .email(UPDATED_EMAIL)
            .website(UPDATED_WEBSITE)
            .zoneCss(UPDATED_ZONE_CSS)
            .zoneIpres(UPDATED_ZONE_IPRES)
            .sectorCss(UPDATED_SECTOR_CSS)
            .sectorIpres(UPDATED_SECTOR_IPRES)
            .agencyCss(UPDATED_AGENCY_CSS)
            .agencyIpres(UPDATED_AGENCY_IPRES)
            .processFlowId(UPDATED_PROCESS_FLOW_ID)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .statutImmatriculation(UPDATED_STATUT_IMMATRICULATION);

        restEmployeurMockMvc.perform(put("/api/employeurs")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedEmployeur)))
            .andExpect(status().isOk());

        // Validate the Employeur in the database
        List<Employeur> employeurList = employeurRepository.findAll();
        assertThat(employeurList).hasSize(databaseSizeBeforeUpdate);
        Employeur testEmployeur = employeurList.get(employeurList.size() - 1);
        assertThat(testEmployeur.getEmployerType()).isEqualTo(UPDATED_EMPLOYER_TYPE);
        assertThat(testEmployeur.getTypeEtablissement()).isEqualTo(UPDATED_TYPE_ETABLISSEMENT);
        assertThat(testEmployeur.getRaisonSociale()).isEqualTo(UPDATED_RAISON_SOCIALE);
        assertThat(testEmployeur.getMaisonMere()).isEqualTo(UPDATED_MAISON_MERE);
        assertThat(testEmployeur.getPrenom()).isEqualTo(UPDATED_PRENOM);
        assertThat(testEmployeur.getNom()).isEqualTo(UPDATED_NOM);
        assertThat(testEmployeur.getTypeIdentifiant()).isEqualTo(UPDATED_TYPE_IDENTIFIANT);
        assertThat(testEmployeur.getNumeroIdentifiant()).isEqualTo(UPDATED_NUMERO_IDENTIFIANT);
        assertThat(testEmployeur.getLegalStatus()).isEqualTo(UPDATED_LEGAL_STATUS);
        assertThat(testEmployeur.getShortName()).isEqualTo(UPDATED_SHORT_NAME);
        assertThat(testEmployeur.getBusinessSector()).isEqualTo(UPDATED_BUSINESS_SECTOR);
        assertThat(testEmployeur.getMainLineOfBusiness()).isEqualTo(UPDATED_MAIN_LINE_OF_BUSINESS);
        assertThat(testEmployeur.getNoOfWorkersInGenScheme()).isEqualTo(UPDATED_NO_OF_WORKERS_IN_GEN_SCHEME);
        assertThat(testEmployeur.getNoOfWorkersInBasicScheme()).isEqualTo(UPDATED_NO_OF_WORKERS_IN_BASIC_SCHEME);
        assertThat(testEmployeur.getRegion()).isEqualTo(UPDATED_REGION);
        assertThat(testEmployeur.getDepartment()).isEqualTo(UPDATED_DEPARTMENT);
        assertThat(testEmployeur.getArondissement()).isEqualTo(UPDATED_ARONDISSEMENT);
        assertThat(testEmployeur.getCommune()).isEqualTo(UPDATED_COMMUNE);
        assertThat(testEmployeur.getQartier()).isEqualTo(UPDATED_QARTIER);
        assertThat(testEmployeur.getAddress()).isEqualTo(UPDATED_ADDRESS);
        assertThat(testEmployeur.getPostboxNo()).isEqualTo(UPDATED_POSTBOX_NO);
        assertThat(testEmployeur.getTelephone()).isEqualTo(UPDATED_TELEPHONE);
        assertThat(testEmployeur.getEmail()).isEqualTo(UPDATED_EMAIL);
        assertThat(testEmployeur.getWebsite()).isEqualTo(UPDATED_WEBSITE);
        assertThat(testEmployeur.getZoneCss()).isEqualTo(UPDATED_ZONE_CSS);
        assertThat(testEmployeur.getZoneIpres()).isEqualTo(UPDATED_ZONE_IPRES);
        assertThat(testEmployeur.getSectorCss()).isEqualTo(UPDATED_SECTOR_CSS);
        assertThat(testEmployeur.getSectorIpres()).isEqualTo(UPDATED_SECTOR_IPRES);
        assertThat(testEmployeur.getAgencyCss()).isEqualTo(UPDATED_AGENCY_CSS);
        assertThat(testEmployeur.getAgencyIpres()).isEqualTo(UPDATED_AGENCY_IPRES);
        assertThat(testEmployeur.getProcessFlowId()).isEqualTo(UPDATED_PROCESS_FLOW_ID);
        assertThat(testEmployeur.getStatutDossier()).isEqualTo(UPDATED_STATUT_DOSSIER);
        assertThat(testEmployeur.isStatutImmatriculation()).isEqualTo(UPDATED_STATUT_IMMATRICULATION);
    }

    @Test
    @Transactional
    public void updateNonExistingEmployeur() throws Exception {
        int databaseSizeBeforeUpdate = employeurRepository.findAll().size();

        // Create the Employeur

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restEmployeurMockMvc.perform(put("/api/employeurs")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(employeur)))
            .andExpect(status().isBadRequest());

        // Validate the Employeur in the database
        List<Employeur> employeurList = employeurRepository.findAll();
        assertThat(employeurList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteEmployeur() throws Exception {
        // Initialize the database
        employeurService.save(employeur);

        int databaseSizeBeforeDelete = employeurRepository.findAll().size();

        // Delete the employeur
        restEmployeurMockMvc.perform(delete("/api/employeurs/{id}", employeur.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Employeur> employeurList = employeurRepository.findAll();
        assertThat(employeurList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
