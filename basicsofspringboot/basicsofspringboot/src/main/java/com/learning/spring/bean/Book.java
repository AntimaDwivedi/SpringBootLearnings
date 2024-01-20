package com.learning.spring.bean;

public class Book {
    public Book(int id, String author, String bookname) {
        this.id = id;
        this.author = author;
        this.bookname = bookname;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookname() {
        return bookname;
    }

    private int id;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", bookname='" + bookname + '\'' +
                '}';
    }

    private String bookname;



}
