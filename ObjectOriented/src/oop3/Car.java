package oop3;

public class Car {

	private int number;
	private int speed;
	private static int counter = 0;
	public static final int MAX_SPEED = 120; // constant

	{
		this.number = counter++;
	}

	public Car() {

	}

	public Car(int speed) {
		this();
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	public static int getCounter() {
		return counter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}

}
