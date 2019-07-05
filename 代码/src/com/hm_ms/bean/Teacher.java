package com.hm_ms.bean;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private String collegeName;
	private String classesName;
	public Teacher(String teacherId, String teacherName, String collegeName,String classesName) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.collegeName = collegeName;
		this.classesName=classesName;
	}
	public Teacher() {
		super();
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getClassesName() {
		return classesName;
	}
	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}
	
}
