package project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) { // everything works besides the threads...
		ReminderSystem rs = new ReminderSystem();
		boolean quit = false;
		while (!quit) {
			if (rs.getReminders().size() > 1) {
				ReminderTask rt = new ReminderTask();
				ImportantReminderTask irt = new ImportantReminderTask();
				rt.start();
				irt.start();
			}
			printMenu();
			String command = sc.next();
			switch (command) {
			case "add":

				try {
					rs.addTask(GetReminderFromUser());
					System.out.println("The reminder was added successfully!");
				} catch (ReminderException e) {
					System.out.println(e.getMessage());
				}
				break;

			case "show":
				System.out.println("\n======= Reminder List=======\n");
				rs.displayReminders();
				break;
			case "quit":

				sc.close();
				System.out.println("Bye");
				quit = true;

			default:
				System.out.println("The command " + command + " does not exist");

			}

		}
	}

	public static Reminder GetReminderFromUser() throws ReminderException {
		System.out.println("Enter a Reminder Description: ");
		String text = sc.nextLine();
		text = sc.nextLine();
		System.out.println("Enter an expiration date: hh:mm:ss ");
		String time = sc.nextLine();
//		time = sc.nextLine();
		LocalDateTime expiration;
		try {
			expiration = LocalDateTime.of(LocalDate.now(), LocalTime.parse(time));
		} catch (DateTimeParseException e) {
			throw new ReminderException("Invalid date format.", e);
		}
		if (expiration.isBefore(LocalDateTime.now())) { // checks if expiration date passed before adding.
//			System.out.println("your reminder's expiration is passed");
			throw new ReminderException("your reminder's expiration is passed, reminder is not added");
		}
		System.out.println("Is the reminder important? 1 = important , else not important.");
		int important = sc.nextInt();
		boolean isImportant = important == 1 ? true : false; // ternary
		Reminder reminder = new Reminder(expiration, text, isImportant);
		return reminder;

	}

	public static void printMenu() { // ========USERINTERFACE=======
		System.out.println("\n=========Reminder Menu==========\n");

		System.out.println("add.====== Add a Reminder=========\n");
		System.out.println("show.======Display Reminders=======\n");
		System.out.println("quit.============Quit==============\n");

	}

}
