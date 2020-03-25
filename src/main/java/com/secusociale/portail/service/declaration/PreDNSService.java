package com.secusociale.portail.service.declaration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.preDNS.CmPresDns;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsFault;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsPortType;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsService;
import com.secusociale.portail.service.soap.preDNS.ObjectFactory;

@Service
public class PreDNSService {
	
	
	
	public Holder<CmPresDns> getPreDns(CmPresDns preDns) throws CmPresDnsFault, JAXBException   {
		
		
		Holder<CmPresDns> cmPreDns = new Holder<CmPresDns>();
		
		
		ObjectFactory obj = new ObjectFactory();
		cmPreDns.value = obj.createCmPresDns() ;
		cmPreDns.value.setAddress(preDns.getAddress());
		cmPreDns.value.setDateDebutPeriodeCotisation(preDns.getDateDebutPeriodeCotisation());
		cmPreDns.value.setDateFinPeriodeCotisation(preDns.getDateFinPeriodeCotisation());
		cmPreDns.value.setNumeroIdentifiant(preDns.getNumeroIdentifiant());
		cmPreDns.value.setTypeIdentifiant(preDns.getTypeIdentifiant());
		cmPreDns.value.setRaisonSociale(preDns.getRaisonSociale());
		cmPreDns.value.setTypeDeclaration(preDns.getTypeDeclaration());
		
		final JAXBContext jc = JAXBContext.newInstance(CmPresDns.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(cmPreDns.value, System.out);
		
		
		CmPresDnsService cmPresDnsService = new CmPresDnsService() ;
		CmPresDnsPortType cmPresDnsPortType = cmPresDnsService.getCmPresDnsPort() ;
		
		BindingProvider prov = (BindingProvider) cmPresDnsPortType ;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        cmPresDnsPortType.cmPresDns(cmPreDns);
		
		
		return cmPreDns;
	}

}
