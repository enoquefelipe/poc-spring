package com.mycompany.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "vertrigo");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
