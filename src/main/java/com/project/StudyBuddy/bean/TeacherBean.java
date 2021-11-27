package com.project.StudyBuddy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeacherBean {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long tId;
	
	private String tName;
	private int tClass;
	private long yearsOfExperience;
	private String subject;
	private long age;
	private long availability;
	private String school;
	private String maxQualifications;
	private long Salary;
	public TeacherBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherBean(String tName, int tClass, long yearsOfExperience, String subject, long age, long availability,
			String school, String maxQualifications) {
		super();
		this.tName = tName;
		this.tClass = tClass;
		this.yearsOfExperience = yearsOfExperience;
		this.subject = subject;
		this.age = age;
		this.availability = availability;
		this.school = school;
		this.maxQualifications = maxQualifications;
	}
	public long gettId() {
		return tId;
	}
	public void settId(long tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int gettClass() {
		return tClass;
	}
	public void settClass(int tClass) {
		this.tClass = tClass;
	}
	public long getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(long yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getAvailability() {
		return availability;
	}
	public void setAvailability(long availability) {
		this.availability = availability;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMaxQualifications() {
		return maxQualifications;
	}
	public void setMaxQualifications(String maxQualifications) {
		this.maxQualifications = maxQualifications;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	
	

}
