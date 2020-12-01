package com.student.Student.Model;



import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="student_updated")
@JsonAutoDetect
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String name;
	private long percentage=0;
	private String result;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="sub_id")
	@JsonIgnoreProperties(value = {"student_updated", "hibernateLazyInitializer"})
	private Subject subject;
	
	
	public Student() {
		super();
	}


	public Student(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPercentage() {
		return percentage;
	}
	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
