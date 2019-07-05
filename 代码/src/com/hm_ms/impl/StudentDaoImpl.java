package com.hm_ms.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.StudentHomeWork;
import com.hm_ms.dao.StudentDao;
import com.hm_ms.util.Toolutil;
import com.mchange.v2.c3p0.impl.NewProxyPreparedStatement;
/**
 * 学生具体实现类
 * @author Hym
 *
 */
 public class StudentDaoImpl implements StudentDao{
	private java.sql.Connection con = null ;
	private NewProxyPreparedStatement pst = null;
	public StudentDaoImpl(java.sql.Connection con) {
		this.con=con;
	}
	@Override
	public boolean updatePerPwd(String stuId, String pwd) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update account"
				+ " set accountPwd=? where accountId = ? ";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
		pst.setString(1, pwd);
		pst.setString(2, stuId);
//	    pst.execute();
		return pst.execute();
	}

	@Override
	public List<StudentHomeWork> SelectHomeWork(String stuId,String hmId) throws Exception {
		// TODO Auto-generated method stub
		List<StudentHomeWork> student = new  ArrayList<StudentHomeWork>();
		String sql = "select hmId,teaName,submitContent,grade"
				+ " from student_homework_teacher where stuId = ? and hmId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, stuId);
		pst.setString(2,hmId);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			StudentHomeWork stu=new StudentHomeWork();
			stu.setHmId(rs.getString("hmId"));
			stu.setTeaName(rs.getString("teaName"));
			stu.setSubmitContent(rs.getString("submitContent"));
			stu.setGrade(rs.getString("grade"));
			student.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return student;
	}

	@Override
	public boolean Submithomework(String stuId, String homeWorkId, String submitContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<StudentHomeWork> SelectAllHomeWork(String stuId) throws Exception {
		// TODO 自动生成的方法存根
//		System.out.println(stuId);
		List<StudentHomeWork> student = new  ArrayList<StudentHomeWork>();
		String sql = "select hmId,problemTitle,problemId,problemContent,submitState from student_homework where stuId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, stuId);
//		pst.setString(2,stuName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			StudentHomeWork stu=new StudentHomeWork();
			stu.setHmId(rs.getString("hmId"));
			stu.setProblemTitle(rs.getString("problemTitle"));
			stu.setProblemId(rs.getString("problemId"));
			stu.setProblemContent(rs.getString("problemContent"));
			stu.setSubmitState(rs.getBoolean("submitState"));
			student.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return student;
	}
	@Override
	public boolean updateHomeWork(String stuId, String hmId, String submitContent) throws Exception {
		
		// TODO 自动生成的方法存根
		String sql = "update student_homework_teacher"
				+ " set submitContent=?,submitState='1' where stuId = ? and hmId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
		pst.setString(1, Toolutil.encodeStr(submitContent));
		pst.setString(2, stuId);
		pst.setString(3, hmId);
//	    pst.execute();
		return pst.execute();
		
	}
	@Override
	public List<Student> findPersonMassage(String username) throws Exception {
		// TODO 自动生成的方法存根
		List<Student> student = new  ArrayList<Student>();
		String sql = "select * from student where stuId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, username);
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
	public List<StudentHomeWork> serchStuPerHomework(String context1) throws Exception {
		// TODO 自动生成的方法存根
		List<StudentHomeWork> student = new  ArrayList<StudentHomeWork>();
		String sql = "select hmId,problemTitle,problemId,problemContent,submitState from student_homework"
				+ " where problemTitle like '%"+context1+"%'";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
//		pst.setString(1, username);
//		pst.setString(2,stuName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			StudentHomeWork stu=new StudentHomeWork();
			stu.setHmId(rs.getString("hmId"));
			stu.setProblemTitle(rs.getString("problemTitle"));
			stu.setProblemId(rs.getString("problemId"));
			stu.setProblemContent(rs.getString("problemContent"));
			stu.setSubmitState(rs.getBoolean("submitState"));
			student.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return student;
	}

}
