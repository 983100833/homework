package com.hm_ms.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSource {
	Connection conn = null;
	String path = "applicationContext.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
	ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
	public DataSource() throws SQLException {
		conn = dataSource.getConnection();
	}
	public Connection getConn() {
		return conn;
	}
}
