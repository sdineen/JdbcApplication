package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductRepository {

	public boolean createProduct(Product product) {
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "carpond";

		//autocloseable object
		try (Connection c = DriverManager.getConnection(url, user, password)) {
			Statement statement = c.createStatement();
			String sql = "insert";
			int rowCount = statement.executeUpdate(sql);		
			//return true if rowCount is 1
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
