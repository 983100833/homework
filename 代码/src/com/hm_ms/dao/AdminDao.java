package com.hm_ms.dao;

import java.util.List;

import com.hm_ms.bean.*;


public interface AdminDao {
	
	/**
	  * ��¼
	 * @param  accountId,pwd
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean Login(String accountId,String pwd) throws Exception;
	
	/**
	  * �޸�����
	 * @param  accountId,pwd
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updatePerPwd(String accountId,String pwd) throws Exception;
	
	/**
	  * ���ѧ��
	 * @param  Student����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addStudent(String stuId,String stuName,
			String stuSex,String colName , String classesName) throws Exception;
	
	/**
	  * �޸�ѧ����Ϣ
	 * @param   stuId,studentѧ������
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateStudent(String stuId,String stuName,String stuSex,
			String colName , String classesName) throws Exception;
	
	/**
	  * ɾ��ѧ����Ϣ
	 * @param   stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteStudent(String stuId) throws Exception;
	
	/**
	  * ��ѯѧ����Ϣ
	 * @param   stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<Student> findStudent(String stuId,String stuName) throws Exception;
	
	/**
	  * ��ӽ�ʦ
	 * @param  Teacher����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addTeacher(String teaId , String teaName , String colName, String classesName) throws Exception;
	
	/**
	  * �޸Ľ�ʦ��Ϣ
	 * @param   teaId,teacherѧ������
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateTeacher(String teaId,String teaName , String colName ,String classesName) throws Exception;
	
	/**
	  * ɾ����ʦ��Ϣ
	 * @param   teaId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteTeacher(String teaId) throws Exception;
	
	/**
	  * ��ѯ��ʦ��Ϣ
	 * @param   stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<Teacher> findTeacher(String teaId, String teaName) throws Exception;
	
	/**
	  * ���ѧԺ
	 * @param  College����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addCollege(College college) throws Exception;
	
	/**
	  * �޸�ѧԺ��Ϣ
	 * @param   collegeId,collegeѧ������
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateCollege(String collegeId,College college) throws Exception;
	
	/**
	  * ɾ��ѧԺ��Ϣ
	 * @param   collegeId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteCollege(String collegeId) throws Exception;
	
	/**
	  * ��ѯѧԺ��Ϣ
	 * @param   stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<College> findCollege(College col) throws Exception;
	
	/**
	  * ��Ӱ༶
	 * @param  Group����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addGroup(Group group) throws Exception;
	
	/**
	  * �޸İ༶��Ϣ
	 * @param   groupId,group�༶����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateGroup(String groupId,Group group) throws Exception;
	
	/**
	  * ɾ���༶��Ϣ
	 * @param   GroupId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteGroup(String GroupId) throws Exception;
	
	/**
	  * ��ѯ�༶��Ϣ
	 * @param   groId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<Group> findGroup(Group gro) throws Exception;
	/**
	  * �����ҵ
	 * @param  HomeWork����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addHomeWork(HomeWork homeWork) throws Exception;
	
	/**
	  * �޸���ҵ��Ϣ
	 * @param   HomeWorkId,homeWork��ҵ����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateHomeWork(String HomeWorkId,HomeWork homeWork) throws Exception;
	
	/**
	  * ɾ����ҵ��Ϣ
	 * @param   HomeWorkId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteHomeWork(String HomeWorkId) throws Exception;
	
	/**
	  * ��ѯ��ҵ��Ϣ
	 * @param   stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<HomeWork> findHomeWork(HomeWork hom) throws Exception;
	/**
	  * �����Ŀ
	 * @param  Problem����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addProblem(Problem problem) throws Exception;
	
	/**
	  * �޸���Ŀ��Ϣ
	 * @param   ProblemId,Problem��ҵ����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateProblem(String ProblemId,String problemContent , String answer) throws Exception;
	
	/**
	  * ɾ����Ŀ��Ϣ
	 * @param   ProblemId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteProblem(String ProblemId) throws Exception;
	
	/**
	  * ��ѯ��Ŀ��Ϣ
	 * @param   proId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<Problem> findProblem(Problem pro) throws Exception;
	/**
	  * ��ѯȫ��ѧ��
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Student> findAllStudent() throws Exception;
	/**
	  * ��ѯȫ����ʦ
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<HomeWork> findAllHomeWork() throws Exception;
	/**
	  * ��ѯȫ����ҵ
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Teacher> findAllTeacher() throws Exception;
	/**
	  * ��ѯȫ������
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Problem> findAllProblem() throws Exception;
	/**
	  * ����˻�
	 * @param  Account����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addAccount(Account account) throws Exception;
	
	/**
	  * �޸��˻�
	 * @param   Account�˻�����
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateAccount(String accountId,String accountPwd , String accountType) throws Exception;
	
	/**
	  * ɾ���û���Ϣ
	 * @param   accountId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteAccount(String accountId) throws Exception;
	
	/**
	  * �����˻�
	 * @param   proId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<Account> findAccount(String accountId) throws Exception;
	/**
	  * ��ѯȫ���˻�
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Account> findAllAccount() throws Exception;
	/**
	  * ��ѯȫ���༶
	 * @param   
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Group> findAllGroup() throws Exception;

	public List<Answer> findAllAnswer() throws Exception;

	public List<Answer> findAnswer(String problemContent) throws Exception;
}
