package exceptions;

public class Test {

	public static void main(String[] args) {

		// handling 2 - try-catch
		try {
			Person p = new Person();
			p.setAge(-1);
		} catch (IllegalAgeException e) {
			System.out.println("age setting failed");
			e.printStackTrace();
		}
	}
}
