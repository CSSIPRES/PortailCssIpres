package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresApp;
import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.repository.ImmatriculationRepository;
import com.secusociale.portail.service.ImmatriculationService;

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
 * Integration tests for the {@link ImmatriculationResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresApp.class)

@AutoConfigureMockMvc
@WithMockUser
public class ImmatriculationResourceIT {

    private static final String DEFAULT_REG_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_REG_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOYER_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYER_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_ETABLISSEMENT = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_ETABLISSEMENT = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOYER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_HQ_ID = "AAAAAAAAAA";
    private static final String UPDATED_HQ_ID = "BBBBBBBBBB";

    private static final String DEFAULT_NINEA_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_NINEA_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_NINET_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_NINET_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_COMPAGNY_ORIGIN_ID = "AAAAAAAAAA";
    private static final String UPDATED_COMPAGNY_ORIGIN_ID = "BBBBBBBBBB";

    private static final String DEFAULT_LEGAL_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_LEGAL_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_TAX_ID = "AAAAAAAAAA";
    private static final String UPDATED_TAX_ID = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_TAX_ID_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TAX_ID_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_TRADE_REGISTER_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_TRADE_REGISTER_NUMBER = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_TRADE_REGISTER_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRADE_REGISTER_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_OF_INPSECTION = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_OF_INPSECTION = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_OF_FIRT_HIRE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_OF_FIRT_HIRE = LocalDate.now(ZoneId.systemDefault());

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

    private static final String DEFAULT_LEGAL_REP_PERSON = "AAAAAAAAAA";
    private static final String UPDATED_LEGAL_REP_PERSON = "BBBBBBBBBB";

    private static final String DEFAULT_LAST_NAME_REP = "AAAAAAAAAA";
    private static final String UPDATED_LAST_NAME_REP = "BBBBBBBBBB";

    private static final String DEFAULT_FIRST_NAME_REP = "AAAAAAAAAA";
    private static final String UPDATED_FIRST_NAME_REP = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_BIRTHDATE_REP = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_BIRTHDATE_REP = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_NATIONALITY_REP = "AAAAAAAAAA";
    private static final String UPDATED_NATIONALITY_REP = "BBBBBBBBBB";

    private static final String DEFAULT_NIN_REP = "AAAAAAAAAA";
    private static final String UPDATED_NIN_REP = "BBBBBBBBBB";

    private static final String DEFAULT_PLACE_OF_BIRTH_REP = "AAAAAAAAAA";
    private static final String UPDATED_PLACE_OF_BIRTH_REP = "BBBBBBBBBB";

    private static final String DEFAULT_CITY_OF_BIRTH_REP = "AAAAAAAAAA";
    private static final String UPDATED_CITY_OF_BIRTH_REP = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_OF_IDENTITY_REP = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_OF_IDENTITY_REP = "BBBBBBBBBB";

    private static final String DEFAULT_IDENTITY_ID_NUMBER_REP = "AAAAAAAAAA";
    private static final String UPDATED_IDENTITY_ID_NUMBER_REP = "BBBBBBBBBB";

    private static final String DEFAULT_NIN_CEDEO_REP = "AAAAAAAAAA";
    private static final String UPDATED_NIN_CEDEO_REP = "BBBBBBBBBB";

    private static final String DEFAULT_ISSUED_DATE_REP = "AAAAAAAAAA";
    private static final String UPDATED_ISSUED_DATE_REP = "BBBBBBBBBB";

    private static final String DEFAULT_EXPIRY_DATE_REP = "AAAAAAAAAA";
    private static final String UPDATED_EXPIRY_DATE_REP = "BBBBBBBBBB";

    private static final String DEFAULT_REGION_REP = "AAAAAAAAAA";
    private static final String UPDATED_REGION_REP = "BBBBBBBBBB";

    private static final String DEFAULT_DEPARTMENT_REP = "AAAAAAAAAA";
    private static final String UPDATED_DEPARTMENT_REP = "BBBBBBBBBB";

    private static final String DEFAULT_ARONDISSEMENT_REP = "AAAAAAAAAA";
    private static final String UPDATED_ARONDISSEMENT_REP = "BBBBBBBBBB";

    private static final String DEFAULT_COMMUNE_REP = "AAAAAAAAAA";
    private static final String UPDATED_COMMUNE_REP = "BBBBBBBBBB";

    private static final String DEFAULT_QARTIER_REP = "AAAAAAAAAA";
    private static final String UPDATED_QARTIER_REP = "BBBBBBBBBB";

    private static final String DEFAULT_ADDRESS_REP = "AAAAAAAAAA";
    private static final String UPDATED_ADDRESS_REP = "BBBBBBBBBB";

    private static final String DEFAULT_LAND_LINE_NUMBER_REP = "AAAAAAAAAA";
    private static final String UPDATED_LAND_LINE_NUMBER_REP = "BBBBBBBBBB";

    private static final String DEFAULT_MOBILE_NUMBER_REP = "AAAAAAAAAA";
    private static final String UPDATED_MOBILE_NUMBER_REP = "BBBBBBBBBB";

    private static final String DEFAULT_EMAIL_REP = "AAAAAAAAAA";
    private static final String UPDATED_EMAIL_REP = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOYER_REGISTRATION_FORM_ID = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYER_REGISTRATION_FORM_ID = "BBBBBBBBBB";

    private static final String DEFAULT_EMPLOYEE_REGISTRATION_FORM_ID = "AAAAAAAAAA";
    private static final String UPDATED_EMPLOYEE_REGISTRATION_FORM_ID = "BBBBBBBBBB";

    private static final String DEFAULT_PROCESS_FLOW_ID = "AAAAAAAAAA";
    private static final String UPDATED_PROCESS_FLOW_ID = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DOSSIER = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DOSSIER = "BBBBBBBBBB";

