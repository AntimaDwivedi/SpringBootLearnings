package com.learning.spring.controller;

import com.learning.spring.bean.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @RequestMapping("/book")
    public List<Book> retrieveAllBooks(){

        return Arrays.asList( new
                Book( 1, "Do Epic Shit" , "Ankur warikoo"),
                new Book(2,"Man ki bat","Narendra Modi"),
                new Book(3,"Atomic habits" ,"James Clear"),
                new Book(5,"Rich dad poor dad" ,"Robert")

        );

    }


}
