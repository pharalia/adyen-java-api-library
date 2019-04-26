
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing content to authenticate -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains: the type of the encapsulated content, which is id-data for an application data or another CMS data structure the data to authenticate
 *
 * <p>Java class for EncapsulatedContent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EncapsulatedContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{}Content" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContentType" use="required" type="{}ContentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncapsulatedContent", propOrder = {
    "content"
})
public class EncapsulatedContent {

    @XmlElement(name = "Content")
    protected byte[] content;
    @XmlAttribute(name = "ContentType", required = true)
    protected ContentType contentType;

    /**
     * Gets the value of the content property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentType property.
     *
     * @return
     *     possible object is
     *     {@link ContentType }
     *
     */
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     *
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

}