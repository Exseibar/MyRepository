package abstracts;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("I AM BATMAN");
	}

	@Override
	public void fly() {
		System.out.println("Bat flies");
	}

	@Override
	public void navigate() {
		System.out.println("Bat navigation");
	}

	@Override
	public void land() {
		System.out.println("Bat lands");

	}

	@Override
	public void takeOff() {
		System.out.println("Bat takes off");

	}

	@Override
	public void glide() {
		System.out.println("Bat glides");
	}

}
