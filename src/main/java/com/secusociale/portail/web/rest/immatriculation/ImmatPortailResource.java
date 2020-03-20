package com.secusociale.portail.web.rest.immatriculation;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;
import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.service.immatriculation.CertificatImmatriculationService;
import com.secusociale.portail.service.immatriculation.ImmatPortailService;
import com.secusociale.portail.service.immatriculation.StatutDossierImmatriculationService;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;
import com.secusociale.portail.web.rest.ImmatriculationResource;
import com.secusociale.portail.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;

@RestController
@RequestMapping("/api")
public class ImmatPortailResource {
	
	private final Logger log = LoggerFactory.getLogger(ImmatriculationResource.class);
    private static final String ENTITY_NAME = "immatriculation";
    
    @Autowired
   private ImmatPortailService immatPortailService ;
    
    @Autowired
    private StatutDossierImmatriculationService statutDossierImmatriculationService ;
    
	
    @Autowired
	private CertificatImmatriculationService certificatImmatriculationService;
    
    
	@PostMapping("/immatPortail")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(@Valid @RequestBody Immatriculation immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault {
        log.debug("REST request to save Immatriculation : {}", immatriculation);
        
        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
        
           immatriculationInbound = immatPortailService.createImmatriculationPortail(immatriculation);
        
		return immatriculationInbound;
       
    }
	
	
	/**
     * {@code GET  /statutDossier/:idDossier} : get the statut Of Immatriculation.
     *
     * @param idDossier the idDossier of the Process Flow to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the declaration, or with status {@code 404 (Not Found)}.
	 * @throws CmGetAttestationRegulariteFault 
	 * @throws JAXBException 
	 * @throws CmGetStatusDossierImmatriculationFault 
     */
	
	
	
	@GetMapping("/statutDossierImmatriculation/{idDossier} ")
	Holder<CmGetStatusDossierImmatriculation> getStatutDossierImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetStatusDossierImmatriculationFault{
		
		Holder<CmGetStatusDossierImmatriculation> statuDossier = new Holder<CmGetStatusDossierImmatriculation>();
		
		statuDossier = statutDossierImmatriculationService.getStatutDossierImmatriculation(idDossier) ;
		
		
		return statuDossier;
		
	}
	
	

	@GetMapping("/certificatImmatriculation/{idDossier} ")
	Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault{
		
		Holder<CmGetCertificatImmatriculation> certificatImmatriculation = new Holder<CmGetCertificatImmatriculation>();
		
		certificatImmatriculation = certificatImmatriculationService.getCertificatImmatriculation(idDossier);
		
		
		return certificatImmatriculation;
		
	}
	


}
