package multi.threading2;

public class ThreadStates {

	public static void main(String[] args) {

		MyThread t = new MyThread("t");
		System.out.println("thread state: " + t.getState());
		t.start();
		System.out.println("thread state: " + t.getState());

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread state: " + t.getState());

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread state: " + t.getState());

	}

}
