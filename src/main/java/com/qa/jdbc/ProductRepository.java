package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRepository {

	public boolean createProduct(Product product) {
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "carpond";

		// autocloseable object
		try (Connection c = DriverManager.getConnection(url, user, password)) {
			String sql = "insert into Product (id, name, costPrice, retailPrice) values(?,?,?,?)";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setDouble(3, product.getCostPrice());
			ps.setDouble(4, product.getRetailPrice());
			int rowCount = ps.executeUpdate();

			return rowCount == 1;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public Product readProduct(int id) {
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "carpond";
		// autocloseable object
		try (Connection c = DriverManager.getConnection(url, user, password)) {

			Statement statement = c.createStatement();
			String sql = "select * from product where id = "+id;
			ResultSet resultSet = statement.executeQuery(sql);
			boolean rowRead = resultSet.next();
			if(rowRead) {
				int idValue = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double costPrice = resultSet.getDouble("costPrice");
				double retailPrice = resultSet.getDouble("retailPrice");
				Product product = new Product(idValue, name, costPrice, retailPrice);
				return product;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
