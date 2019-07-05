package com.hm_ms.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm_ms.bean.Group;
import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.Teacher;
import com.hm_ms.dao.AdminDao;
import com.hm_ms.dao.StudentDao;
import com.hm_ms.dao.TeacherDao;
import com.hm_ms.factory.Factory;
import com.hm_ms.util.Toolutil;
@Controller
public class TeacherControl {
	
	@RequestMapping(value="/queryhomework",method=RequestMethod.GET)
	public String queryhomework(@RequestParam(value="username") String username,Map<String,Object> map) throws Exception{
	 TeacherDao teadao=Factory.getTeacherDAOInstance();
	 String name = teadao.findTeacherName(username);
	 System.out.println(name);
	 map.put("teaId", username);
	 map.put("teaName", name);
	List<HomeWork> homelist=teadao.FindHomeWork(name);
	map.put("homelist", homelist);
	System.out.println(homelist.get(0).getHomeWorkId());
	return "/teacherPage/Homework";
		
	}
	@RequestMapping(value="/addhomework",method=RequestMethod.POST)
	public String addhomework(@RequestParam(value="teaname") String teaname,@RequestParam(value="groupName") String groupName,
			Map<String,Object> map,@RequestParam(value="hmid") String hmid,
			@RequestParam(value="hmTitle") String hmTitle,
			@RequestParam(value="hmStart") String hmStart,
			@RequestParam(value="hmEnd") String hmEnd,
			@RequestParam(value="hmContent") String hmContent) throws Exception{
	 TeacherDao teadao=Factory.getTeacherDAOInstance();
	 HomeWork homework=new HomeWork(hmid, hmStart, hmEnd, hmContent, hmTitle);
	teadao.ArrangementHomeWork(homework, groupName,teaname);
	List<HomeWork> homelist=teadao.FindHomeWork(teaname);
	map.put("homelist", homelist);
	System.out.println(homelist.get(0).getHomeWorkId());
	return "/teacherPage/Homework";
		
	}
	@RequestMapping(value="/querystu",method=RequestMethod.GET)
	public String querystu(@RequestParam(value="teaname") String teaname,
			@RequestParam(value="hmid") String hmid,Map<String,Object> map) throws Exception{
		System.out.println(hmid);
	 TeacherDao teadao=Factory.getTeacherDAOInstance();
	 Map<String, Object> stumap=teadao.FindStu(teaname,hmid);
	map.put("stulist", stumap.get("stulist"));
	map.put("hoWork", stumap.get("hoWork"));
	return "/teacherPage/getthomwork";
	
	}
	@RequestMapping(value="/updatehomework",method=RequestMethod.POST)
	public String updatehomework(@RequestParam(value="howid") String howid,
			@RequestParam(value="stuid") String stuid,Map<String,Object> map) throws Exception{
	
		System.out.println(stuid);
	 TeacherDao teadao=Factory.getTeacherDAOInstance();
	 Map<String,Object> updatemap=teadao.FindStuhow(stuid, howid);
	 map.put("stu", updatemap.get("stu"));
	 map.put("hoWork", updatemap.get("hoWork"));
	 System.out.println("555");
	 map.put("text", updatemap.get("text"));
	return "/teacherPage/updatehomework";
	
	}
	@RequestMapping(value="/Correct",method=RequestMethod.POST)
	public String Correct(@RequestParam(value="howid") String howid,
			@RequestParam(value="stuid") String stuid,@RequestParam(value="teaname") String teaname,@RequestParam(value="grade") String grade,
			Map<String,Object> map) throws Exception{
	
		System.out.println(stuid);
	 TeacherDao teadao=Factory.getTeacherDAOInstance();
	 Map<String, Object> stumap=teadao.FindStu(teaname,howid);
		map.put("stulist", stumap.get("stulist"));
		map.put("hoWork", stumap.get("hoWork"));
	 teadao.CorrectHomeWork(stuid, howid, grade);
	return "/teacherPage/getthomwork";
	
	}
	@RequestMapping(value="/TeacherLeftPage",method=RequestMethod.GET,params= {"username"})
	  public String TeacherLeftPage(@RequestParam(value="username") String username ,Map<String, Object> map) {
		  return "/teacherPage/teacherleft";
	  }
	@RequestMapping(value="/TeacherRightPage",method=RequestMethod.GET,params= {"username"})
	  public String TeacherRightPage(@RequestParam(value="username") String username ,Map<String, Object> map) {
		  return "/teacherPage/teacherindex1";
	  }
	@RequestMapping(value="/AddHomeWork",method=RequestMethod.GET)
	  public String AddHomeWork(@RequestParam(value="teaName") String teaName,Map<String, Object> map) throws Exception {
		System.out.println(teaName);
		map.put("teaName", Toolutil.encodeStr(teaName));
		TeacherDao teadao=Factory.getTeacherDAOInstance();
		String classesName = teadao.finClassesName(teaName);
		map.put("classesName", classesName);
		  return "/teacherPage/addhomework";
	  }
	@RequestMapping(value="/personTeacher",method=RequestMethod.GET,params= {"username"})
	  public String personTeacher(@RequestParam(value="username") String username ,
			  Map<String, Object> map) throws Exception {
		 List<Teacher> list = new ArrayList<Teacher>();
		  TeacherDao daoproxy = (TeacherDao)Factory.getTeacherDAOInstance();
		  list = daoproxy.findPersonMassage(username);
		  map.put("teaId", username);
		  map.put("teacher", list);  
		return "/teacherPage/personTeacher";
	  }
	 @RequestMapping(value="/alterTeacherPwd",method=RequestMethod.GET)
	  public String alterTeacherPwd(@RequestParam(value="teaId") String teaId ,
			  Map<String, Object> map) throws Exception {
		  StudentDao daoproxy = (StudentDao)Factory.getStudentDAOInstance();
		  map.put("teaId", teaId);
		return "/teacherPage/alterTeacherPwd";
}
//	  @RequestMapping(value="/updateStuPwd",method=RequestMethod.POST)
//	  public String updateStuPwd(@RequestParam(value="teaId") String teaId ,
//			  @RequestParam(value="accountPwd") String accountPwd ,
//			  Map<String, Object> map) throws Exception {
//		  System.out.println(teaId+"≤‚ ‘");
//		  TeacherDao daoproxy = (TeacherDao)Factory.getTeacherDAOInstance();
//		  daoproxy.updatePerPwd(teaId, accountPwd);
//		return "redirect:/TestLogin.jsp";
//		  
//	  }
}
