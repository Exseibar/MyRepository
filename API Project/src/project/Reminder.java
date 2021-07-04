package project;

import java.time.LocalDateTime;

public class Reminder implements Comparable<Reminder> {

	public static final int MAX_POPS = 3;

	private LocalDateTime expiration;
	private String text;
	private boolean important;
	private boolean popped;
	private int poppedCount;

	public Reminder(LocalDateTime expiration, String text, boolean important) {
		this.expiration = expiration;
		this.text = text;
		this.important = important;
	}

	public LocalDateTime getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDateTime expiration) {
		this.expiration = expiration;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isImportant() {
		return important;
	}

	public void setImportant(boolean important) {
		this.important = important;
	}

	public boolean isPopped() {
		return popped;
	}

	public void setPopped(boolean popped) {
		this.popped = popped;
	}

	public int getPoppedCount() {
		return poppedCount;
	}

	public void raisePoppedCount() {
		this.poppedCount++;

	}

	@Override
	public int compareTo(Reminder other) {

		if (this == other) {
			return 0;
		}
		if (this.expiration.isBefore(other.expiration)) {
			return -1;
		}
		if (this.expiration.isAfter(other.expiration)) {
			return 1;
		}

		return 0;
	}

	public boolean isExpirationEqual(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Reminder)) {
			return false;
		}
		Reminder other = (Reminder) obj;
		if (expiration == null) {
			if (other.getExpiration() != null) {
				return false;
			}
		} else if (!this.expiration.equals(other.expiration)) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { // for checking if the same text was described in previous reminder
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Reminder)) {
			return false;
		}
		Reminder other = (Reminder) obj;
		if (text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Reminder [expiration=" + expiration + ", text=" + text + ", important=" + important + ", popped="
				+ popped + "]\n";
	}

}
