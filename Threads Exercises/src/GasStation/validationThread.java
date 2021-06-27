package GasStation;

import java.util.Comparator;
import java.util.Scanner;

public class validationThread extends Thread implements Comparator<Person> {

	private Person person;

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
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sc.close();
		if (compare(getPerson(), p) == 0) {
			System.out.println("validation complete!  you can fuel.");
			return;
		}
		System.out.println("credetials incorrect.");

	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1 == o2) {
			return 0;
		}
		if (o1.getCreditNum() == o2.getCreditNum()) {
			return 0;

		}
		return -1;
	}

	public Person getPerson() {
		return person;
	}

}
