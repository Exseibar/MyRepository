package wait.and.notify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> stack = new ArrayList<Integer>();
	public static final int MAX = 10;

	public synchronized void push(int n) {
		while (stack.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack.add(n);
		notify();
	}

	public synchronized int pop() {
		while (stack.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		notify();
		return stack.remove(stack.size() - 1);

	}

	@Override
	public String toString() {
		synchronized (this) {
			return "Stack [stack=" + stack + "]";
		}
	}

}
