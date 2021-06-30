package api;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {

	private List<Task> tasks;
	private boolean monitoringActive;
	private long checkRateMillis = 5000;

	public Scheduler() {
		tasks = new ArrayList<Task>();
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void removeTask(int id) throws TaskException {
		try {
			this.tasks.remove(id - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new TaskException("Task does not exist.");
		}
	}

	public void displayTasks() {
		if (tasks == null) {
			tasks = new ArrayList<Task>();
		}
		System.out.println(tasks);
	}

	public Task getTask(int id) throws TaskException {
		try {
			return tasks.get(id - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new TaskException("Task does not exist.");
		}
	}

	public List<Task> getAllTasks() {
		return tasks;
	}

	public List<Task> getAllTasksDueUntil(LocalDateTime deadline) {
		List<Task> listDueUntil = new ArrayList<Task>();
		for (Task task : tasks) {
			if (task.getDeadline().isBefore(deadline)) {
				listDueUntil.add(task);
			}
		}
		return listDueUntil;

	}

	public void startMonitoringTasks() {
		SchedulerThread schedulerThread = new SchedulerThread();
		schedulerThread.start();
		monitoringActive = true;
	}

	public void stopMonitoringTasks() {
		monitoringActive = false;
	}

	public void checkDeadlines() {
		for (Task t : tasks) {
			if (t.isAlertPopped()) {
				continue;
			}
			if (t.getDeadline().isBefore(LocalDateTime.now()) && !t.isAlertPopped()) {
				System.out.println("DEADLINE ALERT: " + t);
			}
			t.setAlertPopped(true);
		}
	}

	public class SchedulerThread extends Thread {

		public SchedulerThread() {

			this.setDaemon(true);
		}

		@Override
		public void run() {
			while (true) {
				try {
					sleep(checkRateMillis);
				} catch (InterruptedException e) {
					System.out.println("Do not interrupt!");
				}
				checkDeadlines();
			}
		}
	}

}
