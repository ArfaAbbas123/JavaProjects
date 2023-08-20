package com.greet.ws;

public class GreetServiceImplProxy implements com.greet.ws.GreetServiceImpl {
  private String _endpoint = null;
  private com.greet.ws.GreetServiceImpl greetServiceImpl = null;
  
  public GreetServiceImplProxy() {
    _initGreetServiceImplProxy();
  }
  
  public GreetServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initGreetServiceImplProxy();
  }
  
  private void _initGreetServiceImplProxy() {
    try {
      greetServiceImpl = (new com.greet.ws.GreetServiceImplServiceLocator()).getGreetServiceImpl();
      if (greetServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)greetServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)greetServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (greetServiceImpl != null)
      ((javax.xml.rpc.Stub)greetServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.greet.ws.GreetServiceImpl getGreetServiceImpl() {
    if (greetServiceImpl == null)
      _initGreetServiceImplProxy();
    return greetServiceImpl;
  }
  
  public java.lang.String welcomeUser(java.lang.String name) throws java.rmi.RemoteException{
    if (greetServiceImpl == null)
      _initGreetServiceImplProxy();
    return greetServiceImpl.welcomeUser(name);
  }
  
  
}