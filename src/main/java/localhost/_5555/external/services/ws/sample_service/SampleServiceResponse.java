//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.05 at 01:50:07 AM WIB 
//


package localhost._5555.external.services.ws.sample_service;

import com.oracle.external.services.sampleservice.response.v1.SampleServiceResponseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SampleServiceResponseType" type="{http://www.oracle.com/external/services/sampleservice/response/v1.0}SampleServiceResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sampleServiceResponseType"
})
@XmlRootElement(name = "SampleServiceResponse")
public class SampleServiceResponse {

    @XmlElement(name = "SampleServiceResponseType", required = true)
    protected SampleServiceResponseType sampleServiceResponseType;

    /**
     * Gets the value of the sampleServiceResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link SampleServiceResponseType }
     *     
     */
    public SampleServiceResponseType getSampleServiceResponseType() {
        return sampleServiceResponseType;
    }

    /**
     * Sets the value of the sampleServiceResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleServiceResponseType }
     *     
     */
    public void setSampleServiceResponseType(SampleServiceResponseType value) {
        this.sampleServiceResponseType = value;
    }

}
