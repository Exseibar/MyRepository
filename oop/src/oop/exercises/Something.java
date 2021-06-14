package oop.exercises;

import java.util.Scanner;

public class Something {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[2];

		int number = -1;
		int pickAnother = 0;
		String name;
		double price = 00.00;
		double totalSum = 0;
		boolean isAvailable = false;
		boolean doesBookExist = false;
		for (int i = 0; i < book.length; i++) {
			System.out.println("add a book number, name and price");
			number = sc.nextInt();
			price = sc.nextDouble();
			name = (String) sc.nextLine();
			name = (String) sc.nextLine();
			book[i] = new Book(number, name, price);
		}

		System.out.println("choose a book number");
		number = sc.nextInt();

		while (true) {
			isAvailable = true;
			doesBookExist = true;
			for (int i = 0; i < book.length; i++) {
				if (number == book[i].getNumber()) {
					if (book[i].isBookAvailabe()) {
						System.out.println("The book you chose is " + book[i].getName());
						totalSum += book[i].getRentPrice();
						isAvailable = false;
						book[i].setAvailable(isAvailable);
						System.out.println("Do you want to rent anymore books? 1 = yes, other numbers = no.");
						pickAnother = sc.nextInt();
						break;
					} else {
						System.out.println("The book is Unavailable");
						System.out.println("do you wawnt to pick another? 1 = yes, other numbers = no");
						pickAnother = sc.nextInt();
						break;
					}
				} else {
					if (i == book.length - 1) {
						System.out.println("We do not have this book in our library.");
						System.out.println("do you wawnt to pick another? 1 = yes, other numbers = no");
						pickAnother = sc.nextInt();
					}
				}
			}
			if (pickAnother != 1) {
				System.out.println("This will be " + totalSum + "$");
				System.out.println("Thank you, have a nice day.");
				break;
			}
			System.out.println("choose a book number");
			number = sc.nextInt();
		}

	}

}
