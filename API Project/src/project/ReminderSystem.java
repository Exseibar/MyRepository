package project;

import java.util.Set;
import java.util.TreeSet;

public class ReminderSystem {

	private Set<Reminder> reminders;
	private ReminderTask task;

	// CTOR
	public ReminderSystem() {
		reminders = new TreeSet<Reminder>();
	}

	public void addTask(Reminder reminder) throws ReminderException {
		if (reminders == null) {
			reminders = new TreeSet<Reminder>();
		}
		for (Reminder r : reminders) { // check if the reminder's description exists in another reminder
			if (reminder.equals(r)) {
				throw new ReminderException("\nThe reminder's description already exists in another reminder");
			}
			if (reminder.isExpirationEqual(r)) {
				throw new ReminderException("\nThere is another reminder already set to that date");
			}
		}
		reminders.add(reminder);

	}

	public Set<Reminder> getReminders() {
		return reminders;
	}

	public void displayReminders() {
		if (reminders == null) {
			reminders = new TreeSet<Reminder>();
		}
		for (Reminder reminder : reminders) {
			System.out.println(reminder);
		}
	}

	public ReminderTask getTask() {
		return task;
	}

}
