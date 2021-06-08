package advanced.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] chairs = new int[5][12];

		for (int i = 0; i < chairs.length; i++) {
			for (int j = 0; j < chairs[0].length; j++) {
				chairs[i][j] = (int) (Math.random() * 2);
			}
		}
		System.out.println("Chairs:");
		for (int i = 0; i < chairs.length; i++) {
			System.out.println(Arrays.toString(chairs[0]));
		}
		System.out.println("Choose a line: ");
		int line = sc.nextInt() - 1;
		System.out.println("Choose a seat: ");
		int seat = sc.nextInt() - 1;

		while (line != -9 || seat != -9) {
			System.out.println("Chairs:");
			for (int i = 0; i < chairs.length; i++) {
				System.out.println(Arrays.toString(chairs[0]));
			}

			if (chairs[line][seat] == 1) {
				System.out.println("Seat unvailable, please choose another seat");

				System.out.println("Choose a line: ");
				line = sc.nextInt() - 1;
				System.out.println("Choose a seat: ");
				seat = sc.nextInt() - 1;

				continue;

			} else if (line < 0 || line > 4 || seat < 0 || seat > 11) {
				System.out.println("Invalid seat.");
				System.out.println("Choose a line: ");
				line = sc.nextInt() - 1;
				System.out.println("Choose a seat: ");
				seat = sc.nextInt() - 1;
				continue;

			} else {
				System.out.println("Seat available!");

				break;
			}
		}
		sc.close();
		System.out.println("Have a nice day!");
	}

}
