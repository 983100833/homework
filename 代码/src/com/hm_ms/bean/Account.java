package com.hm_ms.bean;

public class Account {
	private String accountId;
	private String pwd;
	private String type;
	public Account(String accountId, String pwd,String type) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.type=type;
	}
	public Account() {
		// TODO 自动生成的构造函数存根
		super();
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
