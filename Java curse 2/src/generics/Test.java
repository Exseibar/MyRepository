package generics;

public class Test {

	public static void main(String[] args) {

		Box<String> boxString = new Box<String>();
		boxString.setContent("aaa");
		Box<Integer> boxInt = new Box<Integer>();
		boxInt.setContent(4);

		System.out.println(boxString.getContent());
		System.out.println(boxInt.getContent());

	}
}
