package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 6) + 5);
		}
		System.out.println(list);

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}

		System.out.println(set);

	}

}
