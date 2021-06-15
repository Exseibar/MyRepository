package inheritance;

public class Square extends Rectangle {

	public Square(String color, int length, int width) {
		super(color, length, width);
	}

	@Override
	public double getArea() {
		return super.getArea();
	}

	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}

	@Override
	public int getLength() {
		return super.getLength();
	}

	@Override
	public void setLength(int length) {
		super.setLength(length);
	}

	@Override
	public int getWidth() {
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		super.setColor(color);
	}

	@Override
	public void print() {
		super.print();
	}

	public static Shape isSquare(String color, int width, int height) {

		if (width == height) {
			return new Square(color, width, height);
		}
		return new Rectangle(color, width, height);
	}

}
