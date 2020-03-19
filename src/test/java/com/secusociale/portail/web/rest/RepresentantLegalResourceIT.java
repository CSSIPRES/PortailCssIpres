package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.RepresentantLegal;
import com.secusociale.portail.repository.RepresentantLegalRepository;
import com.secusociale.portail.service.RepresentantLegalService;

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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link RepresentantLegalResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class RepresentantLegalResourceIT {

    private static final String DEFAULT_LEGAL_REP_PERSON = "AAAAAAAAAA";
    private static final String UPDATED_LEGAL_REP_PERSON = "BBBBBBBBBB";

    private static final String DEFAULT_LAST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_LAST_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_FIRST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_FIRST_NAME = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_BIRTHDATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_BIRTHDATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_NATIONALITY = "AAAAAAAAAA";
    private static final String UPDATED_NATIONALITY = "BBBBBBBBBB";

    private static final String DEFAULT_NIN = "AAAAAAAAAA";
    private static final String UPDATED_NIN = "BBBBBBBBBB";

    private static final String DEFAULT_PLACE_OF_BIRTH = "AAAAAAAAAA";
    private static final String UPDATED_PLACE_OF_BIRTH = "BBBBBBBBBB";

    private static final String DEFAULT_CITY_OF_BIRTH = "AAAAAAAAAA";
    private static final String UPDATED_CITY_OF_BIRTH = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_OF_IDENTITY = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_OF_IDENTITY = "BBBBBBBBBB";

    private static final String DEFAULT_IDENTITY_ID_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_IDENTITY_ID_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_NIN_CEDEO = "AAAAAAAAAA";
    private static final String UPDATED_NIN_CEDEO = "BBBBBBBBBB";

    private static final String DEFAULT_ISSUED_DATE = "AAAAAAAAAA";
    private static final String UPDATED_ISSUED_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_EXPIRY_DATE = "AAAAAAAAAA";
    private static final String UPDATED_EXPIRY_DATE = "BBBBBBBBBB";

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

    private static final String DEFAULT_LAND_LINE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_LAND_LINE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_MOBILE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_MOBILE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_EMAIL = "AAAAAAAAAA";
    private static final String UPDATED_EMAIL = "BBBBBBBBBB";

    @Autowired
    private RepresentantLegalRepository representantLegalRepository;

    @Autowired
    private RepresentantLegalService representantLegalService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restRepresentantLegalMockMvc;

    private RepresentantLegal representantLegal;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static RepresentantLegal createEntity(EntityManager em) {
        RepresentantLegal representantLegal = new RepresentantLegal()
            .legalRepPerson(DEFAULT_LEGAL_REP_PERSON)
            .lastName(DEFAULT_LAST_NAME)
            .firstName(DEFAULT_FIRST_NAME)
            .birthdate(DEFAULT_BIRTHDATE)
            .nationality(DEFAULT_NATIONALITY)
            .nin(DEFAULT_NIN)
            .placeOfBirth(DEFAULT_PLACE_OF_BIRTH)
            .cityOfBirth(DEFAULT_CITY_OF_BIRTH)
            .typeOfIdentity(DEFAULT_TYPE_OF_IDENTITY)
            .identityIdNumber(DEFAULT_IDENTITY_ID_NUMBER)
            .ninCedeo(DEFAULT_NIN_CEDEO)
            .issuedDate(DEFAULT_ISSUED_DATE)
            .expiryDate(DEFAULT_EXPIRY_DATE)
            .region(DEFAULT_REGION)
            .department(DEFAULT_DEPARTMENT)
            .arondissement(DEFAULT_ARONDISSEMENT)
            .commune(DEFAULT_COMMUNE)
            .qartier(DEFAULT_QARTIER)
            .address(DEFAULT_ADDRESS)
            .landLineNumber(DEFAULT_LAND_LINE_NUMBER)
            .mobileNumber(DEFAULT_MOBILE_NUMBER)
            .email(DEFAULT_EMAIL);
        return representantLegal;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static RepresentantLegal createUpdatedEntity(EntityManager em) {
        RepresentantLegal representantLegal = new RepresentantLegal()
            .legalRepPerson(UPDATED_LEGAL_REP_PERSON)
            .lastName(UPDATED_LAST_NAME)
            .firstName(UPDATED_FIRST_NAME)
            .birthdate(UPDATED_BIRTHDATE)
            .nationality(UPDATED_NATIONALITY)
            .nin(UPDATED_NIN)
            .placeOfBirth(UPDATED_PLACE_OF_BIRTH)
            .cityOfBirth(UPDATED_CITY_OF_BIRTH)
            .typeOfIdentity(UPDATED_TYPE_OF_IDENTITY)
            .identityIdNumber(UPDATED_IDENTITY_ID_NUMBER)
            .ninCedeo(UPDATED_NIN_CEDEO)
            .issuedDate(UPDATED_ISSUED_DATE)
            .expiryDate(UPDATED_EXPIRY_DATE)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .landLineNumber(UPDATED_LAND_LINE_NUMBER)
            .mobileNumber(UPDATED_MOBILE_NUMBER)
            .email(UPDATED_EMAIL);
        return representantLegal;
    }

    @BeforeEach
    public void initTest() {
        representantLegal = createEntity(em);
    }

    @Test
    @Transactional
    public void createRepresentantLegal() throws Exception {
        int databaseSizeBeforeCreate = representantLegalRepository.findAll().size();

        // Create the RepresentantLegal
        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isCreated());

        // Validate the RepresentantLegal in the database
        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeCreate + 1);
        RepresentantLegal testRepresentantLegal = representantLegalList.get(representantLegalList.size() - 1);
        assertThat(testRepresentantLegal.getLegalRepPerson()).isEqualTo(DEFAULT_LEGAL_REP_PERSON);
        assertThat(testRepresentantLegal.getLastName()).isEqualTo(DEFAULT_LAST_NAME);
        assertThat(testRepresentantLegal.getFirstName()).isEqualTo(DEFAULT_FIRST_NAME);
        assertThat(testRepresentantLegal.getBirthdate()).isEqualTo(DEFAULT_BIRTHDATE);
        assertThat(testRepresentantLegal.getNationality()).isEqualTo(DEFAULT_NATIONALITY);
        assertThat(testRepresentantLegal.getNin()).isEqualTo(DEFAULT_NIN);
        assertThat(testRepresentantLegal.getPlaceOfBirth()).isEqualTo(DEFAULT_PLACE_OF_BIRTH);
        assertThat(testRepresentantLegal.getCityOfBirth()).isEqualTo(DEFAULT_CITY_OF_BIRTH);
        assertThat(testRepresentantLegal.getTypeOfIdentity()).isEqualTo(DEFAULT_TYPE_OF_IDENTITY);
        assertThat(testRepresentantLegal.getIdentityIdNumber()).isEqualTo(DEFAULT_IDENTITY_ID_NUMBER);
        assertThat(testRepresentantLegal.getNinCedeo()).isEqualTo(DEFAULT_NIN_CEDEO);
        assertThat(testRepresentantLegal.getIssuedDate()).isEqualTo(DEFAULT_ISSUED_DATE);
        assertThat(testRepresentantLegal.getExpiryDate()).isEqualTo(DEFAULT_EXPIRY_DATE);
        assertThat(testRepresentantLegal.getRegion()).isEqualTo(DEFAULT_REGION);
        assertThat(testRepresentantLegal.getDepartment()).isEqualTo(DEFAULT_DEPARTMENT);
        assertThat(testRepresentantLegal.getArondissement()).isEqualTo(DEFAULT_ARONDISSEMENT);
        assertThat(testRepresentantLegal.getCommune()).isEqualTo(DEFAULT_COMMUNE);
        assertThat(testRepresentantLegal.getQartier()).isEqualTo(DEFAULT_QARTIER);
        assertThat(testRepresentantLegal.getAddress()).isEqualTo(DEFAULT_ADDRESS);
        assertThat(testRepresentantLegal.getLandLineNumber()).isEqualTo(DEFAULT_LAND_LINE_NUMBER);
        assertThat(testRepresentantLegal.getMobileNumber()).isEqualTo(DEFAULT_MOBILE_NUMBER);
        assertThat(testRepresentantLegal.getEmail()).isEqualTo(DEFAULT_EMAIL);
    }

    @Test
    @Transactional
    public void createRepresentantLegalWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = representantLegalRepository.findAll().size();

        // Create the RepresentantLegal with an existing ID
        representantLegal.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        // Validate the RepresentantLegal in the database
        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkLastNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = representantLegalRepository.findAll().size();
        // set the field null
        representantLegal.setLastName(null);

        // Create the RepresentantLegal, which fails.

        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkFirstNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = representantLegalRepository.findAll().size();
        // set the field null
        representantLegal.setFirstName(null);

        // Create the RepresentantLegal, which fails.

        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkBirthdateIsRequired() throws Exception {
        int databaseSizeBeforeTest = representantLegalRepository.findAll().size();
        // set the field null
        representantLegal.setBirthdate(null);

        // Create the RepresentantLegal, which fails.

        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNationalityIsRequired() throws Exception {
        int databaseSizeBeforeTest = representantLegalRepository.findAll().size();
        // set the field null
        representantLegal.setNationality(null);

        // Create the RepresentantLegal, which fails.

        restRepresentantLegalMockMvc.perform(post("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllRepresentantLegals() throws Exception {
        // Initialize the database
        representantLegalRepository.saveAndFlush(representantLegal);

        // Get all the representantLegalList
        restRepresentantLegalMockMvc.perform(get("/api/representant-legals?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(representantLegal.getId().intValue())))
            .andExpect(jsonPath("$.[*].legalRepPerson").value(hasItem(DEFAULT_LEGAL_REP_PERSON)))
            .andExpect(jsonPath("$.[*].lastName").value(hasItem(DEFAULT_LAST_NAME)))
            .andExpect(jsonPath("$.[*].firstName").value(hasItem(DEFAULT_FIRST_NAME)))
            .andExpect(jsonPath("$.[*].birthdate").value(hasItem(DEFAULT_BIRTHDATE.toString())))
            .andExpect(jsonPath("$.[*].nationality").value(hasItem(DEFAULT_NATIONALITY)))
            .andExpect(jsonPath("$.[*].nin").value(hasItem(DEFAULT_NIN)))
            .andExpect(jsonPath("$.[*].placeOfBirth").value(hasItem(DEFAULT_PLACE_OF_BIRTH)))
            .andExpect(jsonPath("$.[*].cityOfBirth").value(hasItem(DEFAULT_CITY_OF_BIRTH)))
            .andExpect(jsonPath("$.[*].typeOfIdentity").value(hasItem(DEFAULT_TYPE_OF_IDENTITY)))
            .andExpect(jsonPath("$.[*].identityIdNumber").value(hasItem(DEFAULT_IDENTITY_ID_NUMBER)))
            .andExpect(jsonPath("$.[*].ninCedeo").value(hasItem(DEFAULT_NIN_CEDEO)))
            .andExpect(jsonPath("$.[*].issuedDate").value(hasItem(DEFAULT_ISSUED_DATE)))
            .andExpect(jsonPath("$.[*].expiryDate").value(hasItem(DEFAULT_EXPIRY_DATE)))
            .andExpect(jsonPath("$.[*].region").value(hasItem(DEFAULT_REGION)))
            .andExpect(jsonPath("$.[*].department").value(hasItem(DEFAULT_DEPARTMENT)))
            .andExpect(jsonPath("$.[*].arondissement").value(hasItem(DEFAULT_ARONDISSEMENT)))
            .andExpect(jsonPath("$.[*].commune").value(hasItem(DEFAULT_COMMUNE)))
            .andExpect(jsonPath("$.[*].qartier").value(hasItem(DEFAULT_QARTIER)))
            .andExpect(jsonPath("$.[*].address").value(hasItem(DEFAULT_ADDRESS)))
            .andExpect(jsonPath("$.[*].landLineNumber").value(hasItem(DEFAULT_LAND_LINE_NUMBER)))
            .andExpect(jsonPath("$.[*].mobileNumber").value(hasItem(DEFAULT_MOBILE_NUMBER)))
            .andExpect(jsonPath("$.[*].email").value(hasItem(DEFAULT_EMAIL)));
    }
    
    @Test
    @Transactional
    public void getRepresentantLegal() throws Exception {
        // Initialize the database
        representantLegalRepository.saveAndFlush(representantLegal);

        // Get the representantLegal
        restRepresentantLegalMockMvc.perform(get("/api/representant-legals/{id}", representantLegal.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(representantLegal.getId().intValue()))
            .andExpect(jsonPath("$.legalRepPerson").value(DEFAULT_LEGAL_REP_PERSON))
            .andExpect(jsonPath("$.lastName").value(DEFAULT_LAST_NAME))
            .andExpect(jsonPath("$.firstName").value(DEFAULT_FIRST_NAME))
            .andExpect(jsonPath("$.birthdate").value(DEFAULT_BIRTHDATE.toString()))
            .andExpect(jsonPath("$.nationality").value(DEFAULT_NATIONALITY))
            .andExpect(jsonPath("$.nin").value(DEFAULT_NIN))
            .andExpect(jsonPath("$.placeOfBirth").value(DEFAULT_PLACE_OF_BIRTH))
            .andExpect(jsonPath("$.cityOfBirth").value(DEFAULT_CITY_OF_BIRTH))
            .andExpect(jsonPath("$.typeOfIdentity").value(DEFAULT_TYPE_OF_IDENTITY))
            .andExpect(jsonPath("$.identityIdNumber").value(DEFAULT_IDENTITY_ID_NUMBER))
            .andExpect(jsonPath("$.ninCedeo").value(DEFAULT_NIN_CEDEO))
            .andExpect(jsonPath("$.issuedDate").value(DEFAULT_ISSUED_DATE))
            .andExpect(jsonPath("$.expiryDate").value(DEFAULT_EXPIRY_DATE))
            .andExpect(jsonPath("$.region").value(DEFAULT_REGION))
            .andExpect(jsonPath("$.department").value(DEFAULT_DEPARTMENT))
            .andExpect(jsonPath("$.arondissement").value(DEFAULT_ARONDISSEMENT))
            .andExpect(jsonPath("$.commune").value(DEFAULT_COMMUNE))
            .andExpect(jsonPath("$.qartier").value(DEFAULT_QARTIER))
            .andExpect(jsonPath("$.address").value(DEFAULT_ADDRESS))
            .andExpect(jsonPath("$.landLineNumber").value(DEFAULT_LAND_LINE_NUMBER))
            .andExpect(jsonPath("$.mobileNumber").value(DEFAULT_MOBILE_NUMBER))
            .andExpect(jsonPath("$.email").value(DEFAULT_EMAIL));
    }

    @Test
    @Transactional
    public void getNonExistingRepresentantLegal() throws Exception {
        // Get the representantLegal
        restRepresentantLegalMockMvc.perform(get("/api/representant-legals/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateRepresentantLegal() throws Exception {
        // Initialize the database
        representantLegalService.save(representantLegal);

        int databaseSizeBeforeUpdate = representantLegalRepository.findAll().size();

        // Update the representantLegal
        RepresentantLegal updatedRepresentantLegal = representantLegalRepository.findById(representantLegal.getId()).get();
        // Disconnect from session so that the updates on updatedRepresentantLegal are not directly saved in db
        em.detach(updatedRepresentantLegal);
        updatedRepresentantLegal
            .legalRepPerson(UPDATED_LEGAL_REP_PERSON)
            .lastName(UPDATED_LAST_NAME)
            .firstName(UPDATED_FIRST_NAME)
            .birthdate(UPDATED_BIRTHDATE)
            .nationality(UPDATED_NATIONALITY)
            .nin(UPDATED_NIN)
            .placeOfBirth(UPDATED_PLACE_OF_BIRTH)
            .cityOfBirth(UPDATED_CITY_OF_BIRTH)
            .typeOfIdentity(UPDATED_TYPE_OF_IDENTITY)
            .identityIdNumber(UPDATED_IDENTITY_ID_NUMBER)
            .ninCedeo(UPDATED_NIN_CEDEO)
            .issuedDate(UPDATED_ISSUED_DATE)
            .expiryDate(UPDATED_EXPIRY_DATE)
            .region(UPDATED_REGION)
            .department(UPDATED_DEPARTMENT)
            .arondissement(UPDATED_ARONDISSEMENT)
            .commune(UPDATED_COMMUNE)
            .qartier(UPDATED_QARTIER)
            .address(UPDATED_ADDRESS)
            .landLineNumber(UPDATED_LAND_LINE_NUMBER)
            .mobileNumber(UPDATED_MOBILE_NUMBER)
            .email(UPDATED_EMAIL);

        restRepresentantLegalMockMvc.perform(put("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedRepresentantLegal)))
            .andExpect(status().isOk());

        // Validate the RepresentantLegal in the database
        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeUpdate);
        RepresentantLegal testRepresentantLegal = representantLegalList.get(representantLegalList.size() - 1);
        assertThat(testRepresentantLegal.getLegalRepPerson()).isEqualTo(UPDATED_LEGAL_REP_PERSON);
        assertThat(testRepresentantLegal.getLastName()).isEqualTo(UPDATED_LAST_NAME);
        assertThat(testRepresentantLegal.getFirstName()).isEqualTo(UPDATED_FIRST_NAME);
        assertThat(testRepresentantLegal.getBirthdate()).isEqualTo(UPDATED_BIRTHDATE);
        assertThat(testRepresentantLegal.getNationality()).isEqualTo(UPDATED_NATIONALITY);
        assertThat(testRepresentantLegal.getNin()).isEqualTo(UPDATED_NIN);
        assertThat(testRepresentantLegal.getPlaceOfBirth()).isEqualTo(UPDATED_PLACE_OF_BIRTH);
        assertThat(testRepresentantLegal.getCityOfBirth()).isEqualTo(UPDATED_CITY_OF_BIRTH);
        assertThat(testRepresentantLegal.getTypeOfIdentity()).isEqualTo(UPDATED_TYPE_OF_IDENTITY);
        assertThat(testRepresentantLegal.getIdentityIdNumber()).isEqualTo(UPDATED_IDENTITY_ID_NUMBER);
        assertThat(testRepresentantLegal.getNinCedeo()).isEqualTo(UPDATED_NIN_CEDEO);
        assertThat(testRepresentantLegal.getIssuedDate()).isEqualTo(UPDATED_ISSUED_DATE);
        assertThat(testRepresentantLegal.getExpiryDate()).isEqualTo(UPDATED_EXPIRY_DATE);
        assertThat(testRepresentantLegal.getRegion()).isEqualTo(UPDATED_REGION);
        assertThat(testRepresentantLegal.getDepartment()).isEqualTo(UPDATED_DEPARTMENT);
        assertThat(testRepresentantLegal.getArondissement()).isEqualTo(UPDATED_ARONDISSEMENT);
        assertThat(testRepresentantLegal.getCommune()).isEqualTo(UPDATED_COMMUNE);
        assertThat(testRepresentantLegal.getQartier()).isEqualTo(UPDATED_QARTIER);
        assertThat(testRepresentantLegal.getAddress()).isEqualTo(UPDATED_ADDRESS);
        assertThat(testRepresentantLegal.getLandLineNumber()).isEqualTo(UPDATED_LAND_LINE_NUMBER);
        assertThat(testRepresentantLegal.getMobileNumber()).isEqualTo(UPDATED_MOBILE_NUMBER);
        assertThat(testRepresentantLegal.getEmail()).isEqualTo(UPDATED_EMAIL);
    }

    @Test
    @Transactional
    public void updateNonExistingRepresentantLegal() throws Exception {
        int databaseSizeBeforeUpdate = representantLegalRepository.findAll().size();

        // Create the RepresentantLegal

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restRepresentantLegalMockMvc.perform(put("/api/representant-legals")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(representantLegal)))
            .andExpect(status().isBadRequest());

        // Validate the RepresentantLegal in the database
        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteRepresentantLegal() throws Exception {
        // Initialize the database
        representantLegalService.save(representantLegal);

        int databaseSizeBeforeDelete = representantLegalRepository.findAll().size();

        // Delete the representantLegal
        restRepresentantLegalMockMvc.perform(delete("/api/representant-legals/{id}", representantLegal.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<RepresentantLegal> representantLegalList = representantLegalRepository.findAll();
        assertThat(representantLegalList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
