package com.hm_ms.dao;

import java.util.List;
import java.util.Map;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.bean.Teacher;

public interface TeacherDao {
	/**
	  * 添加题目
	 * @param  problemId,problemContent，answerContent
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addProblem(String problemId,String problemContent,String answerContent) throws Exception;
	
	/**
	  * 修改题目
	 * @param  problemId,problemContent，answerContent
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateProblem(String problemId,String problemContent,String answerContent) throws Exception;
	
	/**
	  * 删除题目
	 * @param  problemId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteProblem(String problemId) throws Exception;
	
	/**
	  * 查询题目
	 * @param  problem 对象
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Problem> deleteProblem(Problem problem) throws Exception;
	
	/**
	  * 发布作业
	 * @param  homework对象,groupName
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean ArrangementHomeWork(HomeWork homework,String groupName,String teaname) throws Exception;
	/**
	  * 查看当前老师已发布的作业
	 * @param  教师名
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception;
	/**
	  * 查看当前正在做老师作业的学生的作业内容
	 * @param  教师名
	 * @throws  抛出的异常
	 */
	
	public Map<String,Object> FindStu(String teacherName,String hmId) throws Exception;
	/**
	  * 获得学生的作业
	 * @param  教师名
	 * @throws  抛出的异常
	 */
	
	public Map<String,Object> FindStuhow(String stuId,String hmId) throws Exception;
	/**
	  * 批改作业
	 * @param  教师名
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean CorrectHomeWork(String studentId,String homeWorkId,String grade) throws Exception;

	public String findTeacherName(String teaname) throws Exception;

	public String finClassesName(String teaName)throws Exception;

	public List<Teacher> findPersonMassage(String username)throws Exception;
	public boolean updatePerPwd(String teaId,String pwd) throws Exception;

}
