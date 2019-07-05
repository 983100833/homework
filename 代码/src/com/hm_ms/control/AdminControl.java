package com.hm_ms.control;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm_ms.dao.AccountDao;
import com.hm_ms.dao.AdminDao;
import com.hm_ms.factory.Factory;
import com.hm_ms.util.Toolutil;
import com.hm_ms.bean.*;

@Controller
public class AdminControl {
//	  @RequestMapping(value="/findAllStudent",method=RequestMethod.POST)
//	  public String findAllStudent(@RequestParam(value="stuName") String stuName,@RequestParam(value="stuId") String stuId,
//			  Map<String, Object> map) throws Exception{
//		  List<Student> list = null;
//		  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
//		  if(stuId.isEmpty()&&stuName.isEmpty())
//		  {
//			  list = daoProxy.findAllStudent();
//		  }
//		  System.out.println("111");
//		  map.put("student", list);
//		  return "/adminPage/student1";
//	  }
	  
	  @RequestMapping(value="/findStudent",method=RequestMethod.POST)
	  public String findStudent(@RequestParam(value="stuName") String stuName,@RequestParam(value="stuId") String stuId,
			  Map<String, Object> map) throws Exception{
		  List<Student> list = new ArrayList<Student>();
		  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
		  
		  System.out.println(Toolutil.encodeStr(stuName));
		  list = daoProxy.findStudent(stuId,Toolutil.encodeStr(stuName));
		  map.put("student", list);
		  return "/adminPage/student1";

	  }
	@RequestMapping(value="/AdminLeftPage")
	  public String AdminLeftPage(Map<String, Object> map) {
		  return "/adminPage/left";
	  }
	@RequestMapping(value="/AdminIndexPage")
	  public String AdminIndexPage(Map<String, Object> map) {
		  return "/adminPage/adminIndex1";
	  }
	 @RequestMapping(value="/StudentPage")
	  public String StudentPage(Map<String, Object> map) throws Exception {
		 List<Student> list = new ArrayList<Student>();
		  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
		  list = daoProxy.findAllStudent();
		  map.put("student", list);
		  return "/adminPage/student1";
	  }
	 @RequestMapping(value="/openAlterStudent")
	  public String openAlterStudent(@RequestParam(value="stuId") String stuId,
			  @RequestParam(value="stuName") String stuName,@RequestParam(value="stuSex") String stuSex,
			  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
			  Map<String, Object> map) throws UnsupportedEncodingException {
		 map.put("stuId", stuId) ;
		 map.put("stuName", Toolutil.encodeStr(stuName)) ;
		 map.put("stuSex", Toolutil.encodeStr(stuSex)) ;
		 map.put("colName", Toolutil.encodeStr(colName)) ;
		 map.put("classesName", Toolutil.encodeStr(classesName)) ;
		 return "/adminPage/alterStudent";
	  }
	 @RequestMapping(value="/updateStudent",method=RequestMethod.POST)
	 public String updateStudent(@RequestParam(value="stuId") String stuId,
			  @RequestParam(value="stuName") String stuName,@RequestParam(value="stuSex") String stuSex,
			  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
			  Map<String, Object> map) throws Exception {
		 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
		   daoProxy.updateStudent(stuId, Toolutil.encodeStr(stuName),Toolutil.encodeStr(stuSex),
				   Toolutil.encodeStr(colName),Toolutil.encodeStr(classesName));
		   String str = "StudentPage";
		   map.put("servlet", str);
		 return "/adminPage/success";
	 }
//		@RequestMapping(value="/AlterSuccess")
//		  public String AlterSuccess(Map<String, Object> map) {
//			  return "/adminPage/student1";
//		  }
		@RequestMapping(value="/AddStudentPage")
		  public String AddStudentPage(Map<String, Object> map) {
			  return "/adminPage/addStudent";
		  }
		 @RequestMapping(value="/addStudent",method=RequestMethod.POST)
		 public String addStudent(@RequestParam(value="stuId") String stuId,
				  @RequestParam(value="stuName") String stuName,@RequestParam(value="stuSex") String stuSex,
				  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
				  Map<String, Object> map) throws Exception {
			 System.out.println(Toolutil.encodeStr(stuName));
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.addStudent(stuId, Toolutil.encodeStr(stuName),Toolutil.encodeStr(stuSex),
					   Toolutil.encodeStr(colName),Toolutil.encodeStr(classesName));
			  String str = "StudentPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/openDeleteStudent",method=RequestMethod.GET)
		 public String openDeleteStudent(@RequestParam(value="stuId") String stuId,Map<String, Object> map) throws Exception {
//			 System.out.println(Toolutil.encodeStr(stuName));
			 System.out.println(stuId);
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteStudent(stuId);
			  String str = "StudentPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/TeacherPage")
		 public String TeacherPage(Map<String, Object> map) throws Exception {
			 List<Teacher> list = new ArrayList<Teacher>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllTeacher();
			  map.put("teacher", list);
			  return "/adminPage/teacher";
		  }
		 @RequestMapping(value="/findTeacher",method=RequestMethod.POST)
		  public String findTeacher(@RequestParam(value="teaName") String teaName,@RequestParam(value="teaId") String teaId,
				  Map<String, Object> map) throws Exception{
			  List<Teacher> list = new ArrayList<Teacher>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findTeacher(teaId,Toolutil.encodeStr(teaName));
			  map.put("teacher", list);
			  return "/adminPage/teacher";

		  }
		 @RequestMapping(value="/AddTeacherPage")
		  public String AddTeacherPage(Map<String, Object> map) {
			  return "/adminPage/addTeacher";
		  }
		 @RequestMapping(value="/addTeacher",method=RequestMethod.POST)
		 public String addTeacher(@RequestParam(value="teaId") String teaId,
				  @RequestParam(value="teaName") String teaName,
				  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.addTeacher(teaId, Toolutil.encodeStr(teaName),
					   Toolutil.encodeStr(colName),Toolutil.encodeStr(classesName));
			  String str = "TeacherPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/openAlterTeacher")
		  public String openAlterTeacher(@RequestParam(value="teaId") String teaId,
				  @RequestParam(value="teaName") String teaName,
				  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
				  Map<String, Object> map) throws UnsupportedEncodingException {
			 map.put("teaId", teaId) ;
			 map.put("teaName", Toolutil.encodeStr(teaName)) ;
			 map.put("colName", Toolutil.encodeStr(colName)) ;
			 map.put("classesName", Toolutil.encodeStr(classesName)) ;
			 return "/adminPage/alterTeacher";
		  }
		 @RequestMapping(value="/updateTeacher",method=RequestMethod.POST)
		 public String updateTeacher(@RequestParam(value="teaId") String teaId,
				  @RequestParam(value="teaName") String teaName,
				  @RequestParam(value="colName") String colName,@RequestParam(value="classesName") String classesName,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			   daoProxy.updateTeacher(teaId, Toolutil.encodeStr(teaName),
					   Toolutil.encodeStr(colName),Toolutil.encodeStr(classesName));
			   String str = "TeacherPage";
			   map.put("servlet", str);
			 return "/adminPage/success";
		 }
		 @RequestMapping(value="/openDeleteTeacher",method=RequestMethod.GET)
		 public String openDeleteTeacher(@RequestParam(value="teaId") String teaId,Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteTeacher(teaId);
			  String str = "TeacherPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
		 }
		 
