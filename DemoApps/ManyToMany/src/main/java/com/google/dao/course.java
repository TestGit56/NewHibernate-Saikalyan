package com.google.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="COURSE")
public class course implements Serializable {
    public course(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	@Id
    @Column(name="COURSE_ID")
	private Integer courseId = null;
    @Column(name="COURSE_NAME")
	private String courseName = null;
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
   
   
	

}
