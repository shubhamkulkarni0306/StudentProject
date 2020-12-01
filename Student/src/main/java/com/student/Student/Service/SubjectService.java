package com.student.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Student.Repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	SubjectRepository subjectRepository;
	
	public String subect1Result() {
		float result = subjectRepository.Subject1()/subjectRepository.count();
		return "Subject_1 overall result : "+ result;
		
	}
	
	public String subect2Result() {
		float result = subjectRepository.Subject2()/subjectRepository.count();
		return "Subject_2 overall result : "+ result;
		
	}
	
	public String subect3Result() {
		float result = subjectRepository.Subject3()/subjectRepository.count();
		return "Subject_3 overall result : "+ result;
		
	}
}
