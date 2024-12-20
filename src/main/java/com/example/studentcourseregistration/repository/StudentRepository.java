package com.example.studentcourseregistration.repository;

import com.example.studentcourseregistration.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
