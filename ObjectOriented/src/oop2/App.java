package oop2;

public class App {

	public static void main(String[] agrs) {
		Pearson p1 = new Pearson(123, "Alfred", 36);
		Pearson p2 = new Pearson(123, "Alfred", 36);

		System.out.println("toString Method");
		System.out.println(p1);
		System.out.println("");

		System.out.println("hashCode Method");
		System.out.println("p1: " + p1.hashCode());
		System.out.println("p2: " + p2.hashCode());

		System.out.println("equals Method");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

		p1 = null;

		System.gc();
	}

}
