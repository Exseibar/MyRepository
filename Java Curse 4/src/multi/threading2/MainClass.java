package multi.threading2;

public class MainClass {

	public static void main(String[] args) {

		MyThread t = new MyThread("Michelangelo");

		// start method initiates run method from its own class at the same time.

		t.start();

		for (int i = 0; i < 8; i++) {
			System.out.println("\t" + "\t" + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
