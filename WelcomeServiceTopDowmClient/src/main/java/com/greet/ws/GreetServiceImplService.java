/**
 * GreetServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greet.ws;

public interface GreetServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getGreetServiceImplAddress();

    public com.greet.ws.GreetServiceImpl getGreetServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.greet.ws.GreetServiceImpl getGreetServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
