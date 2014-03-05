/**
 * WebserviceSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.appuntivari.webservice;

public interface WebserviceSOAP extends javax.xml.rpc.Service {
    public java.lang.String getwebserviceSOAPHttpPortAddress();

    public net.appuntivari.webservice.WebserviceSOAPPortType getwebserviceSOAPHttpPort() throws javax.xml.rpc.ServiceException;

    public net.appuntivari.webservice.WebserviceSOAPPortType getwebserviceSOAPHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
