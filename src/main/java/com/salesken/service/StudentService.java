package com.salesken.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;

@Service
public interface StudentService {

	public Student addStudent(Student student) throws StudentException;
	public Student getStudent(Integer roll)throws StudentException;
	public List<Student> getAllStudent()throws StudentException;
}
