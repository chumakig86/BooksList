package com.chumak.model;

public class Book {
    private String title, author, genre, publisher;
    private int height;

    public Book(String title, String author, String genre, int height, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getHeight() {
        return height;
    }
}
