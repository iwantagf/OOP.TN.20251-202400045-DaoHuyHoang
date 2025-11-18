package com.hust.kstn.models;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalVideoDisc extends Disc {
    private int length;
    private String director;
    private ZonedDateTime addedTime;

    public DigitalVideoDisc(String category, double price, String title, int length, String director) {
        super(title, price, category);
        this.length = length;
        this.director = (director == null || director.isEmpty()) ? "Dao Huy Hoang" : director;
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public String getAddedTime() {
        ZonedDateTime zdt = this.addedTime;
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        return zdt.format(f1);
    }

    public String getID() {
        return String.valueOf(getId());
    }

    @Override
    public String toString() {
        return "DVD[" + this.getId() + "] - "
                + this.getTitle() + " - "
                + this.getPrice() + " - "
                + this.length + " - "
                + this.getCategory() + " - "
                + this.director;
    }
}
