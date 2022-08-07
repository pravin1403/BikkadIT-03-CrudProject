package com.BikkadIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Student;
import com.BikkadIT.Repository.StudentRepository;
@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public int addStudent(Student student) {
		
		Student save = studentRepository.save(student);
		
		
		
		return save.getStudentId();
	}

	@Override
	public Optional<Student> getStudentById(Student student) {
		
		Optional<Student> findById = studentRepository.findById(student.getStudentId());
		
		
		
		return findById;
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> findAll = studentRepository.findAll();
		
		return findAll;
	}

}
