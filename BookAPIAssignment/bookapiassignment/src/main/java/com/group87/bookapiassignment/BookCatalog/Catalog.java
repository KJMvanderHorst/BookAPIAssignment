package com.group87.bookapiassignment.BookCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Book> books;

    public void createBook(String identificationCode, String title, String author, int publicationYear){
        Book newBook = new Book(identificationCode, title, author, publicationYear);
        books.add(newBook);
    }

    

}
