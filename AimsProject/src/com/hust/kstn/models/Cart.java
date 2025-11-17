package com.hust.kstn.models;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Cart {
	private ArrayList<DigitalVideoDisc> items = new ArrayList<>();
	private final int MAX_NUMBER_ORDERED = 20;
	private int quantityOrdered = 0;
	private double totalCost = 0;
	
	public double calculateTotalCost() {
		return this.totalCost;
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (this.quantityOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Reached maximum number of discs in cart");
			return;
		}
		this.items.add(disc);
		this.totalCost += disc.getPrice();
		this.quantityOrdered++;
		System.out.println("Added " + disc.getTitle() + " successfully");
		
		return;
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (items.isEmpty()) {
			System.out.println("There is no discs in cart");
			return;
		}

		if (items.remove(disc)) {
			this.totalCost -= disc.getPrice();
			this.quantityOrdered--;
			System.out.println("Removed " + disc.getTitle() + " successfully");
			return;
		}
		
		System.out.println("Failed to remove " + disc.getTitle());
		
		return;
	}
	
	public void printItems() {
		System.out.println("============= THE CURRENT CART =============");

		if (this.items.isEmpty()) {
			System.out.println("The cart is currently empty.");
			System.out.println("============================================");
			return;
		}

		System.out.println("Total items: " + this.items.size());

		double subtotal = 0.0;
		for (DigitalVideoDisc disc : items) {
			subtotal += disc.getPrice();
			System.out.println("- " + disc.toString());
		}

		System.out.println();
		System.out.println("Subtotal: " + subtotal + "$");
		System.out.println("============================================");
	}
	
	public void sortByTitle(List<DigitalVideoDisc> items) {
		Collections.sort(items, (a, b) -> {
			int cmp = a.getTitle().compareToIgnoreCase(b.getTitle());
			
			if (cmp == 0) {
				return Double.compare(a.getPrice(), b.getPrice());
			}
			
			return cmp;
		});
	}
	
	public void sortByPrice(List<DigitalVideoDisc> items) {
		Collections.sort(items, (a, b) -> {
			int cmp = -Double.compare(a.getPrice(), b.getPrice());
			
			if (cmp == 0) {
				return -a.getTitle().compareToIgnoreCase(b.getTitle());
			}
			
			return cmp;
		});
	}
	
	public void sortCartByTitle() {
		sortByTitle(this.items);
	}
	
	public void sortCartByPrice() {
		sortByPrice(this.items);
	}
	
	public void searchByID(String id) {
		for (DigitalVideoDisc disc : this.items) {
			if (disc.getID().compareToIgnoreCase(id) == 0) {
				System.out.println("Title: " + disc.getTitle());
				System.out.println("Category: " + disc.getCategory());
				System.out.println("Length: " + disc.getLength());
				System.out.println("Price: " + disc.getPrice());
				System.out.println("Added Time: " + disc.getAddedTime());
				System.out.println();
				
				return;
			}
		}
		
		System.out.println("Item is not in your cart");
		return;
	}
	
	public void searchByTitle(String title) {
		if (title == null || title.isEmpty()) return;
	    String q = title.toLowerCase();
	    for (DigitalVideoDisc disc : items) {
	        String t = disc.getTitle();
	        if (t != null && t.toLowerCase().contains(q)) {
	        	System.out.println("Title: " + disc.getTitle());
				System.out.println("Category: " + disc.getCategory());
				System.out.println("Length: " + disc.getLength());
				System.out.println("Price: " + disc.getPrice());
				System.out.println("Added Time: " + disc.getAddedTime());
				System.out.println();
	        	return;
	        }
	    }
		
		System.out.println("Item is not in your cart");
		return;
	}
	
	
	public void createBill() {
		System.out.println("You have ordered " + this.quantityOrdered + " discs in total");
		int number = 0;
		for (DigitalVideoDisc disc : items) {
			++number;
			System.out.printf("Disc %d: \n", number);
			System.out.println("Title: " + disc.getTitle());
			System.out.println("Price: " + disc.getPrice());
			System.out.println();
		}
		
		System.out.println("Total cost: " + this.totalCost);
		
		return;
	}
	
	public void placeOrder() {
		System.out.println("Placed order sucessfully, here is your order!");
		System.out.println("---------------------------------------------");
		createBill();
		
		return;
	}
}
