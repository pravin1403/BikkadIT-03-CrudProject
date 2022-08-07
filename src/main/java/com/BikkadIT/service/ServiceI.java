package com.BikkadIT.service;

import java.util.List;
import java.util.Optional;

import com.BikkadIT.model.Student;



public interface ServiceI {

	public int addStudent(Student student);
	
	public Optional<Student> getStudentById(Student student);
	
	public List<Student> getAllStudent();
	
	
	
	
}
