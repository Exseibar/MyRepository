package c.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Demo8PreparedStatement {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();

		String[] names = { "Dan", "Lea", "Yoni", "David", "Moshe", "yossi" };
		for (int i = 0; i < 30; i++) {
			String name = names[(int) (Math.random() * names.length)];
			int age = (int) (Math.random() * 121);
			personList.add(new Person(i, name, age));

		}
		String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			// ====================================================
			String sql = "insert into person values(?,?,?)";
//			Statement stmt = con.createStatement();
			PreparedStatement stmt = con.prepareStatement(sql);
			for (Person p : personList) {
				stmt.setInt(1, p.getId());
				stmt.setString(2, p.getName());
				stmt.setInt(3, p.getAge());
//				stmt.executeUpdate(sql);
				stmt.executeUpdate(); // execute without an sql String because now it is a prepared statement.
				System.out.println(sql);
			}
			// ====================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
