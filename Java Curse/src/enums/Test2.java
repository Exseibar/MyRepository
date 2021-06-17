package enums;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("choose car color" + Arrays.toString(Color.values()));

		Color color = Color.valueOf(sc.nextLine());
		System.out.println(color);

		sc.close();
		Car c = new Car(111, color);
		System.out.println(c);

	}

}
