package c.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected to " + url);
			// ====================================================
			// primary key means you can't duplicate the same parameter
			String sql = "create table Person(id int primary key, nam varchar(15), age int)"; // statement to sql
			// use Statement to send SQL commands to the RDBMS
			// we get the Statement object from the connection
			Statement stmt = con.createStatement();
			// use Statement object to execute the statement
			stmt.executeUpdate(sql);
			System.out.println(sql);
			// ====================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}
