package com.secusociale.portail.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DemandeService.
 */
@Entity
@Table(name = "demande_service")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DemandeService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_demande")
    private String typeDemande;

    @Column(name = "id_dossier")
    private String idDossier;

    @Column(name = "statut_dossier")
    private String statutDossier;

    @Column(name = "url_document")
    private String urlDocument;

    @ManyToOne
    @JsonIgnoreProperties("idDossiers")
    private Employeur employeur;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeDemande() {
        return typeDemande;
    }

    public DemandeService typeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
        return this;
    }

    public void setTypeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
    }

    public String getIdDossier() {
        return idDossier;
    }

    public DemandeService idDossier(String idDossier) {
        this.idDossier = idDossier;
        return this;
    }

    public void setIdDossier(String idDossier) {
        this.idDossier = idDossier;
    }

    public String getStatutDossier() {
        return statutDossier;
    }

    public DemandeService statutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
        return this;
    }

    public void setStatutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
    }

    public String getUrlDocument() {
        return urlDocument;
    }

    public DemandeService urlDocument(String urlDocument) {
        this.urlDocument = urlDocument;
        return this;
    }

    public void setUrlDocument(String urlDocument) {
        this.urlDocument = urlDocument;
    }

    public Employeur getEmployeur() {
        return employeur;
    }

    public DemandeService employeur(Employeur employeur) {
        this.employeur = employeur;
        return this;
    }

    public void setEmployeur(Employeur employeur) {
        this.employeur = employeur;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DemandeService)) {
            return false;
        }
        return id != null && id.equals(((DemandeService) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "DemandeService{" +
            "id=" + getId() +
            ", typeDemande='" + getTypeDemande() + "'" +
            ", idDossier='" + getIdDossier() + "'" +
            ", statutDossier='" + getStatutDossier() + "'" +
            ", urlDocument='" + getUrlDocument() + "'" +
            "}";
    }
}
