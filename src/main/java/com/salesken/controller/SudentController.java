package com.salesken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.service.StudentService;

@Controller
public class SudentController{

	@Autowired(required = false)
	StudentService studentService;
	
	
	@PostMapping("/student")
	public String studentController(@ModelAttribute("student") Student student) throws StudentException {
		studentService.addStudent(student);
		return "student";
	}
	@GetMapping("/student")
	public String addStudentController() {
		return "student";
	}

}
