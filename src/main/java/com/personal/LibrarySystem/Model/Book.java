package com.personal.LibrarySystem.Model;

import java.time.LocalDate;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private Genre idGenre;
    private LocalDate publicationDate;
    private int totalCopies;
    private int author;
    private int editorial;

    //Constructor vacío
    public Book() {}

    //Constructor con parámetros


    public Book(int id, int editorial, int author, LocalDate publicationDate, int totalCopies, Genre idGenre, String title, String isbn) {
        this.id = id;
        this.editorial = editorial;
        this.author = author;
        this.publicationDate = publicationDate;
        this.totalCopies = totalCopies;
        this.idGenre = idGenre;
        this.title = title;
        this.isbn = isbn;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public Genre getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Genre idGenre) {
        this.idGenre = idGenre;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
