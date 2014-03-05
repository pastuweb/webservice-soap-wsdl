/**
 * WebserviceSOAPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.appuntivari.webservice;

public class WebserviceSOAPLocator extends org.apache.axis.client.Service implements net.appuntivari.webservice.WebserviceSOAP {

    public WebserviceSOAPLocator() {
    }


    public WebserviceSOAPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebserviceSOAPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for webserviceSOAPHttpPort
    private java.lang.String webserviceSOAPHttpPort_address = "http://localhost:8080/SpringTestWebService/xfire/SimpleWebService";

    public java.lang.String getwebserviceSOAPHttpPortAddress() {
        return webserviceSOAPHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String webserviceSOAPHttpPortWSDDServiceName = "webserviceSOAPHttpPort";

    public java.lang.String getwebserviceSOAPHttpPortWSDDServiceName() {
        return webserviceSOAPHttpPortWSDDServiceName;
    }

    public void setwebserviceSOAPHttpPortWSDDServiceName(java.lang.String name) {
        webserviceSOAPHttpPortWSDDServiceName = name;
    }

    public net.appuntivari.webservice.WebserviceSOAPPortType getwebserviceSOAPHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(webserviceSOAPHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwebserviceSOAPHttpPort(endpoint);
    }

    public net.appuntivari.webservice.WebserviceSOAPPortType getwebserviceSOAPHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.appuntivari.webservice.WebserviceSOAPHttpBindingStub _stub = new net.appuntivari.webservice.WebserviceSOAPHttpBindingStub(portAddress, this);
            _stub.setPortName(getwebserviceSOAPHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwebserviceSOAPHttpPortEndpointAddress(java.lang.String address) {
        webserviceSOAPHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.appuntivari.webservice.WebserviceSOAPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.appuntivari.webservice.WebserviceSOAPHttpBindingStub _stub = new net.appuntivari.webservice.WebserviceSOAPHttpBindingStub(new java.net.URL(webserviceSOAPHttpPort_address), this);
                _stub.setPortName(getwebserviceSOAPHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("webserviceSOAPHttpPort".equals(inputPortName)) {
            return getwebserviceSOAPHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.appuntivari", "webserviceSOAP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.appuntivari", "webserviceSOAPHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("webserviceSOAPHttpPort".equals(portName)) {
            setwebserviceSOAPHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
