
package com.adyen.model.nexo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing signed data  -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v1 in EPAS protocol context)  the identifiers of the message digest algorithms  the encapsulated content  the certificates for the verification of the signature
 *
 * <p>Java class for SignedData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SignedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigestAlgorithm" type="{}AlgorithmIdentifier" maxOccurs="unbounded"/>
 *         &lt;element name="EncapsulatedContent" type="{}EncapsulatedContent"/>
 *         &lt;element name="Certificate" type="{}Certificate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Signer" type="{}Signer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionType" default="v1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedData", propOrder = {
    "digestAlgorithm",
    "encapsulatedContent",
    "certificate",
    "signer"
})
public class SignedData {

    @XmlElement(name = "DigestAlgorithm", required = true)
    protected List<AlgorithmIdentifier> digestAlgorithm;
    @XmlElement(name = "EncapsulatedContent", required = true)
    protected EncapsulatedContent encapsulatedContent;
    @XmlElement(name = "Certificate")
    protected List<byte[]> certificate;
    @XmlElement(name = "Signer", required = true)
    protected List<Signer> signer;
    @XmlAttribute(name = "Version")
    protected VersionType version;

    /**
     * Gets the value of the digestAlgorithm property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digestAlgorithm property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigestAlgorithm().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentifier }
     *
     *
     */
    public List<AlgorithmIdentifier> getDigestAlgorithm() {
        if (digestAlgorithm == null) {
            digestAlgorithm = new ArrayList<AlgorithmIdentifier>();
        }
        return this.digestAlgorithm;
    }

    /**
     * Gets the value of the encapsulatedContent property.
     *
     * @return
     *     possible object is
     *     {@link EncapsulatedContent }
     *
     */
    public EncapsulatedContent getEncapsulatedContent() {
        return encapsulatedContent;
    }

    /**
     * Sets the value of the encapsulatedContent property.
     *
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent }
     *
     */
    public void setEncapsulatedContent(EncapsulatedContent value) {
        this.encapsulatedContent = value;
    }

    /**
     * Gets the value of the certificate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     *
     */
    public List<byte[]> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<byte[]>();
        }
        return this.certificate;
    }

    /**
     * Gets the value of the signer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigner().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signer }
     *
     *
     */
    public List<Signer> getSigner() {
        if (signer == null) {
            signer = new ArrayList<Signer>();
        }
        return this.signer;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link VersionType }
     *
     */
    public VersionType getVersion() {
        if (version == null) {
            return VersionType.V_1;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

}