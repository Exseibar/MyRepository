package exercise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListsTar1 {

	// get a set with 10 random numbers in range of 0 - 10
	//

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();
		while (set.size() < 10) {
			set.add((int) (Math.random() * 11));
		}
		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		int sum = 0;
		for (int i = 0; i < set.size(); i++) {
			sum += it.next();
		}
		System.out.println(sum);

	}

}
