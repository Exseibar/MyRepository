package exercise;

public class Trainer extends Person {

	private double monthlySalary;

	public Trainer(int id, String name, int age, double monthlySalary) {
		super(id, name, age);
		this.monthlySalary = monthlySalary;

	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}
