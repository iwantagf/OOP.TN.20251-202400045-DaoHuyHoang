package com.hust.kstn.models;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Book {
    private static int nbBooks = 0;
    private List<BookAuthor> authors = new ArrayList<>();
    private String title;
    private double price;
    private String category;
    private int id;
    private int numOfTokens;

    public Book(String title, double price, String category, int numOfTokens, BookAuthor... authors) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.numOfTokens = numOfTokens;
        ++nbBooks;
        this.id = nbBooks;
        if (authors != null) {
            for (BookAuthor author : authors) {
                this.authors.add(author);
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.getPrice();
    }

    public String getCategory() {
        return this.category;
    }

    public int getNumOfTokens() {
        return this.numOfTokens;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "]["
                + this.title + "]["
                + this.price + "]["
                + this.category + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
