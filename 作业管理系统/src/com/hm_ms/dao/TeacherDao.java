package com.hm_ms.dao;

import java.util.List;
import java.util.Map;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.bean.Teacher;

public interface TeacherDao {
	/**
	  * �����Ŀ
	 * @param  problemId,problemContent��answerContent
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean addProblem(String problemId,String problemContent,String answerContent) throws Exception;
	
	/**
	  * �޸���Ŀ
	 * @param  problemId,problemContent��answerContent
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updateProblem(String problemId,String problemContent,String answerContent) throws Exception;
	
	/**
	  * ɾ����Ŀ
	 * @param  problemId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean deleteProblem(String problemId) throws Exception;
	
	/**
	  * ��ѯ��Ŀ
	 * @param  problem ����
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<Problem> deleteProblem(Problem problem) throws Exception;
	
	/**
	  * ������ҵ
	 * @param  homework����,groupName
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean ArrangementHomeWork(HomeWork homework,String groupName,String teaname) throws Exception;
	/**
	  * �鿴��ǰ��ʦ�ѷ�������ҵ
	 * @param  ��ʦ��
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception;
	/**
	  * �鿴��ǰ��������ʦ��ҵ��ѧ������ҵ����
	 * @param  ��ʦ��
	 * @throws  �׳����쳣
	 */
	
	public Map<String,Object> FindStu(String teacherName,String hmId) throws Exception;
	/**
	  * ���ѧ������ҵ
	 * @param  ��ʦ��
	 * @throws  �׳����쳣
	 */
	
	public Map<String,Object> FindStuhow(String stuId,String hmId) throws Exception;
	/**
	  * ������ҵ
	 * @param  ��ʦ��
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean CorrectHomeWork(String studentId,String homeWorkId,String grade) throws Exception;

	public String findTeacherName(String teaname) throws Exception;

	public String finClassesName(String teaName)throws Exception;

	public List<Teacher> findPersonMassage(String username)throws Exception;
	public boolean updatePerPwd(String teaId,String pwd) throws Exception;

}
