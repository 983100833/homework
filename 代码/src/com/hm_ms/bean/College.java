package com.hm_ms.bean;

public class College {
	private String collegeId;
	private String collegeName;
	private String schoolName;
	public College(String collegeId, String collegeName, String schoolName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.schoolName = schoolName;
	}
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
}
