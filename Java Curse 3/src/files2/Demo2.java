package files2;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		try (FileWriter out = new FileWriter("files/letter.txt");) {
			out.write("Hello Java IO");
			System.out.println("data written to file");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
