package com.secusociale.portail.service.attestation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegularite;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteFault;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegularitePortType;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteService;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.ObjectFactory;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegularite.Input;

@Service
public class DemandeAttestationService {
	
	public Holder<CmGetAttestationRegularite> createDossierAttestation(String typeIdentifiant, String numeroIdentifiant ) throws JAXBException, CmGetAttestationRegulariteFault{
		
		
		Input input = new Input();
		input.setTypeIdentifiant(typeIdentifiant);
		input.setNumeroIdentifiant(numeroIdentifiant);
		
		Holder<CmGetAttestationRegularite>  cmGetAttestationRegularite = new Holder<CmGetAttestationRegularite>();
		
		ObjectFactory obj = new ObjectFactory();
		cmGetAttestationRegularite.value = obj.createCmGetAttestationRegularite();
	
		cmGetAttestationRegularite.value.setInput(input);
		
	
		final JAXBContext jc = JAXBContext.newInstance(CmGetAttestationRegularite.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(cmGetAttestationRegularite.value, System.out);
		
	    CmGetAttestationRegulariteService attestationRegulariteService = new CmGetAttestationRegulariteService();
	    CmGetAttestationRegularitePortType attestationRegularitePortType = attestationRegulariteService.getCmGetAttestationRegularitePort();
	    
	    BindingProvider prov = (BindingProvider) attestationRegularitePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	    
		attestationRegularitePortType.cmGetAttestationRegularite(cmGetAttestationRegularite);
		
		
		return cmGetAttestationRegularite ;
		
	}

}
