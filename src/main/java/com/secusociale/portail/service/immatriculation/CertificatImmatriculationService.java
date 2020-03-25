package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation.Input;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationPortType;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationService;
import com.secusociale.portail.service.soap.certificatImmatriculation.ObjectFactory;

@Service 
public class CertificatImmatriculationService {
	
	public Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault{
		
		Input input = new Input();
		input.setIdDossier(idDossier);
		
		
		Holder<CmGetCertificatImmatriculation>  certificatImmatrication = new  Holder<CmGetCertificatImmatriculation>();
		ObjectFactory obj = new ObjectFactory() ;
		
		certificatImmatrication.value = obj.createCmGetCertificatImmatriculation();
		certificatImmatrication.value.setInput(input);
		
		/*
		 * final JAXBContext jc =
		 * JAXBContext.newInstance(CmGetCertificatImmatriculation.class); final
		 * Marshaller marshaller = jc.createMarshaller();
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 * marshaller.marshal(certificatImmatrication.value, System.out);
		 */
		
	    
	    CmGetCertificatImmatriculationService cmGetCertificatImmatriculationService = new CmGetCertificatImmatriculationService() ;  
	    CmGetCertificatImmatriculationPortType cmGetCertificatImmatriculationPortType = cmGetCertificatImmatriculationService.getCmGetCertificatImmatriculationPort();
	    
	    BindingProvider prov = (BindingProvider) cmGetCertificatImmatriculationPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        cmGetCertificatImmatriculationPortType.cmGetCertificatImmatriculation(certificatImmatrication);   
		
		return certificatImmatrication;
		
		
	}

}
