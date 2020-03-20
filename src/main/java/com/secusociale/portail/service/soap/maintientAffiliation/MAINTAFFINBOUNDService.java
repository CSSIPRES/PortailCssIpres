
package com.secusociale.portail.service.soap.maintientAffiliation;

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
 * MAINT-AFF_INBOUND version 4: Maintain Affliation
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MAINT-AFF_INBOUNDService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND", wsdlLocation = PortailConstant.MAINT_AFF_WSDL)
public class MAINTAFFINBOUNDService
    extends Service
{

    private final static URL MAINTAFFINBOUNDSERVICE_WSDL_LOCATION;
    private final static WebServiceException MAINTAFFINBOUNDSERVICE_EXCEPTION;
    private final static QName MAINTAFFINBOUNDSERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND", "MAINT-AFF_INBOUNDService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(PortailConstant.MAINT_AFF_WSDL);
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MAINTAFFINBOUNDSERVICE_WSDL_LOCATION = url;
        MAINTAFFINBOUNDSERVICE_EXCEPTION = e;
    }

    public MAINTAFFINBOUNDService() {
        super(__getWsdlLocation(), MAINTAFFINBOUNDSERVICE_QNAME);
    }

    public MAINTAFFINBOUNDService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAINTAFFINBOUNDSERVICE_QNAME, features);
    }

    public MAINTAFFINBOUNDService(URL wsdlLocation) {
        super(wsdlLocation, MAINTAFFINBOUNDSERVICE_QNAME);
    }

    public MAINTAFFINBOUNDService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAINTAFFINBOUNDSERVICE_QNAME, features);
    }

    public MAINTAFFINBOUNDService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MAINTAFFINBOUNDService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MAINTAFFINBOUNDPortType
     */
    @WebEndpoint(name = "MAINT-AFF_INBOUNDPort")
    public MAINTAFFINBOUNDPortType getMAINTAFFINBOUNDPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND", "MAINT-AFF_INBOUNDPort"), MAINTAFFINBOUNDPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MAINTAFFINBOUNDPortType
     */
    @WebEndpoint(name = "MAINT-AFF_INBOUNDPort")
    public MAINTAFFINBOUNDPortType getMAINTAFFINBOUNDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND", "MAINT-AFF_INBOUNDPort"), MAINTAFFINBOUNDPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAINTAFFINBOUNDSERVICE_EXCEPTION!= null) {
            throw MAINTAFFINBOUNDSERVICE_EXCEPTION;
        }
        return MAINTAFFINBOUNDSERVICE_WSDL_LOCATION;
    }

}