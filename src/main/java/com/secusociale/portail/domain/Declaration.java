package com.secusociale.portail.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * A Declaration.
 */
@Entity
@Table(name = "declaration")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Declaration implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "id_identifiant", nullable = false)
    private String idIdentifiant;

    @NotNull
    @Column(name = "raison_sociale", nullable = false)
    private String raisonSociale;

    @Column(name = "adresse")
    private String adresse;

    @NotNull
    @Column(name = "type_declaration", nullable = false)
    private String typeDeclaration;

    @NotNull
    @Column(name = "date_debut_cotisation", nullable = false)
    private LocalDate dateDebutCotisation;

    @Column(name = "total_nouv_salaries")
    private Integer totalNouvSalaries;

    @Column(name = "total_salaries")
    private Integer totalSalaries;

    @Column(name = "cumul_tot_sal_ass_ipres_rg", precision = 21, scale = 2)
    private BigDecimal cumulTotSalAssIpresRg;

    @Column(name = "cumul_tot_sal_ass_ipres_rcc", precision = 21, scale = 2)
    private BigDecimal cumulTotSalAssIpresRcc;

    @Column(name = "cumul_tot_sal_ass_css_pf", precision = 21, scale = 2)
    private BigDecimal cumulTotSalAssCssPf;

    @Column(name = "cumul_tot_sal_ass_css_atmp", precision = 21, scale = 2)
    private BigDecimal cumulTotSalAssCssAtmp;

    @Column(name = "total_sal_verses", precision = 21, scale = 2)
    private BigDecimal totalSalVerses;

    @Column(name = "mnt_cot_pf_calc_par_employeur", precision = 21, scale = 2)
    private BigDecimal mntCotPfCalcParEmployeur;

    @Column(name = "mnt_cot_at_mp_calc_par_employeur", precision = 21, scale = 2)
    private BigDecimal mntCotAtMpCalcParEmployeur;

    @Column(name = "mnt_cot_rg_calc_par_employeur", precision = 21, scale = 2)
    private BigDecimal mntCotRgCalcParEmployeur;

    @Column(name = "mnt_cot_rcc_calc_par_employeur", precision = 21, scale = 2)
    private BigDecimal mntCotRccCalcParEmployeur;

    @OneToMany(mappedBy = "declaration")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Employe> employes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdIdentifiant() {
        return idIdentifiant;
    }

    public Declaration idIdentifiant(String idIdentifiant) {
        this.idIdentifiant = idIdentifiant;
        return this;
    }

    public void setIdIdentifiant(String idIdentifiant) {
        this.idIdentifiant = idIdentifiant;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public Declaration raisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
        return this;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public Declaration adresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTypeDeclaration() {
        return typeDeclaration;
    }

    public Declaration typeDeclaration(String typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
        return this;
    }

    public void setTypeDeclaration(String typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }

    public LocalDate getDateDebutCotisation() {
        return dateDebutCotisation;
    }

    public Declaration dateDebutCotisation(LocalDate dateDebutCotisation) {
        this.dateDebutCotisation = dateDebutCotisation;
        return this;
    }

    public void setDateDebutCotisation(LocalDate dateDebutCotisation) {
        this.dateDebutCotisation = dateDebutCotisation;
    }

    public Integer getTotalNouvSalaries() {
        return totalNouvSalaries;
    }

    public Declaration totalNouvSalaries(Integer totalNouvSalaries) {
        this.totalNouvSalaries = totalNouvSalaries;
        return this;
    }

    public void setTotalNouvSalaries(Integer totalNouvSalaries) {
        this.totalNouvSalaries = totalNouvSalaries;
    }

    public Integer getTotalSalaries() {
        return totalSalaries;
    }

    public Declaration totalSalaries(Integer totalSalaries) {
        this.totalSalaries = totalSalaries;
        return this;
    }

    public void setTotalSalaries(Integer totalSalaries) {
        this.totalSalaries = totalSalaries;
    }

    public BigDecimal getCumulTotSalAssIpresRg() {
        return cumulTotSalAssIpresRg;
    }

    public Declaration cumulTotSalAssIpresRg(BigDecimal cumulTotSalAssIpresRg) {
        this.cumulTotSalAssIpresRg = cumulTotSalAssIpresRg;
        return this;
    }

    public void setCumulTotSalAssIpresRg(BigDecimal cumulTotSalAssIpresRg) {
        this.cumulTotSalAssIpresRg = cumulTotSalAssIpresRg;
    }

    public BigDecimal getCumulTotSalAssIpresRcc() {
        return cumulTotSalAssIpresRcc;
    }

    public Declaration cumulTotSalAssIpresRcc(BigDecimal cumulTotSalAssIpresRcc) {
        this.cumulTotSalAssIpresRcc = cumulTotSalAssIpresRcc;
        return this;
    }

    public void setCumulTotSalAssIpresRcc(BigDecimal cumulTotSalAssIpresRcc) {
        this.cumulTotSalAssIpresRcc = cumulTotSalAssIpresRcc;
    }

    public BigDecimal getCumulTotSalAssCssPf() {
        return cumulTotSalAssCssPf;
    }

    public Declaration cumulTotSalAssCssPf(BigDecimal cumulTotSalAssCssPf) {
        this.cumulTotSalAssCssPf = cumulTotSalAssCssPf;
        return this;
    }

    public void setCumulTotSalAssCssPf(BigDecimal cumulTotSalAssCssPf) {
        this.cumulTotSalAssCssPf = cumulTotSalAssCssPf;
    }

    public BigDecimal getCumulTotSalAssCssAtmp() {
        return cumulTotSalAssCssAtmp;
    }

    public Declaration cumulTotSalAssCssAtmp(BigDecimal cumulTotSalAssCssAtmp) {
        this.cumulTotSalAssCssAtmp = cumulTotSalAssCssAtmp;
        return this;
    }

    public void setCumulTotSalAssCssAtmp(BigDecimal cumulTotSalAssCssAtmp) {
        this.cumulTotSalAssCssAtmp = cumulTotSalAssCssAtmp;
    }

    public BigDecimal getTotalSalVerses() {
        return totalSalVerses;
    }

    public Declaration totalSalVerses(BigDecimal totalSalVerses) {
        this.totalSalVerses = totalSalVerses;
        return this;
    }

    public void setTotalSalVerses(BigDecimal totalSalVerses) {
        this.totalSalVerses = totalSalVerses;
    }

    public BigDecimal getMntCotPfCalcParEmployeur() {
        return mntCotPfCalcParEmployeur;
    }

    public Declaration mntCotPfCalcParEmployeur(BigDecimal mntCotPfCalcParEmployeur) {
        this.mntCotPfCalcParEmployeur = mntCotPfCalcParEmployeur;
        return this;
    }

    public void setMntCotPfCalcParEmployeur(BigDecimal mntCotPfCalcParEmployeur) {
        this.mntCotPfCalcParEmployeur = mntCotPfCalcParEmployeur;
    }

    public BigDecimal getMntCotAtMpCalcParEmployeur() {
        return mntCotAtMpCalcParEmployeur;
    }

    public Declaration mntCotAtMpCalcParEmployeur(BigDecimal mntCotAtMpCalcParEmployeur) {
        this.mntCotAtMpCalcParEmployeur = mntCotAtMpCalcParEmployeur;
        return this;
    }

    public void setMntCotAtMpCalcParEmployeur(BigDecimal mntCotAtMpCalcParEmployeur) {
        this.mntCotAtMpCalcParEmployeur = mntCotAtMpCalcParEmployeur;
    }

    public BigDecimal getMntCotRgCalcParEmployeur() {
        return mntCotRgCalcParEmployeur;
    }

    public Declaration mntCotRgCalcParEmployeur(BigDecimal mntCotRgCalcParEmployeur) {
        this.mntCotRgCalcParEmployeur = mntCotRgCalcParEmployeur;
        return this;
    }

    public void setMntCotRgCalcParEmployeur(BigDecimal mntCotRgCalcParEmployeur) {
        this.mntCotRgCalcParEmployeur = mntCotRgCalcParEmployeur;
    }

    public BigDecimal getMntCotRccCalcParEmployeur() {
        return mntCotRccCalcParEmployeur;
    }

    public Declaration mntCotRccCalcParEmployeur(BigDecimal mntCotRccCalcParEmployeur) {
        this.mntCotRccCalcParEmployeur = mntCotRccCalcParEmployeur;
        return this;
    }

    public void setMntCotRccCalcParEmployeur(BigDecimal mntCotRccCalcParEmployeur) {
        this.mntCotRccCalcParEmployeur = mntCotRccCalcParEmployeur;
    }

    public Set<Employe> getEmployes() {
        return employes;
    }

    public Declaration employes(Set<Employe> employes) {
        this.employes = employes;
        return this;
    }

    public Declaration addEmploye(Employe employe) {
        this.employes.add(employe);
        employe.setDeclaration(this);
        return this;
    }

    public Declaration removeEmploye(Employe employe) {
        this.employes.remove(employe);
        employe.setDeclaration(null);
        return this;
    }

    public void setEmployes(Set<Employe> employes) {
        this.employes = employes;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Declaration)) {
            return false;
        }
        return id != null && id.equals(((Declaration) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Declaration{" +
            "id=" + getId() +
            ", idIdentifiant='" + getIdIdentifiant() + "'" +
            ", raisonSociale='" + getRaisonSociale() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", typeDeclaration='" + getTypeDeclaration() + "'" +
            ", dateDebutCotisation='" + getDateDebutCotisation() + "'" +
            ", totalNouvSalaries=" + getTotalNouvSalaries() +
            ", totalSalaries=" + getTotalSalaries() +
            ", cumulTotSalAssIpresRg=" + getCumulTotSalAssIpresRg() +
            ", cumulTotSalAssIpresRcc=" + getCumulTotSalAssIpresRcc() +
            ", cumulTotSalAssCssPf=" + getCumulTotSalAssCssPf() +
            ", cumulTotSalAssCssAtmp=" + getCumulTotSalAssCssAtmp() +
            ", totalSalVerses=" + getTotalSalVerses() +
            ", mntCotPfCalcParEmployeur=" + getMntCotPfCalcParEmployeur() +
            ", mntCotAtMpCalcParEmployeur=" + getMntCotAtMpCalcParEmployeur() +
            ", mntCotRgCalcParEmployeur=" + getMntCotRgCalcParEmployeur() +
            ", mntCotRccCalcParEmployeur=" + getMntCotRccCalcParEmployeur() +
            "}";
    }
}
