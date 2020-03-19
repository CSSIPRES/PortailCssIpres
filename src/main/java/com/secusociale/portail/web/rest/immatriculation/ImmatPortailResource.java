package com.secusociale.portail.web.rest.immatriculation;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;
import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.service.immatriculation.ImmatPortailService;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
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
    
	
	@PostMapping("/immatPortail")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(@Valid @RequestBody Immatriculation immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault {
        log.debug("REST request to save Immatriculation : {}", immatriculation);
        
        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
        
           immatriculationInbound = immatPortailService.createImmatriculationPortail(immatriculation);
        
		return immatriculationInbound;
       
    }

}
