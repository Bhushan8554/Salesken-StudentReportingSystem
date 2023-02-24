package com.salesken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.service.StudentService;

@Controller
public class SudentController{

	
	StudentService studentService;
	
	
	public SudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String studentController(@ModelAttribute("student") Student student,BindingResult r) throws StudentException {
		System.out.println(student);
		studentService.addStudent(student);
		return "student";
	}
	@GetMapping("/student")
	public String addStudentController(Model m) {
		Student s=new Student();
		 m.addAttribute("student", s);
		return "student";
	}
	@GetMapping("/")
	public String homePage() {
		return "home";
	}

}
