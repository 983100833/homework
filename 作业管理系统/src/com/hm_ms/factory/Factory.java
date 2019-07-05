package com.hm_ms.factory;

import java.sql.SQLException;

import com.hm_ms.dao.*;
import com.hm_ms.datasource.DataSource;
import com.hm_ms.proxy.*;
/**
 * 工厂类 获取代理者
 * @author Hym
 *
 */
public class Factory {
	public static AccountDao getUserDAOInstance() throws SQLException{
		return new AccountProxy() ;
	}
	public static TeacherDao getTeacherDAOInstance(){
		return new TeacherProxy() ;
	}
	public static StudentDao getStudentDAOInstance() throws SQLException{
		return new StudentProxy() ;
	}
	public static AdminDao getAdminDAOInstance() throws SQLException{
		return new AdminProxy() ;
	}
//	public static AdminDao getGradeDAOInstance() throws SQLException{
//		return new AdminProxy() ;
//	}
	public static DataSource getDataSuorce() throws SQLException {
		return new DataSource();
	}
}
