package com.navindu.spring_data_jpa_ex;

import com.navindu.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Navindu");
//		s1.setMarks(94);
//
		s2.setRollNo(102);
		s2.setName("Mendis");
		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("Rahul");
//		s3.setMarks(90);
//
//		repo.save(s2);
//		repo.save(s3);

	}

}
