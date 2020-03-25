package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDPortType;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDService;
import com.secusociale.portail.service.soap.demandeImmatriculation.ObjectFactory;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input;
 

@Service
public class ImmatPortailService {
	
	 
	public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(IMMATRICULATIONINBOUND immatriculation) throws IMMATRICULATIONINBOUNDFault, JAXBException{
		
		//String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire 
	   	 
		
		 
		
		Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
		
		Input input = new Input();
		 
		
	    
	    input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
		 
		input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
		input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
		input.setLegalRepresentativeForm(immatriculation.getInput().getLegalRepresentativeForm());
	    input.setDocuments(immatriculation.getInput().getDocuments());
		
		
	    
	    final JAXBContext jc = JAXBContext.newInstance(IMMATRICULATIONINBOUND.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(immatriculationInbound.value, System.out);
		
		ObjectFactory obj = new ObjectFactory();
		
		
		
		
		immatriculationInbound.value = obj.createIMMATRICULATIONINBOUND();
		immatriculationInbound.value.setInput(input);
		
		IMMATRICULATIONINBOUNDService immatriculationinboundService = new IMMATRICULATIONINBOUNDService();
		IMMATRICULATIONINBOUNDPortType immatriculationinboundPortType = immatriculationinboundService.getIMMATRICULATIONINBOUNDPort();
		
		BindingProvider prov = (BindingProvider) immatriculationinboundPortType ;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        immatriculationinboundPortType.immatriculationINBOUND(immatriculationInbound);
		
		return immatriculationInbound;
		
	}

}
