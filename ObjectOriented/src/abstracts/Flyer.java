package abstracts;

public interface Flyer {

	// constants
	int MAX_ALT = 1000;

	// abstract methods
	void fly();

	default void glide() {
		System.out.println("gliding like a flyer");
	}
}
