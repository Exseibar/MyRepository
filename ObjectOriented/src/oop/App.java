package oop;

public class App {

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);

		System.out.println("====toString====");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("====hashCode====");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("====equals====");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
