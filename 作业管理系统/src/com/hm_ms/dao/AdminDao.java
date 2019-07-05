package com.hm_ms.dao;

import java.util.List;

import com.hm_ms.bean.*;


public interface AdminDao {
	
	/**
	  * 登录
	 * @param  accountId,pwd
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean Login(String accountId,String pwd) throws Exception;
	
	/**
	  * 修改密码
	 * @param  accountId,pwd
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updatePerPwd(String accountId,String pwd) throws Exception;
	
	/**
	  * 添加学生
	 * @param  Student对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addStudent(String stuId,String stuName,
			String stuSex,String colName , String classesName) throws Exception;
	
	/**
	  * 修改学生信息
	 * @param   stuId,student学生对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateStudent(String stuId,String stuName,String stuSex,
			String colName , String classesName) throws Exception;
	
	/**
	  * 删除学生信息
	 * @param   stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteStudent(String stuId) throws Exception;
	
	/**
	  * 查询学生信息
	 * @param   stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<Student> findStudent(String stuId,String stuName) throws Exception;
	
	/**
	  * 添加教师
	 * @param  Teacher对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addTeacher(String teaId , String teaName , String colName, String classesName) throws Exception;
	
	/**
	  * 修改教师信息
	 * @param   teaId,teacher学生对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateTeacher(String teaId,String teaName , String colName ,String classesName) throws Exception;
	
	/**
	  * 删除教师信息
	 * @param   teaId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteTeacher(String teaId) throws Exception;
	
	/**
	  * 查询教师信息
	 * @param   stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<Teacher> findTeacher(String teaId, String teaName) throws Exception;
	
	/**
	  * 添加学院
	 * @param  College对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addCollege(College college) throws Exception;
	
	/**
	  * 修改学院信息
	 * @param   collegeId,college学生对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateCollege(String collegeId,College college) throws Exception;
	
	/**
	  * 删除学院信息
	 * @param   collegeId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteCollege(String collegeId) throws Exception;
	
	/**
	  * 查询学院信息
	 * @param   stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<College> findCollege(College col) throws Exception;
	
	/**
	  * 添加班级
	 * @param  Group对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addGroup(Group group) throws Exception;
	
	/**
	  * 修改班级信息
	 * @param   groupId,group班级对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateGroup(String groupId,Group group) throws Exception;
	
	/**
	  * 删除班级信息
	 * @param   GroupId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteGroup(String GroupId) throws Exception;
	
	/**
	  * 查询班级信息
	 * @param   groId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<Group> findGroup(Group gro) throws Exception;
	/**
	  * 添加作业
	 * @param  HomeWork对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addHomeWork(HomeWork homeWork) throws Exception;
	
	/**
	  * 修改作业信息
	 * @param   HomeWorkId,homeWork作业对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateHomeWork(String HomeWorkId,HomeWork homeWork) throws Exception;
	
	/**
	  * 删除作业信息
	 * @param   HomeWorkId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteHomeWork(String HomeWorkId) throws Exception;
	
	/**
	  * 查询作业信息
	 * @param   stuId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<HomeWork> findHomeWork(HomeWork hom) throws Exception;
	/**
	  * 添加题目
	 * @param  Problem对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addProblem(Problem problem) throws Exception;
	
	/**
	  * 修改题目信息
	 * @param   ProblemId,Problem作业对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateProblem(String ProblemId,String problemContent , String answer) throws Exception;
	
	/**
	  * 删除题目信息
	 * @param   ProblemId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteProblem(String ProblemId) throws Exception;
	
	/**
	  * 查询题目信息
	 * @param   proId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<Problem> findProblem(Problem pro) throws Exception;
	/**
	  * 查询全部学生
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Student> findAllStudent() throws Exception;
	/**
	  * 查询全部教师
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<HomeWork> findAllHomeWork() throws Exception;
	/**
	  * 查询全部作业
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Teacher> findAllTeacher() throws Exception;
	/**
	  * 查询全部问题
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Problem> findAllProblem() throws Exception;
	/**
	  * 添加账户
	 * @param  Account对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean addAccount(Account account) throws Exception;
	
	/**
	  * 修改账户
	 * @param   Account账户对象
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean updateAccount(String accountId,String accountPwd , String accountType) throws Exception;
	
	/**
	  * 删除用户信息
	 * @param   accountId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public boolean deleteAccount(String accountId) throws Exception;
	
	/**
	  * 查找账户
	 * @param   proId
	 * @return  返回值boolean
	 * @throws  抛出的异常
	 */
	public List<Account> findAccount(String accountId) throws Exception;
	/**
	  * 查询全部账户
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Account> findAllAccount() throws Exception;
	/**
	  * 查询全部班级
	 * @param   
	 * @return  返回值List
	 * @throws  抛出的异常
	 */
	public List<Group> findAllGroup() throws Exception;

	public List<Answer> findAllAnswer() throws Exception;

	public List<Answer> findAnswer(String problemContent) throws Exception;
}
