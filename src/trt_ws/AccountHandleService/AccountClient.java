package trt_ws.AccountHandleService;

public class AccountClient {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	
    	AccountHandleServicePortTypeProxy accountService=new  AccountHandleServicePortTypeProxy();
    	System.out.println(accountService.addAccount("1", "1", "1", "1", "1"));
    	
    
    }
}
