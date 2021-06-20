package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2ListTyped {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Shmok");
		list.add("Shmok");
		list.add("Shmok");
		list.add(0, "kof");
		System.out.println(list);

	}

}
