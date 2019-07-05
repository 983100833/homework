package com.hm_ms.bean;

public class Group {
	private String groupId;
	private String groupName;
	private String groupNumber;
	private String college;
	public Group(String groupId, String groupName, String groupNumber, String college) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupNumber = groupNumber;
		this.college = college;
	}
	public Group( String groupName, String groupNumber,String college) {
		super();
		
		this.groupName = groupName;
		this.groupNumber = groupNumber;
		this.college = college;
	}
	public  Group() {
		super();
		
	}
	public Group(String classesId) {
		// TODO 自动生成的构造函数存根
		this.groupId = classesId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

}
