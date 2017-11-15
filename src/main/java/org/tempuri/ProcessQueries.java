
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
 *         &lt;element name="iClassQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eClassQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "iClassQuery",
    "eClassQuery"
})
@XmlRootElement(name = "ProcessQueries")
public class ProcessQueries {

    protected String iClassQuery;
    protected String eClassQuery;

    /**
     * Gets the value of the iClassQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIClassQuery() {
        return iClassQuery;
    }

    /**
     * Sets the value of the iClassQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIClassQuery(String value) {
        this.iClassQuery = value;
    }

    /**
     * Gets the value of the eClassQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEClassQuery() {
        return eClassQuery;
    }

    /**
     * Sets the value of the eClassQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEClassQuery(String value) {
        this.eClassQuery = value;
    }

}
