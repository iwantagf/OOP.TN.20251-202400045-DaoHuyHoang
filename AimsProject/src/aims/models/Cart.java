package aims.models;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Cart {
	private ArrayList<DigitalVideoDisc> Items = new ArrayList<>();
	private final int MAX_NUMBER_ORDERED = 36;
	private int QuantityOrdered = 0;
	private double totalCost = 0;
	
	public double calculateTotalCost() {
		return this.totalCost;
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (this.QuantityOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Reached maximum number of discs in cart");
			return;
		}
		this.Items.add(disc);
		this.totalCost += disc.getPrice();
		this.QuantityOrdered++;
		System.out.println("Added " + disc.getTitle() + " successfully");
		
		return;
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (Items.remove(disc)) {
			this.totalCost -= disc.getPrice();
			this.QuantityOrdered--;
			System.out.println("Removed " + disc.getTitle() + " successfully");
			return;
		}
		
		System.out.println("Failed to remove " + disc.getTitle());
		
		return;
	}
	
	public void printItems() {
		if (this.Items.isEmpty()) {
			System.out.println("No discs in cart currently");
			return;
		}
		
		int number = 0;
		for (DigitalVideoDisc disc : Items) {
			++number;
			System.out.printf("Disc number %d: \n", number);
			System.out.println("Title: " + disc.getTitle());
			System.out.println("Category: " + disc.getCategory());
			System.out.println("Length: " + disc.getLength());
			System.out.println("Price: " + disc.getPrice());
			System.out.println("Added Time: " + disc.getAddedTime());
			System.out.println();
		}
		
		return;
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
		sortByTitle(this.Items);
	}
	
	public void sortCartByPrice() {
		sortByPrice(this.Items);
	}
	
	public void searchByID(String ID) {
		for (DigitalVideoDisc disc : this.Items) {
			if (disc.getID().compareToIgnoreCase(ID) == 0) {
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
	
	public void searchByTitle(String Title) {
		if (Title == null || Title.isEmpty()) return;
	    String q = Title.toLowerCase();
	    for (DigitalVideoDisc disc : Items) {
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
		System.out.println("You have ordered " + this.QuantityOrdered + " discs in total");
		int number = 0;
		for (DigitalVideoDisc disc : Items) {
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
