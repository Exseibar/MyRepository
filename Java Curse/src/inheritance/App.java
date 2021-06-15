package inheritance;

public class App {

	public static void main(String[] args) {

		Shape s = new Circle("Yellow", 2);
		Shape r = Square.isSquare("Yellow", 500, 400);
		Shape a = Square.isSquare("Yellow", 500, 500);

		System.out.println(r.getClass());
		System.out.println(a.getClass());
		s.print();

	}

}
