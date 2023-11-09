package com.samjay.simple.project.repository;

import com.samjay.simple.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> findByFirstnameAndLastname(String firstname, String lastname);
}
