package collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("bbbbbbbbbbbbbb");
		list.add("ccc");
		list.add("ccccccccccccc");

		// get an iterator from the list
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String currElement = it.next();
//			System.out.println(currElement);

			// remove elements depending on length
			if (currElement.length() > 3) {
				it.remove();
			}
		}
		System.out.println(list);

	}
}
