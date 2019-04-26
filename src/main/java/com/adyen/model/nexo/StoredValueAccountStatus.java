
package com.adyen.model.nexo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Data related to the result of the stored value card transaction. -- Usage: It contains: - the identification of the stored value accounts or the stored value cards  - the identification of the transaction by the stored value host - the balance of the stored value account if relevant
 *
 * <p>Java class for StoredValueAccountStatus complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StoredValueAccountStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredValueAccountID" type="{}StoredValueAccountID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrentBalance" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueAccountStatus", propOrder = {
    "storedValueAccountID"
})
public class StoredValueAccountStatus {

    @XmlElement(name = "StoredValueAccountID", required = true)
    protected StoredValueAccountID storedValueAccountID;
    @XmlAttribute(name = "CurrentBalance")
    protected BigDecimal currentBalance;

    /**
     * Gets the value of the storedValueAccountID property.
     *
     * @return
     *     possible object is
     *     {@link StoredValueAccountID }
     *
     */
    public StoredValueAccountID getStoredValueAccountID() {
        return storedValueAccountID;
    }

    /**
     * Sets the value of the storedValueAccountID property.
     *
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountID }
     *
     */
    public void setStoredValueAccountID(StoredValueAccountID value) {
        this.storedValueAccountID = value;
    }

    /**
     * Gets the value of the currentBalance property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

}