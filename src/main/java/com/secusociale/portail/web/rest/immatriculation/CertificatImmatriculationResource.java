package com.secusociale.portail.web.rest.immatriculation;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.immatriculation.CertificatImmatriculationService;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.demandeAttestationReguralite.CmGetAttestationRegulariteFault;

@RestController
@RequestMapping("/api")
public class CertificatImmatriculationResource {
	
	@Autowired
	private CertificatImmatriculationService certificatImmatriculationService;
	
	
	/**
     * {@code GET  /certificatImmatriculation/:idDossier} : get the url Of Certificate of Immatriculation.
     *
     * @param idDossier the idDossier of the Process Flow to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the declaration, or with status {@code 404 (Not Found)}.
	 * @throws CmGetAttestationRegulariteFault 
	 * @throws JAXBException 
     */
	
	
	
	@GetMapping("/certificatImmatriculation/{idDossier} ")
	Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault{
		
		Holder<CmGetCertificatImmatriculation> certificatImmatriculation = new Holder<CmGetCertificatImmatriculation>();
		
		certificatImmatriculation = certificatImmatriculationService.getCertificatImmatriculation(idDossier);
		
		
		return certificatImmatriculation;
		
	}

}
