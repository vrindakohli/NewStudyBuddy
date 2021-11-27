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

import com.project.StudyBuddy.bean.StudentBean;
import com.project.StudyBuddy.services.StudentInterface;


@RequestMapping("/student")
@RestController
//@CrossOrigin(value = "*") 
public class StudentController {
	@Autowired
	StudentInterface studentInterface;

	@PostMapping("/addData")
	public ApplicationResponseEntity<StudentBean> addDataInDB(@RequestBody StudentBean studentBean) {
		try {
			studentInterface.addData(studentBean);
			return new ApplicationResponseEntity<>("200", "successfull", studentBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printStudent")
	public ApplicationResponseEntity<List<StudentBean>> printStudent() {
		try {
			// return agentInterface.getAgentData();
			return new ApplicationResponseEntity<>("200", "successfull", studentInterface.getStudentData());
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@GetMapping("/printStudent/{studentId}")
	public ApplicationResponseEntity<StudentBean> printStudentBasedOnId(@PathVariable long studentId) {
		try {

			return new ApplicationResponseEntity<>("200", "student found", studentInterface.studentBasedOnId(studentId));
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}
	}

	@PutMapping("/updateStudent")
	public ApplicationResponseEntity<StudentBean> updateStudentData(@RequestBody StudentBean studentBean) {
		try {
			studentInterface.updatestudent(studentBean);
			return new ApplicationResponseEntity<>("200", "succesfull", studentBean);
		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}

	@DeleteMapping("/deleteStudent/{tId}")
	public ApplicationResponseEntity<HttpStatus> deleteStudentData(@PathVariable long tId) {
		try {
			return new ApplicationResponseEntity<>("200", "succesfully deleted", studentInterface.deletestudent(tId));

		} catch (Exception e) {
			// TODO: handle exception
			return new ApplicationResponseEntity<>("400", e.toString(), null);
		}

	}


}
