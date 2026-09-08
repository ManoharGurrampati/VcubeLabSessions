package com.mainpackage;

public class CartItem {

	private String itemName;
	private String category;
	private String subCategory;
	private double price;
	private int quantity;

	public CartItem() {

	}

	public CartItem(String itemName, String category, String subCategory, double price, int quantity) {
		this.itemName = itemName;
		this.category = category;
		this.subCategory = subCategory;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public String getCategory() {
		return category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSubTotal() {
		return price * quantity;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
