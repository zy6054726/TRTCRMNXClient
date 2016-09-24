package trt_ws.AccountClients;

import trt_ws.AccountHandleService.AccountHandleServicePortTypeProxy;

public class AccountClients {

	public static void main(String[] args) throws Exception {
		AccountClients client = new AccountClients();
//		System.out.println(client.createUser("1", "1", "1", "1", "1"));
		client.createUser("12314523200", "123421","李四", "lisi123");
		client.modifyUser("12314523200", "123422", "0", "李四1", "lisi123");
		client.disableUser("12314523200");
		client.enableUser("12314523200");
	}

	private String url;

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public AccountClients() {
//		this.url = "http://203.195.188.14:7878/services/AccountHandleService?wsdl";
		this.url = "http://10.8.147.169/services/AccountHandleService?wsdl";
	}
	public AccountClients(String url) {
		this.url = url;
	}
	
	/**
	 * 创建用户
	 * 
	 * @param loginCode
	 *            CRM帐号（雇员编号）
	 * @param passWord
	 *            密码
	 * @param userType
	 *            用户类型（线上或线下）
	 * @param userName
	 *            用户姓名
	 * @param loginName
	 *            login
	 * @return   000:成功   001：已存在   002：异常错误
	 */
	public String createUser(String loginCode, String passWord,
			String userName, String loginName) {
		System.out.println("trt_crm_nx create user start..........\n");
		System.out.println("loginCode:" + loginCode);
		System.out.println("passWord:" + passWord);
		System.out.println("userName:" + userName);
		System.out.println("loginName:" + loginName);
		String ret = "";
		String userType = "0";
		try {
			AccountHandleServicePortTypeProxy accountService = new AccountHandleServicePortTypeProxy();
			ret = accountService.addAccount(loginCode, passWord, userType,
					userName, loginName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\rreturnCode:" + ret);
		System.out.println("trt_crm_nx create user end..........\n");
		return ret;
	}
	
	/**
	 * 修改用户
	 * 
	 * @param loginCode
	 *            CRM帐号（雇员编号）
	 * @param passWord
	 *            密码
	 * @param userType
	 *            用户类型（线上或线下）
	 * @param userName
	 *            用户姓名
	 * @param loginName
	 *            login
	 * @return   100:成功   101：已存在   102：异常错误
	 */
	public String modifyUser(String loginCode, String passWord,
			String userType, String userName, String loginName) {
		System.out.println("trt_crm_nx modify user start..........\n");
		System.out.println("loginCode:" + loginCode);
		System.out.println("passWord:" + passWord);
		System.out.println("userType:" + userType);
		System.out.println("userName:" + userName);
		System.out.println("loginName:" + loginName);
		String ret = "";
		try {
			AccountHandleServicePortTypeProxy accountService = new AccountHandleServicePortTypeProxy();
			ret = accountService.modifyAccount(loginCode, passWord, userType,
					userName, loginName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\rreturnCode:" + ret);
		System.out.println("trt_crm_nx modify user end..........\n");
		return ret;
	}
	
	/**
	 * 禁用用户
	 * @param loginCode  CRM帐号（雇员编号）
	 * @return  200：成功    201：已存在    202：异常错误
	 */
	public String disableUser(String loginCode) {
		String ret = "";
		System.out.println("trt_crm_nx disable user start..........\n");
		System.out.println("loginCode:" + loginCode);
		try {
			AccountHandleServicePortTypeProxy accountService = new AccountHandleServicePortTypeProxy();
			ret = accountService.disableAccount(loginCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\rreturnCode:" + ret);
		System.out.println("trt_crm_nx disable user end..........\n");
		return ret;
	}
	
	/**
	 * 启用用户
	 * @param loginCode CRM帐号（雇员编号）
	 * @return  300：成功    301：已存在   302：异常错误
	 */
	public String enableUser(String loginCode) {
		String ret = "";
		System.out.println("trt_crm_nx enable user start..........\n");
		System.out.println("loginCode:" + loginCode);
		try {
			AccountHandleServicePortTypeProxy accountService = new AccountHandleServicePortTypeProxy();
			ret = accountService.enableAccount(loginCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\rreturnCode:" + ret);
		System.out.println("trt_crm_nx enable user end..........\n");
		return ret;
	}
	
}
