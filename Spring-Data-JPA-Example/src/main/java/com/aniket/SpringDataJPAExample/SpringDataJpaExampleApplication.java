package com.aniket.SpringDataJPAExample;

import com.aniket.SpringDataJPAExample.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		s1.setRollNo(101);
//		s1.setName("Rohan");
//		s1.setMarks(85);
//
//		Student s2 = context.getBean(Student.class);
//		s2.setRollNo(102);
//		s2.setName("Rohit");
//		s2.setMarks(100);
//
//		Student s3 = context.getBean(Student.class);
//		s3.setRollNo(103);
//		s3.setName("Virat");
//		s3.setMarks(98);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		List<Student> students = repo.findAll();
//		System.out.println(students);

//		Optional<Student> s=repo.findById(104);
//
//		System.out.println(s.orElse(new Student()));

		//return the students, who's name is navin
//		List<Student> students = repo.findByName("Rohan");
////		Student students = repo.findByName("Rohan");
//
//		System.out.println(students);

//		List<Student> students = repo.findByMarks(100);
//		System.out.println(students);

//		List<Student> students = repo.findByMarksGreaterThan(90);
//		System.out.println(students);

		//update
//		Student s1 = context.getBean(Student.class);
//		s1.setRollNo(101);
//		s1.setName("Rohan");
//		s1.setMarks(66);
//
//		repo.save(s1);

		//delete
//		Student s1 = context.getBean(Student.class);
//		s1.setRollNo(101);
//		s1.setName("Rohan");
//		s1.setMarks(66);
//
//		repo.delete(s1);
	}

}
