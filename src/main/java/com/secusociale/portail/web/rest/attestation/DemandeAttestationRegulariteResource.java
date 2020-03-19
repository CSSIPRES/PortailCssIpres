package com.secusociale.portail.web.rest.attestation;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.attestation.DemandeAttestationService;
import com.secusociale.portail.service.attestation.StatutDossierAttestationService;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegularite;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteFault;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestation;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestationFault;

@RestController
@RequestMapping("/api")
public class DemandeAttestationRegulariteResource {
	
	@Autowired
	private DemandeAttestationService demandeAttestationService ;
	@Autowired
	private StatutDossierAttestationService statutDossierAttestationService ;
	
	@Value("${jhipster.clientApp.name}")
    private String applicationName;
	
	
	/**
     * {@code GET  /attestation/create/:typeIdentifiant/:identifiant} : get the "idDossier " Attestation.
     *
     * @param typeIdentifiant the Identifiant Type of the employer .
     * @param identifiant the ID  of the employer to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the declaration, or with status {@code 404 (Not Found)}.
	 * @throws CmGetAttestationRegulariteFault 
	 * @throws JAXBException 
     */

	@GetMapping("/attestation/create/{typeIdentifiant}/{identifiant}")
	
	Holder<CmGetAttestationRegularite> createDossierAttestation(@PathVariable String typeIdentifiant , @PathVariable String identifiant) throws JAXBException, CmGetAttestationRegulariteFault{
		
		Holder<CmGetAttestationRegularite>  cmGetAttestationRegularite = new Holder<CmGetAttestationRegularite>();
		
		cmGetAttestationRegularite = demandeAttestationService.createDossierAttestation(typeIdentifiant, identifiant);
 
		return cmGetAttestationRegularite;
		

		
	}
	
	
	/**
     * {@code GET  /attestation/getStatut/:idDossier} : get the Statut dossier Attestation
     *
     * @param idDossier the idDossier of Attestation.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the declaration, or with status {@code 404 (Not Found)}.
	 * @throws CmGetAttestationRegulariteFault 
	 * @throws JAXBException 
	 * @throws CMGetStatusDemandeAttestationFault 
     */

	@GetMapping("/attestation/getStatus/{idDossier}")
	
	 Holder<CMGetStatusDemandeAttestation> getStatutDossier(@PathVariable String idDossier ) throws JAXBException, CmGetAttestationRegulariteFault, CMGetStatusDemandeAttestationFault{
		
		 Holder<CMGetStatusDemandeAttestation> cmGetStatutAttestationRegularite = new  Holder<CMGetStatusDemandeAttestation>();
		
		 cmGetStatutAttestationRegularite = statutDossierAttestationService.getStatutDemandeAttestation(idDossier) ;
 
		return  cmGetStatutAttestationRegularite;
		

		
	}

}
