package net.appuntivari.webservice;

public class WebserviceSOAPPortTypeProxy implements net.appuntivari.webservice.WebserviceSOAPPortType {
  private String _endpoint = null;
  private net.appuntivari.webservice.WebserviceSOAPPortType webserviceSOAPPortType = null;
  
  public WebserviceSOAPPortTypeProxy() {
    _initWebserviceSOAPPortTypeProxy();
  }
  
  public WebserviceSOAPPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebserviceSOAPPortTypeProxy();
  }
  
  private void _initWebserviceSOAPPortTypeProxy() {
    try {
      webserviceSOAPPortType = (new net.appuntivari.webservice.WebserviceSOAPLocator()).getwebserviceSOAPHttpPort();
      if (webserviceSOAPPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webserviceSOAPPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webserviceSOAPPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webserviceSOAPPortType != null)
      ((javax.xml.rpc.Stub)webserviceSOAPPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.appuntivari.webservice.WebserviceSOAPPortType getWebserviceSOAPPortType() {
    if (webserviceSOAPPortType == null)
      _initWebserviceSOAPPortTypeProxy();
    return webserviceSOAPPortType;
  }
  
  public net.appuntivari.model.dto.Persona[] getListaPersone() throws java.rmi.RemoteException{
    if (webserviceSOAPPortType == null)
      _initWebserviceSOAPPortTypeProxy();
    return webserviceSOAPPortType.getListaPersone();
  }
  
  public net.appuntivari.model.dto.Persona getPersona() throws java.rmi.RemoteException{
    if (webserviceSOAPPortType == null)
      _initWebserviceSOAPPortTypeProxy();
    return webserviceSOAPPortType.getPersona();
  }
  
  public java.lang.String getTime() throws java.rmi.RemoteException{
    if (webserviceSOAPPortType == null)
      _initWebserviceSOAPPortTypeProxy();
    return webserviceSOAPPortType.getTime();
  }
  
  public void createUtente(net.appuntivari.model.dto.Utente in0) throws java.rmi.RemoteException{
    if (webserviceSOAPPortType == null)
      _initWebserviceSOAPPortTypeProxy();
    webserviceSOAPPortType.createUtente(in0);
  }
  
  
}