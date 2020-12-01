package com.student.Student.Service;

import org.springframework.stereotype.Service;

import com.student.Student.Model.Student;

@Service
public class StudentService {
	
	public void evaluateStudent(Student student) {
		long sum=student.getSubject().getSubject1()+student.getSubject().getSubject2()+student.getSubject().getSubject3();
		student.setPercentage(sum/3);
		if(student.getPercentage()<40) {
			student.setResult("Fail");
		}
		else {
			student.setResult("Pass");
		}
		
	}
	
	
}
