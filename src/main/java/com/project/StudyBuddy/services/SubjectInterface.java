package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.project.StudyBuddy.bean.StudentBean;
import com.project.StudyBuddy.bean.SubjectBean;

public interface SubjectInterface {
	public SubjectBean addData(SubjectBean subjectBean) throws Exception;
	public List<SubjectBean> getSubjecttData() throws Exception;
	public SubjectBean subjectBasedOnId(long sId) throws Exception;
	public SubjectBean updateSubject(SubjectBean subjectBean) throws Exception;
	public HttpStatus deleteSubject(long tId) throws Exception;

}
