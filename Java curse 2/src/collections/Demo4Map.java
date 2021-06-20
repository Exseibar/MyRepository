package collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Map {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(map.get(3));

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		System.out.println(map.get(3));
	}

}
