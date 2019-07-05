package com.hm_ms.bean;

public class Answer {
	private String problemContent;
	private String answer;
	public Answer() {
		super();
	}
	public Answer(String problemContent,String answer) {
		super();
		this.setProblemContent(problemContent);
		this.setAnswer(answer);
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getProblemContent() {
		return problemContent;
	}
	public void setProblemContent(String problemContent) {
		this.problemContent = problemContent;
	}
	
}
