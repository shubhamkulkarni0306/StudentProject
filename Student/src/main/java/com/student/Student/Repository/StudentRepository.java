package com.student.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Student.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	Student findByName(String name);
	List<Student> findAll();
	

}
