package GasStation;

import java.util.Scanner;

public class validationThread extends Thread {

	private Person person;
	private static int sleepTime = 10000;

	public validationThread() {
		person = new Person(123, 645, 6445);
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter your car number");
		int carNumber = sc.nextInt();
		System.out.println("enter credit number");
		int creditCard = sc.nextInt();
		System.out.println("proccessing...");
		Person p = new Person(id, carNumber, creditCard);
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sc.close();
		if (person.getCreditNum() == creditCard) {
			System.out.println("validation complete!  you can fuel.");
			return;
		}
		System.out.println("credetials incorrect.");

	}

}
