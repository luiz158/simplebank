//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.01 at 04:14:02 PM BRST 
//


package br.fatea.simplebank.soap.payment.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPENED"/>
 *     &lt;enumeration value="PAID_NOT_CONFIRMED"/>
 *     &lt;enumeration value="PAID_CONFIRMED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentStatus")
@XmlEnum
public enum PaymentStatus {

    OPENED,
    PAID_NOT_CONFIRMED,
    PAID_CONFIRMED,
    REVERSED,
    CANCELED;

    public String value() {
        return name();
    }

    public static PaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
