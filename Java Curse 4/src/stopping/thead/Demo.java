package stopping.thead;

public class Demo {

	public static void main(String[] args) {

		StoppableThread t = new StoppableThread("t");

		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t.interrupt();

	}

}
