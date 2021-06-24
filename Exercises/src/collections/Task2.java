package collections;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 61) + 20);
		}

		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(9));
		if (list.contains(25)) {
			System.out.println("index of the value 25: " + list.indexOf(25));
		} else {
			System.out.println("list does not contain the value 25");
		}

	}

}
