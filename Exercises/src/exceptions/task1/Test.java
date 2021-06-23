package exceptions.task1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int x, y;

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				try {

					System.out.println("enter x");
					x = Integer.parseInt(sc.nextLine());
					break;

				} catch (NumberFormatException e) {
					System.out.println("please use numbers only. try again.");
				}
			}
			while (true) {
				try {

					System.out.println("enter y");
					y = Integer.parseInt(sc.nextLine());

					break;
				} catch (NumberFormatException e) {

					System.out.println("please use numbers only. try again.");
				}
			}
		}
		Point p = new Point(x, y);

		System.out.println(p);
	}

}
