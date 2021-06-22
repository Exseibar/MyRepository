package read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoReadTextFromFileBuffer {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new FileReader("files/letter.txt"))) {
			String line = in.readLine(); // read the first line
			while (line != null) {
				System.out.print(line); // print current line
				line = in.readLine(); // read the next line
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
