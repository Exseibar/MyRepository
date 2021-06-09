package learning;

public class Blat {

	private final String name;
	private final long id;

	public Blat(String name, long id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object otherBlat) {
		if (this == otherBlat) { // check if the same object (aliasing)
			return true;
		}
		if (otherBlat instanceof Blat) { // check if the same instance, does not want to equals Blat and String
			Blat temp = (Blat) otherBlat; // for example
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
		Blat b1 = new Blat("Yossi", 318166881);
		Blat b2 = new Blat("Yossi", 318166881);
		String name = "Yossi";

		System.out.println(b1.equals(name));
	}

}
