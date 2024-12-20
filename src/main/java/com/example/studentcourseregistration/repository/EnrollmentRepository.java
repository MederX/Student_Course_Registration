package com.example.studentcourseregistration.repository;

import com.example.studentcourseregistration.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
