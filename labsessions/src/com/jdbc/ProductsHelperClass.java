package com.jdbc;

import java.util.List;

public class ProductsHelperClass {

	public static void main(String[] args) {
		
		Products obj = new Products("The Wings Of Fire", "Book", 300.00);

		ProductsDAO DAOobj = new ProductsDAO();

		int id = 4;

//		Inserting a recrod.
		if (DAOobj.insertProduct(obj)) {
			System.out.println("Record(s) inserted successfully");
		} else {
			System.out.println("Unable to insert the record into the table !!!");
		}

//		Retrieving The records (ALL, ById, ByCategory)
		List<Products> list = DAOobj.getAllProducts();
		System.out.println(list);
//
		Products obj2 = DAOobj.getProductById(1);
		System.out.println(obj2);

		if (DAOobj.findProductById(id)) {
			System.out.println("Product with ID : " + id+" is Available !");
		}else {
			System.out.println("Product with ID : " + id+" is Unavailable ! (OutOfStock)");
		}	

//		Updating the record with id and product Object.
		if (DAOobj.updateProduct(id, obj)) {
			System.out.println("Product with id : " + id + " is Updated SuccessFully!");
		} else {
			System.out.println("Product with id : " + id + " Not Found !!");
		}

//		Deleting the record with Id.
		if (DAOobj.deleteAllProducts()) {
			System.out.println("All Products are deleted!");
		} else {
			System.out.println("No prodcuts are available to delete!");
		}
	}

}
