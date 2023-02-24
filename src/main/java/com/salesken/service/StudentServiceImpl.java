package com.salesken.service;

import java.util.List;
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

	@Override
	public Student getStudent(Integer roll) throws StudentException {
		Optional< Student> w=studentRepository.findById(roll);
		if(w.isEmpty()) {
			throw new StudentException("Student not exist");
		}
		return w.get();
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> list=(List<Student>) studentRepository.findAll();
		return list;
	}

}
