package com.reactive.app.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("books")
public class Book {

    @Id
    @Column("book_id")
    private int bookId;

    private String name;

    @Column("book_desc")
    private String description;

    private String publisher;

    private String author;

}