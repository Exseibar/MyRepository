package classes.definition;

public class Program {

	public static void main(String[] args) {

		int id = 123456789;
		String name = "Moshe";
		int age = 36;
		int salary = 15000;

		Employee e = new Employee(id, name, age, salary);

		System.out.println(e);

	}

}
