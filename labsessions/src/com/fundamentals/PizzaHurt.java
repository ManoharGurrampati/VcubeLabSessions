package com.fundamentals;

public class PizzaHurt {

	static String storeName = "PizzaWheels";
	static int orderID = 0;
	double totalPrice;

	{
		orderID += 1;
	}

	String itemName;
	int itemsCount = 0;
	double itemPrice;
	boolean status = false;

	public void addItem() {
		System.out.println("==========================================");
		System.out.println("Item " + itemName + " added to the cart");
		itemsCount += 1;
		totalPrice += itemPrice;
	}

	public void displayCart() {
		System.out.println("=========================================");
		System.out.println("Name of the Website : "+storeName);
		System.out.println( itemsCount+" items are ordered.");
		System.out.println("Price of the your order is :"+totalPrice);
		System.out.println("=========================================");
	}
	
	public void placeOrder() {
		if(status) {
			System.out.println("Oder No : "+orderID+" is palced !");
		}
	}
	
	public static void  changeWebsiteName() {
		storeName ="Pizza Hut";
	}
	
	public static void main(String[] args) {
		PizzaHurt order1 = new PizzaHurt();
		order1.itemName="Veg Pizza";
		order1.itemPrice = 240;
		order1.addItem();
		order1.itemName="CoolDrink (ThumsUp)";
		order1.addItem();
		order1.itemPrice = 120;
		order1.placeOrder();
		order1.displayCart();
		
		changeWebsiteName();
		
		PizzaHurt order2 = new PizzaHurt();
		order2.itemName="Chicken Bugger";
		order2.itemPrice = 420;
		order2.addItem();
		order2.itemName="Mozitto-lime";
		order2.addItem();
		order2.itemPrice = 150;
		order2.placeOrder();
		order2.displayCart();
		
	}

}
