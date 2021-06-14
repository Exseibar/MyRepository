package something;

public class Car {
	
	private int number;
	private String color;
	
	public Car(int number, String color) {
		this.number = number;
		this.color = color;
	}
	
	public String toString() {
		return String.format("Car is %s, Car number is %d",color,number);
	}
}
