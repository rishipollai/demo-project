package com.example.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pkg.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
	

}
