package com.secusociale.portail.web.rest.attestation;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.attestation.DemandeAttestationService;
import com.secusociale.portail.service.attestation.GetAttestationUrlService;
import com.secusociale.portail.service.attestation.StatutDossierAttestationService;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegularite;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteFault;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestation;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestationFault;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATION;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATIONFault;

@RestController
@RequestMapping("/api")
public class DemandeAttestationRegulariteResource {
	
	@Autowired
	private DemandeAttestationService demandeAttestationService ;
	@Autowired
	private StatutDossierAttestationService statutDossierAttestationService ;
	@Autowired
	private GetAttestationUrlService getAttestationUrlService ; 
	
	@Value("${jhipster.clientApp.name}")
    private String applicationName;
	
	
	 

	@PostMapping("/attestation/create/{typeIdentifiant}/{identifiant}")
	
	Holder<CmGetAttestationRegularite> createDossierAttestation(@PathVariable String typeIdentifiant , @PathVariable String identifiant) throws JAXBException, CmGetAttestationRegulariteFault{
		
		Holder<CmGetAttestationRegularite>  cmGetAttestationRegularite = new Holder<CmGetAttestationRegularite>();
		
		cmGetAttestationRegularite = demandeAttestationService.createDossierAttestation(typeIdentifiant, identifiant);
 
		return cmGetAttestationRegularite;
		

		
	}
	
	
	 
	@GetMapping("/attestation/getStatus/{idDossier}")
	
	 Holder<CMGetStatusDemandeAttestation> getStatutDossier(@PathVariable String idDossier ) throws JAXBException, CMGetStatusDemandeAttestationFault{
		
		 Holder<CMGetStatusDemandeAttestation> cmGetStatutAttestationRegularite = new  Holder<CMGetStatusDemandeAttestation>();
		
		 cmGetStatutAttestationRegularite = statutDossierAttestationService.getStatutDemandeAttestation(idDossier) ;
 
		return  cmGetStatutAttestationRegularite;
		

		
	}
	
	
	@GetMapping("/attestation/getUrl/{idDossier}")
	
	Holder<CMGENATTESTATION> getUrlAttestationRegularite(@PathVariable String idDossier) throws JAXBException, CMGENATTESTATIONFault{
		
		Holder<CMGENATTESTATION> cmgenattestation = new Holder<CMGENATTESTATION>() ;
		
		cmgenattestation = getAttestationUrlService.getUrlAttestation(idDossier);
		
		return cmgenattestation;
		
	}

}
