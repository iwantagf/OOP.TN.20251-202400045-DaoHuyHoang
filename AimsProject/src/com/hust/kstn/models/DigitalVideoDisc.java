package com.hust.kstn.models;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;

	private String id;
	private String title;
	private double price;
	private int length;
	private String category;
	private ZonedDateTime addedTime;
	private String director;
	
	
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.director = "Dao Huy Hoang";
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
    public DigitalVideoDisc(String title, String director) {
        this.title = title;
        this.director = (director == null || director.isEmpty()) ? "Dao Huy Hoang" : director;
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
    public DigitalVideoDisc(String category, double price, String title) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.director = "Dao Huy Hoang";
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
        
    }
	
    public DigitalVideoDisc(String category, double price, String title, String director) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.director = (director == null || director.isEmpty()) ? "Dao Huy Hoang" : director;
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
    public DigitalVideoDisc(String category, double price, String title, int length) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.length = length;
        this.director = "Dao Huy Hoang";
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
    public DigitalVideoDisc(String category, double price, String title, int length, String director) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.length = length;
        this.director = (director == null || director.isEmpty()) ? "Dao Huy Hoang" : director;
        nbDigitalVideoDiscs++;
        this.id = Integer.toString(nbDigitalVideoDiscs);
        this.addedTime = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
    }
	
	public String getID() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public String getCategory() {
		return this.category;
	}
	

	public String getDirector() {
		return this.director;
	}

	public String getAddedTime() {
		ZonedDateTime zdt = this.addedTime;
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		
		return zdt.format(f1);
	}

	@Override
	public String toString() {
		return "DVD[" + this.id + "] - "
				+ this.title + " - "
				+ this.price + " - "
				+ this.length + " - "
				+ this.category + " - "
				+ this.director;
 	}
}
