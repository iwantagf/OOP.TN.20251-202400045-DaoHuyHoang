package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc manOfSteel = new DigitalVideoDisc("Sci-fi", 50.0f, "Man of Steel", 180, "Zack Snyder");
        DigitalVideoDisc batman = new DigitalVideoDisc("Action", 36.0f, "Batman", 120, "Christopher Nolan");
        DigitalVideoDisc fiftyDaysToLove = new DigitalVideoDisc("Rom-com", 40.0f, "Fifty Days To Love", 140);
        DigitalVideoDisc spiderManNwh = new DigitalVideoDisc("Sci-fi, Action, Romance", 50.0f, "Spider Man No Way Home", 150, "Jon Watts");
        DigitalVideoDisc cuaLaiVoBau = new DigitalVideoDisc("Bullshit Vietnamese Film, Romance", -30.0f, "Cua lai vo bau", 100);

        System.out.println("===== TEST 1: CART CAPACITY (20 ITEMS MAX) =====");
        for (int i = 0; i < 30; i++) {
            System.out.println("Adding disc " + (i + 1));
            switch (i % 5) {
                case 0 -> cart.addDVD(manOfSteel);
                case 1 -> cart.addDVD(batman);
                case 2 -> cart.addDVD(fiftyDaysToLove);
                case 3 -> cart.addDVD(spiderManNwh);
                case 4 -> cart.addDVD(cuaLaiVoBau);
            }
        }
        
        cart.printItems();

        System.out.println("\n===== TEST 2: REMOVE FROM EMPTY CART =====");
        Cart emptyCart = new Cart();
        emptyCart.removeDVD(manOfSteel);
        emptyCart.printItems();

        System.out.println("\n===== TEST 3: REMOVE NON-EXISTING ITEM =====");
        Cart anotherCart = new Cart();
        anotherCart.addDVD(manOfSteel);
        anotherCart.addDVD(batman);
        anotherCart.printItems();

        System.out.println("Trying to remove disc that is not in cart (Fifty Days To Love)");
        anotherCart.removeDVD(fiftyDaysToLove);
        anotherCart.printItems();
    }
}
