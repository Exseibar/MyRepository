package abstracts;

public class App {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		int flyers = 0;
		int count = 0;

		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Hawk();
		animals[3] = new Ostrich();
		animals[4] = new Butterfly();
		animals[5] = new Ant();
		animals[6] = new Hawk();
		animals[7] = new Ant();
		animals[8] = new Bat();
		animals[9] = new Dog();

		((Flyer) animals[1]).glide();

//		for (Animal animal : animals) {
//			if (animal != null) {
//				animal.speak();
//				if (animal instanceof Flyer) {
//					flyers++;
//				}
//			}
//		}
//
//		Animal[] flyer = new Animal[flyers];
//
//		for (int i = 0; i < animals.length; i++) {
//			if (animals[i] instanceof Flyer) {
//				flyer[count] = animals[i];
//				count++;
//			}
//		}
//		for (int i = 0; i < flyer.length; i++) {
//			System.out.println(flyer[i]);
//		}
//		for (Animal animal : animals) {
//			if (animal instanceof AdvancedFlyer) {
//				((AdvancedFlyer) animal).land();
//			}
//		}

	}
}
