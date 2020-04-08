package com.secusociale.portail.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReferencementModel {
    @Id
    private Long id;
    private String numeroOrdreVirement;
    private  String banqueSource;
    private  String compteSource;
    private  String numéroCompteDestination;
    private String  referenceFacture;
    private Float montantTotal;
    private Float montantAccount;
    private Float RestantAcount;
    private String payer;

    public String getNumeroOrdreVirement() {
        return numeroOrdreVirement;
    }

    public void setNumeroOrdreVirement(String numeroOrdreVirement) {
        this.numeroOrdreVirement = numeroOrdreVirement;
    }

    public String getBanqueSource() {
        return banqueSource;
    }

    public void setBanqueSource(String banqueSource) {
        this.banqueSource = banqueSource;
    }

    public String getCompteSource() {
        return compteSource;
    }

    public void setCompteSource(String compteSource) {
        this.compteSource = compteSource;
    }

    public String getNuméroCompteDestination() {
        return numéroCompteDestination;
    }

    public void setNuméroCompteDestination(String numéroCompteDestination) {
        this.numéroCompteDestination = numéroCompteDestination;
    }

    public String getReferenceFacture() {
        return referenceFacture;
    }

    public void setReferenceFacture(String referenceFacture) {
        this.referenceFacture = referenceFacture;
    }

    public Float getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Float montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Float getMontantAccount() {
        return montantAccount;
    }

    public void setMontantAccount(Float montantAccount) {
        this.montantAccount = montantAccount;
    }

    public Float getRestantAcount() {
        return RestantAcount;
    }

    public void setRestantAcount(Float restantAcount) {
        RestantAcount = restantAcount;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
