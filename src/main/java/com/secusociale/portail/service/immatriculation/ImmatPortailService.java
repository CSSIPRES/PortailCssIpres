package com.secusociale.portail.service.immatriculation;

import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.domain.Employe;
import com.secusociale.portail.domain.Immatriculation;
import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDPortType;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDService;
import com.secusociale.portail.service.soap.demandeImmatriculation.ObjectFactory;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input.Documents;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input.EmployeList;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input.EmployerQuery;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input.LegalRepresentativeForm;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input.MainRegistrationForm;

@Service
public class ImmatPortailService {
	
	public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(Immatriculation immatriculation) throws IMMATRICULATIONINBOUNDFault{
		
		//String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire 
	   	 
		
		 
		
		Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
		
		Input input = new Input();
		EmployerQuery employerQery = new EmployerQuery();
		MainRegistrationForm mainRegistrationForm = new MainRegistrationForm();
		LegalRepresentativeForm legalRepresentativeForm = new LegalRepresentativeForm();
		Documents documents = new Documents();
		
		 
		
	    @SuppressWarnings("unchecked")  
		List<Employe> employes = (List<Employe>) immatriculation.getEmployes();
		
	    int nbEmployes = employes.size();
	    
		 
	   
		
		employerQery.setRegType(immatriculation.getRegType());
		employerQery.setEmployerType(immatriculation.getEmployerType());
		employerQery.setEmployerName(immatriculation.getEmployerName());
		employerQery.setCompanyOriginId(immatriculation.getCompagnyOriginId());
		employerQery.setHqId(immatriculation.getHqId());
		employerQery.setNineaNumber(immatriculation.getNineaNumber());
		employerQery.setLegalStatus(immatriculation.getLegalStatus());
		employerQery.setNinetNumber(immatriculation.getNinetNumber());
		employerQery.setTaxId(immatriculation.getTaxId());
		employerQery.setTaxIdDate(immatriculation.getTaxIdDate().toString());
		employerQery.setTradeRegisterDate(immatriculation.getTradeRegisterDate().toString());
		employerQery.setTradeRegisterDate(immatriculation.getTradeRegisterDate().toString());
		employerQery.setTradeRegisterNumber(immatriculation.getTradeRegisterNumber());
		employerQery.setTypeEtablissement(immatriculation.getTypeEtablissement());
		
		mainRegistrationForm.setAddress(immatriculation.getAddress());
		mainRegistrationForm.setAgencyCss(immatriculation.getAgencyCss());
		mainRegistrationForm.setAgencyIpres(immatriculation.getAgencyIpres());
		mainRegistrationForm.setArondissement(immatriculation.getArondissement());
		mainRegistrationForm.setMainLineOfBusiness(immatriculation.getMainLineOfBusiness());
		mainRegistrationForm.setBusinessSector(immatriculation.getBusinessSector());
		mainRegistrationForm.setCommune(immatriculation.getCommune());
		mainRegistrationForm.setDateOfFirstHire(immatriculation.getDateOfFirtHire().toString());
		mainRegistrationForm.setDateOfInspection(immatriculation.getDateOfInpsection().toString());
		mainRegistrationForm.setDepartment(immatriculation.getDepartment());
		mainRegistrationForm.setEmail(immatriculation.getDepartment());
		mainRegistrationForm.setNoOfWorkersInBasicScheme(immatriculation.getNoOfWorkersInBasicScheme().toString());
		mainRegistrationForm.setNoOfWorkersInGenScheme(immatriculation.getNoOfWorkersInGenScheme().toString());
		mainRegistrationForm.setPostboxNo(immatriculation.getPostboxNo());
		mainRegistrationForm.setQartier(immatriculation.getQartier());
		mainRegistrationForm.setRegion(immatriculation.getRegion());
		mainRegistrationForm.setSectorCss(immatriculation.getSectorCss());
		mainRegistrationForm.setSectorIpres(immatriculation.getSectorIpres());
		mainRegistrationForm.setShortName(immatriculation.getShortName());
		mainRegistrationForm.setTelephone(immatriculation.getTelephone());
		mainRegistrationForm.setWebsite(immatriculation.getWebsite());
		mainRegistrationForm.setZoneCss(immatriculation.getZoneCss());
		mainRegistrationForm.setZoneIpres(immatriculation.getZoneIpres());
		
		legalRepresentativeForm.setAddress(immatriculation.getAddressRep());
		legalRepresentativeForm.setArondissement(immatriculation.getArondissementRep());
		legalRepresentativeForm.setCityOfBirth(immatriculation.getCityOfBirthRep());
		legalRepresentativeForm.setCommune(immatriculation.getCommuneRep());
		legalRepresentativeForm.setDepartment(immatriculation.getDepartmentRep());
		legalRepresentativeForm.setEmail(immatriculation.getEmailRep());
		legalRepresentativeForm.setExpiryDate(immatriculation.getExpiryDateRep());
		legalRepresentativeForm.setFirstName(immatriculation.getFirstNameRep());
		legalRepresentativeForm.setIdentityIdNumber(immatriculation.getIdentityIdNumberRep());
	    legalRepresentativeForm.setIssuedDate(immatriculation.getIssuedDateRep());
	    legalRepresentativeForm.setLandLineNumber(immatriculation.getLandLineNumberRep());
	    legalRepresentativeForm.setLastName(immatriculation.getLastNameRep());
	    legalRepresentativeForm.setLegalRepPerson(immatriculation.getLegalRepPerson());
	    legalRepresentativeForm.setMobileNumber(immatriculation.getMobileNumberRep());
	    legalRepresentativeForm.setNationality(immatriculation.getNationalityRep());
	    legalRepresentativeForm.setNin(immatriculation.getNinRep());
	    legalRepresentativeForm.setBirthdate(immatriculation.getBirthdateRep().toString());
	    legalRepresentativeForm.setNinCedeo(immatriculation.getNinCedeoRep());
	    legalRepresentativeForm.setPlaceOfBirth(immatriculation.getPlaceOfBirthRep());
	    legalRepresentativeForm.setQartier(immatriculation.getQartierRep());
	    legalRepresentativeForm.setRegion(immatriculation.getRegionRep());
	    legalRepresentativeForm.setTypeOfIdentity(immatriculation.getTypeOfIdentityRep());
	    
		 
	    /* Ajout des Salariés          */
	 
 if(nbEmployes != 0) {
	    	
	    	
	    	for (int i=0 ; i<=nbEmployes ; i++) {
	    		
	    		EmployeList employeWS = new EmployeList();
	    		
	    		employeWS.setAdresse(employes.get(i).getAddress());
	    		employeWS.setArrondissement(employes.get(i).getArondissement());
	    		employeWS.setBoitePostale(employes.get(i).getBoitePostale());
	    		employeWS.setCategorie(employes.get(i).getCategorie());
	    		employeWS.setCommune(employes.get(i).getCommune());
	    		employeWS.setConventionApplicable(employes.get(i).getConventionApplicable());
	    		employeWS.setDateDebutContrat(employes.get(i).getDateDebutContrat().toString());
	    		employeWS.setDateFinContrat(employes.get(i).getDateFinContrat().toString());
	    		employeWS.setDateNaissance(employes.get(i).getDateNaissance().toString());
	    		employeWS.setDelivreLe(employes.get(i).getDelivreLe());
	    		employeWS.setDepartement(employes.get(i).getDepartment());
	    		employeWS.setEmploi(employes.get(i).getEmploi());
	    		employeWS.setEmployeurPrec(employes.get(i).getEmployeurPrec());
	    		employeWS.setEtatCivil(employes.get(i).getEtatCivil());
	    		employeWS.setExpireLe(employes.get(i).getExpireLe());
	    		employeWS.setLieuDelivrance(employes.get(i).getLieuDelivrance());
	    		employeWS.setNationalite(employes.get(i).getNationalite());
	    		employeWS.setNatureContrat(employes.get(i).getNatureContrat());
	    		employeWS.setNin(employes.get(i).getNin());
	    		employeWS.setNinCedeao(employes.get(i).getNomEmploye());
	    		employeWS.setNomEmploye(employes.get(i).getNomEmploye());
	    		employeWS.setNomMere(employes.get(i).getNomMere());
	    		employeWS.setNomPere(employes.get(i).getNomPere());
	    		employeWS.setNonCadre(employes.get(i).getNonCadre());
	    		employeWS.setNumPieceIdentite(employes.get(i).getNumPieceIdentite());
	    		employeWS.setNumRegNaiss(employes.get(i).getNumRegNaiss());
	    		employeWS.setOuiCadre(employes.get(i).getOuiCadre());
	    		employeWS.setPays(employes.get(i).getPays());
	    		employeWS.setPaysNaissance(employes.get(i).getPaysNaissance());
	    		employeWS.setPrenomEmploye(employes.get(i).getPrenomEmploye());
	    		employeWS.setPrenomMere(employes.get(i).getPrenomMere());
	    		employeWS.setPrenomPere(employes.get(i).getPrenomPere());
	    		employeWS.setProfession(employes.get(i).getProfession());
	    		employeWS.setQuartier(employes.get(i).getQartier());
	    		employeWS.setRechercheEmploye(employes.get(i).getRechercheEmploye());
	    		employeWS.setRegion(employes.get(i).getRegion());
	    		employeWS.setSalaireContractuel(employes.get(i).getSalaireContractuel().toString());
	    		employeWS.setSexe(employes.get(i).getSexe());
	    		employeWS.setTempsTravail(employes.get(i).getTempsTravail().toString());
	    		employeWS.setTypeMouvement(employes.get(i).getTypeMouvement());
	    		employeWS.setTypePieceIdentite(employes.get(i).getTypePieceIdentite());
	    		employeWS.setVilleNaissance(employes.get(i).getVilleNaissance());
	    	 
	    		
	    		
	    		
	    		input.getEmployeList().add(employeWS);
	    		
	    		
	    	 
	    	}
	    }
	    
		
	    
	    
		
		
		input.setEmployerQuery(employerQery);
		input.setMainRegistrationForm(mainRegistrationForm);
		input.setLegalRepresentativeForm(legalRepresentativeForm);
		input.setDocuments(documents);
		
		
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
