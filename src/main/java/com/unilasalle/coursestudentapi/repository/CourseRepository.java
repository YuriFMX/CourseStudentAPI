package com.unilasalle.coursestudentapi.repository;

import com.unilasalle.coursestudentapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}