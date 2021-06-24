package synchorization;

public class CarDriver extends Thread {

	private Car car;
	private int drivingDistance;

	public CarDriver(String name, Car car, int drivingDistance) {
		super(name);
		this.car = car;
		this.drivingDistance = drivingDistance;
	}

	public void run() {
		car.drive(drivingDistance);
	}

}
