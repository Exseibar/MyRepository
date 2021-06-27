package GasStation;

public class Person {

	private int id;
	private int carNumber;
	private int creditNum;

	public Person(int id, int carNumber, int creditNum) {
		this.id = id;
		this.carNumber = carNumber;
		this.creditNum = creditNum;
	}

	public int getId() {
		return id;
	}

	public int getCarNum() {
		return carNumber;
	}

	public int getCreditNum() {
		return creditNum;
	}

}