    private static final Boolean DEFAULT_STATUT_IMMATRICULATION = false;
    private static final Boolean UPDATED_STATUT_IMMATRICULATION = true;

    @Autowired
    private ImmatriculationRepository immatriculationRepository;

    @Autowired
    private ImmatriculationService immatriculationService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restImmatriculationMockMvc;

    private Immatriculation immatriculation;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Immatriculation createEntity(EntityManager em) {
        Immatriculation immatriculation = new Immatriculation()
            .regType(DEFAULT_REG_TYPE)
            .employerType(DEFAULT_EMPLOYER_TYPE)
            .typeEtablissement(DEFAULT_TYPE_ETABLISSEMENT)
            .employerName(DEFAULT_EMPLOYER_NAME)
            .hqId(DEFAULT_HQ_ID)
            .nineaNumber(DEFAULT_NINEA_NUMBER)
            .ninetNumber(DEFAULT_NINET_NUMBER)
            .compagnyOriginId(DEFAULT_COMPAGNY_ORIGIN_ID)
            .legalStatus(DEFAULT_LEGAL_STATUS)
            .taxId(DEFAULT_TAX_ID)
            .taxIdDate(DEFAULT_TAX_ID_DATE)
            .tradeRegisterNumber(DEFAULT_TRADE_REGISTER_NUMBER)
            .tradeRegisterDate(DEFAULT_TRADE_REGISTER_DATE)
            .dateOfInpsection(DEFAULT_DATE_OF_INPSECTION)
            .dateOfFirtHire(DEFAULT_DATE_OF_FIRT_HIRE)
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
            .legalRepPerson(DEFAULT_LEGAL_REP_PERSON)
            .lastNameRep(DEFAULT_LAST_NAME_REP)
            .firstNameRep(DEFAULT_FIRST_NAME_REP)
            .birthdateRep(DEFAULT_BIRTHDATE_REP)
            .nationalityRep(DEFAULT_NATIONALITY_REP)
            .ninRep(DEFAULT_NIN_REP)
            .placeOfBirthRep(DEFAULT_PLACE_OF_BIRTH_REP)
            .cityOfBirthRep(DEFAULT_CITY_OF_BIRTH_REP)
            .typeOfIdentityRep(DEFAULT_TYPE_OF_IDENTITY_REP)
            .identityIdNumberRep(DEFAULT_IDENTITY_ID_NUMBER_REP)
            .ninCedeoRep(DEFAULT_NIN_CEDEO_REP)
            .issuedDateRep(DEFAULT_ISSUED_DATE_REP)
            .expiryDateRep(DEFAULT_EXPIRY_DATE_REP)
            .regionRep(DEFAULT_REGION_REP)
            .departmentRep(DEFAULT_DEPARTMENT_REP)
            .arondissementRep(DEFAULT_ARONDISSEMENT_REP)
            .communeRep(DEFAULT_COMMUNE_REP)
            .qartierRep(DEFAULT_QARTIER_REP)
            .addressRep(DEFAULT_ADDRESS_REP)
            .landLineNumberRep(DEFAULT_LAND_LINE_NUMBER_REP)
            .mobileNumberRep(DEFAULT_MOBILE_NUMBER_REP)
            .emailRep(DEFAULT_EMAIL_REP)
            .employerRegistrationFormId(DEFAULT_EMPLOYER_REGISTRATION_FORM_ID)
            .employeeRegistrationFormId(DEFAULT_EMPLOYEE_REGISTRATION_FORM_ID)
            .processFlowId(DEFAULT_PROCESS_FLOW_ID)
            .statutDossier(DEFAULT_STATUT_DOSSIER)
            .statutImmatriculation(DEFAULT_STATUT_IMMATRICULATION);
        return immatriculation;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Immatriculation createUpdatedEntity(EntityManager em) {
        Immatriculation immatriculation = new Immatriculation()
            .regType(UPDATED_REG_TYPE)
            .employerType(UPDATED_EMPLOYER_TYPE)
            .typeEtablissement(UPDATED_TYPE_ETABLISSEMENT)
            .employerName(UPDATED_EMPLOYER_NAME)
            .hqId(UPDATED_HQ_ID)
            .nineaNumber(UPDATED_NINEA_NUMBER)
            .ninetNumber(UPDATED_NINET_NUMBER)
            .compagnyOriginId(UPDATED_COMPAGNY_ORIGIN_ID)
            .legalStatus(UPDATED_LEGAL_STATUS)
            .taxId(UPDATED_TAX_ID)
            .taxIdDate(UPDATED_TAX_ID_DATE)
            .tradeRegisterNumber(UPDATED_TRADE_REGISTER_NUMBER)
            .tradeRegisterDate(UPDATED_TRADE_REGISTER_DATE)
            .dateOfInpsection(UPDATED_DATE_OF_INPSECTION)
            .dateOfFirtHire(UPDATED_DATE_OF_FIRT_HIRE)
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
            .legalRepPerson(UPDATED_LEGAL_REP_PERSON)
            .lastNameRep(UPDATED_LAST_NAME_REP)
            .firstNameRep(UPDATED_FIRST_NAME_REP)
            .birthdateRep(UPDATED_BIRTHDATE_REP)
            .nationalityRep(UPDATED_NATIONALITY_REP)
            .ninRep(UPDATED_NIN_REP)
            .placeOfBirthRep(UPDATED_PLACE_OF_BIRTH_REP)
            .cityOfBirthRep(UPDATED_CITY_OF_BIRTH_REP)
            .typeOfIdentityRep(UPDATED_TYPE_OF_IDENTITY_REP)
            .identityIdNumberRep(UPDATED_IDENTITY_ID_NUMBER_REP)
            .ninCedeoRep(UPDATED_NIN_CEDEO_REP)
            .issuedDateRep(UPDATED_ISSUED_DATE_REP)
            .expiryDateRep(UPDATED_EXPIRY_DATE_REP)
            .regionRep(UPDATED_REGION_REP)
            .departmentRep(UPDATED_DEPARTMENT_REP)
            .arondissementRep(UPDATED_ARONDISSEMENT_REP)
            .communeRep(UPDATED_COMMUNE_REP)
            .qartierRep(UPDATED_QARTIER_REP)
            .addressRep(UPDATED_ADDRESS_REP)
            .landLineNumberRep(UPDATED_LAND_LINE_NUMBER_REP)
            .mobileNumberRep(UPDATED_MOBILE_NUMBER_REP)
            .emailRep(UPDATED_EMAIL_REP)
            .employerRegistrationFormId(UPDATED_EMPLOYER_REGISTRATION_FORM_ID)
            .employeeRegistrationFormId(UPDATED_EMPLOYEE_REGISTRATION_FORM_ID)
            .processFlowId(UPDATED_PROCESS_FLOW_ID)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .statutImmatriculation(UPDATED_STATUT_IMMATRICULATION);
        return immatriculation;
    }

    @BeforeEach
    public void initTest() {
        immatriculation = createEntity(em);
    }

    @Test
    @Transactional
    public void createImmatriculation() throws Exception {
        int databaseSizeBeforeCreate = immatriculationRepository.findAll().size();

        // Create the Immatriculation
        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isCreated());

        // Validate the Immatriculation in the database
        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeCreate + 1);
        Immatriculation testImmatriculation = immatriculationList.get(immatriculationList.size() - 1);
        assertThat(testImmatriculation.getRegType()).isEqualTo(DEFAULT_REG_TYPE);
        assertThat(testImmatriculation.getEmployerType()).isEqualTo(DEFAULT_EMPLOYER_TYPE);
        assertThat(testImmatriculation.getTypeEtablissement()).isEqualTo(DEFAULT_TYPE_ETABLISSEMENT);
        assertThat(testImmatriculation.getEmployerName()).isEqualTo(DEFAULT_EMPLOYER_NAME);
        assertThat(testImmatriculation.getHqId()).isEqualTo(DEFAULT_HQ_ID);
        assertThat(testImmatriculation.getNineaNumber()).isEqualTo(DEFAULT_NINEA_NUMBER);
        assertThat(testImmatriculation.getNinetNumber()).isEqualTo(DEFAULT_NINET_NUMBER);
        assertThat(testImmatriculation.getCompagnyOriginId()).isEqualTo(DEFAULT_COMPAGNY_ORIGIN_ID);
        assertThat(testImmatriculation.getLegalStatus()).isEqualTo(DEFAULT_LEGAL_STATUS);
        assertThat(testImmatriculation.getTaxId()).isEqualTo(DEFAULT_TAX_ID);
        assertThat(testImmatriculation.getTaxIdDate()).isEqualTo(DEFAULT_TAX_ID_DATE);
        assertThat(testImmatriculation.getTradeRegisterNumber()).isEqualTo(DEFAULT_TRADE_REGISTER_NUMBER);
        assertThat(testImmatriculation.getTradeRegisterDate()).isEqualTo(DEFAULT_TRADE_REGISTER_DATE);
        assertThat(testImmatriculation.getDateOfInpsection()).isEqualTo(DEFAULT_DATE_OF_INPSECTION);
        assertThat(testImmatriculation.getDateOfFirtHire()).isEqualTo(DEFAULT_DATE_OF_FIRT_HIRE);
        assertThat(testImmatriculation.getShortName()).isEqualTo(DEFAULT_SHORT_NAME);
        assertThat(testImmatriculation.getBusinessSector()).isEqualTo(DEFAULT_BUSINESS_SECTOR);
        assertThat(testImmatriculation.getMainLineOfBusiness()).isEqualTo(DEFAULT_MAIN_LINE_OF_BUSINESS);
        assertThat(testImmatriculation.getNoOfWorkersInGenScheme()).isEqualTo(DEFAULT_NO_OF_WORKERS_IN_GEN_SCHEME);
        assertThat(testImmatriculation.getNoOfWorkersInBasicScheme()).isEqualTo(DEFAULT_NO_OF_WORKERS_IN_BASIC_SCHEME);
        assertThat(testImmatriculation.getRegion()).isEqualTo(DEFAULT_REGION);
        assertThat(testImmatriculation.getDepartment()).isEqualTo(DEFAULT_DEPARTMENT);
        assertThat(testImmatriculation.getArondissement()).isEqualTo(DEFAULT_ARONDISSEMENT);
        assertThat(testImmatriculation.getCommune()).isEqualTo(DEFAULT_COMMUNE);
        assertThat(testImmatriculation.getQartier()).isEqualTo(DEFAULT_QARTIER);
        assertThat(testImmatriculation.getAddress()).isEqualTo(DEFAULT_ADDRESS);
        assertThat(testImmatriculation.getPostboxNo()).isEqualTo(DEFAULT_POSTBOX_NO);
        assertThat(testImmatriculation.getTelephone()).isEqualTo(DEFAULT_TELEPHONE);
        assertThat(testImmatriculation.getEmail()).isEqualTo(DEFAULT_EMAIL);
        assertThat(testImmatriculation.getWebsite()).isEqualTo(DEFAULT_WEBSITE);
        assertThat(testImmatriculation.getZoneCss()).isEqualTo(DEFAULT_ZONE_CSS);
        assertThat(testImmatriculation.getZoneIpres()).isEqualTo(DEFAULT_ZONE_IPRES);
        assertThat(testImmatriculation.getSectorCss()).isEqualTo(DEFAULT_SECTOR_CSS);
        assertThat(testImmatriculation.getSectorIpres()).isEqualTo(DEFAULT_SECTOR_IPRES);
        assertThat(testImmatriculation.getAgencyCss()).isEqualTo(DEFAULT_AGENCY_CSS);
        assertThat(testImmatriculation.getAgencyIpres()).isEqualTo(DEFAULT_AGENCY_IPRES);
        assertThat(testImmatriculation.getLegalRepPerson()).isEqualTo(DEFAULT_LEGAL_REP_PERSON);
        assertThat(testImmatriculation.getLastNameRep()).isEqualTo(DEFAULT_LAST_NAME_REP);
        assertThat(testImmatriculation.getFirstNameRep()).isEqualTo(DEFAULT_FIRST_NAME_REP);
        assertThat(testImmatriculation.getBirthdateRep()).isEqualTo(DEFAULT_BIRTHDATE_REP);
        assertThat(testImmatriculation.getNationalityRep()).isEqualTo(DEFAULT_NATIONALITY_REP);
        assertThat(testImmatriculation.getNinRep()).isEqualTo(DEFAULT_NIN_REP);
        assertThat(testImmatriculation.getPlaceOfBirthRep()).isEqualTo(DEFAULT_PLACE_OF_BIRTH_REP);
        assertThat(testImmatriculation.getCityOfBirthRep()).isEqualTo(DEFAULT_CITY_OF_BIRTH_REP);
        assertThat(testImmatriculation.getTypeOfIdentityRep()).isEqualTo(DEFAULT_TYPE_OF_IDENTITY_REP);
        assertThat(testImmatriculation.getIdentityIdNumberRep()).isEqualTo(DEFAULT_IDENTITY_ID_NUMBER_REP);
        assertThat(testImmatriculation.getNinCedeoRep()).isEqualTo(DEFAULT_NIN_CEDEO_REP);
        assertThat(testImmatriculation.getIssuedDateRep()).isEqualTo(DEFAULT_ISSUED_DATE_REP);
        assertThat(testImmatriculation.getExpiryDateRep()).isEqualTo(DEFAULT_EXPIRY_DATE_REP);
        assertThat(testImmatriculation.getRegionRep()).isEqualTo(DEFAULT_REGION_REP);
        assertThat(testImmatriculation.getDepartmentRep()).isEqualTo(DEFAULT_DEPARTMENT_REP);
        assertThat(testImmatriculation.getArondissementRep()).isEqualTo(DEFAULT_ARONDISSEMENT_REP);
        assertThat(testImmatriculation.getCommuneRep()).isEqualTo(DEFAULT_COMMUNE_REP);
        assertThat(testImmatriculation.getQartierRep()).isEqualTo(DEFAULT_QARTIER_REP);
        assertThat(testImmatriculation.getAddressRep()).isEqualTo(DEFAULT_ADDRESS_REP);
        assertThat(testImmatriculation.getLandLineNumberRep()).isEqualTo(DEFAULT_LAND_LINE_NUMBER_REP);
        assertThat(testImmatriculation.getMobileNumberRep()).isEqualTo(DEFAULT_MOBILE_NUMBER_REP);
        assertThat(testImmatriculation.getEmailRep()).isEqualTo(DEFAULT_EMAIL_REP);
        assertThat(testImmatriculation.getEmployerRegistrationFormId()).isEqualTo(DEFAULT_EMPLOYER_REGISTRATION_FORM_ID);
        assertThat(testImmatriculation.getEmployeeRegistrationFormId()).isEqualTo(DEFAULT_EMPLOYEE_REGISTRATION_FORM_ID);
        assertThat(testImmatriculation.getProcessFlowId()).isEqualTo(DEFAULT_PROCESS_FLOW_ID);
        assertThat(testImmatriculation.getStatutDossier()).isEqualTo(DEFAULT_STATUT_DOSSIER);
        assertThat(testImmatriculation.isStatutImmatriculation()).isEqualTo(DEFAULT_STATUT_IMMATRICULATION);
    }

    @Test
    @Transactional
    public void createImmatriculationWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = immatriculationRepository.findAll().size();

        // Create the Immatriculation with an existing ID
        immatriculation.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        // Validate the Immatriculation in the database
        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkEmployerTypeIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setEmployerType(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkTypeEtablissementIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setTypeEtablissement(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkEmployerNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setEmployerName(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNineaNumberIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setNineaNumber(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkLegalStatusIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setLegalStatus(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkBusinessSectorIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setBusinessSector(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkMainLineOfBusinessIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setMainLineOfBusiness(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkRegionIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setRegion(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkDepartmentIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setDepartment(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkArondissementIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setArondissement(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkCommuneIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setCommune(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkQartierIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setQartier(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkAddressIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setAddress(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkLastNameRepIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setLastNameRep(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkFirstNameRepIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setFirstNameRep(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkBirthdateRepIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setBirthdateRep(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkNationalityRepIsRequired() throws Exception {
        int databaseSizeBeforeTest = immatriculationRepository.findAll().size();
        // set the field null
        immatriculation.setNationalityRep(null);

        // Create the Immatriculation, which fails.

        restImmatriculationMockMvc.perform(post("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllImmatriculations() throws Exception {
        // Initialize the database
        immatriculationRepository.saveAndFlush(immatriculation);

        // Get all the immatriculationList
        restImmatriculationMockMvc.perform(get("/api/immatriculations?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(immatriculation.getId().intValue())))
            .andExpect(jsonPath("$.[*].regType").value(hasItem(DEFAULT_REG_TYPE)))
            .andExpect(jsonPath("$.[*].employerType").value(hasItem(DEFAULT_EMPLOYER_TYPE)))
            .andExpect(jsonPath("$.[*].typeEtablissement").value(hasItem(DEFAULT_TYPE_ETABLISSEMENT)))
            .andExpect(jsonPath("$.[*].employerName").value(hasItem(DEFAULT_EMPLOYER_NAME)))
            .andExpect(jsonPath("$.[*].hqId").value(hasItem(DEFAULT_HQ_ID)))
            .andExpect(jsonPath("$.[*].nineaNumber").value(hasItem(DEFAULT_NINEA_NUMBER)))
            .andExpect(jsonPath("$.[*].ninetNumber").value(hasItem(DEFAULT_NINET_NUMBER)))
            .andExpect(jsonPath("$.[*].compagnyOriginId").value(hasItem(DEFAULT_COMPAGNY_ORIGIN_ID)))
            .andExpect(jsonPath("$.[*].legalStatus").value(hasItem(DEFAULT_LEGAL_STATUS)))
            .andExpect(jsonPath("$.[*].taxId").value(hasItem(DEFAULT_TAX_ID)))
            .andExpect(jsonPath("$.[*].taxIdDate").value(hasItem(DEFAULT_TAX_ID_DATE.toString())))
            .andExpect(jsonPath("$.[*].tradeRegisterNumber").value(hasItem(DEFAULT_TRADE_REGISTER_NUMBER)))
            .andExpect(jsonPath("$.[*].tradeRegisterDate").value(hasItem(DEFAULT_TRADE_REGISTER_DATE.toString())))
            .andExpect(jsonPath("$.[*].dateOfInpsection").value(hasItem(DEFAULT_DATE_OF_INPSECTION.toString())))
            .andExpect(jsonPath("$.[*].dateOfFirtHire").value(hasItem(DEFAULT_DATE_OF_FIRT_HIRE.toString())))
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
            .andExpect(jsonPath("$.[*].legalRepPerson").value(hasItem(DEFAULT_LEGAL_REP_PERSON)))
            .andExpect(jsonPath("$.[*].lastNameRep").value(hasItem(DEFAULT_LAST_NAME_REP)))
            .andExpect(jsonPath("$.[*].firstNameRep").value(hasItem(DEFAULT_FIRST_NAME_REP)))
            .andExpect(jsonPath("$.[*].birthdateRep").value(hasItem(DEFAULT_BIRTHDATE_REP.toString())))
            .andExpect(jsonPath("$.[*].nationalityRep").value(hasItem(DEFAULT_NATIONALITY_REP)))
            .andExpect(jsonPath("$.[*].ninRep").value(hasItem(DEFAULT_NIN_REP)))
            .andExpect(jsonPath("$.[*].placeOfBirthRep").value(hasItem(DEFAULT_PLACE_OF_BIRTH_REP)))
            .andExpect(jsonPath("$.[*].cityOfBirthRep").value(hasItem(DEFAULT_CITY_OF_BIRTH_REP)))
            .andExpect(jsonPath("$.[*].typeOfIdentityRep").value(hasItem(DEFAULT_TYPE_OF_IDENTITY_REP)))
            .andExpect(jsonPath("$.[*].identityIdNumberRep").value(hasItem(DEFAULT_IDENTITY_ID_NUMBER_REP)))
            .andExpect(jsonPath("$.[*].ninCedeoRep").value(hasItem(DEFAULT_NIN_CEDEO_REP)))
            .andExpect(jsonPath("$.[*].issuedDateRep").value(hasItem(DEFAULT_ISSUED_DATE_REP)))
            .andExpect(jsonPath("$.[*].expiryDateRep").value(hasItem(DEFAULT_EXPIRY_DATE_REP)))
            .andExpect(jsonPath("$.[*].regionRep").value(hasItem(DEFAULT_REGION_REP)))
            .andExpect(jsonPath("$.[*].departmentRep").value(hasItem(DEFAULT_DEPARTMENT_REP)))
            .andExpect(jsonPath("$.[*].arondissementRep").value(hasItem(DEFAULT_ARONDISSEMENT_REP)))
            .andExpect(jsonPath("$.[*].communeRep").value(hasItem(DEFAULT_COMMUNE_REP)))
            .andExpect(jsonPath("$.[*].qartierRep").value(hasItem(DEFAULT_QARTIER_REP)))
            .andExpect(jsonPath("$.[*].addressRep").value(hasItem(DEFAULT_ADDRESS_REP)))
            .andExpect(jsonPath("$.[*].landLineNumberRep").value(hasItem(DEFAULT_LAND_LINE_NUMBER_REP)))
            .andExpect(jsonPath("$.[*].mobileNumberRep").value(hasItem(DEFAULT_MOBILE_NUMBER_REP)))
            .andExpect(jsonPath("$.[*].emailRep").value(hasItem(DEFAULT_EMAIL_REP)))
            .andExpect(jsonPath("$.[*].employerRegistrationFormId").value(hasItem(DEFAULT_EMPLOYER_REGISTRATION_FORM_ID)))
            .andExpect(jsonPath("$.[*].employeeRegistrationFormId").value(hasItem(DEFAULT_EMPLOYEE_REGISTRATION_FORM_ID)))
            .andExpect(jsonPath("$.[*].processFlowId").value(hasItem(DEFAULT_PROCESS_FLOW_ID)))
            .andExpect(jsonPath("$.[*].statutDossier").value(hasItem(DEFAULT_STATUT_DOSSIER)))
            .andExpect(jsonPath("$.[*].statutImmatriculation").value(hasItem(DEFAULT_STATUT_IMMATRICULATION.booleanValue())));
    }
    
    @Test
    @Transactional
    public void getImmatriculation() throws Exception {
        // Initialize the database
        immatriculationRepository.saveAndFlush(immatriculation);

        // Get the immatriculation
        restImmatriculationMockMvc.perform(get("/api/immatriculations/{id}", immatriculation.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(immatriculation.getId().intValue()))
            .andExpect(jsonPath("$.regType").value(DEFAULT_REG_TYPE))
            .andExpect(jsonPath("$.employerType").value(DEFAULT_EMPLOYER_TYPE))
            .andExpect(jsonPath("$.typeEtablissement").value(DEFAULT_TYPE_ETABLISSEMENT))
            .andExpect(jsonPath("$.employerName").value(DEFAULT_EMPLOYER_NAME))
            .andExpect(jsonPath("$.hqId").value(DEFAULT_HQ_ID))
            .andExpect(jsonPath("$.nineaNumber").value(DEFAULT_NINEA_NUMBER))
            .andExpect(jsonPath("$.ninetNumber").value(DEFAULT_NINET_NUMBER))
            .andExpect(jsonPath("$.compagnyOriginId").value(DEFAULT_COMPAGNY_ORIGIN_ID))
            .andExpect(jsonPath("$.legalStatus").value(DEFAULT_LEGAL_STATUS))
            .andExpect(jsonPath("$.taxId").value(DEFAULT_TAX_ID))
            .andExpect(jsonPath("$.taxIdDate").value(DEFAULT_TAX_ID_DATE.toString()))
            .andExpect(jsonPath("$.tradeRegisterNumber").value(DEFAULT_TRADE_REGISTER_NUMBER))
            .andExpect(jsonPath("$.tradeRegisterDate").value(DEFAULT_TRADE_REGISTER_DATE.toString()))
            .andExpect(jsonPath("$.dateOfInpsection").value(DEFAULT_DATE_OF_INPSECTION.toString()))
            .andExpect(jsonPath("$.dateOfFirtHire").value(DEFAULT_DATE_OF_FIRT_HIRE.toString()))
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
            .andExpect(jsonPath("$.legalRepPerson").value(DEFAULT_LEGAL_REP_PERSON))
            .andExpect(jsonPath("$.lastNameRep").value(DEFAULT_LAST_NAME_REP))
            .andExpect(jsonPath("$.firstNameRep").value(DEFAULT_FIRST_NAME_REP))
            .andExpect(jsonPath("$.birthdateRep").value(DEFAULT_BIRTHDATE_REP.toString()))
            .andExpect(jsonPath("$.nationalityRep").value(DEFAULT_NATIONALITY_REP))
            .andExpect(jsonPath("$.ninRep").value(DEFAULT_NIN_REP))
            .andExpect(jsonPath("$.placeOfBirthRep").value(DEFAULT_PLACE_OF_BIRTH_REP))
            .andExpect(jsonPath("$.cityOfBirthRep").value(DEFAULT_CITY_OF_BIRTH_REP))
            .andExpect(jsonPath("$.typeOfIdentityRep").value(DEFAULT_TYPE_OF_IDENTITY_REP))
            .andExpect(jsonPath("$.identityIdNumberRep").value(DEFAULT_IDENTITY_ID_NUMBER_REP))
            .andExpect(jsonPath("$.ninCedeoRep").value(DEFAULT_NIN_CEDEO_REP))
            .andExpect(jsonPath("$.issuedDateRep").value(DEFAULT_ISSUED_DATE_REP))
            .andExpect(jsonPath("$.expiryDateRep").value(DEFAULT_EXPIRY_DATE_REP))
            .andExpect(jsonPath("$.regionRep").value(DEFAULT_REGION_REP))
            .andExpect(jsonPath("$.departmentRep").value(DEFAULT_DEPARTMENT_REP))
            .andExpect(jsonPath("$.arondissementRep").value(DEFAULT_ARONDISSEMENT_REP))
            .andExpect(jsonPath("$.communeRep").value(DEFAULT_COMMUNE_REP))
            .andExpect(jsonPath("$.qartierRep").value(DEFAULT_QARTIER_REP))
            .andExpect(jsonPath("$.addressRep").value(DEFAULT_ADDRESS_REP))
            .andExpect(jsonPath("$.landLineNumberRep").value(DEFAULT_LAND_LINE_NUMBER_REP))
            .andExpect(jsonPath("$.mobileNumberRep").value(DEFAULT_MOBILE_NUMBER_REP))
            .andExpect(jsonPath("$.emailRep").value(DEFAULT_EMAIL_REP))
            .andExpect(jsonPath("$.employerRegistrationFormId").value(DEFAULT_EMPLOYER_REGISTRATION_FORM_ID))
            .andExpect(jsonPath("$.employeeRegistrationFormId").value(DEFAULT_EMPLOYEE_REGISTRATION_FORM_ID))
            .andExpect(jsonPath("$.processFlowId").value(DEFAULT_PROCESS_FLOW_ID))
            .andExpect(jsonPath("$.statutDossier").value(DEFAULT_STATUT_DOSSIER))
            .andExpect(jsonPath("$.statutImmatriculation").value(DEFAULT_STATUT_IMMATRICULATION.booleanValue()));
    }

    @Test
    @Transactional
    public void getNonExistingImmatriculation() throws Exception {
        // Get the immatriculation
        restImmatriculationMockMvc.perform(get("/api/immatriculations/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateImmatriculation() throws Exception {
        // Initialize the database
        immatriculationService.save(immatriculation);

        int databaseSizeBeforeUpdate = immatriculationRepository.findAll().size();

        // Update the immatriculation
        Immatriculation updatedImmatriculation = immatriculationRepository.findById(immatriculation.getId()).get();
        // Disconnect from session so that the updates on updatedImmatriculation are not directly saved in db
        em.detach(updatedImmatriculation);
        updatedImmatriculation
            .regType(UPDATED_REG_TYPE)
            .employerType(UPDATED_EMPLOYER_TYPE)
            .typeEtablissement(UPDATED_TYPE_ETABLISSEMENT)
            .employerName(UPDATED_EMPLOYER_NAME)
            .hqId(UPDATED_HQ_ID)
            .nineaNumber(UPDATED_NINEA_NUMBER)
            .ninetNumber(UPDATED_NINET_NUMBER)
            .compagnyOriginId(UPDATED_COMPAGNY_ORIGIN_ID)
            .legalStatus(UPDATED_LEGAL_STATUS)
            .taxId(UPDATED_TAX_ID)
            .taxIdDate(UPDATED_TAX_ID_DATE)
            .tradeRegisterNumber(UPDATED_TRADE_REGISTER_NUMBER)
            .tradeRegisterDate(UPDATED_TRADE_REGISTER_DATE)
            .dateOfInpsection(UPDATED_DATE_OF_INPSECTION)
            .dateOfFirtHire(UPDATED_DATE_OF_FIRT_HIRE)
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
            .legalRepPerson(UPDATED_LEGAL_REP_PERSON)
            .lastNameRep(UPDATED_LAST_NAME_REP)
            .firstNameRep(UPDATED_FIRST_NAME_REP)
            .birthdateRep(UPDATED_BIRTHDATE_REP)
            .nationalityRep(UPDATED_NATIONALITY_REP)
            .ninRep(UPDATED_NIN_REP)
            .placeOfBirthRep(UPDATED_PLACE_OF_BIRTH_REP)
            .cityOfBirthRep(UPDATED_CITY_OF_BIRTH_REP)
            .typeOfIdentityRep(UPDATED_TYPE_OF_IDENTITY_REP)
            .identityIdNumberRep(UPDATED_IDENTITY_ID_NUMBER_REP)
            .ninCedeoRep(UPDATED_NIN_CEDEO_REP)
            .issuedDateRep(UPDATED_ISSUED_DATE_REP)
            .expiryDateRep(UPDATED_EXPIRY_DATE_REP)
            .regionRep(UPDATED_REGION_REP)
            .departmentRep(UPDATED_DEPARTMENT_REP)
            .arondissementRep(UPDATED_ARONDISSEMENT_REP)
            .communeRep(UPDATED_COMMUNE_REP)
            .qartierRep(UPDATED_QARTIER_REP)
            .addressRep(UPDATED_ADDRESS_REP)
            .landLineNumberRep(UPDATED_LAND_LINE_NUMBER_REP)
            .mobileNumberRep(UPDATED_MOBILE_NUMBER_REP)
            .emailRep(UPDATED_EMAIL_REP)
            .employerRegistrationFormId(UPDATED_EMPLOYER_REGISTRATION_FORM_ID)
            .employeeRegistrationFormId(UPDATED_EMPLOYEE_REGISTRATION_FORM_ID)
            .processFlowId(UPDATED_PROCESS_FLOW_ID)
            .statutDossier(UPDATED_STATUT_DOSSIER)
            .statutImmatriculation(UPDATED_STATUT_IMMATRICULATION);

        restImmatriculationMockMvc.perform(put("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedImmatriculation)))
            .andExpect(status().isOk());

        // Validate the Immatriculation in the database
        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeUpdate);
        Immatriculation testImmatriculation = immatriculationList.get(immatriculationList.size() - 1);
        assertThat(testImmatriculation.getRegType()).isEqualTo(UPDATED_REG_TYPE);
        assertThat(testImmatriculation.getEmployerType()).isEqualTo(UPDATED_EMPLOYER_TYPE);
        assertThat(testImmatriculation.getTypeEtablissement()).isEqualTo(UPDATED_TYPE_ETABLISSEMENT);
        assertThat(testImmatriculation.getEmployerName()).isEqualTo(UPDATED_EMPLOYER_NAME);
        assertThat(testImmatriculation.getHqId()).isEqualTo(UPDATED_HQ_ID);
        assertThat(testImmatriculation.getNineaNumber()).isEqualTo(UPDATED_NINEA_NUMBER);
        assertThat(testImmatriculation.getNinetNumber()).isEqualTo(UPDATED_NINET_NUMBER);
        assertThat(testImmatriculation.getCompagnyOriginId()).isEqualTo(UPDATED_COMPAGNY_ORIGIN_ID);
        assertThat(testImmatriculation.getLegalStatus()).isEqualTo(UPDATED_LEGAL_STATUS);
        assertThat(testImmatriculation.getTaxId()).isEqualTo(UPDATED_TAX_ID);
        assertThat(testImmatriculation.getTaxIdDate()).isEqualTo(UPDATED_TAX_ID_DATE);
        assertThat(testImmatriculation.getTradeRegisterNumber()).isEqualTo(UPDATED_TRADE_REGISTER_NUMBER);
        assertThat(testImmatriculation.getTradeRegisterDate()).isEqualTo(UPDATED_TRADE_REGISTER_DATE);
        assertThat(testImmatriculation.getDateOfInpsection()).isEqualTo(UPDATED_DATE_OF_INPSECTION);
        assertThat(testImmatriculation.getDateOfFirtHire()).isEqualTo(UPDATED_DATE_OF_FIRT_HIRE);
        assertThat(testImmatriculation.getShortName()).isEqualTo(UPDATED_SHORT_NAME);
        assertThat(testImmatriculation.getBusinessSector()).isEqualTo(UPDATED_BUSINESS_SECTOR);
        assertThat(testImmatriculation.getMainLineOfBusiness()).isEqualTo(UPDATED_MAIN_LINE_OF_BUSINESS);
        assertThat(testImmatriculation.getNoOfWorkersInGenScheme()).isEqualTo(UPDATED_NO_OF_WORKERS_IN_GEN_SCHEME);
        assertThat(testImmatriculation.getNoOfWorkersInBasicScheme()).isEqualTo(UPDATED_NO_OF_WORKERS_IN_BASIC_SCHEME);
        assertThat(testImmatriculation.getRegion()).isEqualTo(UPDATED_REGION);
        assertThat(testImmatriculation.getDepartment()).isEqualTo(UPDATED_DEPARTMENT);
        assertThat(testImmatriculation.getArondissement()).isEqualTo(UPDATED_ARONDISSEMENT);
        assertThat(testImmatriculation.getCommune()).isEqualTo(UPDATED_COMMUNE);
        assertThat(testImmatriculation.getQartier()).isEqualTo(UPDATED_QARTIER);
        assertThat(testImmatriculation.getAddress()).isEqualTo(UPDATED_ADDRESS);
        assertThat(testImmatriculation.getPostboxNo()).isEqualTo(UPDATED_POSTBOX_NO);
        assertThat(testImmatriculation.getTelephone()).isEqualTo(UPDATED_TELEPHONE);
        assertThat(testImmatriculation.getEmail()).isEqualTo(UPDATED_EMAIL);
        assertThat(testImmatriculation.getWebsite()).isEqualTo(UPDATED_WEBSITE);
        assertThat(testImmatriculation.getZoneCss()).isEqualTo(UPDATED_ZONE_CSS);
        assertThat(testImmatriculation.getZoneIpres()).isEqualTo(UPDATED_ZONE_IPRES);
        assertThat(testImmatriculation.getSectorCss()).isEqualTo(UPDATED_SECTOR_CSS);
        assertThat(testImmatriculation.getSectorIpres()).isEqualTo(UPDATED_SECTOR_IPRES);
        assertThat(testImmatriculation.getAgencyCss()).isEqualTo(UPDATED_AGENCY_CSS);
        assertThat(testImmatriculation.getAgencyIpres()).isEqualTo(UPDATED_AGENCY_IPRES);
        assertThat(testImmatriculation.getLegalRepPerson()).isEqualTo(UPDATED_LEGAL_REP_PERSON);
        assertThat(testImmatriculation.getLastNameRep()).isEqualTo(UPDATED_LAST_NAME_REP);
        assertThat(testImmatriculation.getFirstNameRep()).isEqualTo(UPDATED_FIRST_NAME_REP);
        assertThat(testImmatriculation.getBirthdateRep()).isEqualTo(UPDATED_BIRTHDATE_REP);
        assertThat(testImmatriculation.getNationalityRep()).isEqualTo(UPDATED_NATIONALITY_REP);
        assertThat(testImmatriculation.getNinRep()).isEqualTo(UPDATED_NIN_REP);
        assertThat(testImmatriculation.getPlaceOfBirthRep()).isEqualTo(UPDATED_PLACE_OF_BIRTH_REP);
        assertThat(testImmatriculation.getCityOfBirthRep()).isEqualTo(UPDATED_CITY_OF_BIRTH_REP);
        assertThat(testImmatriculation.getTypeOfIdentityRep()).isEqualTo(UPDATED_TYPE_OF_IDENTITY_REP);
        assertThat(testImmatriculation.getIdentityIdNumberRep()).isEqualTo(UPDATED_IDENTITY_ID_NUMBER_REP);
        assertThat(testImmatriculation.getNinCedeoRep()).isEqualTo(UPDATED_NIN_CEDEO_REP);
        assertThat(testImmatriculation.getIssuedDateRep()).isEqualTo(UPDATED_ISSUED_DATE_REP);
        assertThat(testImmatriculation.getExpiryDateRep()).isEqualTo(UPDATED_EXPIRY_DATE_REP);
        assertThat(testImmatriculation.getRegionRep()).isEqualTo(UPDATED_REGION_REP);
        assertThat(testImmatriculation.getDepartmentRep()).isEqualTo(UPDATED_DEPARTMENT_REP);
        assertThat(testImmatriculation.getArondissementRep()).isEqualTo(UPDATED_ARONDISSEMENT_REP);
        assertThat(testImmatriculation.getCommuneRep()).isEqualTo(UPDATED_COMMUNE_REP);
        assertThat(testImmatriculation.getQartierRep()).isEqualTo(UPDATED_QARTIER_REP);
        assertThat(testImmatriculation.getAddressRep()).isEqualTo(UPDATED_ADDRESS_REP);
        assertThat(testImmatriculation.getLandLineNumberRep()).isEqualTo(UPDATED_LAND_LINE_NUMBER_REP);
        assertThat(testImmatriculation.getMobileNumberRep()).isEqualTo(UPDATED_MOBILE_NUMBER_REP);
        assertThat(testImmatriculation.getEmailRep()).isEqualTo(UPDATED_EMAIL_REP);
        assertThat(testImmatriculation.getEmployerRegistrationFormId()).isEqualTo(UPDATED_EMPLOYER_REGISTRATION_FORM_ID);
        assertThat(testImmatriculation.getEmployeeRegistrationFormId()).isEqualTo(UPDATED_EMPLOYEE_REGISTRATION_FORM_ID);
        assertThat(testImmatriculation.getProcessFlowId()).isEqualTo(UPDATED_PROCESS_FLOW_ID);
        assertThat(testImmatriculation.getStatutDossier()).isEqualTo(UPDATED_STATUT_DOSSIER);
        assertThat(testImmatriculation.isStatutImmatriculation()).isEqualTo(UPDATED_STATUT_IMMATRICULATION);
    }

    @Test
    @Transactional
    public void updateNonExistingImmatriculation() throws Exception {
        int databaseSizeBeforeUpdate = immatriculationRepository.findAll().size();

        // Create the Immatriculation

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restImmatriculationMockMvc.perform(put("/api/immatriculations")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(immatriculation)))
            .andExpect(status().isBadRequest());

        // Validate the Immatriculation in the database
        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteImmatriculation() throws Exception {
        // Initialize the database
        immatriculationService.save(immatriculation);

        int databaseSizeBeforeDelete = immatriculationRepository.findAll().size();

        // Delete the immatriculation
        restImmatriculationMockMvc.perform(delete("/api/immatriculations/{id}", immatriculation.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Immatriculation> immatriculationList = immatriculationRepository.findAll();
        assertThat(immatriculationList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
