package com.hm_ms.impl;

import java.sql.ResultSet;
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
import com.hm_ms.util.Toolutil;
import com.mchange.v2.c3p0.impl.NewProxyPreparedStatement;

public class AdminDaoImpl implements AdminDao {
	private java.sql.Connection con = null ;
	private NewProxyPreparedStatement pst = null;
	public AdminDaoImpl(java.sql.Connection con) {
		super();
		this.con = con;
		// TODO Auto-generated constructor stub
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
		String sql = "insert into student  values(?,?,?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
		System.out.println(stuName);
		System.out.println(stuSex);
		System.out.println(colName);
		pst.setString(1, stuId);
		pst.setString(2, stuName);
		pst.setString(3, stuSex);
		pst.setString(4, colName);
		pst.setString(5,classesName);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean updateStudent(String stuId,String stuName,String stuSex,
			String colName , String classesName) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update student set stuName=?,stuSex=?,colName=?,classesName=? where stuId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
		System.out.println(stuName);
		System.out.println(stuSex);
		System.out.println(colName);
		pst.setString(1, stuName);
		pst.setString(2, stuSex);
		pst.setString(3, colName);
		pst.setString(4, classesName);
		pst.setString(5,stuId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteStudent(String stuId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from student where stuId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,stuId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public List<Student> findStudent(String stuId,String stuName) throws Exception {
		// TODO Auto-generated method stub
		List<Student> student = new  ArrayList<Student>();
		String sql = "select * from student  where stuId like '%"+stuId+"%' and stuName like '%"+stuName+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
//		pst.setString(1, stuId);
//		pst.setString(2,stuName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student stu=new Student();
			stu.setStudentId(rs.getString("stuId"));
			stu.setStudentName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setCollegeName(rs.getString("colName"));
			stu.setClassesName(rs.getString("classesName"));
			student.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return student;

	}

	@Override
	public boolean addTeacher(String teaId , String teaName , String colName, String classesName) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into teacher  values(?,?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);

		pst.setString(1, teaId);
		pst.setString(2, teaName);
		pst.setString(3, colName);
		pst.setString(4, classesName);
		return pst.execute();
	}

	@Override
	public boolean updateTeacher(String teaId,String teaName , String colName ,String classesName) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update teacher set teaName=?,colName=?,classesName=? where teaId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, teaName);
		pst.setString(2, colName);
		pst.setString(3, classesName);
		pst.setString(4,teaId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteTeacher(String teaId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from teacher where teaId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,teaId);
		return pst.execute();
	}

	@Override
	public List<Teacher> findTeacher(String teaId, String teaName) throws Exception {
		// TODO Auto-generated method stub
		List<Teacher> teacher = new  ArrayList<Teacher>();
		String sql = "select * from teacher  where teaId like '%"+teaId+"%' and teaName like '%"+teaName+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Teacher tea=new Teacher();
			tea.setTeacherId(rs.getString("teaId"));
			tea.setTeacherName(rs.getString("teaName"));
			tea.setCollegeName(rs.getString("colName"));
			tea.setClassesName(rs.getString("classesName"));
			teacher.add(tea);
		}
		return teacher;
	}

	@Override
	public boolean addCollege(College college) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCollege(String collegeId, College college) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCollege(String collegeId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<College> findCollege(College col) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGroup(Group group) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into classes  values(?,?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);

		pst.setString(1, group.getGroupId());
		pst.setString(2, Toolutil.encodeStr(group.getGroupName()));
		pst.setString(3, Toolutil.encodeStr(group.getGroupNumber()));
		pst.setString(4, Toolutil.encodeStr(group.getCollege()));
		return pst.execute();
	}

