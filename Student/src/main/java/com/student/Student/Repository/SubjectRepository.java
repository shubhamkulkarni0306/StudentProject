package com.student.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.student.Student.Model.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
	
	List<Subject> findAll();
	
	@Query("select sum(s.subject1) from Subject s")
	Float Subject1();
	
	@Query("select sum(s.subject2) from Subject s")
	Float Subject2();
	
	@Query("select sum(s.subject3) from Subject s")
	Float Subject3();
	

}
