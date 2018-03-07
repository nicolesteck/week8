/**
 * UnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.noaa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

public class UnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _e = "e";
    public static final java.lang.String _m = "m";
    public static final UnitType e = new UnitType(_e);
    public static final UnitType m = new UnitType(_m);
    public java.lang.String getValue() { return _value_;}
    public static UnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UnitType enumeration = (UnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UnitType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://graphical.weather.gov/xml/DWMLgen/schema/DWML.xsd", "unitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * This object contains factory methods for each
     * Java content interface and Java element interface
     * generated in the gov.noaa package.
     * <p>An ObjectFactory allows you to programatically
     * construct new instances of the Java representation
     * for XML content. The Java representation of XML
     * content can consist of schema derived interfaces
     * and classes representing the binding of schema
     * type definitions, element declarations and model
     * groups.  Factory methods for each of these are
     * provided in this class.
     *
     */
    @XmlRegistry
    public static class ObjectFactory {

        private final static QName _Dwml_QNAME = new QName("", "dwml");

        /**
         * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.noaa
         *
         */
        public ObjectFactory() {
        }

        /**
         * Create an instance of {@link DwmlType }
         *
         */
        public DwmlType createDwmlType() {
            return new DwmlType();
        }

        /**
         * Create an instance of {@link JAXBElement }{@code <}{@link DwmlType }{@code >}}
         *
         */
        @XmlElementDecl(namespace = "", name = "dwml")
        public JAXBElement<DwmlType> createDwml(DwmlType value) {
            return new JAXBElement<DwmlType>(_Dwml_QNAME, DwmlType.class, null, value);
        }

    }
}
