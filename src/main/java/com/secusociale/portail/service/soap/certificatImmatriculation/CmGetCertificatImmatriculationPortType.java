
package com.secusociale.portail.service.soap.certificatImmatriculation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CmGetCertificatImmatriculationPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetCertificatImmatriculation")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CmGetCertificatImmatriculationPortType {


    /**
     * 
     * @param body
     * @throws CmGetCertificatImmatriculationFault
     */
    @WebMethod(operationName = "CmGetCertificatImmatriculation", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetCertificatImmatriculation")
    public void cmGetCertificatImmatriculation(
        @WebParam(name = "CmGetCertificatImmatriculation", targetNamespace = "http://oracle.com/CmGetCertificatImmatriculation.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CmGetCertificatImmatriculation> body)
        throws CmGetCertificatImmatriculationFault
    ;

}
