package com.tw;

public class WebServiceProxy implements com.tw.WebService {
  private String _endpoint = null;
  private com.tw.WebService webService = null;
  
  public WebServiceProxy() {
    _initWebServiceProxy();
  }
  
  public WebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceProxy();
  }
  
  private void _initWebServiceProxy() {
    try {
      webService = (new com.tw.WebServiceServiceLocator()).getWebService();
      if (webService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService != null)
      ((javax.xml.rpc.Stub)webService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tw.WebService getWebService() {
    if (webService == null)
      _initWebServiceProxy();
    return webService;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (webService == null)
      _initWebServiceProxy();
    return webService.helloWorld();
  }
  
  
}