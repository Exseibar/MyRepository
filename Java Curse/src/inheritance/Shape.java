package inheritance;

public abstract class Shape implements Printable {

	// Attributes
	protected String color; // instance attribute
	private final int id;
	private static int counter = 0; // Class attribute

	// Initializer - always runs before CTOR
	{
		id = counter++;
	}

	// CTOR
	public Shape(String color) {
		this.color = color;
	}

	// Abstract methods
	public abstract double getArea();

	public abstract double getPerimeter();

	// Concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", id=" + id + "]";
	}
}
