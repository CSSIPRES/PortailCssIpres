package com.secusociale.portail.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.time.LocalDate;

/**
 * A RepresentantLegal.
 */
@Entity
@Table(name = "representant_legal")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RepresentantLegal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "legal_rep_person")
    private String legalRepPerson;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @NotNull
    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "nin")
    private String nin;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "city_of_birth")
    private String cityOfBirth;

    @Column(name = "type_of_identity")
    private String typeOfIdentity;

    @Column(name = "identity_id_number")
    private String identityIdNumber;

    @Column(name = "nin_cedeo")
    private String ninCedeo;

    @Column(name = "issued_date")
    private String issuedDate;

    @Column(name = "expiry_date")
    private String expiryDate;

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

    @Column(name = "land_line_number")
    private String landLineNumber;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLegalRepPerson() {
        return legalRepPerson;
    }

    public RepresentantLegal legalRepPerson(String legalRepPerson) {
        this.legalRepPerson = legalRepPerson;
        return this;
    }

    public void setLegalRepPerson(String legalRepPerson) {
        this.legalRepPerson = legalRepPerson;
    }

    public String getLastName() {
        return lastName;
    }

    public RepresentantLegal lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public RepresentantLegal firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public RepresentantLegal birthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public RepresentantLegal nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNin() {
        return nin;
    }

    public RepresentantLegal nin(String nin) {
        this.nin = nin;
        return this;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public RepresentantLegal placeOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public RepresentantLegal cityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
        return this;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getTypeOfIdentity() {
        return typeOfIdentity;
    }

    public RepresentantLegal typeOfIdentity(String typeOfIdentity) {
        this.typeOfIdentity = typeOfIdentity;
        return this;
    }

    public void setTypeOfIdentity(String typeOfIdentity) {
        this.typeOfIdentity = typeOfIdentity;
    }

    public String getIdentityIdNumber() {
        return identityIdNumber;
    }

    public RepresentantLegal identityIdNumber(String identityIdNumber) {
        this.identityIdNumber = identityIdNumber;
        return this;
    }

    public void setIdentityIdNumber(String identityIdNumber) {
        this.identityIdNumber = identityIdNumber;
    }

    public String getNinCedeo() {
        return ninCedeo;
    }

    public RepresentantLegal ninCedeo(String ninCedeo) {
        this.ninCedeo = ninCedeo;
        return this;
    }

    public void setNinCedeo(String ninCedeo) {
        this.ninCedeo = ninCedeo;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public RepresentantLegal issuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public RepresentantLegal expiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getRegion() {
        return region;
    }

    public RepresentantLegal region(String region) {
        this.region = region;
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartment() {
        return department;
    }

    public RepresentantLegal department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getArondissement() {
        return arondissement;
    }

    public RepresentantLegal arondissement(String arondissement) {
        this.arondissement = arondissement;
        return this;
    }

    public void setArondissement(String arondissement) {
        this.arondissement = arondissement;
    }

    public String getCommune() {
        return commune;
    }

    public RepresentantLegal commune(String commune) {
        this.commune = commune;
        return this;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getQartier() {
        return qartier;
    }

    public RepresentantLegal qartier(String qartier) {
        this.qartier = qartier;
        return this;
    }

    public void setQartier(String qartier) {
        this.qartier = qartier;
    }

    public String getAddress() {
        return address;
    }

    public RepresentantLegal address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public RepresentantLegal landLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
        return this;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public RepresentantLegal mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public RepresentantLegal email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepresentantLegal)) {
            return false;
        }
        return id != null && id.equals(((RepresentantLegal) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "RepresentantLegal{" +
            "id=" + getId() +
            ", legalRepPerson='" + getLegalRepPerson() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", birthdate='" + getBirthdate() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", nin='" + getNin() + "'" +
            ", placeOfBirth='" + getPlaceOfBirth() + "'" +
            ", cityOfBirth='" + getCityOfBirth() + "'" +
            ", typeOfIdentity='" + getTypeOfIdentity() + "'" +
            ", identityIdNumber='" + getIdentityIdNumber() + "'" +
            ", ninCedeo='" + getNinCedeo() + "'" +
            ", issuedDate='" + getIssuedDate() + "'" +
            ", expiryDate='" + getExpiryDate() + "'" +
            ", region='" + getRegion() + "'" +
            ", department='" + getDepartment() + "'" +
            ", arondissement='" + getArondissement() + "'" +
            ", commune='" + getCommune() + "'" +
            ", qartier='" + getQartier() + "'" +
            ", address='" + getAddress() + "'" +
            ", landLineNumber='" + getLandLineNumber() + "'" +
            ", mobileNumber='" + getMobileNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
