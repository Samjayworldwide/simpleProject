package com.samjay.simple.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_table")
public class Books {
    @Id
    @SequenceGenerator(name = "book_sequence", sequenceName = "book_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "book_sequence")
    private Long id;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false,
            foreignKey = @ForeignKey(name = "student_books_fk")
    )
    private Student student;

}
