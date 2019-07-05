package com.hm_ms.bean;

public class Student {
	private String studentId;
	private String studentName;
	private String classesName;
	private String stuSex;
	private String collegeName;
	private String stuPwd;
	public Student() {
		
		super();
	}
	public Student(String studentId, String studentName, String classesName, String stuSex, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stuSex = stuSex;
		this.collegeName = collegeName;
		this.classesName = classesName;
	}
	public Student(String studentId, String studentName, String classesName, String stuSex, String collegeName,String stuPwd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.classesName = classesName;
		this.stuSex = stuSex;
		this.collegeName = collegeName;
		this.stuPwd = stuPwd;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassesName() {
		return classesName;
	}
	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	
}
