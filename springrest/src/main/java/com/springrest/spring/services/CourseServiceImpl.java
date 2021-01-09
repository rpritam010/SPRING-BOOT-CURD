package com.springrest.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.spring.entity.Courses;
import com.springrest.spring.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	//List<Courses> list;
	@Autowired
	private CourseRepository courserepository;

	public CourseServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Courses(145, "Java Core Course", "This course contains basic of java"));
//		list.add(new Courses(146, "spring boot course", "create rest api using spring boot"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courserepository.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
//		Courses c = null;
//		for (Courses course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}

		return courserepository.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {

		//list.add(course);
		 courserepository.save(course);
		 return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
//		list.forEach(courseupdate -> {
//			if (courseupdate.getId() == course.getId()) {
//				courseupdate.setTitle(course.getTitle());
//				courseupdate.setDescription(course.getDescription());
//			}
//		});

		courserepository.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		

		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Courses entity = courserepository.getOne(parseLong);
		courserepository.delete(entity);
	}

}
