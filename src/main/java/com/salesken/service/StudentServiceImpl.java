package com.salesken.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
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
		Iterable< Student> x=studentRepository.findAll();
		List<Student> list=new ArrayList<>();	
		x.forEach(list::add);
		return list;
	}

	@Override
	public String getAvg(Integer sem) throws StudentException {
		if(!(sem==1 || sem==2)) {
			throw new StudentException("semester number not valid");
		}
		List<Student> s= this.getAllStudent();
		Integer n=0;
		Integer count=0;
		if(sem==1) {
			for(Student a:s) {
				
				try {
					n+=a.getSemester1().getEnglish();
					count++;
					n+=a.getSemester1().getMath();
					count++;
					n+=a.getSemester1().getScience();
					count++;
				}
				catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}else if(sem==2) {
			for(Student a:s) {
				
				try {
					n+=a.getSemester2().getEnglish();
					count++;
					n+=a.getSemester2().getMath();
					count++;
					n+=a.getSemester2().getScience();
					count++;
				}
				catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
		count*=100;
		Double avg=(double)n/count;
		DecimalFormat decfor = new DecimalFormat("0.00");  
		
		return decfor.format(avg*100) ;
	}

	@Override
	public Integer getMarks(String subject) throws StudentException {
		List<Student> s= this.getAllStudent();
		int n=0;
		int count=0;
		if(subject.equalsIgnoreCase("english")) {
			for(Student a:s) {
				try {
				
					n+=a.getSemester2().getEnglish();
					count++;
					n+=a.getSemester1().getEnglish();
					count++;
				}
				catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}else if(subject.equalsIgnoreCase("science")) {
			for(Student a:s) {
				try {
				
					n+=a.getSemester2().getScience();
					count++;
					n+=a.getSemester1().getScience();
					count++;
				}
				catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}else if(subject.equalsIgnoreCase("math")) {
			for(Student a:s) {
				try {
				
					n+=a.getSemester2().getMath();
					count++;
					n+=a.getSemester1().getMath();
					count++;
				}catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		int avg=(n/count);
		
		return avg;
	}

	@Override
	public List<Student> getTopStudent() throws StudentException {
		List<Student> s= this.getAllStudent();
		int max1=0;
		int max2=0;
		int sum1=0;
		Student s1=null;
		Student s2=null;
		for(Student a:s) {
			
				try {
					sum1+=a.getSemester1().getEnglish();
					sum1+=a.getSemester1().getMath();
					sum1+=a.getSemester1().getScience();
				
					sum1+=a.getSemester2().getEnglish();
					sum1+=a.getSemester2().getMath();
					sum1+=a.getSemester2().getScience();
				}catch (NullPointerException e) {
					// TODO: handle exception
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			sum1=sum1/6;
				if(sum1>=max1) {
					max2=max1;
					max1=sum1;
					s2=s1;
					s1=a;
				}
			
		}
		List<Student> newList=new ArrayList<>();
		newList.add(s1);
		newList.add(s2);
		return newList;
	}

}
