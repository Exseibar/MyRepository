package wait.and.notify;

public class Consumer extends Thread {

	private Stack stack;
	private int elementsToConsume;
	private int sleepTime;

	public Consumer(Stack stack, int elementsToConsume, int sleepTime) {
		this.stack = stack;
		this.elementsToConsume = elementsToConsume;
		this.sleepTime = sleepTime;

	}

	@Override
	public void run() {
		for (int i = 0; i < elementsToConsume; i++) {
			// consume a random number
			int r = stack.pop();
			// print a message
			System.out.println("consume " + " " + r + " " + stack);

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}