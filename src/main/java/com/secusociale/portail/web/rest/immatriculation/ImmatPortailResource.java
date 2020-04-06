package com.secusociale.portail.web.rest.immatriculation;

import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

<<<<<<< HEAD
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLO;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOFault;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUND;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDFault;
=======
>>>>>>> af9203b62a9bd45c285ca272a0d2181c6e67f60e
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.immatriculation.CertificatImmatriculationService;
import com.secusociale.portail.service.immatriculation.ImmatPortailService;
import com.secusociale.portail.service.immatriculation.StatutDossierImmatriculationService;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;
import com.secusociale.portail.web.rest.ImmatriculationResource;

@RestController
@RequestMapping("/api")
public class ImmatPortailResource {
	
	private final Logger log = LoggerFactory.getLogger(ImmatriculationResource.class);
    private static final String ENTITY_NAME = "IMMATRICULATIONINBOUND";
    
    @Autowired
   private ImmatPortailService immatPortailService ;
    
    @Autowired
    private StatutDossierImmatriculationService statutDossierImmatriculationService ;
    
	
    @Autowired
	private CertificatImmatriculationService certificatImmatriculationService;
    
    

	 
	
    
	@PostMapping("/immatPortail")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(@RequestBody IMMATRICULATIONINBOUND immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault, JAXBException {
        log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);
        
        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
        
           immatriculationInbound = immatPortailService.createImmatriculationPortail(immatriculation);
        
		return immatriculationInbound;
       
    }
	
	
 
	
	
	@GetMapping("/statutDossierImmatriculation/{idDossier}")
	Holder<CmGetStatusDossierImmatriculation> getStatutDossierImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetStatusDossierImmatriculationFault{
		
		Holder<CmGetStatusDossierImmatriculation> statuDossier = new Holder<CmGetStatusDossierImmatriculation>();
		
		statuDossier = statutDossierImmatriculationService.getStatutDossierImmatriculation(idDossier) ;
		
		
		return statuDossier;
		
	}
	
	


	 
	
	@GetMapping("/certificatImmatriculation/{idDossier}")
	Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault{
		
		Holder<CmGetCertificatImmatriculation> certificatImmatriculation = new Holder<CmGetCertificatImmatriculation>();
		
		certificatImmatriculation = certificatImmatriculationService.getCertificatImmatriculation(idDossier);
		
		
		return certificatImmatriculation;
		
	}
<<<<<<< HEAD
    @PostMapping("/immatriculation-maintien-affiliation")
    public Holder<MAINTAFFINBOUND> createImmatriculationMainAffiliation(@RequestBody MAINTAFFINBOUND.Input immatriculationMainAffiliation) throws URISyntaxException, MAINTAFFINBOUNDFault, JAXBException {
	    log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);
        Holder<MAINTAFFINBOUND> immatriculationMaintienAffiliation = new Holder<MAINTAFFINBOUND>();
        immatriculationMaintienAffiliation = immatPortailService.createImmatriculationMaintienAffiliation(immatriculationMainAffiliation);
        return immatriculationMaintienAffiliation;
    }

    @PostMapping("/immatriculation-representant-diplomatique")
    public Holder<IMMATREPDIPLO> createImmatriculationRepresentant(@RequestBody IMMATREPDIPLO.Input immatriculationRepresentant) throws URISyntaxException, IMMATREPDIPLOFault, JAXBException, MAINTAFFINBOUNDFault {
        log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);
        Holder<IMMATREPDIPLO> immatriculationRepresentantOuput = new Holder<IMMATREPDIPLO>();
        immatriculationRepresentantOuput = immatPortailService.createImmatriculationRepresentatnt(immatriculationRepresentant);
        return immatriculationRepresentantOuput;
    }
}
=======
	

>>>>>>> af9203b62a9bd45c285ca272a0d2181c6e67f60e

}
