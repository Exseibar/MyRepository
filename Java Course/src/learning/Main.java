package learning;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pearson[] persons = new Pearson[1];

		int index;
		String username;
		String password;

		for (int i = 0; i < persons.length; i++) { // Creating user names and passwords.
			System.out.println("Choose a username");
			String user = sc.next();
			System.out.println("Choose a password");
			String pass = sc.next();
			persons[i] = new Pearson(user, pass);
		}

		System.out.println("Enter index");
		index = sc.nextInt() - 1;

		while (index >= 0 && index < persons.length) {

			System.out.println("Enter username, enter 'exit' to exit");
			username = sc.next();
			if (username.equals("exit")) {
				break;
			}
			System.out.println("Enter password");
			password = sc.next();
			if (!persons[index].equals(username, password)) {
				System.out.println("invalid credetials.");
			} else {
				System.out.println("Welcome back, " + persons[index].getUser());
				break;
			}
			System.out.println("Enter index");
			index = sc.nextInt() - 1;
		}
		sc.close();

	}
}
