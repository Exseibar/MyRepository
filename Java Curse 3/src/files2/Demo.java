package files2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {

		new File("files").mkdir(); // shortened way to create dirs - not advised.

		try {
			FileWriter out = new FileWriter("files/letter.txt");
			out.write("Hello Java IO");
			System.out.println("data written to file");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
