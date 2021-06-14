package abstracts;

public class Butterfly extends Insect implements Flyer {

	@Override
	public void speak() {
		System.out.println("Butterfly things");
	}

	@Override
	public void fly() {
		System.out.println("flies");
	}
}
