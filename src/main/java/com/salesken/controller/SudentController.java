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
	@PostMapping("/report")
	public String getReport(@RequestParam("studentRoll")Integer roll,Model m) throws StudentException {
		Student s= studentService.getStudent(roll);
		m.addAttribute("data", s);
		return "report";
	}
	@PostMapping("/avg")
	public String getavg(@RequestParam("sem")Integer roll,Model m) throws StudentException {
		List<Student> s= studentService.getAllStudent();
		int n=0;
		int count=0;
		for(Student a:s) {
			if(roll==1) {
				n+=a.getSemister1().getEnglish();
				n+=a.getSemister1().getMath();
				n+=a.getSemister1().getScience();
			}else {
				n+=a.getSemister2().getEnglish();
				n+=a.getSemister2().getMath();
				n+=a.getSemister2().getScience();
			}
			count++;
		}count*=100;
		int avg=(n/count)*100;
		
		m.addAttribute("avgs", avg);
		return "avg";
	}
	@PostMapping("/marks")
	public String getmarks(@RequestParam("sub")String roll,Model m) throws StudentException {
		List<Student> s= studentService.getAllStudent();
		int n=0;
		int count=0;
		for(Student a:s) {
		if(roll.equals("science")) {
			n+=a.getSemister2().getScience();
			n+=a.getSemister1().getScience();
			count++;
		}
		if(roll.equals("math")) {
			n+=a.getSemister1().getMath();
			n+=a.getSemister2().getMath();
			count++;
				}
		if(roll.equals("english")) {
			n+=a.getSemister1().getEnglish();
			n+=a.getSemister2().getEnglish();
			count++;
		}
			
			
		}count*=2;
		int avg=(n/count);
		
		m.addAttribute("marks", avg);
		return "marks";
	}
}
