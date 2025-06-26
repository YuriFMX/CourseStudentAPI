package com.unilasalle.coursestudentapi.repository;

import com.unilasalle.coursestudentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}