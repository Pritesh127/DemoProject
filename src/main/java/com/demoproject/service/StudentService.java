package com.demoproject.service;

import java.util.List;

import com.demoproject.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
}
