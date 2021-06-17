package exercise;

public class Member extends Person {

	private double monthlyPayment;

	public Member(int id, String name, int age, double monthlyPayment) {
		super(id, name, age);
		this.monthlyPayment = monthlyPayment;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

}
