package project;

import java.util.Set;
import java.util.TreeSet;

public class ImportantReminderTask extends Thread {

	private Set<Reminder> importantReminders;
	private ReminderSystem reminderSystem;

	public ImportantReminderTask() {

	}

	public void addImportantReminder(Reminder reminder) {
		if (importantReminders == null) {
			importantReminders = new TreeSet<Reminder>();
		}
		importantReminders.add(reminder);
	}

	private void checkImportantReminderDeadlines() {
		for (Reminder reminder : reminderSystem.getReminders()) {
			if (reminder != null && reminder.getPoppedCount() <= Reminder.MAX_POPS && reminder.isImportant()) {
				if (!reminder.isPopped()) {
					reminder.setPopped(true);
				}
				reminder.raisePoppedCount();
				System.out.println("Alert!! the important reminder: '" + reminder + "' time passed - alert = "
						+ reminder.getPoppedCount());
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			checkImportantReminderDeadlines();
		}
	}

}
