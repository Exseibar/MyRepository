package classes.definition;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + '\n' + "Salary: " + salary;

	}

}
