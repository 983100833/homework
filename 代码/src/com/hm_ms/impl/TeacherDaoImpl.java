package com.hm_ms.impl;

import java.util.List;

import com.hm_ms.bean.HomeWork;
import com.hm_ms.bean.Problem;
import com.hm_ms.dao.TeacherDao;

public class TeacherDaoImpl implements TeacherDao {
	private java.sql.Connection con = null ;
	public TeacherDaoImpl(java.sql.Connection con) {
		this.con=con;
	}
	@Override
	public boolean addProblem(String problemId, String problemContent, String answerContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProblem(String problemId, String problemContent, String answerContent) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProblem(String problemId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Problem> deleteProblem(Problem problem) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ArrangementHomeWork(HomeWork homework, String groupId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HomeWork> FindHomeWork(String teacherName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean CorrectHomeWork(String studentId, String homeWorkId, String grade) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
