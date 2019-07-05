package com.hm_ms.control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.StudentHomeWork;
import com.hm_ms.dao.StudentDao;
import com.hm_ms.factory.Factory;
import com.hm_ms.proxy.DaoProxy;
import com.hm_ms.proxy.StudentProxy;
/**
 * Ñ§Éú¿ØÖÆÆ÷
 * @author Hym
 *
 */

@Controller
public class StudentControl {

	@RequestMapping(value="/serchStuPerHomework",method=RequestMethod.POST)
	 public String serchStuPerHomework(@RequestParam(value="context") String context ,
			 @RequestParam(value="context1") String context1, Map<String, Object> map) throws Exception {
		 List<StudentHomeWork> list = new ArrayList<StudentHomeWork>();
		StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		list = daoproxy.serchStuPerHomework(context1);
		  map.put("student", list);
		  return "/studentPage/3project_list";
	 }
	@RequestMapping(value="/stuLeftPage",method=RequestMethod.GET,params= {"username"})
	  public String stuLeftPage(@RequestParam(value="username") String username ,Map<String, Object> map) {
		  return "/studentPage/left";
	  }
	@RequestMapping(value="/stuRightPage",method=RequestMethod.GET,params= {"username"})
	  public String stuRightPage(@RequestParam(value="username") String username ,Map<String, Object> map) {
		  return "/studentPage/index1";
	  }
	  @RequestMapping(value="/stuPerHomeWork",method=RequestMethod.GET,params= {"username"})
	  public String stuPerHomeWork(@RequestParam(value="username") String username ,Map<String, Object> map) throws Exception {
		  List<StudentHomeWork> list = new ArrayList<StudentHomeWork>();
//		  System.out.println(username+"¿ØÖÆÆ÷");
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  list = daoproxy.SelectAllHomeWork(username);
		  map.put("student", list);
		  map.put("stuId", username);
		  return "/studentPage/3project_list";
	  }
	  @RequestMapping(value="/openHomeWork",method=RequestMethod.GET)
	  public String openHomeWork(@RequestParam(value="stuId") String stuId ,
			  @RequestParam(value="hmId") String hmId ,
			  Map<String, Object> map) throws Exception {
		  List<StudentHomeWork> list = new ArrayList<StudentHomeWork>();
//		  System.out.println(stuId+"¿ØÖÆÆ÷");
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  list = daoproxy.SelectHomeWork(stuId,hmId);
		  map.put("student", list);
		  map.put("stuId", stuId);
		  return "/studentPage/studentHomeWork";
	  }
	  @RequestMapping(value="/updateStudentHomeWork",method=RequestMethod.POST)
	  public String updateStudentHomeWork(@RequestParam(value="stuId") String stuId ,
			  @RequestParam(value="hmId") String hmId ,
			  @RequestParam(value="submitContent") String submitContent ,
			  Map<String, Object> map) throws Exception {
		  List<StudentHomeWork> list = new ArrayList<StudentHomeWork>();
		  System.out.println(stuId+"¿ØÖÆÆ÷");
		  System.out.println(hmId);
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  daoproxy.updateHomeWork(stuId,hmId,submitContent);
		  list = daoproxy.SelectAllHomeWork(stuId);
		  map.put("student", list);
		  map.put("stuId", stuId);
		  return "/studentPage/3project_list";
	  }
	  
	  @RequestMapping(value="/personPage",method=RequestMethod.GET)
	  public String personPage(@RequestParam(value="username") String username ,
			  Map<String, Object> map) throws Exception {
		  List<Student> list = new ArrayList<Student>();
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  list = daoproxy.findPersonMassage(username);
		  map.put("stuId", username);
		  map.put("student", list);
		return "/studentPage/person";
		  
	  }
	  @RequestMapping(value="/alterStuPwd",method=RequestMethod.GET)
	  public String alterStu(@RequestParam(value="stuId") String stuId ,
			  Map<String, Object> map) throws Exception {
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  map.put("stuId", stuId);
		return "/studentPage/alterStudentPwd";
		  
	  }
	  @RequestMapping(value="/updateStuPwd",method=RequestMethod.POST)
	  public String updateStuPwd(@RequestParam(value="stuId") String stuId ,
			  @RequestParam(value="accountPwd") String accountPwd ,
			  Map<String, Object> map) throws Exception {
		  System.out.println(stuId+"²âÊÔ");
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  daoproxy.updatePerPwd(stuId, accountPwd);
		return "redirect:/TestLogin.jsp";
		  
	  }
}
