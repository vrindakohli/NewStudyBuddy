package com.project.StudyBuddy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudyBuddy.bean.StudentBean;

@Repository
public interface StudentDao extends JpaRepository<StudentBean, Long>{

}
