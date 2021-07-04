package project;

import java.util.Set;
import java.util.TreeSet;

public class ReminderTask extends Thread {

	private Set<Reminder> reminders;
	private ReminderSystem reminderSystem;

	public ReminderTask() {
		reminders = new TreeSet<Reminder>();
		reminderSystem = new ReminderSystem();

	}

	public void addReminder(Reminder reminder) {
		if (reminders == null) {
			reminders = new TreeSet<Reminder>();
		}
		if (!reminder.isImportant()) {
			reminders.add(reminder);
		}
	}

	private void checkReminderDeadline() {
		for (Reminder reminder : reminderSystem.getReminders()) {
			if (reminder != null && !reminder.isPopped() && !reminder.isImportant()) {
				System.out.println("Alert! the reminder: '" + reminder + "' time passed!");
				reminder.setPopped(true);
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			checkReminderDeadline();
		}
	}

}
