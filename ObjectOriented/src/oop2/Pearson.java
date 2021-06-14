package oop2;

public class Pearson {

	private int id;
	private String name;
	private int age;

	public Pearson(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int age() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name: %s \nAge: %d \nId: %d", name, age, id);
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = result * prime + id;
		result = result * prime + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pearson)) {
			return false;
		}
		Pearson other = (Pearson) obj;
		if (this.name == other.name && this.age == other.age && this.id == other.id) {
			return true;
		}
		return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("NOoooooo");
	}

}
