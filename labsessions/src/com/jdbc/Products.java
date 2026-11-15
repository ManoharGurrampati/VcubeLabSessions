package com.jdbc;

public class Products {
	private int id;
	private String product_Name;
	private String category;
	private double price;

	public Products(String product_Name, String category, double price) {
		super();
		this.product_Name = product_Name;
		this.category = category;
		this.price = price;
	}

	public Products(int id, String product_Name, String category, double price) {
		super();
		this.id = id;
		this.product_Name = product_Name;
		this.category = category;
		this.price = price;
	}

	public Products() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " id: " + id + ", product_Name: " + product_Name + ", category: " + category + ", price: " + price + "/-"
				+ "\n";
	}

}
