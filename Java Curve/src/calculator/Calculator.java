package calculator;

public class Calculator {

	private int num1;
	private int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int divide(int num1, int num2) throws ArithmeticException {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			throw new ArithmeticException("Cannot divide by 0");
		}
	}
}
