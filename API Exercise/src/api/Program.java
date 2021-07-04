package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {

	private static Scanner sc = new Scanner(System.in);
	private static int nextTaskId = 1;

	public static Task getTaskFromUser() throws TaskException {
		System.out.println("Enter task description");
		String description = sc.nextLine();
		description = sc.nextLine();
		System.out.println("Enter deadline for the task: hh:mm:ss");
		String time = sc.nextLine();
		LocalDateTime deadline = null;
		try {
			deadline = LocalDateTime.of(LocalDate.now(), LocalTime.parse(time));
			Task task = new Task(nextTaskId++, description, deadline);
			return task;
		} catch (DateTimeParseException e) {
			throw new TaskException("Invalid time added. task not added");
		}
	}

	public static void printMenu() {

		System.out.println("===============Task Menu===============\n");
		System.out.println("1.============Add new Task=============\n");
		System.out.println("2.============Remove Task==============\n");
		System.out.println("3.==========Set a Task to Done=========\n");
		System.out.println("3.===========Show Task by ID===========\n");
		System.out.println("4.===========Show all Tasks============\n");
		System.out.println("5.========Show Tasks Due Until=========\n");
		System.out.println("6.============Exit Program=============\n");

	}

	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		int sleepTime = 5000;
		boolean exit = false;
		int taskId;
		scheduler.startMonitoringTasks();
		while (!exit) {
			printMenu();
			int option = sc.nextInt();
			switch (option) {

			case 1:

				try {
					scheduler.addTask(getTaskFromUser());
					System.out.println("The task was added successfully!");
				} catch (TaskException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:

				System.out.println(scheduler.getAllTasks());
				System.out.println("Enter task id to remove task.");
				taskId = sc.nextInt();
				try {
					scheduler.removeTask(taskId);
					System.out.println("Task removed successfully");
				} catch (TaskException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				System.out.println("Enter a task id.");
				taskId = sc.nextInt();
				try {
					scheduler.getTask(taskId).doTask();
					System.out.println("Task " + scheduler.getTask(taskId).getId() + " has been set to done");
				} catch (TaskException e) {
					System.out.println(e.getMessage());
				}
			case 4:

				scheduler.displayTasks();
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					System.out.println("Do not interrupt");
				}
				break;

			case 5:
				System.out.println("Enter a hh:mm:ss");
				String time = sc.nextLine();
				time = sc.nextLine();
				LocalDateTime deadline = null;
				try {
					deadline = LocalDateTime.of(LocalDate.now(), LocalTime.parse(time));
				} catch (DateTimeParseException e) {
					System.out.println("Invalid date.");
				}
				System.out.println(scheduler.getAllTasksDueUntil(deadline));
				break;
			case 6:
				System.out.println("Bye");
				sc.close();
				scheduler.stopMonitoringTasks();
				exit = true;
			}

		}

	}
}
