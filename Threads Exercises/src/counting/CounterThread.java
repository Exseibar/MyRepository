package counting;

public class CounterThread extends Thread {

	@Override
	public void run() {
		int count = 1;
		while (count <= 10) {
			System.out.println(count++);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				while (count > 0) {
					System.out.println(count--);
					try {
						sleep(1000);
					} catch (InterruptedException ex) {
						e.printStackTrace();
					}
				}
				break;
			}
		}
	}
}
