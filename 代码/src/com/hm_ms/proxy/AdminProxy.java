package com.hm_ms.proxy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hm_ms.bean.Account;
import com.hm_ms.bean.Answer;
import com.hm_ms.bean.College;
import com.hm_ms.bean.Group;
import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.Teacher;
import com.hm_ms.dao.AdminDao;
import com.hm_ms.datasource.DataSource;
import com.hm_ms.impl.AccountDaoImpl;
import com.hm_ms.impl.AdminDaoImpl;

public class AdminProxy extends DaoProxy implements AdminDao {
	private java.sql.Connection con = null ;
	private AdminDao dao=null;
	
	public AdminProxy() throws SQLException {
		con=new DataSource().getConn();
		this.dao=new AdminDaoImpl(con);
	}

	@Override
	public boolean Login(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePerPwd(String accountId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addStudent(String stuId,String stuName,
			String stuSex,String colName , String classesName) throws Exception {
		// TODO Auto-generated method stub
		return dao.addStudent(stuId, stuName, stuSex, colName, classesName);
	}

	@Override
	public boolean updateStudent(String stuId,String stuName,String stuSex,
			String colName , String classesName) throws Exception {
		// TODO Auto-generated method stub
//		dao.updateStudent(stuId, stuName, stuSex, colName, classesName);
		return dao.updateStudent(stuId, stuName, stuSex, colName, classesName);
	}

	@Override
	public boolean deleteStudent(String stuId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteStudent(stuId);
	}

	@Override
	public List<Student> findStudent(String stuId,String stuName) throws Exception {
		// TODO Auto-generated method stub
		return dao.findStudent(stuId, stuName);
	}
	public List<Student> findAllStudent() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAllStudent();
	}

	@Override
	public boolean addTeacher(String teaId , String teaName , String colName, String classesName) throws Exception {
		// TODO Auto-generated method stub
		return dao.addTeacher(teaId, teaName, colName, classesName);
	}

	@Override
	public boolean updateTeacher(String teaId,String teaName , String colName ,String classesName) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateTeacher(teaId, teaName, colName, classesName);
	}

	@Override
	public boolean deleteTeacher(String teaId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteTeacher(teaId);
	}

	@Override
	public List<Teacher> findTeacher(String teaId, String teaName) throws Exception {
		// TODO Auto-generated method stub
		return dao.findTeacher(teaId, teaName);
	}

	@Override
	public boolean addCollege(College college) throws Exception {
		// TODO Auto-generated method stub
		return dao.addCollege(college);
	}

	@Override
	public boolean updateCollege(String collegeId, College college) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateCollege(collegeId, college);
	}

	@Override
	public boolean deleteCollege(String collegeId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteCollege(collegeId);
	}

	@Override
	public List<College> findCollege(College col) throws Exception {
		// TODO Auto-generated method stub
		return dao.findCollege(col);
	}

	@Override
	public boolean addGroup(Group group) throws Exception {
		// TODO Auto-generated method stub
		return dao.addGroup(group);
	}

	@Override
	public boolean updateGroup(String groupId, Group group) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateGroup(groupId, group);
	}

	@Override
	public boolean deleteGroup(String GroupId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteGroup(GroupId);
	}

	@Override
	public List<Group> findGroup(Group gro) throws Exception {
		// TODO Auto-generated method stub
		return dao.findGroup(gro);
	}

	@Override
	public boolean addHomeWork(HomeWork homeWork) throws Exception {
		// TODO Auto-generated method stub
		return dao.addHomeWork(homeWork);
	}

	@Override
	public boolean updateHomeWork(String HomeWorkId, HomeWork homeWork) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateHomeWork(HomeWorkId, homeWork);
	}

	@Override
	public boolean deleteHomeWork(String HomeWorkId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteHomeWork(HomeWorkId);
	}

	@Override
	public List<HomeWork> findHomeWork(HomeWork hom) throws Exception {
		// TODO Auto-generated method stub
		return dao.findHomeWork(hom);
	}

	@Override
	public boolean addProblem(Problem problem) throws Exception {
		// TODO Auto-generated method stub
		return dao.addProblem(problem);
	}

	@Override
	public boolean updateProblem(String ProblemId,String problemContent , String answer) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateProblem( ProblemId, problemContent ,  answer);
	}

	@Override
	public boolean deleteProblem(String ProblemId) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteProblem(ProblemId);
	}

	@Override
	public List<Problem> findProblem(Problem pro) throws Exception {
		// TODO Auto-generated method stub
		return dao.findProblem(pro);
	}

	@Override
	public List<Teacher> findAllTeacher() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllTeacher();
	}

	@Override
	public List<HomeWork> findAllHomeWork() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllHomeWork();
	}

	@Override
	public List<Problem> findAllProblem() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllProblem();
	}

	@Override
	public boolean addAccount(Account account) throws Exception {
		// TODO 自动生成的方法存根
		return dao.addAccount(account);
	}

	@Override
	public boolean updateAccount(String accountId, String accountPwd, String accountType) throws Exception {
		// TODO 自动生成的方法存根
		return dao.updateAccount(accountId, accountPwd, accountType);
	}

	@Override
	public boolean deleteAccount(String accountId) throws Exception {
		// TODO 自动生成的方法存根
		return dao.deleteAccount(accountId);
	}

	@Override
	public List<Account> findAccount(String accountId) throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAccount(accountId);
	}

	@Override
	public List<Account> findAllAccount() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllAccount();
	}

	@Override
	public List<Group> findAllGroup() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllGroup();
	}

	@Override
	public List<Answer> findAllAnswer() throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAllAnswer();
	}

	@Override
	public List<Answer> findAnswer(String problemContent) throws Exception {
		// TODO 自动生成的方法存根
		return dao.findAnswer(problemContent);
	}

}
