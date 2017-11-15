
package ca932631;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="SubmitXMLResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="m_responseState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="m_errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "submitXMLResult",
    "mResponseState",
    "mErrorMessage"
})
@XmlRootElement(name = "SubmitXMLResponse")
public class SubmitXMLResponse {

    @XmlElement(name = "SubmitXMLResult")
    protected String submitXMLResult;
    @XmlElement(name = "m_responseState")
    protected int mResponseState;
    @XmlElement(name = "m_errorMessage")
    protected String mErrorMessage;

    /**
     * Gets the value of the submitXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitXMLResult() {
        return submitXMLResult;
    }

    /**
     * Sets the value of the submitXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitXMLResult(String value) {
        this.submitXMLResult = value;
    }

    /**
     * Gets the value of the mResponseState property.
     * 
     */
    public int getMResponseState() {
        return mResponseState;
    }

    /**
     * Sets the value of the mResponseState property.
     * 
     */
    public void setMResponseState(int value) {
        this.mResponseState = value;
    }

    /**
     * Gets the value of the mErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMErrorMessage() {
        return mErrorMessage;
    }

    /**
     * Sets the value of the mErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMErrorMessage(String value) {
        this.mErrorMessage = value;
    }

}
