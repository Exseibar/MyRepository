package files;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		File directory = new File("files"); // relative path - creates dir in project.
//		File file = new File("c:/temp/letter.txt"); // use parent CTOR.
		File file = new File(directory, "letter.txt"); // use make no mistakes.

		try {
			// create new file in the directory
			directory.mkdirs();
			System.out.println("directory created ot exists");
			// create a file in the directory
			file.createNewFile();
			System.out.println("file created or exists");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}