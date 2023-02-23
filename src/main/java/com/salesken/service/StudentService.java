package com.salesken.service;


import org.springframework.stereotype.Service;

import com.salesken.exception.StudentException;
import com.salesken.model.Student;

@Service
public interface StudentService {

	public Student addStudent(Student student) throws StudentException;
}
