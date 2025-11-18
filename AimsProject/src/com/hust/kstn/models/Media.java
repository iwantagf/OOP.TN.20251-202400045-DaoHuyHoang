package com.hust.kstn.models;

public class Media {
    private static int nbMedias = 0;

    private int id;
    private String title;
    private double price;
    private String category;

    public Media(String title, double price, String category) {
        this.title = title;
        this.price = price;
        this.category = category;
        ++nbMedias;
        this.id = nbMedias;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Media[" + this.id + "]["
                + this.title + "]["
                + this.price + "]["
                + this.category + "]";
    }
}
