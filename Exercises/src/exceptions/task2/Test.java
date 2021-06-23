package exceptions.task2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		Triangle t;

		while (true) {
			System.out.println("enter a value");
			a = sc.nextInt();
			System.out.println("enter a value");
			b = sc.nextInt();
			System.out.println("enter a value");
			c = sc.nextInt();
			if (Triangle.isValid(a, b, c)) {
				t = new Triangle(a, b, c);
				break;
			}
			System.out.println("invalid values for triangle.  please try again");

		}
		System.out.println(t);

	}

}
