package com.mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StyleMart {

	static Scanner sc = new Scanner(System.in);

// Main Menu method
	public int showMenu() {
		int choice;
		System.out.println("\n| ========> Style Mart <========|");
		System.out.println("1. Start Shopping");
		System.out.println("2. Exit");
		System.out.println("| ============================ |");
		System.out.println("Enter Your Choice Here.");
		choice = Integer.parseInt(sc.nextLine());
		return choice;
	}

// Categories method that shows available categories in my store.
	public String selectCategory() {
		int choice;
		String selectedCat;
		do {
			System.out.println("\n| =====> StyleMart Categories <===== |");
			System.out.println("1. Kids");
			System.out.println("2. Men");
			System.out.println("3. Women");
			System.out.println("| ================================== |");
			System.out.println("Select The Category.");
			choice = Integer.parseInt(sc.nextLine());

// Switch with retrun type
			selectedCat = switch (choice) {
			case 1 -> "KIDS";
			case 2 -> "MEN";
			case 3 -> "WOMEN";
			default -> null;
			};

			if (selectedCat == null) {
				System.out.println("Invalid Choice, Please Select The Correct Category.");
			}
		} while (selectedCat == null);
		return selectedCat;
	}

// Sub-Category method that shows available sub-categories of each main category.
	public String selectSubCategory(String category) {
		int choice;
		String selectedSubCat;
		switch (category) {
//		Case : 1
		case "KIDS" -> {

			do {
				System.out.println("\n| ===== Kids Categories ===== |");
				System.out.println("1. Boys");
				System.out.println("2. Girls");
				System.out.println("| =========================== |");
				System.out.println("Select The Sub-Category.");
				choice = Integer.parseInt(sc.nextLine());

				selectedSubCat = switch (choice) {
				case 1 -> "BOYS";
				case 2 -> "GIRLS";
				default -> null;
				};

				if (selectedSubCat == null) {
					System.out.println("Invalid Choice, Please Select The Correct Sub-Category.");
				}

			} while (selectedSubCat == null);
			return selectedSubCat;
		}
//			Case : 2
		case "MEN" -> {

			do {
				System.out.println("\n| ===== Men Categories ===== |");
				System.out.println("1. Men Formals");
				System.out.println("2. Men Casuals");
				System.out.println("3. Men Western");
				System.out.println("| =========================== |");
				System.out.println("Select The Sub-Category.");
				choice = Integer.parseInt(sc.nextLine());

				selectedSubCat = switch (choice) {
				case 1 -> "MEN FORMALS";
				case 2 -> "MEN CASUALS";
				case 3 -> "MEN WESTERN";
				default -> null;
				};

				if (selectedSubCat == null) {
					System.out.println("Invalid Choice, Please Select The Correct Sub-Category.");
				}

			} while (selectedSubCat == null);
			return selectedSubCat;

		}
//			Case : 3
		case "WOMEN" -> {

			do {
				System.out.println("\n| ===== Women Categories ===== |");
				System.out.println("1. Women Traditional");
				System.out.println("2. Women Western");
				System.out.println("3. Women Casuals");
				System.out.println("| =========================== |");
				System.out.println("Select The Sub-Category.");
				choice = Integer.parseInt(sc.nextLine());

				selectedSubCat = switch (choice) {
				case 1 -> "WOMEN TRADITIONAL";
				case 2 -> "WOMEN WESTERN";
				case 3 -> "WOMEN CASUALS";
				default -> null;
				};

				if (selectedSubCat == null) {
					System.out.println("Invalid Choice, Please Select The Correct Sub-Category.");
				}

			} while (selectedSubCat == null);
			return selectedSubCat;
		}
// default case
		default -> {
			System.out.println("Invalid choice !");
			return null;
		}
		}
	}

	public CartItem selectItem(String category, String subCategory) {

		switch (subCategory) {

		case "BOYS" -> {
			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Boys ===== |");
				System.out.println("1. T-Shirt - Rs.499");
				System.out.println("2. Shirt - Rs.699");
				System.out.println("3. Jeans - Rs.899");
				System.out.println("4. Nightwear - Rs.399");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "T-Shirt";
					price = 499.0;
					stock = 20;
				}
				case 2 -> {
					itemName = "Shirt";
					price = 699.0;
					stock = 15;
				}
				case 3 -> {
					itemName = "Jeans";
					price = 899.0;
					stock = 10;
				}
				case 4 -> {
					itemName = "NightWear";
					price = 399.0;
					stock = 25;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);
		}
		case "GIRLS" -> {

			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Girls ===== |");
				System.out.println("1. Frock - Rs.699");
				System.out.println("2. Leggings - Rs.299");
				System.out.println("3. NightWear Set - Rs.399");
				System.out.println("4. Skirt & Top - Rs.499");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Frock";
					price = 699.0;
					stock = 12;
				}
				case 2 -> {
					itemName = "Leggings";
					price = 299.0;
					stock = 30;
				}
				case 3 -> {
					itemName = "NightWear Set";
					price = 399.0;
					stock = 25;
				}
				case 4 -> {
					itemName = "Skirt & Top";
					price = 499.0;
					stock = 8;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);
		}
		case "MEN FORMALS" -> {

			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Men Formals ===== |");
				System.out.println("1. Formal Shirt - Rs.1099");
				System.out.println("2. Formal Trousers - Rs.1299");
				System.out.println("3. Blazer - Rs.1999");
				System.out.println("4. Tie - Rs.399");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Formal Shirt";
					price = 1099.0;
					stock = 18;
				}
				case 2 -> {
					itemName = "Formal Trousers";
					price = 1299.0;
					stock = 14;
				}
				case 3 -> {
					itemName = "Blazer";
					price = 1999.0;
					stock = 5;
				}
				case 4 -> {
					itemName = "Tie";
					price = 399.0;
					stock = 14;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);
		}
		case "MEN CASUALS" -> {
			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Men Casuals ===== |");
				System.out.println("1. Casual T-Shirt - Rs.599");
				System.out.println("2. Polo Shirt - Rs.799");
				System.out.println("3. Denim Jeans - Rs.1199");
				System.out.println("4. Cargo Pants - Rs.999");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Casual T-Shirt";
					price = 599.0;
					stock = 25;
				}
				case 2 -> {
					itemName = "Polo Shirt";
					price = 799.0;
					stock = 20;
				}
				case 3 -> {
					itemName = "Denim Jeans";
					price = 1199.0;
					stock = 12;
				}
				case 4 -> {
					itemName = "Cargo Pants";
					price = 999.0;
					stock = 10;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);
		}
		case "MEN WESTERN" -> {
			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Men Western ===== |");
				System.out.println("1. Bomber Jacket - Rs.2199");
				System.out.println("2. Graphic Hoodie - Rs.1499");
				System.out.println("3. Ripped Jeans - Rs.1399");
				System.out.println("4. Sneaker-Fit Joggers - Rs.999");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Bomber Jacket";
					price = 2199.0;
					stock = 6;
				}
				case 2 -> {
					itemName = "Graphic Hoodie";
					price = 1499.0;
					stock = 15;
				}
				case 3 -> {
					itemName = "Ripped Jeans";
					price = 1399.0;
					stock = 10;
				}
				case 4 -> {
					itemName = "Sneaker-Fit Joggers";
					price = 999.0;
					stock = 18;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);

		}
		case "WOMEN TRADITIONAL" -> {
			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Women Traditional ===== |");
				System.out.println("1. Saree - Rs.1499");
				System.out.println("2. Kurti - Rs.799");
				System.out.println("3. Salwari Suit - Rs.1599");
				System.out.println("4. Dupatta - Rs.399");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Saree";
					price = 1499.0;
					stock = 8;
				}
				case 2 -> {
					itemName = "Kurti";
					price = 799.0;
					stock = 22;
				}
				case 3 -> {
					itemName = "Salwari Suit";
					price = 1599.0;
					stock = 10;
				}
				case 4 -> {
					itemName = "Dupatta";
					price = 399.0;
					stock = 35;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);

		}
		case "WOMEN WESTERN" -> {

			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Women Western ===== |");
				System.out.println("1. Dress - Rs.1599");
				System.out.println("2. Denim Jacket - Rs.1799");
				System.out.println("3. Jump Suit - Rs.1699");
				System.out.println("4. Skirt - Rs.999");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Dress";
					price = 1599.0;
					stock = 12;
				}
				case 2 -> {
					itemName = "Denim Jacket";
					price = 1799.0;
					stock = 9;
				}
				case 3 -> {
					itemName = "Jump Suit";
					price = 1699.0;
					stock = 7;
				}
				case 4 -> {
					itemName = "Skirt";
					price = 999.0;
					stock = 20;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);

		}
		case "WOMEN CASUALS" -> {

			int choice;
			String itemName = null;
			double price = 0;
			int stock = 0;

			do {
				System.out.println("\n| ===== Women Casuals ===== |");
				System.out.println("1. Casual Top - Rs.599");
				System.out.println("2. Leggings - Rs.349");
				System.out.println("3. T-Shirt - Rs.499");
				System.out.println("4. Palazzo Pants - Rs.799");
				System.out.println("| ======================= |");
				System.out.println("Select The Item.");

				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> {
					itemName = "Casual Top";
					price = 599.0;
					stock = 25;
				}
				case 2 -> {
					itemName = "Leggings";
					price = 349.0;
					stock = 30;
				}
				case 3 -> {
					itemName = "T-Shirt";
					price = 499.0;
					stock = 25;
				}
				case 4 -> {
					itemName = "Palazzo Pants";
					price = 799.0;
					stock = 15;
				}
				default -> itemName = null;
				}

				if (itemName == null) {
					System.out.println("Invalid Choice, Please Select The Correct Item.");
				}

			} while (itemName == null);

			int quantity = getQuantity(stock);
			return new CartItem(itemName, category, subCategory, price, quantity);

		}
		default -> {
			System.out.println("Invalid Sub-category received.");
			return null;
		}
		}
	}

	private int getQuantity(int stock) {
		int quantity;
		boolean valid;
		do {
			System.out.println("Enter Quantity (Available stock : " + stock + " ) :");
			quantity = Integer.parseInt(sc.nextLine());

			if (quantity <= 0) {
				System.out.println("Quantity must be atleast 1.");
				valid = false;
			} else if (quantity > stock) {
				System.out.println("Only " + stock + " items available in stock.");
				valid = false;
			} else {
				valid = true;
			}

		} while (!valid);
		return quantity;
	}

	public void addToCart(List<CartItem> cart, CartItem item) {
		cart.add(item);
	}

	public void displayCart(List<CartItem> cart) {

		if (cart.isEmpty() || cart.size() == 0) {
			System.out.println("Your Cart is Empty !");
			return;
		} else {
			double total = 0;
			System.out.println();
			for (CartItem item : cart) {
				System.out.println("========== Cart Item Details ==========");
				System.out.println("Item Name :" + item.getItemName());
				System.out.println("Quantity :" + item.getQuantity());
				System.out.println("price :" + item.getPrice());
				System.out.println("Sub Total : " + item.getSubTotal());
				total += item.getSubTotal();
				System.out.println("--------------------------------------");
			}
			System.out.println("\n--------------------------------------");
			System.out.println("Current  Cart Total : " + total);
			System.out.println("--------------------------------------");
		}
	}

	public double calculateTotal(List<CartItem> cart) {
		double total = 0;
		for (CartItem items : cart) {
			total += items.getSubTotal();
		}
		return total;
	}

	public double calculateDiscount(List<CartItem> cart, double cartTotal) {

		double discountPercentage = 0;
		boolean hasKidsItem = false;
		for (CartItem item : cart) {
			if (item.getCategory().equals("KIDS")) {
				hasKidsItem = true;
			}
		}
		if (cartTotal > 3000) {
			if (hasKidsItem) {
				discountPercentage = 20;
			} else {
				discountPercentage = 15;
			}
		} else if (cartTotal > 1500) {
			discountPercentage = 10;
		} else {
			discountPercentage = 0;
		}
		return cartTotal * (discountPercentage / 100.0);
	}

	public void generateInvoice(List<CartItem> cart, double cartTotal, double discount) {
		if (cart.isEmpty()) {
			System.out.println("No items to generate invoice for !");
			return;
		}

		double finalTotal = cartTotal - discount;

		System.out.println("\n===============================================");
		System.out.println("           STYLEMART - INVOICE           ");
		System.out.println("===============================================");
		System.out.printf("%-20s %-5s %-10s %-10s%n", "Item", "Qty", "Price", "Subtotal");
		System.out.println("-----------------------------------------------");
		for (CartItem item : cart) {
			System.out.printf("%-20s %-5d %-10.2f %-10.2f%n", item.getItemName(), item.getQuantity(), item.getPrice(),
					item.getSubTotal());
		}

		System.out.println("-----------------------------------------------");
		System.out.printf("%-26s %-10.2f%n", "Subtotal:", cartTotal);
		System.out.printf("%-26s %-10.2f%n", "Discount:", discount);
		System.out.printf("%-26s %-10.2f%n", "Total Payable:", finalTotal);
		System.out.println("===============================================");
		System.out.println("     Thank you for shopping with us!      ");
		System.out.println("===============================================");

	}

	public boolean askToContinueShopping() {
		System.out.println("Add another item? (yes/no)");
		String decision = sc.nextLine().toLowerCase();
		if (decision.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean askToShopAgain() {
		System.out.println("Would you like to shop again (yes/no)");
		String decision = sc.nextLine().toLowerCase();
		if (decision.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		StyleMart store = new StyleMart();
		int menuChoice;

		do {
			menuChoice = store.showMenu();
			if (menuChoice == 1) {
				
				List<CartItem> cart = new ArrayList<>();
				boolean continueShopping;
				
				do {
					String category = store.selectCategory();
					String subCategory = store.selectSubCategory(category);
					CartItem item = store.selectItem(category, subCategory);
					store.addToCart(cart, item);
					store.displayCart(cart);

					continueShopping = store.askToContinueShopping();

				} while (continueShopping);

				double cartTotal = store.calculateTotal(cart);
				double discount = store.calculateDiscount(cart, cartTotal);
				store.generateInvoice(cart, cartTotal, discount);

			} else if (menuChoice == 2) {
				System.out.println("Thank you for visiting StyleMart. Goodbye!");
			} else {
				System.out.println("Invalid choice, please select 1 or 2.");
			}

		} while (menuChoice != 2);
	}
}
