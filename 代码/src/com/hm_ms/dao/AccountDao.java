package com.hm_ms.dao;

public interface AccountDao {
	
	/**
	  * 登录密码
	 * @param  accountId,pwd
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public String Login(String accountId,String pwd) throws Exception;
	/**
	  * 修改密码
	 * @param  accountId,pwd
	 * @return  返回值
	 * @throws  抛出的异常
	 */
	public boolean updatePerPwd(String accountId,String pwd) throws Exception;
	
}
