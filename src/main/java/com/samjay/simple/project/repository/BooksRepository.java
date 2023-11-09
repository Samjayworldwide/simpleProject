package com.samjay.simple.project.repository;

import com.samjay.simple.project.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {
    Optional<Books> findByBookName(String bookName);
}
