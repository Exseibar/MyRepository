package exceptions.task2;

public class Triangle {
	public static final int MIN = 0;

	private int a;

	private int b;

	private int c;

	public Triangle() {

	}

	public Triangle(int a, int b, int c) {
		try {
			setABC(a, b, c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public void setABC(int a, int b, int c) throws Exception {
		if (isValid(a, b, c) == false) {
			this.a = MIN;
			this.b = MIN;
			this.c = MIN;
			throw new Exception("invalid triangle. all numbers are initiated to " + MIN);

		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static boolean isValid(int a, int b, int c) {
		if (a + b > c && b + c > a && a + c > b) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
