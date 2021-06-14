package abstracts;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("I AM BATMAN");
	}

	@Override
	public void fly() {
		System.out.println("flies");
	}

	@Override
	public void navigate() {
		System.out.println("navigates");
	}

	@Override
	public void land() {
		System.out.println("Lands");

	}

	@Override
	public void takeOff() {
		System.out.println("Takes off");

	}

}
