package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

		set.add("Zahava");
		set.add("Avi");
		set.add("Yossi");

		System.out.println(set);

		Iterator<String> it = set.iterator();

		for (int i = 0; it.hasNext(); i++) {
			String curr = it.next();
			if (i == 2) {
				System.out.println(curr);
				break;
			}
		}
	}

}
