package com.hm_ms.dao;

import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;

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
	 * @param  homework����,groupId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean ArrangementHomeWork(HomeWork homework,String groupId) throws Exception;
	
	/**
	  * �鿴��ǰ��ʦ�ѷ�������ҵ
	 * @param  ��ʦ��
	 * @return  ����ֵList
	 * @throws  �׳����쳣
	 */
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception;
	
	/**
	  * ������ҵ
	 * @param  ��ʦ��
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean CorrectHomeWork(String studentId,String homeWorkId,String grade) throws Exception;
}
