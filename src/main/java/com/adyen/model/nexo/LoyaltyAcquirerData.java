
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Data related to the loyalty Acquirer during a loyalty transaction. -- Usage: Information allowing the Sale System to characterise the transaction on the loyalty Acquirer host.
 *
 * <p>Java class for LoyaltyAcquirerData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAcquirerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalCode" type="{}ApprovalCode" minOccurs="0"/>
 *         &lt;element name="LoyaltyTransactionID" type="{}TransactionIdentification" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyaltyAcquirerID" type="{}LoyaltyAcquirerID" />
 *       &lt;attribute name="HostReconciliationID" type="{}HostReconciliationID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyAcquirerData", propOrder = {
    "approvalCode",
    "loyaltyTransactionID"
})
public class LoyaltyAcquirerData {

    @XmlElement(name = "ApprovalCode")
    protected String approvalCode;
    @XmlElement(name = "LoyaltyTransactionID")
    protected TransactionIdentification loyaltyTransactionID;
    @XmlAttribute(name = "LoyaltyAcquirerID")
    protected String loyaltyAcquirerID;
    @XmlAttribute(name = "HostReconciliationID")
    protected String hostReconciliationID;

    /**
     * Gets the value of the approvalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the loyaltyTransactionID property.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentification }
     *
     */
    public TransactionIdentification getLoyaltyTransactionID() {
        return loyaltyTransactionID;
    }

    /**
     * Sets the value of the loyaltyTransactionID property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification }
     *
     */
    public void setLoyaltyTransactionID(TransactionIdentification value) {
        this.loyaltyTransactionID = value;
    }

    /**
     * Gets the value of the loyaltyAcquirerID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyAcquirerID() {
        return loyaltyAcquirerID;
    }

    /**
     * Sets the value of the loyaltyAcquirerID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyAcquirerID(String value) {
        this.loyaltyAcquirerID = value;
    }

    /**
     * Gets the value of the hostReconciliationID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHostReconciliationID() {
        return hostReconciliationID;
    }

    /**
     * Sets the value of the hostReconciliationID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHostReconciliationID(String value) {
        this.hostReconciliationID = value;
    }

}