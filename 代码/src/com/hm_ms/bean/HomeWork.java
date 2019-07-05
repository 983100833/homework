package com.hm_ms.bean;

public class HomeWork {
	private String homeWorkId;
	private String startTime;
	private String endTime;
	private String homeWorkContent;
	private String homeWorkTitle;
	public HomeWork(String homeWorkId, String startTime, String endTime, String homeWorkContent, String homeWorkTitle) {
		super();
		this.homeWorkId = homeWorkId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.homeWorkContent = homeWorkContent;
		this.homeWorkTitle = homeWorkTitle;
	}
	public HomeWork(String homeWorkId){
		super();
		this.homeWorkId = homeWorkId;
		
	}
	public HomeWork(){
		super();
	}
	public HomeWork(String hmStart, String hmEnd, String problemContent, String problemTitle) {
		// TODO 自动生成的构造函数存根
		this.startTime = hmStart;
		this.endTime = hmEnd;
		this.homeWorkContent = problemContent;
		this.homeWorkTitle = problemTitle;
	}
	public String getHomeWorkId() {
		return homeWorkId;
	}
	public void setHomeWorkId(String homeWorkId) {
		this.homeWorkId = homeWorkId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getHomeWorkContent() {
		return homeWorkContent;
	}
	public void setHomeWorkContent(String homeWorkContent) {
		this.homeWorkContent = homeWorkContent;
	}
	public String getHomeWorkTitle() {
		return homeWorkTitle;
	}
	public void setHomeWorkTitle(String homeWorkTitle) {
		this.homeWorkTitle = homeWorkTitle;
	}
	
	
}
