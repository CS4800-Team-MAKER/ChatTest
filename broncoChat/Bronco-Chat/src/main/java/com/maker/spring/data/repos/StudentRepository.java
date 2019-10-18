package com.maker.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.maker.spring.data.entities.Student;
import com.sun.xml.bind.v2.model.core.ID;

public interface StudentRepository extends CrudRepository<Student, ID> 
{
	
}
