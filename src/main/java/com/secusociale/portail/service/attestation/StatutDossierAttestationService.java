package com.secusociale.portail.service.attestation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestation;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestation.Input;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestationFault;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestationPortType;
import com.secusociale.portail.service.soap.statutAttestationRegularite.CMGetStatusDemandeAttestationService;
import com.secusociale.portail.service.soap.statutAttestationRegularite.ObjectFactory;

@Service
public class StatutDossierAttestationService {
	
	
	public Holder<CMGetStatusDemandeAttestation> getStatutDemandeAttestation(String idDossier) throws JAXBException, CMGetStatusDemandeAttestationFault{
		
		
		Input input = new Input();
		input.setIdDossier(idDossier);
		
		 Holder<CMGetStatusDemandeAttestation> cmGetstatutDemandeAttestation = new Holder<CMGetStatusDemandeAttestation>();
		 ObjectFactory obj = new ObjectFactory();
		 cmGetstatutDemandeAttestation.value = obj.createCMGetStatusDemandeAttestation();
		 cmGetstatutDemandeAttestation.value.setInput(input);
		
		 final JAXBContext jc = JAXBContext.newInstance(CMGetStatusDemandeAttestation.class) ;
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(cmGetstatutDemandeAttestation.value, System.out);
		 
		 CMGetStatusDemandeAttestationService attestationService = new CMGetStatusDemandeAttestationService();
		 CMGetStatusDemandeAttestationPortType attestationPortType = attestationService.getCMGetStatusDemandeAttestationPort();
		 
		 BindingProvider prov = (BindingProvider) attestationPortType ;
		 
		 prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	     prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	     
	     attestationPortType.cmGetStatusDemandeAttestation(cmGetstatutDemandeAttestation);
		 
		
		
		return cmGetstatutDemandeAttestation ;
		
		
	}

}
