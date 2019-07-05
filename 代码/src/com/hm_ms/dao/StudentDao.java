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
	  * �޸�����
	 * @param  stuId,pwd
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean updatePerPwd(String stuId,String pwd) throws Exception;
	
	/**
	  * ��ҵ��ѯ
	 * @param  stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<StudentHomeWork> SelectHomeWork(String stuId,String hmId) throws Exception;
	
	/**
	  * ��ҵ�ύ
	 * @param  stuId,homeWorkId,submitContent
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public boolean Submithomework(String stuId,String homeWorkId,String submitContent) throws Exception;

	/**
	  * ��ҵ��ѯ
	 * @param  stuId
	 * @return  ����ֵboolean
	 * @throws  �׳����쳣
	 */
	public List<StudentHomeWork> SelectAllHomeWork(String stuId) throws Exception;

	public boolean updateHomeWork(String stuId, String hmId, String submitContent)throws Exception;

	public List<Student> findPersonMassage(String username)throws Exception;
}
