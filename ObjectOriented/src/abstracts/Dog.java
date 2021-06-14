package abstracts;

public class Dog extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("woof woof");
	}

	@Override
	public void navigate() {
		System.out.println("Dog Navigation");

	}

}
