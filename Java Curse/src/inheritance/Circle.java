package inheritance;

public class Circle extends Shape {

	// Attributes
	private int radius;

	// CTOR
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return (Math.PI * radius) * 2;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	@Override
	public void print() {
		System.out.println(this);
	}

}