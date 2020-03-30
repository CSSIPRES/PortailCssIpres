package com.secusociale.portail.web.rest.declaration;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.model.DeclarationModel;
import com.secusociale.portail.service.declaration.PreDNSService;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsFault;


@RestController
@RequestMapping("/api")
public class DeclarationPortailResource {

	private final Logger log = LoggerFactory.getLogger(DeclarationPortailResource.class);
	private static final String ENTITY_NAME = "CmPresDns";
	
	
	@Autowired
	private PreDNSService dnsService ;
	
	
	@PostMapping("/preDNS")
	public DeclarationModel getPreDNSEmployeur(@RequestBody DeclarationModel preDnsInput) throws CmPresDnsFault, JAXBException, DatatypeConfigurationException{
		
		log.debug("REST request to get PreDNS: {}", ENTITY_NAME);
		
		 
		
		return dnsService.getPreDns(preDnsInput);
		
	}
	
}
