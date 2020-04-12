package com.secusociale.portail.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

/**
 * A Employeur.
 */
@Entity
@Table(name = "employeur")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Employeur implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employer_type")
    private String employerType;

    @Column(name = "type_etablissement")
    private String typeEtablissement;

    @Column(name = "raison_sociale")
    private String raisonSociale;

    @Column(name = "maison_mere")
    private String maisonMere;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @Column(name = "type_identifiant")
    private String typeIdentifiant;

    @Column(name = "numero_identifiant")
    private String numeroIdentifiant;

    @Column(name = "legal_status")
    private String legalStatus;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "business_sector")
    private String businessSector;

    @Column(name = "main_line_of_business")
    private String mainLineOfBusiness;

    @Column(name = "no_of_workers_in_gen_scheme")
    private Integer noOfWorkersInGenScheme;

    @Column(name = "no_of_workers_in_basic_scheme")
    private Integer noOfWorkersInBasicScheme;

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

    @Column(name = "process_flow_id")
    private String processFlowId;

    @Column(name = "statut_dossier")
    private String statutDossier;

    @Column(name = "statut_immatriculation")
    private Boolean statutImmatriculation;

    @OneToMany(mappedBy = "employeur")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<DemandeService> idDossiers = new HashSet<>();

    @OneToMany(mappedBy = "employeur")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<DocumentUrl> documents = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("employeurs")
    private User user;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployerType() {
        return employerType;
    }

    public Employeur employerType(String employerType) {
        this.employerType = employerType;
        return this;
    }

    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }

    public String getTypeEtablissement() {
        return typeEtablissement;
    }

    public Employeur typeEtablissement(String typeEtablissement) {
        this.typeEtablissement = typeEtablissement;
        return this;
    }

    public void setTypeEtablissement(String typeEtablissement) {
        this.typeEtablissement = typeEtablissement;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public Employeur raisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
        return this;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getMaisonMere() {
        return maisonMere;
    }

    public Employeur maisonMere(String maisonMere) {
        this.maisonMere = maisonMere;
        return this;
    }

    public void setMaisonMere(String maisonMere) {
        this.maisonMere = maisonMere;
    }

    public String getPrenom() {
        return prenom;
    }

    public Employeur prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public Employeur nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeIdentifiant() {
        return typeIdentifiant;
    }

    public Employeur typeIdentifiant(String typeIdentifiant) {
        this.typeIdentifiant = typeIdentifiant;
        return this;
    }

    public void setTypeIdentifiant(String typeIdentifiant) {
        this.typeIdentifiant = typeIdentifiant;
    }

    public String getNumeroIdentifiant() {
        return numeroIdentifiant;
    }

    public Employeur numeroIdentifiant(String numeroIdentifiant) {
        this.numeroIdentifiant = numeroIdentifiant;
        return this;
    }

    public void setNumeroIdentifiant(String numeroIdentifiant) {
        this.numeroIdentifiant = numeroIdentifiant;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public Employeur legalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
        return this;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getShortName() {
        return shortName;
    }

    public Employeur shortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getBusinessSector() {
        return businessSector;
    }

    public Employeur businessSector(String businessSector) {
        this.businessSector = businessSector;
        return this;
    }

    public void setBusinessSector(String businessSector) {
        this.businessSector = businessSector;
    }

    public String getMainLineOfBusiness() {
        return mainLineOfBusiness;
    }

    public Employeur mainLineOfBusiness(String mainLineOfBusiness) {
        this.mainLineOfBusiness = mainLineOfBusiness;
        return this;
    }

    public void setMainLineOfBusiness(String mainLineOfBusiness) {
        this.mainLineOfBusiness = mainLineOfBusiness;
    }

    public Integer getNoOfWorkersInGenScheme() {
        return noOfWorkersInGenScheme;
    }

    public Employeur noOfWorkersInGenScheme(Integer noOfWorkersInGenScheme) {
        this.noOfWorkersInGenScheme = noOfWorkersInGenScheme;
        return this;
    }

    public void setNoOfWorkersInGenScheme(Integer noOfWorkersInGenScheme) {
        this.noOfWorkersInGenScheme = noOfWorkersInGenScheme;
    }

    public Integer getNoOfWorkersInBasicScheme() {
        return noOfWorkersInBasicScheme;
    }

    public Employeur noOfWorkersInBasicScheme(Integer noOfWorkersInBasicScheme) {
        this.noOfWorkersInBasicScheme = noOfWorkersInBasicScheme;
        return this;
    }

    public void setNoOfWorkersInBasicScheme(Integer noOfWorkersInBasicScheme) {
        this.noOfWorkersInBasicScheme = noOfWorkersInBasicScheme;
    }

    public String getRegion() {
        return region;
    }

    public Employeur region(String region) {
        this.region = region;
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartment() {
        return department;
    }

    public Employeur department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getArondissement() {
        return arondissement;
    }

    public Employeur arondissement(String arondissement) {
        this.arondissement = arondissement;
        return this;
    }

    public void setArondissement(String arondissement) {
        this.arondissement = arondissement;
    }

    public String getCommune() {
        return commune;
    }

    public Employeur commune(String commune) {
        this.commune = commune;
        return this;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getQartier() {
        return qartier;
    }

    public Employeur qartier(String qartier) {
        this.qartier = qartier;
        return this;
    }

    public void setQartier(String qartier) {
        this.qartier = qartier;
    }

    public String getAddress() {
        return address;
    }

    public Employeur address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostboxNo() {
        return postboxNo;
    }

    public Employeur postboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
        return this;
    }

    public void setPostboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public Employeur telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public Employeur email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public Employeur website(String website) {
        this.website = website;
        return this;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getZoneCss() {
        return zoneCss;
    }

    public Employeur zoneCss(String zoneCss) {
        this.zoneCss = zoneCss;
        return this;
    }

    public void setZoneCss(String zoneCss) {
        this.zoneCss = zoneCss;
    }

    public String getZoneIpres() {
        return zoneIpres;
    }

    public Employeur zoneIpres(String zoneIpres) {
        this.zoneIpres = zoneIpres;
        return this;
    }

    public void setZoneIpres(String zoneIpres) {
        this.zoneIpres = zoneIpres;
    }

    public String getSectorCss() {
        return sectorCss;
    }

    public Employeur sectorCss(String sectorCss) {
        this.sectorCss = sectorCss;
        return this;
    }

    public void setSectorCss(String sectorCss) {
        this.sectorCss = sectorCss;
    }

    public String getSectorIpres() {
        return sectorIpres;
    }

    public Employeur sectorIpres(String sectorIpres) {
        this.sectorIpres = sectorIpres;
        return this;
    }

    public void setSectorIpres(String sectorIpres) {
        this.sectorIpres = sectorIpres;
    }

    public String getAgencyCss() {
        return agencyCss;
    }

    public Employeur agencyCss(String agencyCss) {
        this.agencyCss = agencyCss;
        return this;
    }

    public void setAgencyCss(String agencyCss) {
        this.agencyCss = agencyCss;
    }

    public String getAgencyIpres() {
        return agencyIpres;
    }

    public Employeur agencyIpres(String agencyIpres) {
        this.agencyIpres = agencyIpres;
        return this;
    }

    public void setAgencyIpres(String agencyIpres) {
        this.agencyIpres = agencyIpres;
    }

    public String getProcessFlowId() {
        return processFlowId;
    }

    public Employeur processFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
        return this;
    }

    public void setProcessFlowId(String processFlowId) {
        this.processFlowId = processFlowId;
    }

    public String getStatutDossier() {
        return statutDossier;
    }

    public Employeur statutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
        return this;
    }

    public void setStatutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
    }

    public Boolean isStatutImmatriculation() {
        return statutImmatriculation;
    }

    public Employeur statutImmatriculation(Boolean statutImmatriculation) {
        this.statutImmatriculation = statutImmatriculation;
        return this;
    }

    public void setStatutImmatriculation(Boolean statutImmatriculation) {
        this.statutImmatriculation = statutImmatriculation;
    }

    public Set<DemandeService> getIdDossiers() {
        return idDossiers;
    }

    public Employeur idDossiers(Set<DemandeService> demandeServices) {
        this.idDossiers = demandeServices;
        return this;
    }

    public Employeur addIdDossier(DemandeService demandeService) {
        this.idDossiers.add(demandeService);
        demandeService.setEmployeur(this);
        return this;
    }

    public Employeur removeIdDossier(DemandeService demandeService) {
        this.idDossiers.remove(demandeService);
        demandeService.setEmployeur(null);
        return this;
    }

    public void setIdDossiers(Set<DemandeService> demandeServices) {
        this.idDossiers = demandeServices;
    }

    public Set<DocumentUrl> getDocuments() {
        return documents;
    }

    public Employeur documents(Set<DocumentUrl> documentUrls) {
        this.documents = documentUrls;
        return this;
    }

    public Employeur addDocument(DocumentUrl documentUrl) {
        this.documents.add(documentUrl);
        documentUrl.setEmployeur(this);
        return this;
    }

    public Employeur removeDocument(DocumentUrl documentUrl) {
        this.documents.remove(documentUrl);
        documentUrl.setEmployeur(null);
        return this;
    }

    public void setDocuments(Set<DocumentUrl> documentUrls) {
        this.documents = documentUrls;
    }

    public User getUser() {
        return user;
    }

    public Employeur user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employeur)) {
            return false;
        }
        return id != null && id.equals(((Employeur) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Employeur{" +
            "id=" + getId() +
            ", employerType='" + getEmployerType() + "'" +
            ", typeEtablissement='" + getTypeEtablissement() + "'" +
            ", raisonSociale='" + getRaisonSociale() + "'" +
            ", maisonMere='" + getMaisonMere() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", nom='" + getNom() + "'" +
            ", typeIdentifiant='" + getTypeIdentifiant() + "'" +
            ", numeroIdentifiant='" + getNumeroIdentifiant() + "'" +
            ", legalStatus='" + getLegalStatus() + "'" +
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
            ", processFlowId='" + getProcessFlowId() + "'" +
            ", statutDossier='" + getStatutDossier() + "'" +
            ", statutImmatriculation='" + isStatutImmatriculation() + "'" +
            "}";
    }
}
