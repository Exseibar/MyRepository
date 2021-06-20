package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo1List {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("AAA");
		list.add(5);
		list.add(true);
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.size());
	}

}
