package inheritance;

public class App3 {
	public static void main(String[] args) {
		Object obj = new Circle(5, "Pink");
		Shape shape = (Shape) obj;
		shape.getArea();
		shape.getColor();
		shape.setColor("Black");

		Circle circle = (Circle) obj;
		circle.getArea();
		circle.getColor();
		circle.getRadius();
		circle.setColor("Black");
		circle.setRadius(8);

	}

}
