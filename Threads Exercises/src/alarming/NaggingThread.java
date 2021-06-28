package alarming;

public class NaggingThread extends Thread {

	@Override
	public void run() {
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			System.out.println("name?");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
