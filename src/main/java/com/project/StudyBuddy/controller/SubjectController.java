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

import com.project.StudyBuddy.bean.SubjectBean;
import com.project.StudyBuddy.services.SubjectInterface;

@RequestMapping("/subject")
@RestController
//@CrossOrigin(value = "*")
public class SubjectController {
	@Autowired
	SubjectInterface subjectInterface;

	@PostMapping("/addData")
	public ApplicationResponseEntity<SubjectBean> addDataInDB(@RequestBody SubjectBean subjectBean) {
		try {
			subjectInterface.addData(subjectBean);
			return new ApplicationResponseEntity<>("200", "successfull", subjectBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printSubject")
	public ApplicationResponseEntity<List<SubjectBean>> printSubject() {
		try {
			// return agentInterface.getAgentData();
			return new ApplicationResponseEntity<>("200", "successfull", subjectInterface.getSubjecttData());
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printSubject/{subjectID}")
	public ApplicationResponseEntity<SubjectBean> printSubjectBasedOnId(@PathVariable long subjectID) {
		try {

			return new ApplicationResponseEntity<>("200", "subject found", subjectInterface.subjectBasedOnId(subjectID));
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@PutMapping("/updateSubject")
	public ApplicationResponseEntity<SubjectBean> updateSubjectData(@RequestBody SubjectBean subjectBean) {
		try {
			subjectInterface.updateSubject(subjectBean);
			return new ApplicationResponseEntity<>("200", "succesfull", subjectBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}

	@DeleteMapping("/deletSubject/{sId}")
	public ApplicationResponseEntity<HttpStatus> deleteStudentData(@PathVariable long sId) {
		try {
			return new ApplicationResponseEntity<>("200", "succesfully deleted", subjectInterface.deleteSubject(sId));

		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}



}
