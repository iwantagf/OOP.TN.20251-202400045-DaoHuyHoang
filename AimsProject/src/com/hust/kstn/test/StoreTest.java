package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String args[]) {
        Store myStore = new Store();

        //ID duoc danh so theo thu tu them vao
		DigitalVideoDisc manOfSteel = new DigitalVideoDisc("Sci-fi", 50.0f, "Man of Steel", 180, "Zack Snyder"); //id = 0
		DigitalVideoDisc batman = new DigitalVideoDisc("Action", 36.0f, "Batman", 120, "Christopher Nolan"); //id = 1
		DigitalVideoDisc fiftyDaysToLove = new DigitalVideoDisc("Rom-com", 40.0f, "Fifty Days To Love", 140); //id = 2
		DigitalVideoDisc spiderManNwh = new DigitalVideoDisc("Sci-fi, Action, Romance", 50.0f, "Spider Man No Way Home", 150, "Jon Watts"); //id = 3
		DigitalVideoDisc cuaLaiVoBau = new DigitalVideoDisc("Bullshit Vietnamese Film, Romance", -30.0f, "Cua lai vo bau", 100); //id = 4


        System.out.println("===== TEST 1: STORE CAPACITY (100 ITEMS MAX) =====");
        for (int i = 0; i < 102; i++) {
            System.out.println("Adding disc " + (i + 1));
            switch (i % 5) {
                case 0 -> myStore.addDVD(manOfSteel);
                case 1 -> myStore.addDVD(batman);
                case 2 -> myStore.addDVD(fiftyDaysToLove);
                case 3 -> myStore.addDVD(spiderManNwh);
                case 4 -> myStore.addDVD(cuaLaiVoBau);
            }
        }

        myStore.printItems();

        System.out.println("\n===== TEST 2: REMOVE FROM EMPTY STORE =====");
        Store emptyStore = new Store();
        emptyStore.removeDVD(manOfSteel);
        emptyStore.printItems();

        System.out.println("\n===== TEST 3: REMOVE NON-EXISTING ITEM =====");
        Store anotherStore = new Store();
        anotherStore.addDVD(manOfSteel);
        anotherStore.addDVD(batman);
        anotherStore.printItems();

        System.out.println("Trying to remove disc that is not in store (Fifty Days To Love)");
        anotherStore.removeDVD(fiftyDaysToLove);
        anotherStore.printItems();
    }
}
