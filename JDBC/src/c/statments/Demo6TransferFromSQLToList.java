package c.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo6TransferFromSQLToList {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected to " + url);
			// ====================================================
			// select * from person
			String sql = "select * from person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<Person> personList = new ArrayList<Person>();
			while (rs.next()) { // print all result set
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				int age = rs.getInt(3);
				int id = rs.getInt("id");
				String name = rs.getString("nam");
				int age = rs.getInt("age");
				personList.add(new Person(id, name, age));

				System.out.println(id + ", " + name + ", " + age);
			}
			System.out.println(personList);

			System.out.println(sql);
			// ====================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}
