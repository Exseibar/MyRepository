package enums;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Car c1 = new Car(111, Color.BLACK);
		Car c2 = new Car(111, Color.WHITE);
		Car c3 = new Car(111, Color.YELLOW);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// get an array of all enum constants
		Color[] colors = Color.values();
		System.out.println(Arrays.toString(colors));

		// get a single enum constant from a String
		String str = "BLACK";
		Color color = Color.valueOf(str);

		// set an enum constant to an object
		c2.setColor(color);
		System.out.println(c2);

	}

}
