package com.sangvaleap.lab1.controller;

import com.sangvaleap.lab1.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping(value = {"/"})
    Book[] getBooks(){
        return new Book[]{
                new Book(1, "Book A", "1111-1111", "Mr. A"),
                new Book(2, "Book B", "2222-2222", "Mr. B"),
                new Book(1, "Book C", "3333-3333", "Mr. C"),
        };
    }

    @GetMapping(value = {"/greeting"})
    String getGreeting(){
        return "Hello Sangvaleap Vanny 2";
    }
}
