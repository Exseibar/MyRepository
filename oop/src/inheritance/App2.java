package inheritance;

public class App2 {
	public static void main(String[] args) {
		Shape[] shape = new Shape[5];
		shape[0] = new Rectangle(5, 7, "Green");
		shape[1] = new Circle(4, "Yellow");
		shape[2] = new Shape("White");
		shape[3] = new Rectangle(7, 8, "Blue");
		shape[4] = new Circle(8, "Grey");

		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].getArea());
			System.out.println(shape[i].getColor());
			if (shape[i] instanceof Circle) {
				System.out.println("This is a circle");
				Circle circle = (Circle) shape[i];
				System.out.println("Radius: " + circle.getRadius());
			}
		}
	}

}
