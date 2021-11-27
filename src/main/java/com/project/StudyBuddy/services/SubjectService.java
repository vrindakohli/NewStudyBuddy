package com.project.StudyBuddy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.StudyBuddy.bean.SubjectBean;
import com.project.StudyBuddy.bean.TeacherBean;
import com.project.StudyBuddy.dao.SubjectDao;

@Service
public class SubjectService implements SubjectInterface{

	@Autowired
	SubjectDao subjectDao;
	
	
	@Override
	public SubjectBean addData(SubjectBean subjectBean) throws Exception {
		// TODO Auto-generated method stub
		subjectDao.save(subjectBean);
		return subjectBean;		}

	@Override
	public List<SubjectBean> getSubjecttData() throws Exception {
		// TODO Auto-generated method stub
		return subjectDao.findAll();
	}

	@Override
	public SubjectBean subjectBasedOnId(long sId) throws Exception {
		// TODO Auto-generated method stub
		SubjectBean subjectBean=subjectDao.findById(sId).orElseThrow(()->new Exception("no subject found"));
		return subjectBean;	}

	@Override
	public SubjectBean updateSubject(SubjectBean subjectBean) throws Exception {
		// TODO Auto-generated method stub
		SubjectBean sb= subjectDao.findById(subjectBean.getcId()).orElseThrow(()->new Exception("no subject exists"));
		subjectDao.save(subjectBean);
		return subjectBean;	}

	@Override
	public HttpStatus deleteSubject(long sId) throws Exception {
		// TODO Auto-generated method stub
		SubjectBean sb= subjectDao.findById(sId).orElseThrow(()->new Exception("no agent exist"));
		subjectDao.deleteById(sId);
		return HttpStatus.ACCEPTED;	}

}
