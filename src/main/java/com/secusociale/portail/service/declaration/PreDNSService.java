package com.secusociale.portail.service.declaration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.model.DeclarationModel;
import com.secusociale.portail.model.DeclarationModel.EmployeModel;
import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.preDNS.CmPresDns;
import com.secusociale.portail.service.soap.preDNS.CmPresDns.InformationSalaries;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsFault;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsPortType;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsService;
import com.secusociale.portail.service.soap.preDNS.ObjectFactory;

@Service
public class PreDNSService {
	
	 
	
	public Holder<DeclarationModel> getPreDns(DeclarationModel preDnsInput) throws CmPresDnsFault, JAXBException, DatatypeConfigurationException   {
		
		
		Holder<CmPresDns> cmPreDns = new Holder<CmPresDns>();
		
		Holder<DeclarationModel> preDNS = new Holder<DeclarationModel>();
		
        List<InformationSalaries> listSalaries = new ArrayList<CmPresDns.InformationSalaries>();
	
		
        DeclarationModel model = new DeclarationModel();
		
		// Input
		 
         SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		   
		
		  GregorianCalendar gDateDebutCalendar = new GregorianCalendar();
		  gDateDebutCalendar.setTime(preDnsInput.getDateDebutCotisation());
		  XMLGregorianCalendar dateDebutcotisation = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gDateDebutCalendar.get(Calendar.YEAR), gDateDebutCalendar.get(Calendar.MONTH)+1, gDateDebutCalendar.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
		  
		  GregorianCalendar gDateFinCalendar = new GregorianCalendar();
		  gDateFinCalendar.setTime(preDnsInput.getDateFinPeriodeCotisation());
		  XMLGregorianCalendar dateFinCotisation = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gDateFinCalendar.get(Calendar.YEAR), gDateFinCalendar.get(Calendar.MONTH)+1, gDateFinCalendar.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
		 
		  
	 
		
		ObjectFactory obj = new ObjectFactory();
		
		
		
		  JAXBElement<XMLGregorianCalendar> dateDebutCoti = obj.createCmPresDnsDateDebutPeriodeCotisation(dateDebutcotisation);
		  JAXBElement<XMLGregorianCalendar> dateFinCoti = obj.createCmPresDnsDateFinPeriodeCotisation(dateFinCotisation);
		  
		  
		 
		cmPreDns.value = obj.createCmPresDns() ;
		cmPreDns.value.setAddress(preDnsInput.getAdresse());
		  
		cmPreDns.value.setDateDebutPeriodeCotisation(dateDebutCoti);
		cmPreDns.value.setDateFinPeriodeCotisation(dateFinCoti);
		
		cmPreDns.value.setNumeroIdentifiant(preDnsInput.getIdIdentifiant());
		cmPreDns.value.setTypeIdentifiant(preDnsInput.getTypeIdentifiant());
		cmPreDns.value.setRaisonSociale(preDnsInput.getRaisonSociale());
		cmPreDns.value.setTypeDeclaration(preDnsInput.getTypeDeclaration());
		
		
		////////////////
		
		
		
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
		
		
		//////////
		
		
        
        // Output (Insertion des valeur dans le model)
        
		
		
		  preDnsInput.setTotalSalaries(cmPreDns.value.getTotalSalaries());
		  preDnsInput.setCumulTotSalAssCssAtmp(cmPreDns.value.getTotalSalaireAssujetisAtmp().getValue());
		  preDnsInput.setCumulTotSalAssCssPf(cmPreDns.value.getTotalSalaireAssujetisPf().getValue()); 
		  preDnsInput.setCumulTotSalAssIpresRcc(cmPreDns.value.getTotalSalaireAssujetisRcc().getValue());
		  preDnsInput.setCumulTotSalAssIpresRg(cmPreDns.value.getTotalSalaireAssujetisRg().getValue());
		  preDnsInput.setTotalSalVerses(cmPreDns.value.getTotalSalaireVerses().getValue());
		  preDnsInput.setMntCotAtMpCalcParEmployeur(cmPreDns.value.getMontantCotisationAtmpEmp().getValue());
		  preDnsInput.setMntCotPfCalcParEmployeur(cmPreDns.value.getMontantCotisationPfEmp().getValue());
		  preDnsInput.setMntCotRccCalcParEmployeur(cmPreDns.value.getMontantCotisationRccEmp().getValue());
		  preDnsInput.setMntCotRgCalcParEmployeur(cmPreDns.value.getMontantCotisationRgEmpl().getValue());
		 
        
		
		  listSalaries = cmPreDns.value.getInformationSalaries();
		  
		  //DeclarationModel declarationModel = new DeclarationModel();
		  
		  for (int i=0 ; i < listSalaries.size() ; i++) {
		  
		  EmployeModel employeModel =  new EmployeModel() ;
		  
		  JAXBElement<XMLGregorianCalendar> rcc1 = listSalaries.get(i).getDateEffetRegimeCadreMois1();
		  JAXBElement<XMLGregorianCalendar> rcc2 = listSalaries.get(i).getDateEffetRegimeCadreMois2();
		  JAXBElement<XMLGregorianCalendar> rcc3 = listSalaries.get(i).getDateEffetRegimeCadreMois3();
		  JAXBElement<XMLGregorianCalendar> dateSortie = listSalaries.get(i).getDateSortie();
		  
		  employeModel.setNumeroAssureSocial(listSalaries.get(i).getNumeroAssureSocial()); 
		  employeModel.setNomEmploye(listSalaries.get(i).getNom());
		  employeModel.setPrenomEmploye(listSalaries.get(i).getPrenom());
		  employeModel.setDateNaissance(model.formaToString(listSalaries.get(i).getDateNaissance().getValue().toGregorianCalendar().getTime()));
		  employeModel.setTypePieceIdentite(listSalaries.get(i).getTypePiece());
		  employeModel.setNumPieceIdentite(listSalaries.get(i).getNumeroPiece());
		  employeModel.setNatureContrat(listSalaries.get(i).getNatureContrat());
		  employeModel.setDateEntree(model.formaToString(listSalaries.get(i).getDateEntree().getValue().toGregorianCalendar().getTime()));
		  if(dateSortie != null) {
			  employeModel.setDateSortie(model.formaToString(dateSortie.getValue().toGregorianCalendar().getTime()));
		  }
		  employeModel.setMotifSortie(listSalaries.get(i).getMotif());
		  
		
		  
		  
		  
		  employeModel.setTotSalAssCssAtmp1(listSalaries.get(i).getTotalSalaireAssujetisAtmpMois1().getValue());
		  employeModel.setTotSalAssCssPf1(listSalaries.get(i).getTotalSalaireAssujetisPfMois1().getValue());
		  employeModel.setTotSalAssIpresRcc1(listSalaries.get(i).getTotalSalaireAssujetisRccMois1().getValue());
		  employeModel.setTotSalAssIpresRg1(listSalaries.get(i).getTotalSalaireAssujetisRgMois1().getValue());
		  employeModel.setSalaireBrut1(listSalaries.get(i).getSalaireBrutMois1().getValue());
		  employeModel.setNombreJours1(listSalaries.get(i).getTempsPresenceJourMois1());
		  employeModel.setNombreHeures1(listSalaries.get(i).getTempsPresenceHeureMois1());
		  employeModel.setTempsTravail1(listSalaries.get(i).getTempsTravailMois1());
		  employeModel.setTrancheTravail1(listSalaries.get(i).getTranceDeTravailMois1());
		  employeModel.setRegimeGeneral1(listSalaries.get(i).getRegimeGeneralMois1().getValue());
		  employeModel.setRegimCompCadre1(listSalaries.get(i).getRegimeCadreMois1().getValue()); 
		  
		  if(rcc1 != null) {
			  employeModel.setDateEffetRegimeCadre1(model.formaToString(rcc1.getValue().toGregorianCalendar().getTime()));
			  
			  //System.out.println("RCC1: "+rcc1.getValue());
			  //System.out.println("RCC2: "+rcc2);
		  }
		  
		 
		  
		  employeModel.setTotSalAssCssAtmp2(listSalaries.get(i).getTotalSalaireAssujetisAtmpMois2().getValue());
		  employeModel.setTotSalAssCssPf2(listSalaries.get(i).getTotalSalaireAssujetisPfMois2());
		  employeModel.setTotSalAssIpresRcc2(listSalaries.get(i).getTotalSalaireAssujetisRccMois2().getValue());
		  employeModel.setTotSalAssIpresRg2(listSalaries.get(i).getTotalSalaireAssujetisRgMois2().getValue());
		  employeModel.setSalaireBrut2(listSalaries.get(i).getSalaireBrutMois2().getValue());
		  employeModel.setNombreJours2(listSalaries.get(i).getTempsPresenceJourMois2().getValue());
		  employeModel.setNombreHeures2(listSalaries.get(i).getTempsPresenceHeureMois2().getValue());
		  employeModel.setTempsTravail2(listSalaries.get(i).getTempsTravailMois2());
		  employeModel.setTrancheTravail2(listSalaries.get(i).getTranceDeTravailMois2());
		  employeModel.setRegimeGeneral2(listSalaries.get(i).getRegimeGeneralMois2().getValue());
		  employeModel.setRegimCompCadre2(listSalaries.get(i).getRegimeCadreMois2().getValue()); 
		  if(rcc2 != null) {
			  employeModel.setDateEffetRegimeCadre2(model.formaToString(rcc2.getValue().toGregorianCalendar().getTime()));
			  
			  
		  }
		  
		  
		  
		  employeModel.setTotSalAssCssAtmp3(listSalaries.get(i).getTotalSalaireAssujetisAtmpMois3().getValue());
		  employeModel.setTotSalAssCssPf3(listSalaries.get(i).getTotalSalaireAssujetisPfMois3().getValue());
		  employeModel.setTotSalAssIpresRcc3(listSalaries.get(i).getTotalSalaireAssujetisRccMois3().getValue());
		  employeModel.setTotSalAssIpresRg3(listSalaries.get(i).getTotalSalaireAssujetisRgMois3().getValue());
		  employeModel.setSalaireBrut3(listSalaries.get(i).getSalaireBrutMois3().getValue());
		  employeModel.setNombreJours3(listSalaries.get(i).getTempsPresenceJourMois3().getValue());
		  employeModel.setNombreHeures3(listSalaries.get(i).getTempsPresenceHeureMois3().getValue());
		  employeModel.setTempsTravail3(listSalaries.get(i).getTempsTravailMois3());
		  employeModel.setTrancheTravail3(listSalaries.get(i).getTranceDeTravailMois3());
		  employeModel.setRegimeGeneral3(listSalaries.get(i).getRegimeGeneralMois3().getValue());
		  employeModel.setRegimCompCadre3(listSalaries.get(i).getRegimeCadreMois3().getValue()); 
		  if(rcc3 != null) {
			  employeModel.setDateEffetRegimeCadre3(model.formaToString(rcc3.getValue().toGregorianCalendar().getTime()));
		  }
		  
		  
		  
		  preDnsInput.getInformationSalaries().add(employeModel);
		  
		  }
		 
		 
        		
       
        
		preDNS.value = preDnsInput ;
		
		return preDNS;
	}

}