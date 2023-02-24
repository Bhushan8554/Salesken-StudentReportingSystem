package com.salesken.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;
import com.salesken.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student)throws StudentException {
		Optional<Student> s=studentRepository.findById(student.getRoll());
		if(s.isPresent()) {
			throw new StudentException("Student already exist");
		}
		return studentRepository.save(student);
	}

}
