package com.group87.bookapiassignment.BookCatalog;

public class Book{

    private String identificationCode;
    private String title;
    private String author;
    private int publicationYear;

    // Constructor
    public Book(String id, String title, String author, int publicationYear) {
        this.identificationCode = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter and Setter for ID
    public String getId() {
        return identificationCode;
    }

    public void setId(String id) {
        this.identificationCode = id;
    }

    // Getter and Setter for Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for Publication Year
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}