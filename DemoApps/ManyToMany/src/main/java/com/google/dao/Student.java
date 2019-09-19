package com.google.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name="Student")
public class Student implements Serializable {
	@Id
	@Column(name="STUDENT_ID")
	private Integer studentId = null;
	@Column(name="STUDENT_NAME")
	private String studentName = null;
	@ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(
			name = "STUDENT_COURSE",
			joinColumns = {@JoinColumn(name = "STUDENT_FK_ID")},
			inverseJoinColumns = {@JoinColumn(name = "COURSE_FK_ID")}
			)

	private Set<course> courseSet = null;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseSet=" + courseSet + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<course> getCourseSet() {
		return courseSet;
	}

	public void setCourseSet(Set<course> courseSet) {
		this.courseSet = courseSet;
	}
	
	 

}
