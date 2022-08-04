package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {


	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "carpond";

		//autocloseable object
		try (Connection c = DriverManager.getConnection(url, user, password)) {
			return c;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

}
