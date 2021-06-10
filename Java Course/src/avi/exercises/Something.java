package avi.exercises;

public class Something {

	private final String name;
	private final long id;

	public Something(String name, long id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object otherSomething) {
		if (this == otherSomething) { // check if the same object (aliasing)
			return true;
		}
		if (otherSomething instanceof Something) { // check if the same instance, does not want to equals Something and
													// String
			Something temp = (Something) otherSomething; // for example
			return id == temp.getId() && name.equals(temp.getName()); // compare attributes and return true if equlsa
		}

		return false; // not the same instance
	}

	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Something b1 = new Something("Yossi", 318166881);
		Something b2 = new Something("Yossi", 318166881);
		String name = "Yossi";

		System.out.println(b1.equals(name));
	}

}
