//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.05 at 01:50:07 AM WIB 
//


package com.oracle.external.services.sampleservice.response.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.external.services.sampleservice.response.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Sampleservicers_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/response/v1.0", "sampleservicers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.external.services.sampleservice.response.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SampleServiceResponseType }
     * 
     */
    public SampleServiceResponseType createSampleServiceResponseType() {
        return new SampleServiceResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleServiceResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SampleServiceResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", name = "sampleservicers")
    public JAXBElement<SampleServiceResponseType> createSampleservicers(SampleServiceResponseType value) {
        return new JAXBElement<SampleServiceResponseType>(_Sampleservicers_QNAME, SampleServiceResponseType.class, null, value);
    }

}
