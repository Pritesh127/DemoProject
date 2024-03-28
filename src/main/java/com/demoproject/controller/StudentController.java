package com.demoproject.controller;

import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demoproject.entity.Student;
import com.demoproject.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createNewStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "createStudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
//		 Iterator<String> it = student.iterator();
//
//		    // Print the first item
//		    System.out.println(it.next());
		System.out.println(student);
		
		return "redirect:/students";
	}
	
	
}
