package counting;

public class MainThread {

	public static void main(String[] args) {

		CounterThread t = new CounterThread();

		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
	}

}
