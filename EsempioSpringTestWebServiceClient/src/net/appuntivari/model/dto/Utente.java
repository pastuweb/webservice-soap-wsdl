/**
 * Utente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.appuntivari.model.dto;

public class Utente  implements java.io.Serializable {
    private java.lang.String password;

    private net.appuntivari.model.dto.Persona persona;

    private java.lang.String profilo;

    private java.lang.String username;

    public Utente() {
    }

    public Utente(
           java.lang.String password,
           net.appuntivari.model.dto.Persona persona,
           java.lang.String profilo,
           java.lang.String username) {
           this.password = password;
           this.persona = persona;
           this.profilo = profilo;
           this.username = username;
    }


    /**
     * Gets the password value for this Utente.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Utente.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the persona value for this Utente.
     * 
     * @return persona
     */
    public net.appuntivari.model.dto.Persona getPersona() {
        return persona;
    }


    /**
     * Sets the persona value for this Utente.
     * 
     * @param persona
     */
    public void setPersona(net.appuntivari.model.dto.Persona persona) {
        this.persona = persona;
    }


    /**
     * Gets the profilo value for this Utente.
     * 
     * @return profilo
     */
    public java.lang.String getProfilo() {
        return profilo;
    }


    /**
     * Sets the profilo value for this Utente.
     * 
     * @param profilo
     */
    public void setProfilo(java.lang.String profilo) {
        this.profilo = profilo;
    }


    /**
     * Gets the username value for this Utente.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Utente.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Utente)) return false;
        Utente other = (Utente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.persona==null && other.getPersona()==null) || 
             (this.persona!=null &&
              this.persona.equals(other.getPersona()))) &&
            ((this.profilo==null && other.getProfilo()==null) || 
             (this.profilo!=null &&
              this.profilo.equals(other.getProfilo()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPersona() != null) {
            _hashCode += getPersona().hashCode();
        }
        if (getProfilo() != null) {
            _hashCode += getProfilo().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Utente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.model.appuntivari", "Utente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.model.appuntivari", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.model.appuntivari", "persona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.model.appuntivari", "Persona"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.model.appuntivari", "profilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.model.appuntivari", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
