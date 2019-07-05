package com.hm_ms.dao;

import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Student;
import com.hm_ms.bean.StudentHomeWork;
/**
 * @author DELL
 *
 */
public interface StudentDao {
	/**
	  * 修改密码
	 * @param  stuId,pwd
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updatePerPwd(String stuId,String pwd) throws Exception;
	
	/**
	  * 作业查询
	 * @param  stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<StudentHomeWork> SelectHomeWork(String stuId,String hmId) throws Exception;
	
	/**
	  * 作业提交
	 * @param  stuId,homeWorkId,submitContent
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean Submithomework(String stuId,String homeWorkId,String submitContent) throws Exception;

	/**
	  * 作业查询
	 * @param  stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<StudentHomeWork> SelectAllHomeWork(String stuId) throws Exception;

	public boolean updateHomeWork(String stuId, String hmId, String submitContent)throws Exception;

	public List<Student> findPersonMassage(String username)throws Exception;
}
