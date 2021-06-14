package inheritance;

public class App {

	public static void main(String[] args) {
		Shape shape = new Shape("yellow");
		System.out.println(shape.getArea());

		Rectangle rectangle = new Rectangle(5, 3, "Green");
		System.out.println(rectangle.getArea());

		Circle circle = new Circle(5, "Black");
		System.out.println(circle.getArea());

	}

}
