package com.hm_ms.control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm_ms.bean.Account;
import com.hm_ms.bean.Problem;
import com.hm_ms.dao.AccountDao;
import com.hm_ms.dao.AdminDao;
import com.hm_ms.factory.Factory;
import com.hm_ms.proxy.StudentProxy;
import com.hm_ms.util.Toolutil;
@Controller
public class AccountControl {
	  @RequestMapping(value="/AccountControl",method=RequestMethod.POST,params= {"username"})
	  public String Login (@RequestParam(value="username") String username , @RequestParam(value="pwd")String pwd,
			  Map<String, Object> map) throws  Exception{
		  AccountDao daoProxy= (AccountDao) Factory.getUserDAOInstance();
			String result=daoProxy.Login(username, pwd);
			//map.put("text", new String[] {"111","222"});
			System.out.println(result);
			System.out.println(username);
			if (result.equals("admin")) {
				return "/adminPage/adminindex";
			}
		   if (result.equals("student")) {
				return "/studentPage/Index";
			}
		   if (result.equals("teacher")) {
				return "/teacherPage/teacher/teacherIndex";
			}
		   return null;

		  
	  }
	  


}
