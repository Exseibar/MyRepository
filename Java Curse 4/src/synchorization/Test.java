package synchorization;

public class Test {

	public static void main(String[] args) {
		Car chevrolet = new Car(111);

		CarDriver shalom = new CarDriver("Shalom", chevrolet, 100);
		CarDriver dana = new CarDriver("Danna", chevrolet, 100);

		shalom.start();
		dana.start();
	}

}
