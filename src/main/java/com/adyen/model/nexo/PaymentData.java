
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Data related to the payment transaction. -- Usage: Elements requested by the Sale System that are related to the payment only.
 *
 * <p>Java class for PaymentData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardAcquisitionReference" type="{}TransactionIdentification" minOccurs="0"/>
 *         &lt;element name="RequestedValidityDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="Instalment" type="{}Instalment" minOccurs="0"/>
 *         &lt;element name="CustomerOrder" type="{}CustomerOrder" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Payment" type="{}PaymentType" default="Normal" />
 *       &lt;attribute name="SplitPaymentFlag" type="{}SplitPaymentFlag" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentData", propOrder = {
    "cardAcquisitionReference",
    "requestedValidityDate",
    "instalment",
    "customerOrder",
    "paymentInstrumentData"
})
public class PaymentData {

    @XmlElement(name = "CardAcquisitionReference")
    protected TransactionIdentification cardAcquisitionReference;
    @XmlElement(name = "RequestedValidityDate")
    protected String requestedValidityDate;
    @XmlElement(name = "Instalment")
    protected Instalment instalment;
    @XmlElement(name = "CustomerOrder")
    protected CustomerOrder customerOrder;
    @XmlElement(name = "PaymentInstrumentData")
    protected PaymentInstrumentData paymentInstrumentData;
    @XmlAttribute(name = "Payment")
    protected PaymentType payment;
    @XmlAttribute(name = "SplitPaymentFlag")
    protected Boolean splitPaymentFlag;

    /**
     * Gets the value of the cardAcquisitionReference property.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentification }
     *
     */
    public TransactionIdentification getCardAcquisitionReference() {
        return cardAcquisitionReference;
    }

    /**
     * Sets the value of the cardAcquisitionReference property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification }
     *
     */
    public void setCardAcquisitionReference(TransactionIdentification value) {
        this.cardAcquisitionReference = value;
    }

    /**
     * Gets the value of the requestedValidityDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestedValidityDate() {
        return requestedValidityDate;
    }

    /**
     * Sets the value of the requestedValidityDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestedValidityDate(String value) {
        this.requestedValidityDate = value;
    }

    /**
     * Gets the value of the instalment property.
     *
     * @return
     *     possible object is
     *     {@link Instalment }
     *
     */
    public Instalment getInstalment() {
        return instalment;
    }

    /**
     * Sets the value of the instalment property.
     *
     * @param value
     *     allowed object is
     *     {@link Instalment }
     *
     */
    public void setInstalment(Instalment value) {
        this.instalment = value;
    }

    /**
     * Gets the value of the customerOrder property.
     *
     * @return
     *     possible object is
     *     {@link CustomerOrder }
     *
     */
    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    /**
     * Sets the value of the customerOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerOrder }
     *
     */
    public void setCustomerOrder(CustomerOrder value) {
        this.customerOrder = value;
    }

    /**
     * Gets the value of the paymentInstrumentData property.
     *
     * @return
     *     possible object is
     *     {@link PaymentInstrumentData }
     *
     */
    public PaymentInstrumentData getPaymentInstrumentData() {
        return paymentInstrumentData;
    }

    /**
     * Sets the value of the paymentInstrumentData property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentData }
     *
     */
    public void setPaymentInstrumentData(PaymentInstrumentData value) {
        this.paymentInstrumentData = value;
    }

    /**
     * Gets the value of the payment property.
     *
     * @return
     *     possible object is
     *     {@link PaymentType }
     *
     */
    public PaymentType getPayment() {
        if (payment == null) {
            return PaymentType.NORMAL;
        } else {
            return payment;
        }
    }

    /**
     * Sets the value of the payment property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the splitPaymentFlag property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isSplitPaymentFlag() {
        if (splitPaymentFlag == null) {
            return false;
        } else {
            return splitPaymentFlag;
        }
    }

    /**
     * Sets the value of the splitPaymentFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSplitPaymentFlag(Boolean value) {
        this.splitPaymentFlag = value;
    }

}