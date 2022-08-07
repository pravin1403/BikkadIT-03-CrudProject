package com.BikkadIT.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Student;
import com.BikkadIT.service.ServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private ServiceImpl serviceImpl;

	@PostMapping(value = "/addStudent", consumes = "application/json")
	public ResponseEntity<String> addStudentData(@RequestBody Student student) {

		int student2 = serviceImpl.addStudent(student);

		String msg = "Your Resistration Successful \n Student Id is " + (student2);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@GetMapping(value = "/getAllStudent", produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> allStudent = serviceImpl.getAllStudent();
		
		System.out.println(allStudent);
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);
	}

	
	@GetMapping(value = "/getStudent",  consumes = "application/json", produces = "application/json")
	public ResponseEntity<Optional<Student>> getStudent(@RequestBody Student student) {
		
		
		
	     Optional<Student> id = serviceImpl.getStudentById(student);
	     
		
		
		return new ResponseEntity<Optional<Student>>(id, HttpStatus.OK);
	}

	
	
}
