package com.project.StudyBuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudyBuddy.bean.TeacherBean;
import com.project.StudyBuddy.dao.TeacherDao;
import com.project.StudyBuddy.services.TeacherInterface;

@RequestMapping("/teacher")
@RestController
//@CrossOrigin(value = "*") // means another port can access this code. used for angular code to access this
							// project

public class TeacherController {
	@Autowired
	TeacherInterface teacherInterface;

	@PostMapping("/addData")
	public ApplicationResponseEntity<TeacherBean> addDataInDB(@RequestBody TeacherBean teacherBean) {
		try {
			teacherInterface.addData(teacherBean);
			return new ApplicationResponseEntity<>("200", "successfull", teacherBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printAgent")
	public ApplicationResponseEntity<List<TeacherBean>> printTeacher() {
		try {
			// return agentInterface.getAgentData();
			return new ApplicationResponseEntity<>("200", "successfull", teacherInterface.getTeacherData());
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printAgent/{agentID}")
	public ApplicationResponseEntity<TeacherBean> printTeacherBasedOnId(@PathVariable long teacherId) {
		try {

			return new ApplicationResponseEntity<>("200", "teacher found", teacherInterface.teacherBasedOnId(teacherId));
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@PutMapping("/updateAgent")
	public ApplicationResponseEntity<TeacherBean> updateTeacherData(@RequestBody TeacherBean teacherBean) {
		try {
			teacherInterface.updateTeacher(teacherBean);
			return new ApplicationResponseEntity<>("200", "succesfull", teacherBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}

	@DeleteMapping("/deleteTeacher/{tId}")
	public ApplicationResponseEntity<HttpStatus> deleteTeacherData(@PathVariable long tId) {
		try {
			return new ApplicationResponseEntity<>("200", "succesfully deleted", teacherInterface.deleteTeacher(tId));

		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}

}
