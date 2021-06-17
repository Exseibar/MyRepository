package enums2;

import java.util.Arrays;
import java.util.Scanner;

public class SolarSystemApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a planet: " + Arrays.toString(Planet.values()));

		Planet planet = Planet.valueOf(sc.nextLine());
		sc.close();

		System.out.println("Showing info on planet: " + planet);
		System.out.println("Order from the sun: " + (planet.ordinal() + 1));
		System.out.println("Orbit: " + planet.getOrbit());
		System.out.println("Mass: " + planet.mass);
		System.out.println(planet);

	}

}
