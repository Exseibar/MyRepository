package stopping.thread;

public class StoppableThread extends Thread {

	public StoppableThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("thread interrupted and will be stopped");
				return;
			}
		}

	}

}
