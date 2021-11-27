package com.project.StudyBuddy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StudentBean {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long sId;
	private String sName;
	private long sClass;
	private long contactNo;
	private String emailId;
	private String password;
	private String school;
	private String userType;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(String sName, long sClass, long contactNo, String emailId, String school, String userType) {
		super();
		this.sName = sName;
		this.sClass = sClass;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.school = school;
		this.userType = userType;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getsClass() {
		return sClass;
	}
	public void setsClass(long sClass) {
		this.sClass = sClass;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public long getsId() {
		return sId;
	}
	
	
}