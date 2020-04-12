package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.DocumentUrl;
import com.secusociale.portail.repository.DocumentUrlRepository;
import com.secusociale.portail.service.DocumentUrlService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;
import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link DocumentUrlResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class DocumentUrlResourceIT {

    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_URL = "AAAAAAAAAA";
    private static final String UPDATED_URL = "BBBBBBBBBB";

    private static final byte[] DEFAULT_DOCUMENT = TestUtil.createByteArray(1, "0");
    private static final byte[] UPDATED_DOCUMENT = TestUtil.createByteArray(1, "1");
    private static final String DEFAULT_DOCUMENT_CONTENT_TYPE = "image/jpg";
    private static final String UPDATED_DOCUMENT_CONTENT_TYPE = "image/png";

    @Autowired
    private DocumentUrlRepository documentUrlRepository;

    @Autowired
    private DocumentUrlService documentUrlService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restDocumentUrlMockMvc;

    private DocumentUrl documentUrl;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DocumentUrl createEntity(EntityManager em) {
        DocumentUrl documentUrl = new DocumentUrl()
            .name(DEFAULT_NAME)
            .url(DEFAULT_URL)
            .document(DEFAULT_DOCUMENT)
            .documentContentType(DEFAULT_DOCUMENT_CONTENT_TYPE);
        return documentUrl;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DocumentUrl createUpdatedEntity(EntityManager em) {
        DocumentUrl documentUrl = new DocumentUrl()
            .name(UPDATED_NAME)
            .url(UPDATED_URL)
            .document(UPDATED_DOCUMENT)
            .documentContentType(UPDATED_DOCUMENT_CONTENT_TYPE);
        return documentUrl;
    }

    @BeforeEach
    public void initTest() {
        documentUrl = createEntity(em);
    }

    @Test
    @Transactional
    public void createDocumentUrl() throws Exception {
        int databaseSizeBeforeCreate = documentUrlRepository.findAll().size();

        // Create the DocumentUrl
        restDocumentUrlMockMvc.perform(post("/api/document-urls")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(documentUrl)))
            .andExpect(status().isCreated());

        // Validate the DocumentUrl in the database
        List<DocumentUrl> documentUrlList = documentUrlRepository.findAll();
        assertThat(documentUrlList).hasSize(databaseSizeBeforeCreate + 1);
        DocumentUrl testDocumentUrl = documentUrlList.get(documentUrlList.size() - 1);
        assertThat(testDocumentUrl.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testDocumentUrl.getUrl()).isEqualTo(DEFAULT_URL);
        assertThat(testDocumentUrl.getDocument()).isEqualTo(DEFAULT_DOCUMENT);
        assertThat(testDocumentUrl.getDocumentContentType()).isEqualTo(DEFAULT_DOCUMENT_CONTENT_TYPE);
    }

    @Test
    @Transactional
    public void createDocumentUrlWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = documentUrlRepository.findAll().size();

        // Create the DocumentUrl with an existing ID
        documentUrl.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restDocumentUrlMockMvc.perform(post("/api/document-urls")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(documentUrl)))
            .andExpect(status().isBadRequest());

        // Validate the DocumentUrl in the database
        List<DocumentUrl> documentUrlList = documentUrlRepository.findAll();
        assertThat(documentUrlList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllDocumentUrls() throws Exception {
        // Initialize the database
        documentUrlRepository.saveAndFlush(documentUrl);

        // Get all the documentUrlList
        restDocumentUrlMockMvc.perform(get("/api/document-urls?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(documentUrl.getId().intValue())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME)))
            .andExpect(jsonPath("$.[*].url").value(hasItem(DEFAULT_URL)))
            .andExpect(jsonPath("$.[*].documentContentType").value(hasItem(DEFAULT_DOCUMENT_CONTENT_TYPE)))
            .andExpect(jsonPath("$.[*].document").value(hasItem(Base64Utils.encodeToString(DEFAULT_DOCUMENT))));
    }
    
    @Test
    @Transactional
    public void getDocumentUrl() throws Exception {
        // Initialize the database
        documentUrlRepository.saveAndFlush(documentUrl);

        // Get the documentUrl
        restDocumentUrlMockMvc.perform(get("/api/document-urls/{id}", documentUrl.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(documentUrl.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME))
            .andExpect(jsonPath("$.url").value(DEFAULT_URL))
            .andExpect(jsonPath("$.documentContentType").value(DEFAULT_DOCUMENT_CONTENT_TYPE))
            .andExpect(jsonPath("$.document").value(Base64Utils.encodeToString(DEFAULT_DOCUMENT)));
    }

    @Test
    @Transactional
    public void getNonExistingDocumentUrl() throws Exception {
        // Get the documentUrl
        restDocumentUrlMockMvc.perform(get("/api/document-urls/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateDocumentUrl() throws Exception {
        // Initialize the database
        documentUrlService.save(documentUrl);

        int databaseSizeBeforeUpdate = documentUrlRepository.findAll().size();

        // Update the documentUrl
        DocumentUrl updatedDocumentUrl = documentUrlRepository.findById(documentUrl.getId()).get();
        // Disconnect from session so that the updates on updatedDocumentUrl are not directly saved in db
        em.detach(updatedDocumentUrl);
        updatedDocumentUrl
            .name(UPDATED_NAME)
            .url(UPDATED_URL)
            .document(UPDATED_DOCUMENT)
            .documentContentType(UPDATED_DOCUMENT_CONTENT_TYPE);

        restDocumentUrlMockMvc.perform(put("/api/document-urls")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedDocumentUrl)))
            .andExpect(status().isOk());

        // Validate the DocumentUrl in the database
        List<DocumentUrl> documentUrlList = documentUrlRepository.findAll();
        assertThat(documentUrlList).hasSize(databaseSizeBeforeUpdate);
        DocumentUrl testDocumentUrl = documentUrlList.get(documentUrlList.size() - 1);
        assertThat(testDocumentUrl.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testDocumentUrl.getUrl()).isEqualTo(UPDATED_URL);
        assertThat(testDocumentUrl.getDocument()).isEqualTo(UPDATED_DOCUMENT);
        assertThat(testDocumentUrl.getDocumentContentType()).isEqualTo(UPDATED_DOCUMENT_CONTENT_TYPE);
    }

    @Test
    @Transactional
    public void updateNonExistingDocumentUrl() throws Exception {
        int databaseSizeBeforeUpdate = documentUrlRepository.findAll().size();

        // Create the DocumentUrl

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDocumentUrlMockMvc.perform(put("/api/document-urls")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(documentUrl)))
            .andExpect(status().isBadRequest());

        // Validate the DocumentUrl in the database
        List<DocumentUrl> documentUrlList = documentUrlRepository.findAll();
        assertThat(documentUrlList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteDocumentUrl() throws Exception {
        // Initialize the database
        documentUrlService.save(documentUrl);

        int databaseSizeBeforeDelete = documentUrlRepository.findAll().size();

        // Delete the documentUrl
        restDocumentUrlMockMvc.perform(delete("/api/document-urls/{id}", documentUrl.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<DocumentUrl> documentUrlList = documentUrlRepository.findAll();
        assertThat(documentUrlList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
