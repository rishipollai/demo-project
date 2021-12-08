package com.example.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pkg.model.Student;
import com.example.pkg.repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping
	public List<Student> getAllStudent(){
		return repository.findAll();
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return repository.save(student);
	}

}
