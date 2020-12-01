package com.student.Student.Model;


import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="subject_details")
@JsonAutoDetect
public class Subject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long subId;
	private long subject1;
	private long subject2;
	private long subject3;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy = "subject")
	@JoinColumn(name="sub_id")
	@JsonIgnoreProperties(value = {"subject_details", "hibernateLazyInitializer"})
	private Student student;
	
	public Subject() {
		super();
	}
	public Subject(long subject1, long subject2, long subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	public long getSubject1() {
		return subject1;
	}
	public void setSubject1(long subject1) {
		this.subject1 = subject1;
	}
	public long getSubject2() {
		return subject2;
	}
	public void setSubject2(long subject2) {
		this.subject2 = subject2;
	}
	public long getSubject3() {
		return subject3;
	}
	public void setSubject3(long subject3) {
		this.subject3 = subject3;
	}
	

}
