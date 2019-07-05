package com.hm_ms.proxy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.bean.Teacher;
import com.hm_ms.dao.TeacherDao;
import com.hm_ms.impl.AdminDaoImpl;
import com.hm_ms.impl.TeacherDaoImpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TeacherProxy  extends DaoProxy implements TeacherDao {
	private java.sql.Connection con = null ;
	private TeacherDao dao=null;
	public TeacherProxy() {
		String path="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
		ComboPooledDataSource dataSource=(ComboPooledDataSource)applicationContext.getBean("dataSource");
		try {
			con=dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.dao = new TeacherDaoImpl(con) ;
	}
	@Override
	public boolean addProblem(String problemId, String problemContent, String answerContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProblem(String problemId, String problemContent, String answerContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProblem(String problemId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Problem> deleteProblem(Problem problem) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ArrangementHomeWork(HomeWork homework, String groupName,String teaname) throws Exception {
		// TODO Auto-generated method stub
		return dao.ArrangementHomeWork(homework, groupName, teaname);
	}

	@Override
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception {
		// TODO Auto-generated method stub
		 return dao.FindHomeWork(teacherName);
	}

	@Override
	public boolean CorrectHomeWork(String studentId, String homeWorkId, String grade) throws Exception {
		// TODO Auto-generated method stub
		return dao.CorrectHomeWork(studentId, homeWorkId, grade);
	}
	@Override
	public Map<String,Object> FindStu(String teacherName,String hmId) throws Exception {
		// TODO Auto-generated method stub
		return dao.FindStu(teacherName,hmId);
	}
	@Override
	public Map<String, Object> FindStuhow(String stuId, String hmId) throws Exception {
		// TODO Auto-generated method stub
		return dao.FindStuhow(stuId, hmId);
	}
	@Override
	public String findTeacherName(String teaname) throws Exception {
		// TODO 自动生成的方法存根
		return dao.findTeacherName(teaname);
	}
	@Override
	public String finClassesName(String teaName) throws Exception {
		return dao.finClassesName(teaName);
		// TODO 自动生成的方法存根
		
	}
	@Override
	public List<Teacher> findPersonMassage(String username) throws Exception {
		// TODO 自动生成的方法存根
		return dao.findPersonMassage(username);
	}
	@Override
	public boolean updatePerPwd(String teaId, String pwd) throws Exception {
		// TODO 自动生成的方法存根
		return dao.updatePerPwd(teaId, pwd);
	}
	

}
