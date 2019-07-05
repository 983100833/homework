package com.hm_ms.bean;

public class Problem {
	private String problemId;
	private String problemContent;
	private String answerContent;
	public Problem(String problemId, String problemContent, String answerContent) {
		super();
		this.problemId = problemId;
		this.problemContent = problemContent;
		this.answerContent = answerContent;
	}
	public Problem(String problemId, String problemContent) {
		super();
		this.problemId = problemId;
		this.problemContent = problemContent;
	}
	public Problem() {
		// TODO 自动生成的构造函数存根
		super();
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
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	
}
