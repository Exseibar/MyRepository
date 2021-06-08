package learning;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pearson[] persons = new Pearson[3];

		for (int i = 0; i < 3; i++) { // Creating user names and passwords.
			System.out.println("Choose a username");
			String user = sc.nextLine();
			System.out.println("Choose a password");
			String pass = sc.nextLine();
			persons[i] = new Pearson(user, pass);
		}
		boolean loggedIn = false;

		do { // logging in.
			loggedIn = false;

			System.out.println("Enter index");
			int index = sc.nextInt() - 1;
			if (index < 0 || index > persons.length) {
				System.out.println("invalid Index, try again: ");
				continue;
			}
			System.out.println("Enter username");
			String user = sc.nextLine();
			if (user != persons[index].getUser()) {
				System.out.println("wrong username, try again: ");
				continue;
			}
			System.out.println("Enter passwword");
			String pass = sc.nextLine();
			if (pass != persons[index].getPass()) {
			}

		} while (loggedIn == false);

	}

}
