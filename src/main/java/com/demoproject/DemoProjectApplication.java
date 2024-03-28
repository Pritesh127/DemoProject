package com.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoproject.entity.Student;
import com.demoproject.repository.StudentRepository;

@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
//		System.out.println(5/0);
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Pritesh","Memane","pritesh@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Ganesh","Jeure","ganesh@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Ganesh","Shelke","ganeshs@gmail.com");
//		studentRepository.save(student3);
	}

}
