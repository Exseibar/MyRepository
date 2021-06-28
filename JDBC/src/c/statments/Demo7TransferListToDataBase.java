package c.statments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo7TransferListToDataBase {

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
			System.out.println("connected to " + url);
			// ====================================================
			// select * from person
			Statement stmt = con.createStatement();
			for (Person p : personList) {
				String sql = "insert into person values(" + p.getId() + ", '" + p.getName() + "', " + p.getAge() + ")";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
			// ====================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}
