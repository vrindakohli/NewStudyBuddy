package com.project.StudyBuddy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubjectBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cId;
	private String cName;
	private long fees;

	public SubjectBean() {
		super();

		// TODO Auto-generated constructor stub
	}

	public SubjectBean(String cName, long fees) {
		super();
		this.cName = cName;
		this.fees = fees;
	}

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	
}
