package com.hm_ms.dao;

public interface AccountDao {
	
	/**
	  * ��¼����
	 * @param  accountId,pwd
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public String Login(String accountId,String pwd) throws Exception;
	/**
	  * �޸�����
	 * @param  accountId,pwd
	 * @return  ����ֵ
	 * @throws  �׳����쳣
	 */
	public boolean updatePerPwd(String accountId,String pwd) throws Exception;
	
}
