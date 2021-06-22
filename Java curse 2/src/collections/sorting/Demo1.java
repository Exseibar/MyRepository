package collections.sorting;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		{
			System.out.println("=====================================");
			List<Integer> list = Arrays.asList(4, 5, 8, 2, 5, 3, 1);
			System.out.println(list);
			list.sort(null);
			System.out.println("---------------------------------");
			System.out.println(list);
			System.out.println("======================================");
		}
		{
			List<String> list = Arrays.asList("banana", "dog", "cat", "apple");
			printCollection(list);
			list.sort(null);
			System.out.println("----------------------------------");
			printCollection(list);

			System.out.println("======================================");
		}
		{
			List<LocalDate> list = Arrays.asList(LocalDate.of(1980, 12, 15),

					LocalDate.of(1950, 5, 12),

					LocalDate.of(2001, 11, 5),

					LocalDate.of(1985, 2, 2),

					LocalDate.of(1972, 3, 12),

					LocalDate.of(2005, 4, 8));

			list.sort(null);
			printCollection(list);
		}

		System.out.println("=============================================");

		{
			List<Person> list = Arrays.asList(new Person(555, "elon", 6), new Person(333, "dan", 12),
					new Person(111, "zahava", 95), new Person(444, "elyhu", 18));
			printCollection(list);
			list.sort(new PersonNameComparator());
			System.out.println("-------------------------------------");
			printCollection(list);
		}
		System.out.println("==============================================");

	}

	private static void printCollection(Collection<?> col) {

		for (Object o : col) {
			System.out.println(o);
		}

	}

}
