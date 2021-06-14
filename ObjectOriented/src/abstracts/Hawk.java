package abstracts;

public class Hawk extends Bird implements Flyer {

	@Override
	public void speak() {
		System.out.println("Hawk Screech");
	}

	@Override
	public void fly() {
		System.out.println("flies");
	}
}
