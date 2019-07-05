package com.hm_ms.impl;

import java.sql.ResultSet;

import com.hm_ms.dao.AccountDao;
import com.mchange.v2.c3p0.impl.NewProxyPreparedStatement;
import com.mysql.jdbc.PreparedStatement;

public class AccountDaoImpl implements AccountDao {
	
	private java.sql.Connection con;
	private NewProxyPreparedStatement pst = null;
	public AccountDaoImpl(java.sql.Connection con) {
		super();
		this.con = con;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean updatePerPwd(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String Login(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		String accountType = null;
		String sql = "select accountType from account  where accountId = ? and accountPwd = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, accountId);
		pst.setString(2, pwd);
		ResultSet rs = pst.executeQuery();
		if(rs.next()==false) {
			return null;
		}
		else {
			accountType = rs.getString("accountType");
			System.out.println(accountType);
			return accountType;
		}
	}


}
