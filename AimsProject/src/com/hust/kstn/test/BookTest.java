package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String args[]) {
        BookAuthor AndrzejSapkowski = new BookAuthor("Andrzej Sapkowski", 1948, "Polish Greate Writer!");
        BookAuthor Tolkien = new BookAuthor("John Ronald Reuel Tolkien", 1892, "Lengendary English Writer!");
        BookAuthor LeMinhHoang = new BookAuthor("Le Minh Hoang", 0, "HNUE Lecturer");
        BookAuthor DoDucDong = new BookAuthor("Do Duc Dong", 0, "UET Lecturer");
        BookAuthor GeogreRRMartin = new BookAuthor("George Raymond Martin", 1948, "Novelist, screenwriter, short story writer, television producer");

        Book DSA = new Book("Tai lieu giao khoa chuyen Tin", 20000.0, "Tai lieu hoc tap", 10000, DoDucDong, LeMinhHoang);
        Book TheWitcher = new Book("The Witcher: The Last Wish", 200000.0, "Tieu thuyet", 100000, AndrzejSapkowski);
        Book LordOfTheRings = new Book("The Lord of the Rings", 200000.0, "Tieu thuyet", 100000, Tolkien);
        Book GameOfThrones = new Book("A Song of Fire and Ice", 200000.0, "Chinh kich", 100000, GeogreRRMartin);

        System.out.println(DSA);
        System.out.println(TheWitcher);
        System.out.println(LordOfTheRings);
        System.out.println(GameOfThrones);
    }
}
