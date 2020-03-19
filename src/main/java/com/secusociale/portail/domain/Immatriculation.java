package com.secusociale.portail.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * A Immatriculation.
 */
@Entity
@Table(name = "immatriculation")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Immatriculation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reg_type")
    private String regType;

    @NotNull
    @Column(name = "employer_type", nullable = false)
    private String employerType;

    @NotNull
    @Column(name = "type_etablissement", nullable = false)
    private String typeEtablissement;

    @NotNull
    @Column(name = "employer_name", nullable = false)
    private String employerName;

    @Column(name = "hq_id")
    private String hqId;

    @NotNull
    @Column(name = "ninea_number", nullable = false)
    private String nineaNumber;

    @Column(name = "ninet_number")
    private String ninetNumber;

    @Column(name = "compagny_origin_id")
    private String compagnyOriginId;

    @NotNull
    @Column(name = "legal_status", nullable = false)
    private String legalStatus;

    @Column(name = "tax_id")
    private String taxId;

    @Column(name = "tax_id_date")
    private LocalDate taxIdDate;

    @Column(name = "trade_register_number")
    private String tradeRegisterNumber;

    @Column(name = "trade_register_date")
    private LocalDate tradeRegisterDate;

    @Column(name = "date_of_inpsection")
    private LocalDate dateOfInpsection;

    @Column(name = "date_of_firt_hire")
    private LocalDate dateOfFirtHire;

    @Column(name = "short_name")
    private String shortName;

    @NotNull
    @Column(name = "business_sector", nullable = false)
    private String businessSector;

    @NotNull
    @Column(name = "main_line_of_business", nullable = false)
    private String mainLineOfBusiness;

    @Column(name = "no_of_workers_in_gen_scheme")
    private Integer noOfWorkersInGenScheme;

    @Column(name = "no_of_workers_in_basic_scheme")
    private Integer noOfWorkersInBasicScheme;

    @NotNull
    @Column(name = "region", nullable = false)
    private String region;

    @NotNull
    @Column(name = "department", nullable = false)
    private String department;

    @NotNull
    @Column(name = "arondissement", nullable = false)
    private String arondissement;

    @NotNull
    @Column(name = "commune", nullable = false)
    private String commune;

    @NotNull
    @Column(name = "qartier", nullable = false)
    private String qartier;

    @NotNull
    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "postbox_no")
    private String postboxNo;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "zone_css")
    private String zoneCss;

    @Column(name = "zone_ipres")
    private String zoneIpres;

    @Column(name = "sector_css")
    private String sectorCss;

    @Column(name = "sector_ipres")
    private String sectorIpres;

    @Column(name = "agency_css")
    private String agencyCss;

    @Column(name = "agency_ipres")
    private String agencyIpres;

    @Column(name = "legal_rep_person")
    private String legalRepPerson;

    @NotNull
    @Column(name = "last_name_rep", nullable = false)
    private String lastNameRep;

    @NotNull
    @Column(name = "first_name_rep", nullable = false)
    private String firstNameRep;

    @NotNull
    @Column(name = "birthdate_rep", nullable = false)
    private LocalDate birthdateRep;

    @NotNull
    @Column(name = "nationality_rep", nullable = false)
    private String nationalityRep;

    @Column(name = "nin_rep")
    private String ninRep;

    @Column(name = "place_of_birth_rep")
    private String placeOfBirthRep;

    @Column(name = "city_of_birth_rep")
    private String cityOfBirthRep;

    @Column(name = "type_of_identity_rep")
    private String typeOfIdentityRep;

    @Column(name = "identity_id_number_rep")
    private String identityIdNumberRep;

    @Column(name = "nin_cedeo_rep")
    private String ninCedeoRep;

    @Column(name = "issued_date_rep")
    private String issuedDateRep;

    @Column(name = "expiry_date_rep")
    private String expiryDateRep;

    @Column(name = "region_rep")
    private String regionRep;

    @Column(name = "department_rep")
    private String departmentRep;

    @Column(name = "arondissement_rep")
    private String arondissementRep;

    @Column(name = "commune_rep")
    private String communeRep;

    @Column(name = "qartier_rep")
    private String qartierRep;

    @Column(name = "address_rep")
    private String addressRep;

    @Column(name = "land_line_number_rep")
    private String landLineNumberRep;

    @Column(name = "mobile_number_rep")
    private String mobileNumberRep;

    @Column(name = "email_rep")
    private String emailRep;

    @Column(name = "employer_registration_form_id")
    private String employerRegistrationFormId;

    @Column(name = "employee_registration_form_id")
    private String employeeRegistrationFormId;

    @Column(name = "process_flow_id")
    private String processFlowId;

    @Column(name = "statut_dossier")
    private String statutDossier;

    @Column(name = "statut_immatriculation")
    private Boolean statutImmatriculation;

    @OneToOne
    @JoinColumn(unique = true)
    private User user;

    @OneToMany(mappedBy = "employeur")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Employe> employes = new HashSet<>();

    @OneToMany(mappedBy = "employeur")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Document> documents = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegType() {
        return regType;
    }

    public Immatriculation regType(String regType) {
        this.regType = regType;
        return this;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getEmployerType() {
        return employerType;
    }

    public Immatriculation employerType(String employerType) {
        this.employerType = employerType;
        return this;
    }

    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }

    public String getTypeEtablissement() {
        return typeEtablissement;
    }

    public Immatriculation typeEtablissement(String typeEtablissement) {
        this.typeEtablissement = typeEtablissement;
        return this;
    }

    public void setTypeEtablissement(String typeEtablissement) {
        this.typeEtablissement = typeEtablissement;
    }

    public String getEmployerName() {
        return employerName;
    }

    public Immatriculation employerName(String employerName) {
        this.employerName = employerName;
        return this;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getHqId() {
        return hqId;
    }

    public Immatriculation hqId(String hqId) {
        this.hqId = hqId;
        return this;
    }

    public void setHqId(String hqId) {
        this.hqId = hqId;
    }

    public String getNineaNumber() {
        return nineaNumber;
    }

    public Immatriculation nineaNumber(String nineaNumber) {
        this.nineaNumber = nineaNumber;
        return this;
    }

    public void setNineaNumber(String nineaNumber) {
        this.nineaNumber = nineaNumber;
    }

    public String getNinetNumber() {
        return ninetNumber;
    }

    public Immatriculation ninetNumber(String ninetNumber) {
        this.ninetNumber = ninetNumber;
        return this;
    }

    public void setNinetNumber(String ninetNumber) {
        this.ninetNumber = ninetNumber;
    }

    public String getCompagnyOriginId() {
        return compagnyOriginId;
    }

    public Immatriculation compagnyOriginId(String compagnyOriginId) {
        this.compagnyOriginId = compagnyOriginId;
        return this;
    }

    public void setCompagnyOriginId(String compagnyOriginId) {
        this.compagnyOriginId = compagnyOriginId;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public Immatriculation legalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
        return this;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getTaxId() {
        return taxId;
    }

    public Immatriculation taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public LocalDate getTaxIdDate() {
        return taxIdDate;
    }

    public Immatriculation taxIdDate(LocalDate taxIdDate) {
        this.taxIdDate = taxIdDate;
        return this;
    }

    public void setTaxIdDate(LocalDate taxIdDate) {
        this.taxIdDate = taxIdDate;
    }

    public String getTradeRegisterNumber() {
        return tradeRegisterNumber;
    }

    public Immatriculation tradeRegisterNumber(String tradeRegisterNumber) {
        this.tradeRegisterNumber = tradeRegisterNumber;
        return this;
    }

    public void setTradeRegisterNumber(String tradeRegisterNumber) {
        this.tradeRegisterNumber = tradeRegisterNumber;
    }

    public LocalDate getTradeRegisterDate() {
        return tradeRegisterDate;
    }

    public Immatriculation tradeRegisterDate(LocalDate tradeRegisterDate) {
        this.tradeRegisterDate = tradeRegisterDate;
        return this;
    }

    public void setTradeRegisterDate(LocalDate tradeRegisterDate) {
        this.tradeRegisterDate = tradeRegisterDate;
    }

    public LocalDate getDateOfInpsection() {
        return dateOfInpsection;
    }

    public Immatriculation dateOfInpsection(LocalDate dateOfInpsection) {
        this.dateOfInpsection = dateOfInpsection;
        return this;
    }

    public void setDateOfInpsection(LocalDate dateOfInpsection) {
        this.dateOfInpsection = dateOfInpsection;
    }

    public LocalDate getDateOfFirtHire() {
        return dateOfFirtHire;
    }

    public Immatriculation dateOfFirtHire(LocalDate dateOfFirtHire) {
        this.dateOfFirtHire = dateOfFirtHire;
        return this;
    }

    public void setDateOfFirtHire(LocalDate dateOfFirtHire) {
        this.dateOfFirtHire = dateOfFirtHire;
    }

    public String getShortName() {
        return shortName;
    }

    public Immatriculation shortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public Immatriculation businessSector(String businessSector) {
        this.businessSector = businessSector;
        return this;
    }

    public void setBusinessSector(String businessSector) {
        this.businessSector = businessSector;
    }

    public String getMainLineOfBusiness() {
        return mainLineOfBusiness;
    }

    public Immatriculation mainLineOfBusiness(String mainLineOfBusiness) {
        this.mainLineOfBusiness = mainLineOfBusiness;
        return this;
    }

    public void setMainLineOfBusiness(String mainLineOfBusiness) {
        this.mainLineOfBusiness = mainLineOfBusiness;
    }

    public Integer getNoOfWorkersInGenScheme() {
        return noOfWorkersInGenScheme;
    }

    public Immatriculation noOfWorkersInGenScheme(Integer noOfWorkersInGenScheme) {
        this.noOfWorkersInGenScheme = noOfWorkersInGenScheme;
        return this;
    }

    public void setNoOfWorkersInGenScheme(Integer noOfWorkersInGenScheme) {
        this.noOfWorkersInGenScheme = noOfWorkersInGenScheme;
    }

    public Integer getNoOfWorkersInBasicScheme() {
        return noOfWorkersInBasicScheme;
    }

    public Immatriculation noOfWorkersInBasicScheme(Integer noOfWorkersInBasicScheme) {
        this.noOfWorkersInBasicScheme = noOfWorkersInBasicScheme;
        return this;
    }

    public void setNoOfWorkersInBasicScheme(Integer noOfWorkersInBasicScheme) {
        this.noOfWorkersInBasicScheme = noOfWorkersInBasicScheme;
    }

    public String getRegion() {
        return region;
    }

    public Immatriculation region(String region) {
        this.region = region;
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartment() {
        return department;
    }

    public Immatriculation department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getArondissement() {
        return arondissement;
    }

    public Immatriculation arondissement(String arondissement) {
        this.arondissement = arondissement;
        return this;
    }

    public void setArondissement(String arondissement) {
        this.arondissement = arondissement;
    }

    public String getCommune() {
        return commune;
    }

    public Immatriculation commune(String commune) {
        this.commune = commune;
        return this;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getQartier() {
        return qartier;
    }

    public Immatriculation qartier(String qartier) {
        this.qartier = qartier;
        return this;
    }

    public void setQartier(String qartier) {
        this.qartier = qartier;
    }

    public String getAddress() {
        return address;
    }

    public Immatriculation address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostboxNo() {
        return postboxNo;
    }

    public Immatriculation postboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
        return this;
    }

    public void setPostboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public Immatriculation telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public Immatriculation email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public Immatriculation website(String website) {
        this.website = website;
        return this;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getZoneCss() {
        return zoneCss;
    }

    public Immatriculation zoneCss(String zoneCss) {
        this.zoneCss = zoneCss;
        return this;
    }

    public void setZoneCss(String zoneCss) {
        this.zoneCss = zoneCss;
    }

    public String getZoneIpres() {
        return zoneIpres;
    }

    public Immatriculation zoneIpres(String zoneIpres) {
        this.zoneIpres = zoneIpres;
        return this;
    }

    public void setZoneIpres(String zoneIpres) {
        this.zoneIpres = zoneIpres;
    }

    public String getSectorCss() {
        return sectorCss;
    }

    public Immatriculation sectorCss(String sectorCss) {
        this.sectorCss = sectorCss;
        return this;
    }

    public void setSectorCss(String sectorCss) {
        this.sectorCss = sectorCss;
    }

    public String getSectorIpres() {
        return sectorIpres;
    }

    public Immatriculation sectorIpres(String sectorIpres) {
        this.sectorIpres = sectorIpres;
        return this;
    }

    public void setSectorIpres(String sectorIpres) {
        this.sectorIpres = sectorIpres;
    }

    public String getAgencyCss() {
        return agencyCss;
    }

    public Immatriculation agencyCss(String agencyCss) {
        this.agencyCss = agencyCss;
        return this;
    }

    public void setAgencyCss(String agencyCss) {
        this.agencyCss = agencyCss;
    }

    public String getAgencyIpres() {
        return agencyIpres;
    }

    public Immatriculation agencyIpres(String agencyIpres) {
        this.agencyIpres = agencyIpres;
        return this;
    }

    public void setAgencyIpres(String agencyIpres) {
        this.agencyIpres = agencyIpres;
    }

    public String getLegalRepPerson() {
        return legalRepPerson;
    }

    public Immatriculation legalRepPerson(String legalRepPerson) {
        this.legalRepPerson = legalRepPerson;
        return this;
    }

    public void setLegalRepPerson(String legalRepPerson) {
        this.legalRepPerson = legalRepPerson;
    }

    public String getLastNameRep() {
        return lastNameRep;
    }

    public Immatriculation lastNameRep(String lastNameRep) {
        this.lastNameRep = lastNameRep;
        return this;
    }

    public void setLastNameRep(String lastNameRep) {
        this.lastNameRep = lastNameRep;
    }

    public String getFirstNameRep() {
        return firstNameRep;
    }

    public Immatriculation firstNameRep(String firstNameRep) {
        this.firstNameRep = firstNameRep;
        return this;
    }

    public void setFirstNameRep(String firstNameRep) {
        this.firstNameRep = firstNameRep;
    }

    public LocalDate getBirthdateRep() {
        return birthdateRep;
    }

    public Immatriculation birthdateRep(LocalDate birthdateRep) {
        this.birthdateRep = birthdateRep;
        return this;
    }

    public void setBirthdateRep(LocalDate birthdateRep) {
        this.birthdateRep = birthdateRep;
    }

    public String getNationalityRep() {
        return nationalityRep;
    }

    public Immatriculation nationalityRep(String nationalityRep) {
        this.nationalityRep = nationalityRep;
        return this;
    }

    public void setNationalityRep(String nationalityRep) {
        this.nationalityRep = nationalityRep;
    }

    public String getNinRep() {
        return ninRep;
    }

    public Immatriculation ninRep(String ninRep) {
        this.ninRep = ninRep;
        return this;
    }

    public void setNinRep(String ninRep) {
        this.ninRep = ninRep;
    }

    public String getPlaceOfBirthRep() {
        return placeOfBirthRep;
    }

    public Immatriculation placeOfBirthRep(String placeOfBirthRep) {
        this.placeOfBirthRep = placeOfBirthRep;
        return this;
    }

    public void setPlaceOfBirthRep(String placeOfBirthRep) {
        this.placeOfBirthRep = placeOfBirthRep;
    }

    public String getCityOfBirthRep() {
        return cityOfBirthRep;
    }

    public Immatriculation cityOfBirthRep(String cityOfBirthRep) {
        this.cityOfBirthRep = cityOfBirthRep;
        return this;
    }

    public void setCityOfBirthRep(String cityOfBirthRep) {
        this.cityOfBirthRep = cityOfBirthRep;
    }

    public String getTypeOfIdentityRep() {
        return typeOfIdentityRep;
    }

    public Immatriculation typeOfIdentityRep(String typeOfIdentityRep) {
        this.typeOfIdentityRep = typeOfIdentityRep;
        return this;
    }

    public void setTypeOfIdentityRep(String typeOfIdentityRep) {
        this.typeOfIdentityRep = typeOfIdentityRep;
    }

    public String getIdentityIdNumberRep() {
        return identityIdNumberRep;
    }

    public Immatriculation identityIdNumberRep(String identityIdNumberRep) {
        this.identityIdNumberRep = identityIdNumberRep;
        return this;
    }

    public void setIdentityIdNumberRep(String identityIdNumberRep) {
        this.identityIdNumberRep = identityIdNumberRep;
    }

    public String getNinCedeoRep() {
        return ninCedeoRep;
    }

    public Immatriculation ninCedeoRep(String ninCedeoRep) {
        this.ninCedeoRep = ninCedeoRep;
        return this;
    }

    public void setNinCedeoRep(String ninCedeoRep) {
        this.ninCedeoRep = ninCedeoRep;
    }

    public String getIssuedDateRep() {
        return issuedDateRep;
    }

    public Immatriculation issuedDateRep(String issuedDateRep) {
        this.issuedDateRep = issuedDateRep;
        return this;
    }

    public void setIssuedDateRep(String issuedDateRep) {
        this.issuedDateRep = issuedDateRep;
    }

    public String getExpiryDateRep() {
        return expiryDateRep;
    }

    public Immatriculation expiryDateRep(String expiryDateRep) {
        this.expiryDateRep = expiryDateRep;
        return this;
    }

    public void setExpiryDateRep(String expiryDateRep) {
        this.expiryDateRep = expiryDateRep;
    }

    public String getRegionRep() {
        return regionRep;
    }

    public Immatriculation regionRep(String regionRep) {
        this.regionRep = regionRep;
        return this;
    }

    public void setRegionRep(String regionRep) {
        this.regionRep = regionRep;
    }

    public String getDepartmentRep() {
        return departmentRep;
    }

    public Immatriculation departmentRep(String departmentRep) {
        this.departmentRep = departmentRep;
        return this;
    }

    public void setDepartmentRep(String departmentRep) {
        this.departmentRep = departmentRep;
    }

    public String getArondissementRep() {
        return arondissementRep;
    }

    public Immatriculation arondissementRep(String arondissementRep) {
        this.arondissementRep = arondissementRep;
        return this;
    }

    public void setArondissementRep(String arondissementRep) {
        this.arondissementRep = arondissementRep;
    }

    public String getCommuneRep() {
        return communeRep;
    }

    public Immatriculation communeRep(String communeRep) {
        this.communeRep = communeRep;
        return this;
    }

    public void setCommuneRep(String communeRep) {
        this.communeRep = communeRep;
    }

    public String getQartierRep() {
        return qartierRep;
    }

    public Immatriculation qartierRep(String qartierRep) {
        this.qartierRep = qartierRep;
        return this;
    }

    public void setQartierRep(String qartierRep) {
        this.qartierRep = qartierRep;
    }

    public String getAddressRep() {
        return addressRep;
    }

    public Immatriculation addressRep(String addressRep) {
        this.addressRep = addressRep;
        return this;
    }

    public void setAddressRep(String addressRep) {
        this.addressRep = addressRep;
    }

    public String getLandLineNumberRep() {
        return landLineNumberRep;
    }

    public Immatriculation landLineNumberRep(String landLineNumberRep) {
        this.landLineNumberRep = landLineNumberRep;
        return this;
    }

    public void setLandLineNumberRep(String landLineNumberRep) {
        this.landLineNumberRep = landLineNumberRep;
    }

    public String getMobileNumberRep() {
        return mobileNumberRep;
    }

    public Immatriculation mobileNumberRep(String mobileNumberRep) {
        this.mobileNumberRep = mobileNumberRep;
        return this;
    }

    public void setMobileNumberRep(String mobileNumberRep) {
        this.mobileNumberRep = mobileNumberRep;
    }

    public String getEmailRep() {
        return emailRep;
    }

    public Immatriculation emailRep(String emailRep) {
        this.emailRep = emailRep;
        return this;
    }

    public void setEmailRep(String emailRep) {
        this.emailRep = emailRep;
    }

    public String getEmployerRegistrationFormId() {
        return employerRegistrationFormId;
    }

    public Immatriculation employerRegistrationFormId(String employerRegistrationFormId) {
        this.employerRegistrationFormId = employerRegistrationFormId;
        return this;
    }

    public void setEmployerRegistrationFormId(String employerRegistrationFormId) {
        this.employerRegistrationFormId = employerRegistrationFormId;
    }

    public String getEmployeeRegistrationFormId() {
        return employeeRegistrationFormId;
    }

    public Immatriculation employeeRegistrationFormId(String employeeRegistrationFormId) {
        this.employeeRegistrationFormId = employeeRegistrationFormId;
        return this;
    }

    public void setEmployeeRegistrationFormId(String employeeRegistrationFormId) {
        this.employeeRegistrationFormId = employeeRegistrationFormId;
    }

    public String getProcessFlowId() {
        return processFlowId;
    }

    public Immatriculation processFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
        return this;
    }

    public void setProcessFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
    }

    public String getStatutDossier() {
        return statutDossier;
    }

    public Immatriculation statutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
        return this;
    }

    public void setStatutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
    }

    public Boolean isStatutImmatriculation() {
        return statutImmatriculation;
    }

    public Immatriculation statutImmatriculation(Boolean statutImmatriculation) {
        this.statutImmatriculation = statutImmatriculation;
        return this;
    }

    public void setStatutImmatriculation(Boolean statutImmatriculation) {
        this.statutImmatriculation = statutImmatriculation;
    }

    public User getUser() {
        return user;
    }

    public Immatriculation user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Employe> getEmployes() {
        return employes;
    }

    public Immatriculation employes(Set<Employe> employes) {
        this.employes = employes;
        return this;
    }

    public Immatriculation addEmploye(Employe employe) {
        this.employes.add(employe);
        employe.setEmployeur(this);
        return this;
    }

    public Immatriculation removeEmploye(Employe employe) {
        this.employes.remove(employe);
        employe.setEmployeur(null);
        return this;
    }

    public void setEmployes(Set<Employe> employes) {
        this.employes = employes;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public Immatriculation documents(Set<Document> documents) {
        this.documents = documents;
        return this;
    }

    public Immatriculation addDocument(Document document) {
        this.documents.add(document);
        document.setEmployeur(this);
        return this;
    }

    public Immatriculation removeDocument(Document document) {
        this.documents.remove(document);
        document.setEmployeur(null);
        return this;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Immatriculation)) {
            return false;
        }
        return id != null && id.equals(((Immatriculation) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Immatriculation{" +
            "id=" + getId() +
            ", regType='" + getRegType() + "'" +
            ", employerType='" + getEmployerType() + "'" +
            ", typeEtablissement='" + getTypeEtablissement() + "'" +
            ", employerName='" + getEmployerName() + "'" +
            ", hqId='" + getHqId() + "'" +
            ", nineaNumber='" + getNineaNumber() + "'" +
            ", ninetNumber='" + getNinetNumber() + "'" +
            ", compagnyOriginId='" + getCompagnyOriginId() + "'" +
            ", legalStatus='" + getLegalStatus() + "'" +
            ", taxId='" + getTaxId() + "'" +
            ", taxIdDate='" + getTaxIdDate() + "'" +
            ", tradeRegisterNumber='" + getTradeRegisterNumber() + "'" +
            ", tradeRegisterDate='" + getTradeRegisterDate() + "'" +
            ", dateOfInpsection='" + getDateOfInpsection() + "'" +
            ", dateOfFirtHire='" + getDateOfFirtHire() + "'" +
            ", shortName='" + getShortName() + "'" +
            ", businessSector='" + getBusinessSector() + "'" +
            ", mainLineOfBusiness='" + getMainLineOfBusiness() + "'" +
            ", noOfWorkersInGenScheme=" + getNoOfWorkersInGenScheme() +
            ", noOfWorkersInBasicScheme=" + getNoOfWorkersInBasicScheme() +
            ", region='" + getRegion() + "'" +
            ", department='" + getDepartment() + "'" +
            ", arondissement='" + getArondissement() + "'" +
            ", commune='" + getCommune() + "'" +
            ", qartier='" + getQartier() + "'" +
            ", address='" + getAddress() + "'" +
            ", postboxNo='" + getPostboxNo() + "'" +
            ", telephone='" + getTelephone() + "'" +
            ", email='" + getEmail() + "'" +
            ", website='" + getWebsite() + "'" +
            ", zoneCss='" + getZoneCss() + "'" +
            ", zoneIpres='" + getZoneIpres() + "'" +
            ", sectorCss='" + getSectorCss() + "'" +
            ", sectorIpres='" + getSectorIpres() + "'" +
            ", agencyCss='" + getAgencyCss() + "'" +
            ", agencyIpres='" + getAgencyIpres() + "'" +
            ", legalRepPerson='" + getLegalRepPerson() + "'" +
            ", lastNameRep='" + getLastNameRep() + "'" +
            ", firstNameRep='" + getFirstNameRep() + "'" +
            ", birthdateRep='" + getBirthdateRep() + "'" +
            ", nationalityRep='" + getNationalityRep() + "'" +
            ", ninRep='" + getNinRep() + "'" +
            ", placeOfBirthRep='" + getPlaceOfBirthRep() + "'" +
            ", cityOfBirthRep='" + getCityOfBirthRep() + "'" +
            ", typeOfIdentityRep='" + getTypeOfIdentityRep() + "'" +
            ", identityIdNumberRep='" + getIdentityIdNumberRep() + "'" +
            ", ninCedeoRep='" + getNinCedeoRep() + "'" +
            ", issuedDateRep='" + getIssuedDateRep() + "'" +
            ", expiryDateRep='" + getExpiryDateRep() + "'" +
            ", regionRep='" + getRegionRep() + "'" +
            ", departmentRep='" + getDepartmentRep() + "'" +
            ", arondissementRep='" + getArondissementRep() + "'" +
            ", communeRep='" + getCommuneRep() + "'" +
            ", qartierRep='" + getQartierRep() + "'" +
            ", addressRep='" + getAddressRep() + "'" +
            ", landLineNumberRep='" + getLandLineNumberRep() + "'" +
            ", mobileNumberRep='" + getMobileNumberRep() + "'" +
            ", emailRep='" + getEmailRep() + "'" +
            ", employerRegistrationFormId='" + getEmployerRegistrationFormId() + "'" +
            ", employeeRegistrationFormId='" + getEmployeeRegistrationFormId() + "'" +
            ", processFlowId='" + getProcessFlowId() + "'" +
            ", statutDossier='" + getStatutDossier() + "'" +
            ", statutImmatriculation='" + isStatutImmatriculation() + "'" +
            "}";
    }
}
