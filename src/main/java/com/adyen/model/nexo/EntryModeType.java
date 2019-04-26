
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryModeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RFID"/>
 *     &lt;enumeration value="Keyed"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="Scanned"/>
 *     &lt;enumeration value="MagStripe"/>
 *     &lt;enumeration value="ICC"/>
 *     &lt;enumeration value="SynchronousICC"/>
 *     &lt;enumeration value="Tapped"/>
 *     &lt;enumeration value="Contactless"/>
 *     &lt;enumeration value="Mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "EntryModeType")
@XmlEnum
public enum EntryModeType {


    /**
     * Payment instrument information are taken from RFID
     *
     */
    RFID("RFID"),

    /**
     * Manual key entry
     *
     */
    @XmlEnumValue("Keyed")
    KEYED("Keyed"),

    /**
     * Reading of embossing or OCR of printed data either at time of transaction or after the event.
     *
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Account data on file
     *
     */
    @XmlEnumValue("File")
    FILE("File"),

    /**
     * Scanned by a bar code reader.
     *
     */
    @XmlEnumValue("Scanned")
    SCANNED("Scanned"),

    /**
     * Magnetic stripe  card reader.
     *
     */
    @XmlEnumValue("MagStripe")
    MAG_STRIPE("MagStripe"),

    /**
     * Contact ICC (asynchronous)
     *
     */
    ICC("ICC"),

    /**
     * Contact ICC (synchronous)
     *
     */
    @XmlEnumValue("SynchronousICC")
    SYNCHRONOUS_ICC("SynchronousICC"),

    /**
     * Contactless card reader Magnetic Stripe
     *
     */
    @XmlEnumValue("Tapped")
    TAPPED("Tapped"),

    /**
     * Contactless card reader conform to ISO 14443
     *
     */
    @XmlEnumValue("Contactless")
    CONTACTLESS("Contactless"),

    /**
     * Mobile phone.
     *
     */
    @XmlEnumValue("Mobile")
    MOBILE("Mobile");
    private final String value;

    EntryModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryModeType fromValue(String v) {
        for (EntryModeType c: EntryModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}