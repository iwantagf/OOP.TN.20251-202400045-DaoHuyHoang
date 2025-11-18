package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, double price, String category, int numOfTokens, BookAuthor... authors) {
        super(title, price, category);
        this.numOfTokens = numOfTokens;
        if (authors != null) {
            for (BookAuthor author : authors) {
                this.authors.add(author);
            }
        }
    }

    public int getNumOfTokens() {
        return this.numOfTokens;
    }

    @Override
    public String toString() {
        return "Book[" + this.getId() + "]["
                + this.getTitle() + "]["
                + this.getPrice() + "]["
                + this.getCategory() + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
