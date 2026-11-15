package com.jdbc;

import java.util.List;

public interface ProductsInterface {
//	Create a product record.
	public abstract boolean insertProduct(Products product);

//	Read records from the products tables.
	public abstract List<Products> getAllProducts();

//
	public abstract Products getProductById(int id);

//
	public abstract List<Products> getProductsByCategory(String category);

	public abstract boolean findProductById(int id);

//	Update the products record.
	public abstract boolean updateProduct(int id, Products product);

//	Delete the product records.
	public abstract boolean deleteAllProducts();
//
//	public abstract boolean deleteProductById(int id);
}
