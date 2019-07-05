package com.hm_ms.proxy;

import java.sql.SQLException;

import com.hm_ms.dao.AccountDao;
import com.hm_ms.datasource.DataSource;
import com.hm_ms.impl.AccountDaoImpl;

public class AccountProxy extends DaoProxy implements AccountDao {
	private java.sql.Connection con = null ;
	private AccountDao dao=null;
	public AccountProxy() throws SQLException {
		con=new DataSource().getConn();
		this.dao=new AccountDaoImpl(con);
	}
	@Override
	public boolean updatePerPwd(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub

		return dao.updatePerPwd(accountId, pwd);
	}
	@Override
	public String Login(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		String type;
		type = dao.Login(accountId, pwd);
		return type;
	}

}
