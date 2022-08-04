package com.qa.jdbc;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;

import org.junit.Test;

public class ConnectToDbTest {

	@Test
	public void getConnectionTest() {
		ConnectToDb db = new ConnectToDb();
		Connection c = db.getConnection();
		assertTrue(c instanceof Connection);
	}
}
