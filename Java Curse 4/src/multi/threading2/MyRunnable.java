package multi.threading2;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		for (int i = 0; i < 11; i++) {
			System.out.println(currentThread.getName() + " " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
