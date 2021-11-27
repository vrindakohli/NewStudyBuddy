package com.project.StudyBuddy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudyBuddy.bean.SubjectBean;

@Repository
public interface SubjectDao extends JpaRepository<SubjectBean, Long>{

}
