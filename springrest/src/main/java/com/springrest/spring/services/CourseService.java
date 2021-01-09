package com.springrest.spring.services;

import java.util.List;

import com.springrest.spring.entity.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();

	public Courses getCourses(long courseId);

	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

	public void deleteCourse(long parseLong);

}
