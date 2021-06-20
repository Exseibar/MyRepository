package collections;

import java.util.HashSet;
import java.util.Set;

public class Demo3Set {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("aaa");
		set.add("aaaa");
		set.add("bbbb");
		set.add("wewew");
		set.add("asdasd");
		set.add("asdasdfg");
		System.out.println(set);
	}

}
