/**
 * WebserviceSOAPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.appuntivari.webservice;

public interface WebserviceSOAPPortType extends java.rmi.Remote {
    public net.appuntivari.model.dto.Persona[] getListaPersone() throws java.rmi.RemoteException;
    public net.appuntivari.model.dto.Persona getPersona() throws java.rmi.RemoteException;
    public java.lang.String getTime() throws java.rmi.RemoteException;
    public void createUtente(net.appuntivari.model.dto.Utente in0) throws java.rmi.RemoteException;
}
