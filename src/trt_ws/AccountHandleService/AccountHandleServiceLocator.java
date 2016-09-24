/**
 * AccountHandleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package trt_ws.AccountHandleService;

public class AccountHandleServiceLocator extends org.apache.axis.client.Service implements trt_ws.AccountHandleService.AccountHandleService {

    public AccountHandleServiceLocator() {
    }


    public AccountHandleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountHandleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)  throws javax.xml.rpc.ServiceException{
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountHandleServiceHttpPort
    private java.lang.String AccountHandleServiceHttpPort_address = "http://10.8.147.169/services/AccountHandleService";

    public java.lang.String getAccountHandleServiceHttpPortAddress() {
        return AccountHandleServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountHandleServiceHttpPortWSDDServiceName = "AccountHandleServiceHttpPort";

    public java.lang.String getAccountHandleServiceHttpPortWSDDServiceName() {
        return AccountHandleServiceHttpPortWSDDServiceName;
    }

    public void setAccountHandleServiceHttpPortWSDDServiceName(java.lang.String name) {
        AccountHandleServiceHttpPortWSDDServiceName = name;
    }

    public trt_ws.AccountHandleService.AccountHandleServicePortType getAccountHandleServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountHandleServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountHandleServiceHttpPort(endpoint);
    }

    public trt_ws.AccountHandleService.AccountHandleServicePortType getAccountHandleServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            trt_ws.AccountHandleService.AccountHandleServiceHttpBindingStub _stub = new trt_ws.AccountHandleService.AccountHandleServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getAccountHandleServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountHandleServiceHttpPortEndpointAddress(java.lang.String address) {
        AccountHandleServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (trt_ws.AccountHandleService.AccountHandleServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                trt_ws.AccountHandleService.AccountHandleServiceHttpBindingStub _stub = new trt_ws.AccountHandleService.AccountHandleServiceHttpBindingStub(new java.net.URL(AccountHandleServiceHttpPort_address), this);
                _stub.setPortName(getAccountHandleServiceHttpPortWSDDServiceName());
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
        if ("AccountHandleServiceHttpPort".equals(inputPortName)) {
            return getAccountHandleServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://trt_ws/AccountHandleService", "AccountHandleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://trt_ws/AccountHandleService", "AccountHandleServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountHandleServiceHttpPort".equals(portName)) {
            setAccountHandleServiceHttpPortEndpointAddress(address);
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
