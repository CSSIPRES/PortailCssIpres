package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation.Input;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationPortType;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationService;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.ObjectFactory;

@Service 
public class StatutDossierImmatriculationService {
	
	
	public Holder<CmGetStatusDossierImmatriculation> getStatutDossierImmatriculation (String idDossier) throws JAXBException, CmGetStatusDossierImmatriculationFault{
		
		Holder<CmGetStatusDossierImmatriculation> statutDossierImmatriculation = new Holder<CmGetStatusDossierImmatriculation>();
		
		Input input = new Input() ;
		
		input.setIdDossierImmatriculation(idDossier);
		
		ObjectFactory obj = new ObjectFactory() ;
		
		statutDossierImmatriculation.value = obj.createCmGetStatusDossierImmatriculation() ;
		statutDossierImmatriculation.value.setInput(input);
		
		
		  final JAXBContext jc = JAXBContext.newInstance(CmGetStatusDossierImmatriculation.class); 
		  final Marshaller marshaller = jc.createMarshaller();
		  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		  marshaller.marshal(statutDossierImmatriculation.value, System.out);
		 
		
		CmGetStatusDossierImmatriculationService cmGetStatusDossierImmatriculationService = new CmGetStatusDossierImmatriculationService() ;
		CmGetStatusDossierImmatriculationPortType cmGetStatusDossierImmatriculationPortType = cmGetStatusDossierImmatriculationService.getCmGetStatusDossierImmatriculationPort() ;
		
		BindingProvider prov = (BindingProvider) cmGetStatusDossierImmatriculationPortType ;
		
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
        cmGetStatusDossierImmatriculationPortType.cmGetStatusDossierImmatriculation(statutDossierImmatriculation);
		
		return statutDossierImmatriculation;
		
	}

}
