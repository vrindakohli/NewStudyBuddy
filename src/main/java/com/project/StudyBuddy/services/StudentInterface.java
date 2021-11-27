package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.project.StudyBuddy.bean.StudentBean;

public interface StudentInterface {
	public StudentBean addData(StudentBean studentBean) throws Exception;
	public List<StudentBean> getStudentData() throws Exception;
	public StudentBean studentBasedOnId(long sId) throws Exception;
	public StudentBean updatestudent(StudentBean studentBean) throws Exception;
	public HttpStatus deletestudent(long sId) throws Exception;

	

}
