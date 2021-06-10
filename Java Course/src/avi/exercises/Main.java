package avi.exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pearson[] persons = new Pearson[3];

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

		System.out.println("Enter user number"); // the user index in the array.
		index = sc.nextInt() - 1;

		while (index >= 0 && index < persons.length) { // until the credentials are right or the user exits.

			System.out.println("Enter username, enter 'exit' to exit");
			username = sc.next();
			if (username.equals("exit")) {
				break;
			}
			System.out.println("Enter password");
			password = sc.next();
			Pearson temp = new Pearson(username, password);
			if (!persons[index].equals(temp)) {
				System.out.println("invalid credetials.");
			} else {
				System.out.println("Welcome back!");
				break;
			}
			System.out.println("Enter user number");
			index = sc.nextInt() - 1;
		}
		sc.close();

	}
}
