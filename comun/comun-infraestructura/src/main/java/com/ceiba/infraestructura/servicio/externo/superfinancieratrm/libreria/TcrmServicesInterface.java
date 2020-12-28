
package com.ceiba.infraestructura.servicio.externo.superfinancieratrm.libreria;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TcrmServicesInterface", targetNamespace = "http://action.trm.services.generic.action.superfinanciera.nexura.sc.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TcrmServicesInterface {


    /**
     * 
     * @param tcrmQueryAssociatedDate
     * @return
     *     returns com.ceiba.infraestructura.servicio.externo.superfinancieratrm.libreria.TcrmResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryTCRM", targetNamespace = "http://action.trm.services.generic.action.superfinanciera.nexura.sc.com.co/", className = "com.ceiba.infraestructura.servicio.externo.superfinancieratrm.libreria.QueryTCRM")
    @ResponseWrapper(localName = "queryTCRMResponse", targetNamespace = "http://action.trm.services.generic.action.superfinanciera.nexura.sc.com.co/", className = "com.ceiba.infraestructura.servicio.externo.superfinancieratrm.libreria.QueryTCRMResponse")
    public TcrmResponse queryTCRM(
        @WebParam(name = "tcrmQueryAssociatedDate", targetNamespace = "")
        String tcrmQueryAssociatedDate);

}