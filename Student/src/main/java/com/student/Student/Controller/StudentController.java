package com.student.Student.Controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.student.Student.Model.Student;
import com.student.Student.Repository.StudentRepository;
import com.student.Student.Repository.SubjectRepository;
import com.student.Student.Service.StudentService;
import com.student.Student.Service.SubjectService;


@RestController
@JsonAutoDetect
public class StudentController implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	SubjectService subjectService;
	
	@RequestMapping("/students")
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	@PostMapping("/insertstudent")
	public String insertStudent(@RequestBody Student student) {
		
		studentService.evaluateStudent(student);
		studentRepository.save(student);
		
		return "student info saved successfully";
	}
	
	@RequestMapping("/Student/{name}")
	public Student getByName(@PathVariable String name) {
		return studentRepository.findByName(name);
	}
	
	@RequestMapping("/Student/{name}/getresult")
	public String getById(@PathVariable String name) {
		return studentRepository.findByName(name).getResult();
	}
	
	@RequestMapping("/resultanalysys")
	public String OverallResult() {
		return "Overall subjectwise Result analysis\n"+subjectService.subect1Result()+"\n"+subjectService.subect2Result()+"\n"+subjectService.subect3Result();
		
	}
}
