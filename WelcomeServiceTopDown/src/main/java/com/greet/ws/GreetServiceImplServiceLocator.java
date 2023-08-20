/**
 * GreetServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greet.ws;

public class GreetServiceImplServiceLocator extends org.apache.axis.client.Service implements com.greet.ws.GreetServiceImplService {

    public GreetServiceImplServiceLocator() {
    }


    public GreetServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GreetServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GreetServiceImpl
    private java.lang.String GreetServiceImpl_address = "http://localhost:8081/GreetWSDLWeb/services/GreetServiceImpl";

    public java.lang.String getGreetServiceImplAddress() {
        return GreetServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GreetServiceImplWSDDServiceName = "GreetServiceImpl";

    public java.lang.String getGreetServiceImplWSDDServiceName() {
        return GreetServiceImplWSDDServiceName;
    }

    public void setGreetServiceImplWSDDServiceName(java.lang.String name) {
        GreetServiceImplWSDDServiceName = name;
    }

    public com.greet.ws.GreetServiceImpl getGreetServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GreetServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGreetServiceImpl(endpoint);
    }

    public com.greet.ws.GreetServiceImpl getGreetServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.greet.ws.GreetServiceImplSoapBindingStub _stub = new com.greet.ws.GreetServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getGreetServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGreetServiceImplEndpointAddress(java.lang.String address) {
        GreetServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.greet.ws.GreetServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.greet.ws.GreetServiceImplSoapBindingStub _stub = new com.greet.ws.GreetServiceImplSoapBindingStub(new java.net.URL(GreetServiceImpl_address), this);
                _stub.setPortName(getGreetServiceImplWSDDServiceName());
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
        if ("GreetServiceImpl".equals(inputPortName)) {
            return getGreetServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.greet.com", "GreetServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.greet.com", "GreetServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GreetServiceImpl".equals(portName)) {
            setGreetServiceImplEndpointAddress(address);
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
