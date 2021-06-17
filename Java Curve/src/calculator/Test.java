package calculator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			int b = sc.nextInt();

			Calculator calc = new Calculator(a, b);
			calc.divide(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.err.println("HMPH!!!!!!!!");
		}
	}

}
