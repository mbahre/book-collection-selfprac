package com.michaelbahreini.arrofobjsoops;

public class Books {

    private String bookName;
    private String author;
    private String genre;
    private int publishedYear;

    public Books(String bookName, String author, String genre, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String toString(){
        return "\n Name of Book: " + this.bookName + "\n Author: " + this.author + "\n Published Date: "
                + this.publishedYear;
    }

}
