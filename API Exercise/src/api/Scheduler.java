package api;

import java.util.ArrayList;
import java.util.List;

public class Scheduler extends Thread {

	List<Task> tasks;
	private boolean monitoringActive;
	private long checkRateMillis;

	public Scheduler() {

		tasks = new ArrayList<Task>();
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void removeTask(int index) {
		this.tasks.remove(index);
	}

	public void displayTasks() {
		if (tasks == null) {
			tasks = new ArrayList<Task>();
		}
		System.out.println(tasks);
	}

	public Task getTask(int index) {
		return tasks.get(index);
	}

	public List<Task> getAllTasks() {
		return tasks;
	}

}
