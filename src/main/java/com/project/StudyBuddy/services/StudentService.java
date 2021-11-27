package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.StudyBuddy.bean.StudentBean;
import com.project.StudyBuddy.dao.StudentDao;

@Service
public class StudentService implements StudentInterface{
	
	@Autowired
	StudentDao studentDao;

	@Override
	public StudentBean addData(StudentBean studentBean) throws Exception {
		// TODO Auto-generated method stub
		studentDao.save(studentBean);
		return studentBean;		}

	@Override
	public List<StudentBean> getStudentData() throws Exception {
		// TODO Auto-generated method stub
		return studentDao.findAll();	}

	@Override
	public StudentBean studentBasedOnId(long tId) throws Exception {
		// TODO Auto-generated method stub
		StudentBean studentBean=studentDao.findById(tId).orElseThrow(()->new Exception("no teacher found"));
		return studentBean;
		
	}

	@Override
	public StudentBean updatestudent(StudentBean studentBean) throws Exception {
		// TODO Auto-generated method stub
		StudentBean sb= studentDao.findById(studentBean.getsId()).orElseThrow(()->new Exception("no agent exists"));
		studentDao.save(studentBean);
		return studentBean;}

	@Override
	public HttpStatus deletestudent(long tId) throws Exception {
		// TODO Auto-generated method stub
		StudentBean ae= studentDao.findById(tId).orElseThrow(()->new Exception("no agent exist"));
		studentDao.deleteById(tId);
		return HttpStatus.ACCEPTED;	}

}