	@Override
	public boolean updateGroup(String groupId, Group group) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update classes set classesName=?,classesNum=?,colName=? where classesId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, Toolutil.encodeStr(group.getGroupName()));
		pst.setString(2, group.getGroupNumber());
		pst.setString(3, Toolutil.encodeStr(group.getCollege()));
		pst.setString(4,groupId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteGroup(String GroupId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from classes where classesId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,GroupId);
		return pst.execute();
	}

	@Override
	public List<Group> findGroup(Group gro) throws Exception {
		// TODO Auto-generated method stub
		List<Group> group = new  ArrayList<Group>();
		String classesId = gro.getGroupId();
		String sql = "select * from classes  where classesId like '%"+classesId+"%' ";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Group pr=new Group();
			pr.setGroupId(rs.getString("classesId"));
			pr.setGroupName(rs.getString("classesName"));
			pr.setGroupNumber(rs.getString("classesNum"));
			pr.setCollege(rs.getString("colName"));
			group.add(pr);

		}
		return group;
	}

	@Override
	public boolean addHomeWork(HomeWork homeWork) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into homework  values(?,?,?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, homeWork.getHomeWorkId());
		pst.setString(2, homeWork.getStartTime());
		pst.setString(3, homeWork.getEndTime());
		pst.setString(4, Toolutil.encodeStr(homeWork.getHomeWorkContent()));
		pst.setString(5,Toolutil.encodeStr(homeWork.getHomeWorkTitle()));
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean updateHomeWork(String HomeWorkId, HomeWork homeWork) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update homework set hmStart=?,hmEnd=?,problemContent=?,problemTitle=? where hmId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, homeWork.getStartTime());
		pst.setString(2, homeWork.getEndTime());
		pst.setString(3, Toolutil.encodeStr(homeWork.getHomeWorkContent()));
		pst.setString(4, Toolutil.encodeStr(homeWork.getHomeWorkTitle()));
		pst.setString(5,HomeWorkId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteHomeWork(String HomeWorkId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from homework where hmId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,HomeWorkId);
		return pst.execute();
	}

	@Override
	public List<HomeWork> findHomeWork(HomeWork hom) throws Exception {
		// TODO Auto-generated method stub
		List<HomeWork> homework = new  ArrayList<HomeWork>();
		String hmId = hom.getHomeWorkId();
		String sql = "select * from homework  where hmId like '%"+hmId+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			HomeWork hm=new HomeWork();
			hm.setHomeWorkId(rs.getString("hmId"));
			hm.setStartTime(rs.getString("hmStart"));
			hm.setEndTime(rs.getString("hmEnd"));
			hm.setHomeWorkContent(rs.getString("problemContent"));
			hm.setHomeWorkTitle(rs.getString("problemTitle"));
			homework.add(hm);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return homework;
	}

	@Override
	public boolean addProblem(Problem problem) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into problem  values(?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);

		pst.setString(1, problem.getProblemId());
		pst.setString(2, Toolutil.encodeStr(problem.getProblemContent()));
		pst.setString(3, Toolutil.encodeStr(problem.getAnswerContent()));
		return pst.execute();
	}

	@Override
	public boolean updateProblem(String ProblemId,String problemContent , String answer) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update problem set problemContent=?,answer=? where problemId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, Toolutil.encodeStr(problemContent));
		pst.setString(2, Toolutil.encodeStr(answer));
		pst.setString(3, ProblemId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteProblem(String ProblemId) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from problem where problemId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,ProblemId);
		return pst.execute();
	}

	@Override
	public List<Problem> findProblem(Problem pro) throws Exception {
		// TODO Auto-generated method stub
		List<Problem> problem = new  ArrayList<Problem>();
		String problemId = pro.getProblemId();
		String problemContent = Toolutil.encodeStr(pro.getProblemContent());
		String sql = "select * from problem  where problemId like '%"+problemId+"%' and problemContent like '%"+problemContent+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Problem pr=new Problem();
			pr.setProblemId(rs.getString("problemId"));
			pr.setProblemContent(rs.getString("problemContent"));
			pr.setAnswerContent(rs.getString("answer"));
			problem.add(pr);

		}
		return problem;
	}

	@Override
	public List<Student> findAllStudent() throws Exception {
		// TODO 自动生成的方法存根
		List<Student> student = new  ArrayList<Student>();
		String sql = "select * from student";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);;
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Student stu=new Student();
			stu.setStudentId(rs.getString("stuId"));
			stu.setStudentName(rs.getString("stuName"));
			stu.setStuSex(rs.getString("stuSex"));
			stu.setCollegeName(rs.getString("colName"));
			stu.setClassesName(rs.getString("classesName"));
			student.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return student;
	}

	@Override
	public List<Teacher> findAllTeacher() throws Exception {
		// TODO 自动生成的方法存根
		List<Teacher> teacher = new  ArrayList<Teacher>();
		String sql = "select * from teacher";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
//		pst.setString(1, stuId);
//		pst.setString(2,stuName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Teacher tea=new Teacher();
			tea.setTeacherId(rs.getString("teaId"));
			tea.setTeacherName(rs.getString("teaName"));
			tea.setCollegeName(rs.getString("colName"));
			tea.setClassesName(rs.getString("classesName"));
			teacher.add(tea);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return teacher;
	}

	@Override
	public List<HomeWork> findAllHomeWork() throws Exception {
		// TODO 自动生成的方法存根
		List<HomeWork> homework = new  ArrayList<HomeWork>();
		String sql = "select * from homework";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
//		pst.setString(1, stuId);
//		pst.setString(2,stuName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			HomeWork hm=new HomeWork();
			hm.setHomeWorkId(rs.getString("hmId"));
			hm.setStartTime(rs.getString("hmStart"));
			hm.setEndTime(rs.getString("hmEnd"));
			hm.setHomeWorkContent(rs.getString("problemContent"));
			hm.setHomeWorkTitle(rs.getString("problemTitle"));
			homework.add(hm);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return homework;
	}

	@Override
	public List<Problem> findAllProblem() throws Exception {
		// TODO 自动生成的方法存根
		List<Problem> problem = new  ArrayList<Problem>();
		String sql = "select * from problem";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Problem pb=new Problem();
			pb.setProblemId(rs.getString("problemId"));
			pb.setProblemContent(rs.getString("problemContent"));
			pb.setAnswerContent(rs.getString("answer"));
			problem.add(pb);

		}
		return problem;
	}

	@Override
	public boolean addAccount(Account account) throws Exception {
		// TODO 自动生成的方法存根
		String sql = "insert into account  values(?,?,?)";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);

		pst.setString(1, account.getAccountId());
		pst.setString(2, account.getPwd());
		pst.setString(3, account.getType());
		return pst.execute();
	}

	@Override
	public boolean updateAccount(String accountId, String accountPwd, String accountType) throws Exception {
		// TODO 自动生成的方法存根
		String sql = "update account set accountPwd=?,accountType=? where accountId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, accountPwd);
		pst.setString(2, accountType);
		pst.setString(3, accountId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public boolean deleteAccount(String accountId) throws Exception {
		// TODO 自动生成的方法存根
		String sql = "delete from account where accountId=?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1,accountId);
		return pst.execute();
	}

	@Override
	public List<Account> findAccount(String accountId) throws Exception {
		// TODO 自动生成的方法存根
		List<Account> account = new  ArrayList<Account>();
		String sql = "select * from account where accountId like '%"+accountId+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Account pb=new Account();
			pb.setAccountId(rs.getString("accountId"));
			pb.setPwd(rs.getString("accountPwd"));
			pb.setType(rs.getString("accountType"));
			account.add(pb);

		}
		return account;
	}

	@Override
	public List<Account> findAllAccount() throws Exception {
		// TODO 自动生成的方法存根
		List<Account> account = new  ArrayList<Account>();
		String sql = "select * from account";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Account pb=new Account();
			pb.setAccountId(rs.getString("accountId"));
			pb.setPwd(rs.getString("accountPwd"));
			pb.setType(rs.getString("accountType"));
			account.add(pb);

		}
		return account;
	}

	@Override
	public List<Group> findAllGroup() throws Exception {
		// TODO 自动生成的方法存根
		List<Group> group = new  ArrayList<Group>();
		String sql = "select * from classes";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Group pb=new Group();
			pb.setGroupId(rs.getString("classesId"));
			pb.setGroupName(rs.getString("classesName"));
			pb.setGroupNumber(rs.getString("classesNum"));
			pb.setCollege(rs.getString("colName"));
			group.add(pb);

		}
		return group;
	}

	@Override
	public List<Answer> findAllAnswer() throws Exception {
		// TODO 自动生成的方法存根
		List<Answer> answer = new  ArrayList<Answer>();
		String sql = "select * from answer";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Answer pb=new Answer();
			pb.setProblemContent(rs.getString("problemContent"));
			pb.setAnswer(rs.getString("answer"));
			answer.add(pb);

		}
		return answer;
	}

	@Override
	public List<Answer> findAnswer(String problemContent) throws SQLException {
		// TODO 自动生成的方法存根
		List<Answer> answer = new  ArrayList<Answer>();
		String sql = "select * from answer where problemContent like '%"+problemContent+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Answer pb=new Answer();
			pb.setProblemContent(rs.getString("problemContent"));
			pb.setAnswer(rs.getString("answer"));
			answer.add(pb);

		}
		return answer;
	}

}
