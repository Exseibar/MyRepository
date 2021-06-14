package oop.exercises;

public class Book {

	private int number;
	private String name;
	private double rentPrice;
	private boolean isAvailable = true;

	public Book(int number, String name, double price) {

		this.number = number;
		this.name = name;
		this.rentPrice = price;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public boolean isBookAvailabe() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
