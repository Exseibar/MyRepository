package collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		int sum = 0;

		list.add(50);
		list.add(564);
		list.add(32);

		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		System.out.println("sum= " + sum);
		System.out.println("avg= " + (double) sum / list.size());
	}

}
