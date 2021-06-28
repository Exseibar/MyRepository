package api;

import java.time.LocalDateTime;
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

	public List<Task> getAllTasksDueUntil(LocalDateTime deadline) {
		return null; ///////////////////////////////////////////////
	}

	public void startMonitoringTasks() {
		System.out.println("Start monitoring tasks");
		monitoringActive = true;
	}

	public void stopMonitoringTasks() {
		System.out.println("stop monitoring tasks");
		monitoringActive = false;
	}

	public void checkDeadlines() {
		LocalDateTime now = LocalDateTime.now();
		for (int i = 0; i < tasks.size(); i++) {

		}
	}

}
