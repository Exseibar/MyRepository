package synchorization;

public class Car {

	private int number;
	private int km;

	public Car(int number) {
		super();
		this.number = number;
	}

	public synchronized void drive(int distance) {
		Thread driver = Thread.currentThread();
		System.out.print(driver.getName() + " started at " + km + " with car number " + number);
		System.out.print(" for a distance of " + distance + '\n');

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		km += distance;
		System.out.println(driver.getName() + " finished at " + km + " with car number " + number);
	}

}
