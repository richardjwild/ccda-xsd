//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.20 at 02:39:52 PM BST 
//


package com.ecw.ccd.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationVerifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationVerifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VRF"/>
 *     &lt;enumeration value="AUTHEN"/>
 *     &lt;enumeration value="LA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationVerifier")
@XmlEnum
public enum ParticipationVerifier {

    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationVerifier fromValue(String v) {
        return valueOf(v);
    }

}
