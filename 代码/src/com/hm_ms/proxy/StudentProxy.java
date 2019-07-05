package com.hm_ms.proxy;

import java.sql.SQLException;
import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.StudentHomeWork;
import com.hm_ms.dao.StudentDao;
import com.hm_ms.datasource.DataSource;
import com.hm_ms.impl.AdminDaoImpl;
import com.hm_ms.impl.StudentDaoImpl;

/**
 * 学生代理者
 * @author Hym
 *
 */
public class StudentProxy extends DaoProxy implements StudentDao{
	private java.sql.Connection con = null ;
	private StudentDao dao = null ;
	public StudentProxy() throws SQLException {
		//初始化
		con=new DataSource().getConn();
		this.dao=new StudentDaoImpl(con);
	}
	@Override
	public boolean updatePerPwd(String stuId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		
		return dao.updatePerPwd(stuId, pwd);
	}

	@Override
	public List<StudentHomeWork> SelectHomeWork(String stuId,String hmId) throws Exception {
		// TODO Auto-generated method stub
		return dao.SelectHomeWork(stuId, hmId);
	}

	@Override
	public boolean Submithomework(String stuId, String homeWorkId, String submitContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<StudentHomeWork> SelectAllHomeWork(String stuId) throws Exception {
		// TODO 自动生成的方法存根
		return dao.SelectAllHomeWork(stuId);
	}
	@Override
	public boolean updateHomeWork(String stuId, String hmId, String submitContent) throws Exception {
		return dao.updateHomeWork(stuId, hmId, submitContent);
		// TODO 自动生成的方法存根
		
	}
	@Override
	public List<Student> findPersonMassage(String username) throws Exception {
		// TODO 自动生成的方法存根
		return dao.findPersonMassage(username);
	}
	@Override
	public List<StudentHomeWork> serchStuPerHomework(String username) throws Exception {
		// TODO 自动生成的方法存根
		return dao.serchStuPerHomework(username);
	}

}