		 @RequestMapping(value="/HomeWorkPage")
		  public String HomeWorkPage(Map<String, Object> map) throws Exception {
			 List<HomeWork> list = new ArrayList<HomeWork>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllHomeWork();
			  map.put("homework", list);
			  return "/adminPage/homeWork";
		  }
		 @RequestMapping(value="/findHomeWork",method=RequestMethod.POST)
		  public String findHomeWork(@RequestParam(value="hmId") String hmId,
				  Map<String, Object> map) throws Exception{
			  List<HomeWork> list = new ArrayList<HomeWork>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findHomeWork(new HomeWork(hmId));
			  map.put("homework", list);

//			  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//			  Calendar c = Calendar.getInstance();
//			  System.out.println("当前日期:"+sf.format(c.getTime()));
//			  c.add(Calendar.DAY_OF_MONTH, 1);
//			  System.out.println("增加一天后日期:"+sf.format(c.getTime()));
			  return "/adminPage/homeWork";

		  }
		 @RequestMapping(value="/openAlterHomeWork")
		  public String openAlterHomeWork(@RequestParam(value="hmId") String hmId,
				  @RequestParam(value="hmStart") String hmStart,
				  @RequestParam(value="hmEnd") String hmEnd,@RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="problemTitle") String problemTitle,Map<String, Object> map) throws UnsupportedEncodingException {
			 map.put("hmId", hmId) ;
			 map.put("hmStart", hmStart) ;
			 map.put("hmEnd", hmEnd) ;
			 map.put("problemContent", Toolutil.encodeStr(problemContent)) ;
			 map.put("problemTitle", Toolutil.encodeStr(problemTitle)) ;
			 return "/adminPage/alterHomeWork";
		  }
		 @RequestMapping(value="/updateHomeWork",method=RequestMethod.POST)
		 public String updateHomeWork(@RequestParam(value="hmId") String hmId,
				  @RequestParam(value="hmStart") String hmStart,
				  @RequestParam(value="hmEnd") String hmEnd,@RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="problemTitle") String problemTitle,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			   daoProxy.updateHomeWork(hmId,new HomeWork(hmStart,hmEnd,problemContent,problemTitle));
			   String str = "HomeWorkPage";
			   map.put("servlet", str);
			 return "/adminPage/success";
		 }
		 @RequestMapping(value="/openDeleteHomeWork",method=RequestMethod.GET)
		 public String openDeleteHomeWork(@RequestParam(value="hmId") String hmId,Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteHomeWork(hmId);
			  String str = "HomeWorkPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
		 }
		 @RequestMapping(value="/AddHomeWorkPage")
		  public String AddHomeWorkPage(Map<String, Object> map) {
			  return "/adminPage/addHomeWork";
		  }
		 @RequestMapping(value="/addHomeWork",method=RequestMethod.POST)
		 public String addHomeWork(@RequestParam(value="hmId") String hmId,
				  @RequestParam(value="hmStart") String hmStart,
				  @RequestParam(value="hmEnd") String hmEnd,@RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="problemTitle") String problemTitle,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			 	daoProxy.addHomeWork(new HomeWork(hmId,hmStart,hmEnd,problemContent,problemTitle));
			 	String str = "HomeWorkPage";
				   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/ProblemPage")
		  public String ProblemPage(Map<String, Object> map) throws Exception {
			 List<Problem> list = new ArrayList<Problem>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllProblem();
			  map.put("problem", list);
			  return "/adminPage/problem";
		  }
		 @RequestMapping(value="/findProblem",method=RequestMethod.POST)
		  public String findProblem(@RequestParam(value="problemId") String problemId,
				  @RequestParam(value="problemContent") String problemContent,
				  Map<String, Object> map) throws Exception{
			  List<Problem> list = new ArrayList<Problem>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findProblem(new Problem(problemId,problemContent));
			  map.put("problem", list);
			  return "/adminPage/problem";

		  }
		 @RequestMapping(value="/openAlterProblem")
		  public String openAlterProblem(@RequestParam(value="problemId") String problemId,
				  @RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="answer") String answer,
				  Map<String, Object> map) throws UnsupportedEncodingException {
			 map.put("problemId", problemId) ;
			 map.put("problemContent", Toolutil.encodeStr(problemContent)) ;
			 map.put("answer", Toolutil.encodeStr(answer)) ;
			 return "/adminPage/alterProblem";
		  }
		 @RequestMapping(value="/updateProblem",method=RequestMethod.POST)
		 public String updateProblem(@RequestParam(value="problemId") String problemId,
				  @RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="answer") String answer,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			   daoProxy.updateProblem(problemId,problemContent,answer);
			   String str = "ProblemPage";
			   map.put("servlet", str);
			 return "/adminPage/success";
		 }
		 @RequestMapping(value="/openDeleteProblem",method=RequestMethod.GET)
		 public String openDeleteProblem(@RequestParam(value="problemId") String problemId,Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteProblem(problemId);
			  String str = "ProblemPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
		 }
		 @RequestMapping(value="/AddProblemPage")
		  public String AddProblemPage(Map<String, Object> map) {
			  return "/adminPage/addProblem";
		  }
		 @RequestMapping(value="/addProblem",method=RequestMethod.POST)
		 public String addProblem(@RequestParam(value="problemId") String problemId,
				  @RequestParam(value="problemContent") String problemContent,
				  @RequestParam(value="answer") String answer,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			 	daoProxy.addProblem(new Problem(problemId,problemContent,answer));
			 	String str = "ProblemPage";
				   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/AccountPage")
		  public String AccountPage(Map<String, Object> map) throws Exception {
			 List<Account> list = new ArrayList<Account>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllAccount();
			  map.put("account", list);
			  return "/adminPage/account";
		  }
		 @RequestMapping(value="/findAccount",method=RequestMethod.POST)
		  public String findAccount(@RequestParam(value="accountId") String accountId,
				  Map<String, Object> map) throws Exception{
			  List<Account> list = new ArrayList<Account>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findAccount(accountId);
			  map.put("account", list);
			  return "/adminPage/account";

		  }
		 @RequestMapping(value="/openAlterAccount")
		  public String openAlterAccount(@RequestParam(value="accountId") String accountId,
				  @RequestParam(value="accountPwd") String accountPwd,
				  @RequestParam(value="accountType") String accountType,
				  Map<String, Object> map) throws UnsupportedEncodingException {
			 map.put("accountId", accountId) ;
			 map.put("accountPwd", accountPwd) ;
			 map.put("accountType", accountType) ;
			 return "/adminPage/alterAccount";
		  }
		 @RequestMapping(value="/updateAccount",method=RequestMethod.POST)
		 public String updateAccount(@RequestParam(value="accountId") String accountId,
				  @RequestParam(value="accountPwd") String accountPwd,
				  @RequestParam(value="accountType") String accountType,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			   daoProxy.updateAccount(accountId, accountPwd, accountType);
			   String str = "AccountPage";
			   map.put("servlet", str);
			 return "/adminPage/success";
		 }
		 @RequestMapping(value="/openDeleteAccount",method=RequestMethod.GET)
		 public String openDeleteAccount(@RequestParam(value="accountId") String accountId,Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteAccount(accountId);
			  String str = "AccountPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
		 }
		 @RequestMapping(value="/AddAccountPage")
		  public String AddAccountPage(Map<String, Object> map) {
			  return "/adminPage/addAccount";
		  }
		 @RequestMapping(value="/addAccount",method=RequestMethod.POST)
		 public String addAccount(@RequestParam(value="accountId") String accountId,
				  @RequestParam(value="accountPwd") String accountPwd,
				  @RequestParam(value="accountType") String accountType,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			 	daoProxy.addAccount(new Account(accountId,accountPwd,accountType));
			 	String str = "AccountPage";
				   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/ClassesPage")
		  public String ClassesPage(Map<String, Object> map) throws Exception {
			 List<Group> list = new ArrayList<Group>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllGroup();
			  map.put("classes", list);
			  return "/adminPage/classes";
		  }
		 @RequestMapping(value="/findClasses",method=RequestMethod.POST)
		  public String findClasses(@RequestParam(value="classesId") String classesId,
				  Map<String, Object> map) throws Exception{
			  List<Group> list = new ArrayList<Group>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findGroup(new Group(classesId));
			  map.put("classes", list);
			  return "/adminPage/classes";

		  }
		 @RequestMapping(value="/AddClassesPage")
		  public String AddClassesPage(Map<String, Object> map) {
			  return "/adminPage/addClasses";
		  }
		 @RequestMapping(value="/addClasses",method=RequestMethod.POST)
		 public String addClasses(@RequestParam(value="classesId") String classesId,
				  @RequestParam(value="classesName") String classesName,
				  @RequestParam(value="classesNum") String classesNum,
				  @RequestParam(value="colName") String colName,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			 	daoProxy.addGroup(new Group(classesId,classesName,classesNum,colName));
			 	String str = "ClassesPage";
				   map.put("servlet", str);
				   return "/adminPage/success";
	
		 }
		 @RequestMapping(value="/openAlterClasses")
		  public String openAlterClasses(@RequestParam(value="classesId") String classesId,
				  @RequestParam(value="classesName") String classesName,
				  @RequestParam(value="classesNum") String classesNum,
				  @RequestParam(value="colName") String colName,
				  Map<String, Object> map) throws UnsupportedEncodingException {
			 map.put("classesId", Toolutil.encodeStr(classesId)) ;
			 map.put("classesName", Toolutil.encodeStr(classesName)) ;
			 map.put("classesNum", Toolutil.encodeStr(classesNum)) ;
			 map.put("colName", Toolutil.encodeStr(colName)) ;
			 return "/adminPage/alterClasses";
		  }
		 @RequestMapping(value="/updateClasses",method=RequestMethod.POST)
		 public String updateClasses(@RequestParam(value="classesId") String classesId,
				  @RequestParam(value="classesName") String classesName,
				  @RequestParam(value="classesNum") String classesNum,
				  @RequestParam(value="colName") String colName,
				  Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			   daoProxy.updateGroup(classesId, new Group(classesName, classesNum,colName));
			   String str = "ClassesPage";
			   map.put("servlet", str);
			 return "/adminPage/success";
		 }
		 @RequestMapping(value="/openDeleteClasses",method=RequestMethod.GET)
		 public String openDeleteClasses(@RequestParam(value="classesId") String classesId,Map<String, Object> map) throws Exception {
			 AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();  
			  daoProxy.deleteGroup(classesId);
			  String str = "ClassesPage";
			   map.put("servlet", str);
				   return "/adminPage/success";
		 }
		 @RequestMapping(value="/AnswerPage")
		  public String AnswerPage(Map<String, Object> map) throws Exception {
			 List<Answer> list = new ArrayList<Answer>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  list = daoProxy.findAllAnswer();
			  map.put("answer", list);
			  return "/adminPage/answer";
		  }
		 @RequestMapping(value="/findAnswer",method=RequestMethod.POST)
		  public String findAnswer(@RequestParam(value="problemContent") String problemContent,
				  Map<String, Object> map) throws Exception{
			  List<Answer> list = new ArrayList<Answer>();
			  AdminDao daoProxy= (AdminDao) Factory.getAdminDAOInstance();
			  
			  list = daoProxy.findAnswer(problemContent);
			  map.put("answer", list);
			  return "/adminPage/answer";

		  }
		 
}
