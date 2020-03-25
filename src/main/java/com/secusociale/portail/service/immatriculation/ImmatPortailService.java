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
	
	public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(IMMATRICULATIONINBOUND immatriculation) throws IMMATRICULATIONINBOUNDFault{
		
		//String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire 
	   	 
		
		 
		
		Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();
		
		Input input = new Input();
		EmployerQuery employerQery = new EmployerQuery();
		MainRegistrationForm mainRegistrationForm = new MainRegistrationForm();
		LegalRepresentativeForm legalRepresentativeForm = new LegalRepresentativeForm();
		Documents documents = new Documents();
		//EmployeList listEmp = new EmployeList();
		
		
		
	 
	    
		List<EmployeList> employes =  immatriculation.getInput().getEmployeList() ;
		
	    int nbEmployes = employes.size();
	    
		 
	   
		
		employerQery.setRegType(immatriculation.getInput().getEmployerQuery().getRegType());
		employerQery.setEmployerType(immatriculation.getInput().getEmployerQuery().getEmployerType());
		employerQery.setEmployerName(immatriculation.getInput().getEmployerQuery().getEmployerName());
		employerQery.setCompanyOriginId(immatriculation.getInput().getEmployerQuery().getCompanyOriginId());
		employerQery.setHqId(immatriculation.getInput().getEmployerQuery().getHqId());
		employerQery.setNineaNumber(immatriculation.getInput().getEmployerQuery().getNineaNumber());
		employerQery.setLegalStatus(immatriculation.getInput().getEmployerQuery().getLegalStatus());
		employerQery.setNinetNumber(immatriculation.getInput().getEmployerQuery().getNinetNumber());
		employerQery.setTaxId(immatriculation.getInput().getEmployerQuery().getTaxId());
		employerQery.setTaxIdDate(immatriculation.getInput().getEmployerQuery().getTaxIdDate());
		employerQery.setTradeRegisterDate(immatriculation.getInput().getEmployerQuery().getTradeRegisterDate());
		employerQery.setTradeRegisterDate(immatriculation.getInput().getEmployerQuery().getTradeRegisterDate());
		employerQery.setTradeRegisterNumber(immatriculation.getInput().getEmployerQuery().getTradeRegisterNumber());
		employerQery.setTypeEtablissement(immatriculation.getInput().getEmployerQuery().getTypeEtablissement());
		
		mainRegistrationForm.setAddress(immatriculation.getInput().getMainRegistrationForm().getAddress());
		mainRegistrationForm.setAgencyCss(immatriculation.getInput().getMainRegistrationForm().getAgencyCss());
		mainRegistrationForm.setAgencyIpres(immatriculation.getInput().getMainRegistrationForm().getAgencyIpres());
		mainRegistrationForm.setArondissement(immatriculation.getInput().getMainRegistrationForm().getArondissement());
		mainRegistrationForm.setMainLineOfBusiness(immatriculation.getInput().getMainRegistrationForm().getMainLineOfBusiness());
		mainRegistrationForm.setBusinessSector(immatriculation.getInput().getMainRegistrationForm().getBusinessSector());
		mainRegistrationForm.setCommune(immatriculation.getInput().getMainRegistrationForm().getCommune());
		mainRegistrationForm.setDateOfFirstHire(immatriculation.getInput().getMainRegistrationForm().getDateOfFirstHire());
		mainRegistrationForm.setDateOfInspection(immatriculation.getInput().getMainRegistrationForm().getDateOfInspection());
		mainRegistrationForm.setDepartment(immatriculation.getInput().getMainRegistrationForm().getDepartment());
		mainRegistrationForm.setEmail(immatriculation.getInput().getMainRegistrationForm().getEmail());
		mainRegistrationForm.setNoOfWorkersInBasicScheme(immatriculation.getInput().getMainRegistrationForm().getNoOfWorkersInBasicScheme());
		mainRegistrationForm.setNoOfWorkersInGenScheme(immatriculation.getInput().getMainRegistrationForm().getNoOfWorkersInGenScheme());
		mainRegistrationForm.setPostboxNo(immatriculation.getInput().getMainRegistrationForm().getPostboxNo());
		mainRegistrationForm.setQartier(immatriculation.getInput().getMainRegistrationForm().getQartier());
		mainRegistrationForm.setRegion(immatriculation.getInput().getMainRegistrationForm().getRegion());
		mainRegistrationForm.setSectorCss(immatriculation.getInput().getMainRegistrationForm().getSectorCss());
		mainRegistrationForm.setSectorIpres(immatriculation.getInput().getMainRegistrationForm().getSectorIpres());
		mainRegistrationForm.setShortName(immatriculation.getInput().getMainRegistrationForm().getShortName());
		mainRegistrationForm.setTelephone(immatriculation.getInput().getMainRegistrationForm().getTelephone());
		mainRegistrationForm.setWebsite(immatriculation.getInput().getMainRegistrationForm().getWebsite());
		mainRegistrationForm.setZoneCss(immatriculation.getInput().getMainRegistrationForm().getZoneCss());
		mainRegistrationForm.setZoneIpres(immatriculation.getInput().getMainRegistrationForm().getZoneIpres());
		
		legalRepresentativeForm.setAddress(immatriculation.getInput().getLegalRepresentativeForm().getAddress());
		legalRepresentativeForm.setArondissement(immatriculation.getInput().getLegalRepresentativeForm().getArondissement());
		legalRepresentativeForm.setCityOfBirth(immatriculation.getInput().getLegalRepresentativeForm().getCityOfBirth());
		legalRepresentativeForm.setCommune(immatriculation.getInput().getLegalRepresentativeForm().getCommune());
		legalRepresentativeForm.setDepartment(immatriculation.getInput().getLegalRepresentativeForm().getDepartment());
		legalRepresentativeForm.setEmail(immatriculation.getInput().getLegalRepresentativeForm().getEmail());
		legalRepresentativeForm.setExpiryDate(immatriculation.getInput().getLegalRepresentativeForm().getExpiryDate());
		legalRepresentativeForm.setFirstName(immatriculation.getInput().getLegalRepresentativeForm().getFirstName());
		legalRepresentativeForm.setIdentityIdNumber(immatriculation.getInput().getLegalRepresentativeForm().getIdentityIdNumber());
	    legalRepresentativeForm.setIssuedDate(immatriculation.getInput().getLegalRepresentativeForm().getIssuedDate());
	    legalRepresentativeForm.setLandLineNumber(immatriculation.getInput().getLegalRepresentativeForm().getLandLineNumber());
	    legalRepresentativeForm.setLastName(immatriculation.getInput().getLegalRepresentativeForm().getLastName());
	    legalRepresentativeForm.setLegalRepPerson(immatriculation.getInput().getLegalRepresentativeForm().getLegalRepPerson());
	    legalRepresentativeForm.setMobileNumber(immatriculation.getInput().getLegalRepresentativeForm().getMobileNumber());
	    legalRepresentativeForm.setNationality(immatriculation.getInput().getLegalRepresentativeForm().getNationality());
	    legalRepresentativeForm.setNin(immatriculation.getInput().getLegalRepresentativeForm().getNin());
	    legalRepresentativeForm.setBirthdate(immatriculation.getInput().getLegalRepresentativeForm().getBirthdate());
	    legalRepresentativeForm.setNinCedeo(immatriculation.getInput().getLegalRepresentativeForm().getNinCedeo());
	    legalRepresentativeForm.setPlaceOfBirth(immatriculation.getInput().getLegalRepresentativeForm().getPlaceOfBirth());
	    legalRepresentativeForm.setQartier(immatriculation.getInput().getLegalRepresentativeForm().getQartier());
	    legalRepresentativeForm.setRegion(immatriculation.getInput().getLegalRepresentativeForm().getRegion());
	    legalRepresentativeForm.setTypeOfIdentity(immatriculation.getInput().getLegalRepresentativeForm().getTypeOfIdentity());
	    
		/*
		 * documents.setAttestationChomage(immatriculation.getInput().getDocuments().
		 * getAttestationChomage());
		 * documents.setAvisImmatriculation(immatriculation.getInput().getDocuments().
		 * getAvisImmatriculation());
		 * documents.setBulletinsSalaire(immatriculation.getInput().getDocuments().
		 * getBulletinsSalaire());
		 * documents.setCarteIdentiteConsulaire(immatriculation.getInput().getDocuments(
		 * ).getCarteIdentiteConsulaire());
		 * documents.setCarteNationaleIdentite(immatriculation.getInput().getDocuments()
		 * .getCarteNationaleIdentite());
		 * documents.setCessationActivity(immatriculation.getInput().getDocuments().
		 * getCessationActivity());
		 * documents.setCni(immatriculation.getInput().getDocuments().getCni());
		 * documents.setContratsTravail(immatriculation.getInput().getDocuments().
		 * getContratsTravail());
		 * documents.setDeclarationEtablissement(immatriculation.getInput().getDocuments
		 * ().getDeclarationEtablissement());
		 * documents.setDecretMinisteriel(immatriculation.getInput().getDocuments().
		 * getDecretMinisteriel());
		 * documents.setDemandeEcrit(immatriculation.getInput().getDocuments().
		 * getDemandeEcrit());
		 * documents.setDerniersBulletins(immatriculation.getInput().getDocuments().
		 * getDerniersBulletins());
		 * documents.setDmt(immatriculation.getInput().getDocuments().getDmt());
		 * documents.setEtatRecensement(immatriculation.getInput().getDocuments().
		 * getEtatRecensement());
		 * documents.setFormDemande(immatriculation.getInput().getDocuments().
		 * getFormDemande());
		 * documents.setManuscriteAdressee(immatriculation.getInput().getDocuments().
		 * getManuscriteAdressee());
		 * documents.setPassportDoc(immatriculation.getInput().getDocuments().
		 * getPassportDoc());
		 * documents.setPhotocopieStatus(immatriculation.getInput().getDocuments().
		 * getPhotocopieStatus());
		 * documents.setPieceIdDoc(immatriculation.getInput().getDocuments().
		 * getPieceIdDoc());
		 * documents.setPieceIdGerantDoc(immatriculation.getInput().getDocuments().
		 * getPieceIdGerantDoc());
		 * documents.setRegistreCommerce(immatriculation.getInput().getDocuments().
		 * getRegistreCommerce());
		 */


		 
	    /* Ajout des Salariés          */
	 
		/*
		 * if(nbEmployes != 0) {
		 * 
		 * 
		 * for (int i=0 ; i<=nbEmployes ; i++) {
		 * 
		 * EmployeList employeWS = new EmployeList();
		 * 
		 * employeWS.setAdresse(employes.get(i).getAdresse());
		 * employeWS.setArrondissement(employes.get(i).getArrondissement());
		 * employeWS.setBoitePostale(employes.get(i).getBoitePostale());
		 * employeWS.setCategorie(employes.get(i).getCategorie());
		 * employeWS.setCommune(employes.get(i).getCommune());
		 * employeWS.setConventionApplicable(employes.get(i).getConventionApplicable());
		 * employeWS.setDateDebutContrat(employes.get(i).getDateDebutContrat().toString(
		 * ));
		 * employeWS.setDateFinContrat(employes.get(i).getDateFinContrat().toString());
		 * employeWS.setDateNaissance(employes.get(i).getDateNaissance().toString());
		 * employeWS.setDelivreLe(employes.get(i).getDelivreLe());
		 * employeWS.setDepartement(employes.get(i).getDepartement());
		 * employeWS.setEmploi(employes.get(i).getEmploi());
		 * employeWS.setEmployeurPrec(employes.get(i).getEmployeurPrec());
		 * employeWS.setEtatCivil(employes.get(i).getEtatCivil());
		 * employeWS.setExpireLe(employes.get(i).getExpireLe());
		 * employeWS.setLieuDelivrance(employes.get(i).getLieuDelivrance());
		 * employeWS.setNationalite(employes.get(i).getNationalite());
		 * employeWS.setNatureContrat(employes.get(i).getNatureContrat());
		 * employeWS.setNin(employes.get(i).getNin());
		 * employeWS.setNinCedeao(employes.get(i).getNomEmploye());
		 * employeWS.setNomEmploye(employes.get(i).getNomEmploye());
		 * employeWS.setNomMere(employes.get(i).getNomMere());
		 * employeWS.setNomPere(employes.get(i).getNomPere());
		 * employeWS.setNonCadre(employes.get(i).getNonCadre());
		 * employeWS.setNumPieceIdentite(employes.get(i).getNumPieceIdentite());
		 * employeWS.setNumRegNaiss(employes.get(i).getNumRegNaiss());
		 * employeWS.setOuiCadre(employes.get(i).getOuiCadre());
		 * employeWS.setPays(employes.get(i).getPays());
		 * employeWS.setPaysNaissance(employes.get(i).getPaysNaissance());
		 * employeWS.setPrenomEmploye(employes.get(i).getPrenomEmploye());
		 * employeWS.setPrenomMere(employes.get(i).getPrenomMere());
		 * employeWS.setPrenomPere(employes.get(i).getPrenomPere());
		 * employeWS.setProfession(employes.get(i).getProfession());
		 * employeWS.setQuartier(employes.get(i).getQuartier());
		 * employeWS.setRechercheEmploye(employes.get(i).getRechercheEmploye());
		 * employeWS.setRegion(employes.get(i).getRegion());
		 * employeWS.setSalaireContractuel(employes.get(i).getSalaireContractuel().
		 * toString()); employeWS.setSexe(employes.get(i).getSexe());
		 * employeWS.setTempsTravail(employes.get(i).getTempsTravail().toString());
		 * employeWS.setTypeMouvement(employes.get(i).getTypeMouvement());
		 * employeWS.setTypePieceIdentite(employes.get(i).getTypePieceIdentite());
		 * employeWS.setVilleNaissance(employes.get(i).getVilleNaissance());
		 * 
		 * 
		 * 
		 * 
		 * input.getEmployeList().add(employeWS);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * } }
		 */
		
	    
	    
		
		
		input.setEmployerQuery(employerQery);
		input.setMainRegistrationForm(mainRegistrationForm);
		input.setLegalRepresentativeForm(legalRepresentativeForm);
		//input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
		//input.getEmployeList().add((EmployeList) employes);
		//input.setDocuments(documents);
		
	
		
		
		
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
