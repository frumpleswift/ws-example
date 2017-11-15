
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iClassQueryResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eClassQueryResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iClassQueryResponse",
    "eClassQueryResponse"
})
@XmlRootElement(name = "ProcessQueriesResponse")
public class ProcessQueriesResponse {

    protected String iClassQueryResponse;
    protected String eClassQueryResponse;

    /**
     * Gets the value of the iClassQueryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIClassQueryResponse() {
        return iClassQueryResponse;
    }

    /**
     * Sets the value of the iClassQueryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIClassQueryResponse(String value) {
        this.iClassQueryResponse = value;
    }

    /**
     * Gets the value of the eClassQueryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEClassQueryResponse() {
        return eClassQueryResponse;
    }

    /**
     * Sets the value of the eClassQueryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEClassQueryResponse(String value) {
        this.eClassQueryResponse = value;
    }

}
