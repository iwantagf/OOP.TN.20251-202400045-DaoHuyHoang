package aims;

import aims.models.*;

import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
		//ID duoc danh so theo thu tu them vao
		DigitalVideoDisc manOfSteel = new DigitalVideoDisc("Sci-fi", 50.0f, "Man of Steel", 180, "Zack Snyder"); //id = 0
		DigitalVideoDisc batman = new DigitalVideoDisc("Action", 36.0f, "Batman", 120, "Christopher Nolan"); //id = 1
		DigitalVideoDisc fiftyDaysToLove = new DigitalVideoDisc("Rom-com", 40.0f, "Fifty Days To Love", 140); //id = 2
		DigitalVideoDisc spiderManNwh = new DigitalVideoDisc("Sci-fi, Action, Romance", 50.0f, "Spider Man No Way Home", 150, "Jon Watts"); //id = 3
		DigitalVideoDisc cuaLaiVoBau = new DigitalVideoDisc("Bullshit Vietnamese Film, Romance", -30.0f, "Cua lai vo bau", 100); //id = 4
		
		Cart cart = new Cart();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You can do one of these operations by typing its index to the console then press Enter\n"
				+ "1. Add a DVD to cart\n"
				+ "2. Remove a DVD from cart\n"
				+ "3. Print current cart\n"
				+ "4. Sort cart by price\n"
				+ "5. Sort cart by title\n"
				+ "6. Find an item in cart by its ID\n"
				+ "7. Find an item in cart by its title\n"
				+ "8. Place an order\n"
				+ "9. Show the operations");
		
		while (true) {
			int option = sc.nextInt();
			
			
			if (option == 9) {
				System.out.println("You can do one of these operations by typing its index to the console then press Enter\n"
						+ "1. Add a DVD to cart\n"
						+ "2. Remove a DVD from cart\n"
						+ "3. Print current cart\n"
						+ "4. Sort cart by price\n"
						+ "5. Sort cart by title\n"
						+ "6. Find an item in cart by its ID\n"
						+ "7. Find an item in cart by its title\n"
						+ "8. Place an order\n"
						+ "9. Show the operations");
				
				continue;
			}
			
			if (option == 1) {
				System.out.println("Choose one of these discs: \n"
						+ "1. Man Of Steel\n"
						+ "2. Batman\n"
						+ "3. Fifty Days To Love\n"
						+ "4. Spider Man No Way Home\n"
						+ "5. Bullshit Vietnamese Film");
				
				int chosenDisc = sc.nextInt();
				
				switch (chosenDisc) {
					case 1:
						cart.addDVD(manOfSteel);
						break;
					case 2:
						cart.addDVD(batman);
						break;
					case 3:
						cart.addDVD(fiftyDaysToLove);
						break;
					case 4:
						cart.addDVD(spiderManNwh);
						break;
					case 5:
						cart.addDVD(cuaLaiVoBau);
						break;
					default:
						System.out.println("We haven't had this disc in the list");
						break;
				}
				continue;
			}
			
			if (option == 2) {
				System.out.println("Choose one of these discs: \n"
						+ "1. Man Of Steel\n"
						+ "2. Batman\n"
						+ "3. Fifty Days To Love\n"
						+ "4. Spider Man No Way Home\n"
						+ "5. Bullshit Vietnamese Film");
				
				int chosenDisc = sc.nextInt();
				
				switch (chosenDisc) {
					case 1:
						cart.removeDVD(manOfSteel);
						break;
					case 2:
						cart.removeDVD(batman);
						break;
					case 3:
						cart.removeDVD(fiftyDaysToLove);
						break;
					case 4:
						cart.removeDVD(spiderManNwh);
						break;
					case 5:
						cart.removeDVD(cuaLaiVoBau);
						break;
					default:
						System.out.println("We haven't had this disc in the list");
						break;
				}
				continue;
			}
			
			if (option == 3) {
				cart.printItems();
				continue;
			}
			
			if (option == 4) {
				cart.sortCartByPrice();
				continue;
			}
			
			
			if (option == 5) {
				cart.sortCartByTitle();
				continue;
			}
			
			if (option == 6) {
				System.out.println("Enter an ID: ");
				String id = String.valueOf(sc.nextInt());
				cart.searchByID(id);
				continue;
			}
			
			if (option == 7) {
				System.out.println("Enter a title: ");
				sc.nextLine();
                String title = sc.nextLine();
                cart.searchByTitle(title);
                continue;
			}
			
			if (option == 8) {
				cart.placeOrder();
				break;
			}
		}
		
		sc.close();
		
		return;
	}
	
	public static final class ItemCounter {
		private ItemCounter() {}
		
		public static int count = 0;
		
		public static void increase() {
			++count;
		}
		
		public static int get() {
			return count;
		}
		
		public static void reset() {
			count = 0;
		}
	}
}
