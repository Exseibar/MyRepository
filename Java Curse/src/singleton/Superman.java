package singleton;

public class Superman {
	// 1. Private CTOR
	private Superman() {
	}

	// 2. Define a field for the single instance
	private static Superman instance = new Superman();

	// 3. Define a getter for that single instance
	public static Superman getInstance() {
		return instance;
	}

	public void fly() {
		System.out.println("Flying");
	}

}
