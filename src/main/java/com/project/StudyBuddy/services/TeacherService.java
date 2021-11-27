package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.StudyBuddy.bean.TeacherBean;
import com.project.StudyBuddy.dao.TeacherDao;

@Service
public class TeacherService implements TeacherInterface{
	@Autowired
	TeacherDao teacherDao;

	
	@Override
	public TeacherBean addData(TeacherBean teacherBean) throws Exception {
		// TODO Auto-generated method stub
		teacherDao.save(teacherBean);
		return teacherBean;	}


	@Override
	public List<TeacherBean> getTeacherData() throws Exception {
		// TODO Auto-generated method stub
		return teacherDao.findAll();
	}


	@Override
	public TeacherBean teacherBasedOnId(long tId) throws Exception {
		// TODO Auto-generated method stub
		TeacherBean teacherBean=teacherDao.findById(tId).orElseThrow(()->new Exception("no teacher found"));
		return teacherBean;	}


	@Override
	public TeacherBean updateTeacher(TeacherBean teacherBean) throws Exception {
		// TODO Auto-generated method stub
		TeacherBean tb= teacherDao.findById(teacherBean.gettId()).orElseThrow(()->new Exception("no agent exists"));
		teacherDao.save(teacherBean);
		return teacherBean;
	}
	
	@Override
	public HttpStatus deleteTeacher(long tId) throws Exception {
		// TODO Auto-generated method stub
		TeacherBean ae= teacherDao.findById(tId).orElseThrow(()->new Exception("no agent exist"));
		teacherDao.deleteById(tId);
		return HttpStatus.ACCEPTED;	}


	
}
