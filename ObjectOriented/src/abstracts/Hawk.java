package abstracts;

public class Hawk extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("Hawk Screech");
	}

	@Override
	public void fly() {
		System.out.println("flies");
	}

	@Override
	public void navigate() {
		System.out.println("Hawk navigation");

	}
}
