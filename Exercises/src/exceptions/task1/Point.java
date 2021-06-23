package exceptions.task1;

public class Point {
	public static final int MAX = 100;
	public static final int MIN = 0;

	private int x;
	private int y;

	public Point(int x, int y) {
		try {
			setX(x);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			setY(y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void setX(int x) throws Exception {
		if (x < MIN) {
			this.x = MIN;
			throw new Exception("x coordinate is under minimum range and is initiated to " + MIN);
		}
		if (x > MAX) {
			this.x = MAX;
			throw new Exception("x coordinate is over maximum range and is initiated to " + MAX);
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws Exception {
		if (y < MIN) {
			this.y = MIN;
			throw new Exception("y coordinate is under minimum range and is initiated to " + MIN);
		}
		if (y > MAX) {
			this.y = MAX;
			throw new Exception("y coordinate is over maximum range and is initiated to " + MAX);
		}
		this.y = y;
	}

	public void moveUp(int num) {
		if (num == MAX) {
			System.out.println("number can't go higher than " + MAX);
			return;
		}
		num++;
	}

	public void moveDown(int num) {
		if (num == MIN) {
			System.out.println("number can't go lower than " + MIN);
			return;
		}
		num--;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
