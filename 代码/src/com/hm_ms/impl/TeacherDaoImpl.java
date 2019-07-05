package com.hm_ms.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.Teacher;
import com.hm_ms.dao.TeacherDao;
import com.hm_ms.util.Toolutil;
import com.mchange.v2.c3p0.impl.NewProxyPreparedStatement;


public class TeacherDaoImpl implements TeacherDao {
	private java.sql.Connection con = null ;
	private NewProxyPreparedStatement pst = null;
	public TeacherDaoImpl(java.sql.Connection con) {
		this.con=con;
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
	public Student querystu(String stuid)
	{
		System.out.println(stuid+"测试");
		String sql="select * from student where stuId=?";
		PreparedStatement psmt;
		Student stu=null;
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, stuid);
			ResultSet resultSet=psmt.executeQuery();
			resultSet.next();
			System.out.println(resultSet.getString(1));
			 stu=new Student(resultSet.getString("stuId"), resultSet.getString("stuName"),
					"", resultSet.getString("classesName"),"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;}
    public void addhowtostu(String stuid,HomeWork homeWork,String teaname) {
		// TODO Auto-generated method stub
          String addhwtostu="insert into student_homework_teacher values(?,?,?,?,?,?,?)";
          try {
			PreparedStatement psmt=con.prepareStatement(addhwtostu);
			psmt.setString(1, stuid);
			psmt.setString(2,homeWork.getHomeWorkId());
			psmt.setString(3,teaname);
			psmt.setString(4, "1");
			psmt.setString(5, "0");
			psmt.setString(6, "");
			psmt.setString(7, "");
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public boolean ArrangementHomeWork(HomeWork homework, String groupName,String teaname) throws Exception {
		// TODO Auto-generated method stub
		String addsql="insert into classes_homework_teacher values(?,?,?,?,?)";
		ArrayList<String> stuidlist=new ArrayList<String>();
		PreparedStatement psmt1=con.prepareStatement(addsql);
		psmt1.setString(1, groupName);
		psmt1.setString(2, homework.getHomeWorkId());
		psmt1.setString(3, teaname);
		psmt1.setString(4, "1");
		psmt1.setString(5, "0");
		psmt1.executeUpdate();
		String querystusql="select * from student where classesName=?";
		PreparedStatement stupmst=con.prepareStatement(querystusql);
		stupmst.setString(1, groupName);
		ResultSet resultSet=stupmst.executeQuery();
		while(resultSet.next())
		{
			stuidlist.add(resultSet.getString("stuId"));
		}
		for(int i=0;i<stuidlist.size();i++)
		{
			addhowtostu(stuidlist.get(i), homework, teaname);
		}
		return true;
		
	}
    public HomeWork queryhow(String howid)
    {
    	String hmnasql="select * from homework where hmId=?";
    	ResultSet hmresultSet=null;
    	PreparedStatement hmpsmt=null;
	      try {
	    	  hmpsmt=con.prepareStatement(hmnasql);
			  hmpsmt.setString(1, howid);
			  hmresultSet=hmpsmt.executeQuery();
			  hmresultSet.next();
			return new HomeWork(hmresultSet.getString(1), hmresultSet.getString(2),
					  hmresultSet.getString(3),hmresultSet.getString(4),hmresultSet.getString(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      return null;
    }
    public ArrayList<String> findhmid(String teacherName)
    {
    	String hmnusql="select * from classes_homework_teacher where teaName=?";
		ArrayList<String> hmidlist=new ArrayList<String>();
		PreparedStatement idpsmt=null;
		ResultSet hmidresultSet=null;
		try {
			idpsmt=con.prepareStatement(hmnusql);
			idpsmt.setString(1, teacherName);
			hmidresultSet=idpsmt.executeQuery();
			while(hmidresultSet.next())
			{
			  hmidlist.add(hmidresultSet.getString("hmId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hmidlist;
    }
	@Override
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception {
		// TODO Auto-generated method stub
		HomeWork homeWork=null;
		ArrayList<String> hmidlist=null;
		ArrayList<HomeWork> hmlist=new ArrayList<HomeWork>();
		 hmidlist=findhmid(teacherName);
		for(int i=0;i<hmidlist.size();i++)
		{   homeWork=queryhow(hmidlist.get(i));
		    if(homeWork!=null)
			{hmlist.add(homeWork);}
			}
		return hmlist;
	}

	@Override
	public boolean CorrectHomeWork(String studentId, String homeWorkId, String grade) throws Exception {
		// TODO Auto-generated method stub
		String updatesql="update student_homework_teacher set grade=?"
				+ "where stuId=? and hmId=?";
		System.out.println("成绩："+studentId);
		PreparedStatement psmt=con.prepareStatement(updatesql);
		psmt.setString(1, grade);
		psmt.setString(2, studentId);
		psmt.setString(3, homeWorkId);
		int i=psmt.executeUpdate();
		System.out.println(i);
		return true;
	
	}
	@Override
	public Map<String,Object> FindStu(String teacherName,String hmId) throws Exception {
		// TODO Auto-generated method stub

		 String findstusql="select * from student_homework_teacher where teaName=? and hmId=?";
		 Student stu=null;
		 PreparedStatement stupsmt=con.prepareStatement(findstusql);
		 stupsmt.setString(1,Toolutil.encodeStr(teacherName));
		 stupsmt.setString(2, hmId);
		 ResultSet resultSet=stupsmt.executeQuery();
		 Map<String,Object> map=new HashMap<String,Object>();		 
		 HomeWork hoWork=queryhow(hmId);
		 ArrayList<Student> stulist=new ArrayList<Student>();
		 //String classesName = findClassesName(resultSet.getString("classesId"));
		 while(resultSet.next())
		 {
			 stu=querystu((resultSet.getNString(1)));
			 if(stu!=null)
			 {
				stulist.add(stu); 
			 }
		 }
		 
		 map.put("stulist",stulist);
		 map.put("hoWork",hoWork);
		 return map;	 
	}
//	private String findClassesName(String string) throws SQLException {
//		// TODO 自动生成的方法存根
//		String sql="select classesName from classes where classesId=?";
//		PreparedStatement psmt=con.prepareStatement(sql);
//		psmt.setString(1,string);
//		ResultSet resultSet=psmt.executeQuery();
//		resultSet.next();
//		String classesName=resultSet.getString("classesName");
//		return classesName;
//	}
	@Override
	public Map<String, Object> FindStuhow(String stuId, String hmId) throws Exception {
		// TODO Auto-generated method stub
		String corrsql="select * from student_homework_teacher where stuId=? and hmId=?";
		PreparedStatement psmt=con.prepareStatement(corrsql);
		psmt.setString(1,stuId);
		psmt.setString(2,hmId);
		ResultSet resultSet=psmt.executeQuery();
		resultSet.next();
		String text=resultSet.getString("submitContent");
		Student stu=querystu(stuId);
		System.out.println("213无");
		HomeWork hoWork=queryhow(hmId);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("stu", stu);
		map.put("hoWork", hoWork);
		map.put("text", text);
		return map;
	}
	@Override
	public String findTeacherName(String teaname) throws Exception {
		// TODO 自动生成的方法存根
		String sql="select teaName from teacher where teaId=?";
		PreparedStatement psmt=con.prepareStatement(sql);
		psmt.setString(1,teaname);
		ResultSet resultSet=psmt.executeQuery();
		resultSet.next();
		String teacherName=resultSet.getString("teaName");
		return teacherName;
	}
	@Override
	public String finClassesName(String teaName) throws Exception {
		String sql="select classesName from teacher where teaName =?";
		PreparedStatement psmt=con.prepareStatement(sql);
		psmt.setString(1,Toolutil.encodeStr(teaName));
		ResultSet resultSet=psmt.executeQuery();
		resultSet.next();
		String classesName=resultSet.getString("classesName");
		return classesName;
		
	}
	@Override
	public List<Teacher> findPersonMassage(String username) throws Exception {
		// TODO 自动生成的方法存根
		List<Teacher> teacher = new  ArrayList<Teacher>();
		String sql = "select * from teacher where teaId = ?";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		pst.setString(1, username);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Teacher stu=new Teacher();
			stu.setTeacherId(rs.getString("teaId"));
			stu.setTeacherName(rs.getString("teaName"));
			stu.setCollegeName(rs.getString("colName"));
			stu.setClassesName(rs.getString("classesName"));
			teacher.add(stu);
//			student.add(new Student(rs.getString("stuId"),rs.getString("stuName"),
//					rs.getString("stuSex"), rs.getString("colName"),
//					));
		}
		return teacher;
	}
	@Override
	public boolean updatePerPwd(String teaId, String pwd) throws Exception {
		// TODO 自动生成的方法存根
		String sql = "update account"
				+ " set accountPwd=? where accountId = ? ";
		pst=(NewProxyPreparedStatement) con.prepareStatement(sql);
		System.out.println(sql);
		pst.setString(1, pwd);
		pst.setString(2, teaId);
//	    pst.execute();
		return pst.execute();
	}

}
