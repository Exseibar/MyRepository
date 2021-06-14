package classes.definition;

public class Person {

	protected int id;
	protected String name;
	protected int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	public void speak() {
		System.out.println(name + " says: bla bla");
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

	public void setAge(int age) {
		if (age < 0 || age > 120) {
			age = 0;
		}
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Id: " + id;

	}

}
