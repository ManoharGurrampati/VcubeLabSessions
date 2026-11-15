package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO implements ProductsInterface {
	boolean status = false;
	List<Products> list = new ArrayList<>();

	@Override
	public boolean insertProduct(Products product) {

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement stmt = con
					.prepareStatement("insert into products (product_Name, category, price) values (?,?,?)");

			stmt.setString(1, product.getProduct_Name());
			stmt.setString(2, product.getCategory());
			stmt.setDouble(3, product.getPrice());

			int n = stmt.executeUpdate();

			if (n > 0) {
				status = true;
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

	@Override
	public List<Products> getAllProducts() {
		try {
			Connection con = DBConnection.getConnection();

			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery("select * from products");

			while (set.next()) {
				list.add(new Products(set.getInt(1), set.getString(2), set.getString(3), set.getDouble(4)));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public Products getProductById(int id) {
		Products product = null;
		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement stmt = con.prepareStatement("select * from products where id = ?");
			stmt.setInt(1, id);

			ResultSet set = stmt.executeQuery();

			while (set.next()) {
				product = new Products(set.getInt(1), set.getString(2), set.getString(3), set.getDouble(4));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return product;
	}

	@Override
	public List<Products> getProductsByCategory(String category) {

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement stmt = con.prepareStatement("select * from products where category = ?");
			stmt.setString(1, category);

			ResultSet set = stmt.executeQuery();

			while (set.next()) {
				list.add(new Products(set.getInt(1), set.getString(2), set.getString(3), set.getDouble(4)));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	@Override
	public boolean findProductById(int id) {

		try {
			Connection con = DBConnection.getConnection();

			PreparedStatement stmt = con.prepareStatement("select * from products where id = ?");
			stmt.setInt(1, id);

			ResultSet set = stmt.executeQuery();

			if (set.next()) {
				status = true;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return status;
	}

	@Override
	public boolean updateProduct(int id, Products product) {
		try {

			if (findProductById(id)) {
				Connection con = DBConnection.getConnection();

				PreparedStatement stmt = con
						.prepareStatement("update products set product_Name = ?, category = ?, price = ? where id = ?");

				stmt.setString(1, product.getProduct_Name());
				stmt.setString(2, product.getCategory());
				stmt.setDouble(3, product.getPrice());
				stmt.setInt(4, id);

				int n = stmt.executeUpdate();

				if (n > 0) {
					status = true;
				}

				con.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

	@Override
	public boolean deleteAllProducts() {
		try {
			Connection con = DBConnection.getConnection();

			Statement stmt = con.createStatement();

			int n = stmt.executeUpdate("Delete from products");

			if (n > 0) {
				status = true;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

}
