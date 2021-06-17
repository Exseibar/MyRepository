package exceptions;

public class Person {

	public static final int MIN_AGE = 0;
	public static final int MAX_AGE = 120;
	public int id;
	public int age;
	public String name;

	public Person() {

	}

	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	// handling 1 = throws declaration
	public void setAge(int age) throws IllegalAgeException {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age;
		} else {
			// we want to throw an Exception
			// we need an Exception instance
			IllegalAgeException e = new IllegalAgeException("the age " + age + " is out of range");
			// we need to throw the Exception
			throw e;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
