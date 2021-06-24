package multi.threading;

public class ReferenceMainThread {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		// get a reference to the currently running thread
		System.out.println(mainThread.getName());
		// print the thread's name
		System.out.println("thread will sleep for 3 seconds");

		try { // make the thread sleep
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread woke up");
		// thread woke up
	}

}