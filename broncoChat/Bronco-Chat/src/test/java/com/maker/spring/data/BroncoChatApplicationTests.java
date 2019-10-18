package com.maker.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.maker.spring.data.entities.Student;
import com.maker.spring.data.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BroncoChatApplicationTests
{
	@Autowired
	ApplicationContext context;
	
	@Test
	public void saveStudent()
	{
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		Student student = new Student();
		
		//CREATE
		student.setUsername("coolGuy");
		student.setFirstname("Eric");
		student.setLastname("Ramirez");
		
		student.setUsername("anotherOne");
		student.setFirstname("John");
		student.setLastname("Doe");
		
		repository.save(student);
		
		//READ
		String result = student.getFirstname();
		System.out.println(result);
	
		//READ ALL
		repository.findAll().forEach(p->{System.out.println(p.getLastname());});
	}

}
