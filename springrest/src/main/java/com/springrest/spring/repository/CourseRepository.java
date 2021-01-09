package com.springrest.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.spring.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
