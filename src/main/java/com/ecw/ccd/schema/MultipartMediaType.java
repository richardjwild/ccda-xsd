//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.20 at 02:39:52 PM BST 
//


package com.ecw.ccd.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipartMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipartMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="multipart/x-hl7-cda-level1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultipartMediaType")
@XmlEnum
public enum MultipartMediaType {

    @XmlEnumValue("multipart/x-hl7-cda-level1")
    MULTIPART_X_HL_7_CDA_LEVEL_1("multipart/x-hl7-cda-level1");
    private final String value;

    MultipartMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultipartMediaType fromValue(String v) {
        for (MultipartMediaType c: MultipartMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
