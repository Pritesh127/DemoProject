package com.demoproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demoproject.entity.Student;
import com.demoproject.repository.StudentRepository;
import com.demoproject.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
		
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	
}
