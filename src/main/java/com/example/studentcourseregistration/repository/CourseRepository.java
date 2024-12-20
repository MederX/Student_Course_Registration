package com.example.studentcourseregistration.repository;

import com.example.studentcourseregistration.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
