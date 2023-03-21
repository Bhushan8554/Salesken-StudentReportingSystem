package com.salesken.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/error")
	public String showError() {
		return "error";
	}
	@PostMapping("/report")
	public String getReport(@RequestParam("studentRoll")Integer roll,Model m) throws StudentException {
		Student s= studentService.getStudent(roll);
		m.addAttribute("data", s);
		return "report";
	}
	@PostMapping("/avg")
	public String getavg(@RequestParam("sem")Integer sem,Model m) throws StudentException {
		String percentage=studentService.getAvg(sem)+" %";
		m.addAttribute("avgs", percentage);
		return "avg";
	}
	@PostMapping("/marks")
	public String getmarks(@RequestParam("sub")String sub,Model m) throws StudentException {
		int avg=studentService.getMarks(sub);
		m.addAttribute("marks", avg);
		return "marks";
	}
	@GetMapping("topstudent")
	public String getTopStudnet(Model m) throws StudentException {
		List<Student> x=studentService.getTopStudent();
		
		m.addAttribute("top1", x.get(0));
		m.addAttribute("top2", x.get(1));
		return "tops";
	}
	
}
