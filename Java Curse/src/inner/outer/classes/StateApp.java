package inner.outer.classes;

import inner.outer.classes.State.Citizen;

public class StateApp {

	public static void main(String[] args) {

		State isr = new State("Israel", 5555);
		State fra = new State("France", 6666);

		Citizen c1 = isr.new Citizen("David");
		Citizen c2 = fra.new Citizen("Pier");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(isr.getPopulation());
		System.out.println(State.getWorldPopulation());
	}

}
