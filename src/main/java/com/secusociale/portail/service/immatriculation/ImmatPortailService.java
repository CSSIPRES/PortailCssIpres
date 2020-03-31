package com.secusociale.portail.service.immatriculation;


import javax.xml.bind.JAXBContext;


import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUND;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDFault;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDPortType;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDService;
import com.secusociale.portail.service.soap.preDNS.CmPresDns;
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
	 // Save Immatriculation maintien d'affiliation

    public Holder<MAINTAFFINBOUND> createImmatriculationMaintienAffiliation(MAINTAFFINBOUND.Input immatriculation) throws MAINTAFFINBOUNDFault, JAXBException {
        //String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire
        Holder<MAINTAFFINBOUND> immatriculationAffiliation = new Holder<MAINTAFFINBOUND>();
        MAINTAFFINBOUND.Input input = new MAINTAFFINBOUND.Input();
       // input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
        input.setInformationsGenerales(immatriculation.getInformationsGenerales());
        input.setRegistrationFormInfos(immatriculation.getRegistrationFormInfos());
        input.setInfosSupplementaires(immatriculation.getInfosSupplementaires());
        input.setDocuments(immatriculation.getDocuments());
        com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory obj = new com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory();
        immatriculationAffiliation.value = obj.createMAINTAFFINBOUND();
        immatriculationAffiliation.value.setInput(input);

        final JAXBContext jc = JAXBContext.newInstance(MAINTAFFINBOUND.class);
        final Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(immatriculationAffiliation.value, System.out);


        MAINTAFFINBOUNDService immatriculationMainAffiliationService = new MAINTAFFINBOUNDService();
        MAINTAFFINBOUNDPortType immatriculationMainAffiliationPortType = immatriculationMainAffiliationService.getMAINTAFFINBOUNDPort();
        BindingProvider prov = (BindingProvider) immatriculationMainAffiliationPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        immatriculationMainAffiliationPortType.maintAFFINBOUND(immatriculationAffiliation);
        return immatriculationAffiliation;
    }






    // Save Immatriculation maintien d'affiliation

    public Holder<MAINTAFFINBOUND> createImmatriculationRepresentatnt(MAINTAFFINBOUND.Input immatriculation) throws MAINTAFFINBOUNDFault, JAXBException {
        //String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire
        Holder<MAINTAFFINBOUND> immatriculationAffiliation = new Holder<MAINTAFFINBOUND>();
        MAINTAFFINBOUND.Input input = new MAINTAFFINBOUND.Input();
        // input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
        input.setInformationsGenerales(immatriculation.getInformationsGenerales());
        input.setRegistrationFormInfos(immatriculation.getRegistrationFormInfos());
        input.setInfosSupplementaires(immatriculation.getInfosSupplementaires());
        input.setDocuments(immatriculation.getDocuments());
        com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory obj = new com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory();
        immatriculationAffiliation.value = obj.createMAINTAFFINBOUND();
        immatriculationAffiliation.value.setInput(input);


        final JAXBContext jc = JAXBContext.newInstance(MAINTAFFINBOUND.class);
        final Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(immatriculationAffiliation.value, System.out);


        MAINTAFFINBOUNDService immatriculationMainAffiliationService = new MAINTAFFINBOUNDService();
        MAINTAFFINBOUNDPortType immatriculationMainAffiliationPortType = immatriculationMainAffiliationService.getMAINTAFFINBOUNDPort();
        BindingProvider prov = (BindingProvider) immatriculationMainAffiliationPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        immatriculationMainAffiliationPortType.maintAFFINBOUND(immatriculationAffiliation);

        return immatriculationAffiliation;
    }
}
