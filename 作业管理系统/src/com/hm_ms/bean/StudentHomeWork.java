package com.hm_ms.bean;

public class StudentHomeWork {
	private String stuId;
	private String hmId;
	private String teaName;
	private String submitContent;
	private boolean submitState;
	private boolean endState;
	private String problemTitle;
	private String problemId;
	private String problemContent;
	private String grade;
	public boolean isSubmitState() {
		return submitState;
	}
	public void setSubmitState(boolean submitState) {
		this.submitState = submitState;
	}
	public boolean isEndState() {
		return endState;
	}
	public void setEndState(boolean endState) {
		this.endState = endState;
	}

	
	public StudentHomeWork(){
		super();
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getHmId() {
		return hmId;
	}
	public void setHmId(String hmId) {
		this.hmId = hmId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getSubmitContent() {
		return submitContent;
	}
	public void setSubmitContent(String submitContent) {
		this.submitContent = submitContent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getProblemTitle() {
		return problemTitle;
	}
	public void setProblemTitle(String problemTitle) {
		this.problemTitle = problemTitle;
	}
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getProblemContent() {
		return problemContent;
	}
	public void setProblemContent(String problemContent) {
		this.problemContent = problemContent;
	}
	
}
