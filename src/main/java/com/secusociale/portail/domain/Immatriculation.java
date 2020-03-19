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
    private RepresentantLegal representantLegal;

    @OneToOne
    @JoinColumn(unique = true)
    private User user;

    @OneToMany(mappedBy = "employeur")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Declaration> declarations = new HashSet<>();

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

    public RepresentantLegal getRepresentantLegal() {
        return representantLegal;
    }

    public Immatriculation representantLegal(RepresentantLegal representantLegal) {
        this.representantLegal = representantLegal;
        return this;
    }

    public void setRepresentantLegal(RepresentantLegal representantLegal) {
        this.representantLegal = representantLegal;
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

    public Set<Declaration> getDeclarations() {
        return declarations;
    }

    public Immatriculation declarations(Set<Declaration> declarations) {
        this.declarations = declarations;
        return this;
    }

    public Immatriculation addDeclaration(Declaration declaration) {
        this.declarations.add(declaration);
        declaration.setEmployeur(this);
        return this;
    }

    public Immatriculation removeDeclaration(Declaration declaration) {
        this.declarations.remove(declaration);
        declaration.setEmployeur(null);
        return this;
    }

    public void setDeclarations(Set<Declaration> declarations) {
        this.declarations = declarations;
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
            ", employerRegistrationFormId='" + getEmployerRegistrationFormId() + "'" +
            ", employeeRegistrationFormId='" + getEmployeeRegistrationFormId() + "'" +
            ", processFlowId='" + getProcessFlowId() + "'" +
            ", statutDossier='" + getStatutDossier() + "'" +
            ", statutImmatriculation='" + isStatutImmatriculation() + "'" +
            "}";
    }
}
