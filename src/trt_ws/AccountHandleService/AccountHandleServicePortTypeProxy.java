package trt_ws.AccountHandleService;

public class AccountHandleServicePortTypeProxy implements trt_ws.AccountHandleService.AccountHandleServicePortType {
  private String _endpoint = null;
  private trt_ws.AccountHandleService.AccountHandleServicePortType accountHandleServicePortType = null;
  
  public AccountHandleServicePortTypeProxy() {
    _initAccountHandleServicePortTypeProxy();
  }
  
  public AccountHandleServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountHandleServicePortTypeProxy();
  }
  
  private void _initAccountHandleServicePortTypeProxy() {
    try {
      accountHandleServicePortType = (new trt_ws.AccountHandleService.AccountHandleServiceLocator()).getAccountHandleServiceHttpPort();
      if (accountHandleServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountHandleServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountHandleServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountHandleServicePortType != null)
      ((javax.xml.rpc.Stub)accountHandleServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public trt_ws.AccountHandleService.AccountHandleServicePortType getAccountHandleServicePortType() {
    if (accountHandleServicePortType == null)
      _initAccountHandleServicePortTypeProxy();
    return accountHandleServicePortType;
  }
  
  public java.lang.String modifyAccount(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (accountHandleServicePortType == null)
      _initAccountHandleServicePortTypeProxy();
    return accountHandleServicePortType.modifyAccount(in0, in1, in2, in3, in4);
  }
  
  public java.lang.String addAccount(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException{
    if (accountHandleServicePortType == null)
      _initAccountHandleServicePortTypeProxy();
    return accountHandleServicePortType.addAccount(in0, in1, in2, in3, in4);
  }
  
  public java.lang.String disableAccount(java.lang.String in0) throws java.rmi.RemoteException{
    if (accountHandleServicePortType == null)
      _initAccountHandleServicePortTypeProxy();
    return accountHandleServicePortType.disableAccount(in0);
  }
  
  public java.lang.String enableAccount(java.lang.String in0) throws java.rmi.RemoteException{
    if (accountHandleServicePortType == null)
      _initAccountHandleServicePortTypeProxy();
    return accountHandleServicePortType.enableAccount(in0);
  }
  
  
}