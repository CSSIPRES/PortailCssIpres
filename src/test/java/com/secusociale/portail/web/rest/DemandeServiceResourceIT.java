package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.DemandeService;
import com.secusociale.portail.repository.DemandeServiceRepository;
import com.secusociale.portail.service.DemandeServiceService;

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
 * Integration tests for the {@link DemandeServiceResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class DemandeServiceResourceIT {

    private static final String DEFAULT_TYPE_DEMANDE = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_DEMANDE = "BBBBBBBBBB";

    private static final String DEFAULT_ID_DOSSIER = "AAAAAAAAAA";
    private static final String UPDATED_ID_DOSSIER = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DOSSIER = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DOSSIER = "BBBBBBBBBB";

    private static final String DEFAULT_URL_DOCUMENT = "AAAAAAAAAA";
    private static final String UPDATED_URL_DOCUMENT = "BBBBBBBBBB";

    @Autowired
    private DemandeServiceRepository demandeServiceRepository;

    @Autowired
    private DemandeServiceService demandeServiceService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restDemandeServiceMockMvc;

    private DemandeService demandeService;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DemandeService createEntity(EntityManager em) {
        DemandeService demandeService = new DemandeService()
            .typeDemande(DEFAULT_TYPE_DEMANDE)
            .idDossier(DEFAULT_ID_DOSSIER)
            .statutDossier(DEFAULT_STATUT_DOSSIER)
            .urlDocument(DEFAULT_URL_DOCUMENT);
        return demandeService;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DemandeService createUpdatedEntity(EntityManager em) {
        DemandeService demandeService = new DemandeService()
            .typeDemande(UPDATED_TYPE_DEMANDE)
            .idDossier(UPDATED_ID_DOSSIER)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .urlDocument(UPDATED_URL_DOCUMENT);
        return demandeService;
    }

    @BeforeEach
    public void initTest() {
        demandeService = createEntity(em);
    }

    @Test
    @Transactional
    public void createDemandeService() throws Exception {
        int databaseSizeBeforeCreate = demandeServiceRepository.findAll().size();

        // Create the DemandeService
        restDemandeServiceMockMvc.perform(post("/api/demande-services")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(demandeService)))
            .andExpect(status().isCreated());

        // Validate the DemandeService in the database
        List<DemandeService> demandeServiceList = demandeServiceRepository.findAll();
        assertThat(demandeServiceList).hasSize(databaseSizeBeforeCreate + 1);
        DemandeService testDemandeService = demandeServiceList.get(demandeServiceList.size() - 1);
        assertThat(testDemandeService.getTypeDemande()).isEqualTo(DEFAULT_TYPE_DEMANDE);
        assertThat(testDemandeService.getIdDossier()).isEqualTo(DEFAULT_ID_DOSSIER);
        assertThat(testDemandeService.getStatutDossier()).isEqualTo(DEFAULT_STATUT_DOSSIER);
        assertThat(testDemandeService.getUrlDocument()).isEqualTo(DEFAULT_URL_DOCUMENT);
    }

    @Test
    @Transactional
    public void createDemandeServiceWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = demandeServiceRepository.findAll().size();

        // Create the DemandeService with an existing ID
        demandeService.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restDemandeServiceMockMvc.perform(post("/api/demande-services")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(demandeService)))
            .andExpect(status().isBadRequest());

        // Validate the DemandeService in the database
        List<DemandeService> demandeServiceList = demandeServiceRepository.findAll();
        assertThat(demandeServiceList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllDemandeServices() throws Exception {
        // Initialize the database
        demandeServiceRepository.saveAndFlush(demandeService);

        // Get all the demandeServiceList
        restDemandeServiceMockMvc.perform(get("/api/demande-services?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(demandeService.getId().intValue())))
            .andExpect(jsonPath("$.[*].typeDemande").value(hasItem(DEFAULT_TYPE_DEMANDE)))
            .andExpect(jsonPath("$.[*].idDossier").value(hasItem(DEFAULT_ID_DOSSIER)))
            .andExpect(jsonPath("$.[*].statutDossier").value(hasItem(DEFAULT_STATUT_DOSSIER)))
            .andExpect(jsonPath("$.[*].urlDocument").value(hasItem(DEFAULT_URL_DOCUMENT)));
    }
    
    @Test
    @Transactional
    public void getDemandeService() throws Exception {
        // Initialize the database
        demandeServiceRepository.saveAndFlush(demandeService);

        // Get the demandeService
        restDemandeServiceMockMvc.perform(get("/api/demande-services/{id}", demandeService.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(demandeService.getId().intValue()))
            .andExpect(jsonPath("$.typeDemande").value(DEFAULT_TYPE_DEMANDE))
            .andExpect(jsonPath("$.idDossier").value(DEFAULT_ID_DOSSIER))
            .andExpect(jsonPath("$.statutDossier").value(DEFAULT_STATUT_DOSSIER))
            .andExpect(jsonPath("$.urlDocument").value(DEFAULT_URL_DOCUMENT));
    }

    @Test
    @Transactional
    public void getNonExistingDemandeService() throws Exception {
        // Get the demandeService
        restDemandeServiceMockMvc.perform(get("/api/demande-services/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateDemandeService() throws Exception {
        // Initialize the database
        demandeServiceService.save(demandeService);

        int databaseSizeBeforeUpdate = demandeServiceRepository.findAll().size();

        // Update the demandeService
        DemandeService updatedDemandeService = demandeServiceRepository.findById(demandeService.getId()).get();
        // Disconnect from session so that the updates on updatedDemandeService are not directly saved in db
        em.detach(updatedDemandeService);
        updatedDemandeService
            .typeDemande(UPDATED_TYPE_DEMANDE)
            .idDossier(UPDATED_ID_DOSSIER)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .urlDocument(UPDATED_URL_DOCUMENT);

        restDemandeServiceMockMvc.perform(put("/api/demande-services")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedDemandeService)))
            .andExpect(status().isOk());

        // Validate the DemandeService in the database
        List<DemandeService> demandeServiceList = demandeServiceRepository.findAll();
        assertThat(demandeServiceList).hasSize(databaseSizeBeforeUpdate);
        DemandeService testDemandeService = demandeServiceList.get(demandeServiceList.size() - 1);
        assertThat(testDemandeService.getTypeDemande()).isEqualTo(UPDATED_TYPE_DEMANDE);
        assertThat(testDemandeService.getIdDossier()).isEqualTo(UPDATED_ID_DOSSIER);
        assertThat(testDemandeService.getStatutDossier()).isEqualTo(UPDATED_STATUT_DOSSIER);
        assertThat(testDemandeService.getUrlDocument()).isEqualTo(UPDATED_URL_DOCUMENT);
    }

    @Test
    @Transactional
    public void updateNonExistingDemandeService() throws Exception {
        int databaseSizeBeforeUpdate = demandeServiceRepository.findAll().size();

        // Create the DemandeService

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDemandeServiceMockMvc.perform(put("/api/demande-services")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(demandeService)))
            .andExpect(status().isBadRequest());

        // Validate the DemandeService in the database
        List<DemandeService> demandeServiceList = demandeServiceRepository.findAll();
        assertThat(demandeServiceList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteDemandeService() throws Exception {
        // Initialize the database
        demandeServiceService.save(demandeService);

        int databaseSizeBeforeDelete = demandeServiceRepository.findAll().size();

        // Delete the demandeService
        restDemandeServiceMockMvc.perform(delete("/api/demande-services/{id}", demandeService.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<DemandeService> demandeServiceList = demandeServiceRepository.findAll();
        assertThat(demandeServiceList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
