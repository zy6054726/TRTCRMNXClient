/**
 * AccountHandleServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package trt_ws.AccountHandleService;

public interface AccountHandleServicePortType extends java.rmi.Remote {
    public java.lang.String modifyAccount(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public java.lang.String addAccount(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public java.lang.String disableAccount(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String enableAccount(java.lang.String in0) throws java.rmi.RemoteException;
}
