package com.hm_ms.dao;

import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;

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
	 * @param  homework对象,groupId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean ArrangementHomeWork(HomeWork homework,String groupId) throws Exception;
	
	/**
	  * 查看当前老师已发布的作业
	 * @param  教师名
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception;
	
	/**
	  * 批改作业
	 * @param  教师名
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean CorrectHomeWork(String studentId,String homeWorkId,String grade) throws Exception;
}
