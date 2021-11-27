package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.project.StudyBuddy.bean.TeacherBean;
import com.project.StudyBuddy.dao.TeacherDao;


public interface TeacherInterface {

	public TeacherBean addData(TeacherBean teacherBean) throws Exception;
	public List<TeacherBean> getTeacherData() throws Exception;
	public TeacherBean teacherBasedOnId(long tId) throws Exception;
	public TeacherBean updateTeacher(TeacherBean teacherBean) throws Exception;
	public HttpStatus deleteTeacher(long tId) throws Exception;
	

}
