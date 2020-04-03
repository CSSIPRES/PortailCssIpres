package com.secusociale.portail.service.immatriculation;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDPortType;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDService;
import com.secusociale.portail.service.soap.demandeImmatriculation.ObjectFactory;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input;
 

@Service
public class ImmatPortailService {
	
	 
	public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(IMMATRICULATIONINBOUND immatriculation) throws IMMATRICULATIONINBOUNDFault{
		
		//String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire 
	   	 
		
		 
		
		Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
		
		Input input = new Input();
		 
		
	    
	    input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
		 
		input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
		input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
		input.setLegalRepresentativeForm(immatriculation.getInput().getLegalRepresentativeForm());
	    input.setDocuments(immatriculation.getInput().getDocuments());
		
		
		
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
