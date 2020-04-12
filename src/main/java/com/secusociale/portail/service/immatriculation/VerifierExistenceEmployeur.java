package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeur;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeur.Input;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeurFault;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeurPortType;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeurService;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.ObjectFactory;

@Service
public class VerifierExistenceEmployeur {
	
	
	public Holder<CmCheckExistenceEmployeur> verifierExistenceEmployeur(String typeIdentifiant, String numeroIdentifiant) throws JAXBException{
		
		 Holder<CmCheckExistenceEmployeur> cmCheckExistenceEmployeur = new Holder<CmCheckExistenceEmployeur>();
		 
		 Input input = new Input();
		 
		 input.setTaxpayerIdentifierType(typeIdentifiant);
		 input.setTaxpayerIdentifierValue(numeroIdentifiant);
		 
		 ObjectFactory obj = new ObjectFactory();
		 
		 cmCheckExistenceEmployeur.value = obj.createCmCheckExistenceEmployeur();
		 cmCheckExistenceEmployeur.value.setInput(input);
		 
		 final JAXBContext jc = JAXBContext.newInstance(CmCheckExistenceEmployeur.class); 
		  final Marshaller marshaller = jc.createMarshaller();
		  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		  marshaller.marshal(cmCheckExistenceEmployeur.value, System.out);
		  
		  CmCheckExistenceEmployeurService checkExistenceEmployeurService = new CmCheckExistenceEmployeurService();
		  CmCheckExistenceEmployeurPortType checkExistenceEmployeurPortType = checkExistenceEmployeurService.getCmCheckExistenceEmployeurPort();
		  
		  BindingProvider prov = (BindingProvider) checkExistenceEmployeurPortType ;
			
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		  
		
	    try {
			checkExistenceEmployeurPortType.cmCheckExistenceEmployeur(cmCheckExistenceEmployeur);
		} catch (CmCheckExistenceEmployeurFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
	    
		return cmCheckExistenceEmployeur;
		
	}

}
