
package com.secusociale.portail.service.soap.maintientAffiliation;

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
@WebService(name = "MAINT-AFF_INBOUNDPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MAINTAFFINBOUNDPortType {


    /**
     * 
     * @param body
     * @throws MAINTAFFINBOUNDFault
     */
    @WebMethod(operationName = "MAINT-AFF_INBOUND", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/MAINT-AFF_INBOUND")
    public void maintAFFINBOUND(
        @WebParam(name = "MAINT-AFF_INBOUND", targetNamespace = "http://oracle.com/MAINT-AFF_INBOUND.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<MAINTAFFINBOUND> body)
        throws MAINTAFFINBOUNDFault
    ;

}
