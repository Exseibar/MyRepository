package learning;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pearson[] persons = new Pearson[3];

		// get input from the user, then call the to person ctor with the user values
		for (int i = 0; i < 3; i++) {
			System.out.println("Choose a username");
			String user = sc.nextLine();
			System.out.println("Choose a password");
			String pass = sc.nextLine();
			persons[i] = new Pearson(user, pass);
		}
		
		do {
			String user = sc.nextLine();
			String pass = sc.nextLine();
			
			
		}while()
		

	}

}
