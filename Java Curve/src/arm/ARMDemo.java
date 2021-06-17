package arm;

import java.util.Scanner;

public class ARMDemo {

	public static void main(String[] args) {

		// declaring a resource
		// create a resource

		try (Scanner sc = new Scanner(System.in);) {
//			throw new NullPointerException();
			throw new RuntimeException();

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Catch - ArithmeticException OR NullPointerException");
		} catch (Exception e) {
			System.out.println("catch - some other Exception");
		} finally {
			System.out.println("finally");
		}

		// after the try block Java call close() method on the ARM resource
	}

}

class MyCloseable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("MyCloseable is closing");

	}

}
