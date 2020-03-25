package com.secusociale.portail.service.attestation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATION;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATION.Input;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATION.Input.Parameters;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATIONFault;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATIONPortType;
import com.secusociale.portail.service.soap.urlAttestationReguralite.CMGENATTESTATIONService;
import com.secusociale.portail.service.soap.urlAttestationReguralite.ObjectFactory;

@Service 
public class GetAttestationUrlService {
	
	
	public Holder<CMGENATTESTATION> getUrlAttestation(String idDossier) throws JAXBException, CMGENATTESTATIONFault{
		
		String reportTemplate = "ATTESTATION_REGULARITE" ;
		String parameterName = "processFlowId";
		
		
		Holder<CMGENATTESTATION> cmGenAttestation = new Holder<CMGENATTESTATION>() ;
		
		Input input = new Input();
		Parameters parameters = new Parameters();
		
		parameters.setName(parameterName);
		parameters.setValue(idDossier);
		
		// Add parameter 
		
		input.getParameters().add(parameters);
		
		// Set Report key
		
		input.setReportTemplate(reportTemplate);
		input.setReportKey(idDossier);
		
		ObjectFactory obj = new ObjectFactory() ;
		
		cmGenAttestation.value = obj.createCMGENATTESTATION() ;
		cmGenAttestation.value.setInput(input);
		  
		
		 final JAXBContext jc = JAXBContext.newInstance(CMGENATTESTATION.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(cmGenAttestation.value, System.out);
		
		CMGENATTESTATIONService cmgenattestationService = new CMGENATTESTATIONService();
		CMGENATTESTATIONPortType cmgenattestationPortType = cmgenattestationService.getCMGENATTESTATIONPort() ;
		
		BindingProvider prov = (BindingProvider) cmgenattestationPortType ;
		
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        cmgenattestationPortType.cmGENATTESTATION(cmGenAttestation);
		
		return cmGenAttestation;
		
	}

}
