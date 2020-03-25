
package com.secusociale.portail.service.soap.statutDossierImmatriculation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.secusociale.portail.service.PortailConstant;


/**
 * Cm-GetStatusDossierImmatriculation version 2: Recuperation status dossier immatriculation
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Cm-GetStatusDossierImmatriculationService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/Cm-GetStatusDossierImmatriculation", wsdlLocation =  PortailConstant.STATUT_DOSSIER_IMMAT_WSDL)
public class CmGetStatusDossierImmatriculationService
    extends Service
{

    private final static URL CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_EXCEPTION;
    private final static QName CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/Cm-GetStatusDossierImmatriculation", "Cm-GetStatusDossierImmatriculationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL( PortailConstant.STATUT_DOSSIER_IMMAT_WSDL);
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_WSDL_LOCATION = url;
        CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_EXCEPTION = e;
    }

    public CmGetStatusDossierImmatriculationService() {
        super(__getWsdlLocation(), CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_QNAME);
    }

    public CmGetStatusDossierImmatriculationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_QNAME, features);
    }

    public CmGetStatusDossierImmatriculationService(URL wsdlLocation) {
        super(wsdlLocation, CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_QNAME);
    }

    public CmGetStatusDossierImmatriculationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_QNAME, features);
    }

    public CmGetStatusDossierImmatriculationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CmGetStatusDossierImmatriculationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CmGetStatusDossierImmatriculationPortType
     */
    @WebEndpoint(name = "Cm-GetStatusDossierImmatriculationPort")
    public CmGetStatusDossierImmatriculationPortType getCmGetStatusDossierImmatriculationPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/Cm-GetStatusDossierImmatriculation", "Cm-GetStatusDossierImmatriculationPort"), CmGetStatusDossierImmatriculationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CmGetStatusDossierImmatriculationPortType
     */
    @WebEndpoint(name = "Cm-GetStatusDossierImmatriculationPort")
    public CmGetStatusDossierImmatriculationPortType getCmGetStatusDossierImmatriculationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/Cm-GetStatusDossierImmatriculation", "Cm-GetStatusDossierImmatriculationPort"), CmGetStatusDossierImmatriculationPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_EXCEPTION!= null) {
            throw CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_EXCEPTION;
        }
        return CMGETSTATUSDOSSIERIMMATRICULATIONSERVICE_WSDL_LOCATION;
    }

}
