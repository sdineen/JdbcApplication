package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {


	public Connection getConnection() {
		String url = "jdbc:h2:~/db1";

		//autocloseable object
		try (Connection c = DriverManager.getConnection(url)) {
			return c;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

}
