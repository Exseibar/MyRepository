package b.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) {

		// after '?' a parameter comes // how to create database from java
		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true"; // jdbc:mysql://localhost:port/schema
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) { // disconnect from database after use
			// Connection is closeable
			System.out.println("connected to " + url);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}
}
