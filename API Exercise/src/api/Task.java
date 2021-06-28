package api;

import java.time.LocalDateTime;

public class Task implements Comparable {

	private int id;
	private String description;
	private boolean done;
	private LocalDateTime deadline;
	private boolean alertPopped;

	public Task(int id, String description, LocalDateTime deadline) {
		this.id = id;
		this.description = description;
		this.deadline = deadline;

	}

	public void doTask() {
		this.deadline = LocalDateTime.now();
		this.done = true;

	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDone() {
		return done;
	}

	public LocalDateTime deadline() {
		return deadline;
	}

	public boolean alertPopped() {
		return alertPopped;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", done=" + done + ", deadline=" + deadline
				+ ", alertPopped=" + alertPopped + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		if (o instanceof Task) {
			Task other = (Task) o;
			if (this.id > other.getId()) {
				return 1;
			}
			if (this.id < other.getId()) {
				return -1;
			}
		}
		return 0;
	}

}
