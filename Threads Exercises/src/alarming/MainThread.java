package alarming;

import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) {

		NaggingThread t = new NaggingThread();
		t.setDaemon(true);
		t.start();
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("please enter your name");
			String name = sc.next();
			System.out.println("Hello " + name);
		}
	}

}
