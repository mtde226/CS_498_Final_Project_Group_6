package gradebook;

import java.util.Scanner;

public class Task {
	public String name = "";
	public String description = "";
	public Boolean complete = false;
	public String dueDate = "";
	Scanner in = new Scanner(System.in);
	public Task taskPlaceHolder = new Task();
	
	public Task addTask() {//Allows the user to add a new task to the their task list
		System.out.print("\nWhat is the task name? ");
		taskPlaceHolder.name = in.nextLine();
		System.out.print("\nWhat is the task due date? ");
		taskPlaceHolder.dueDate = in.nextLine();
		System.out.print("\nWhat is the task description? ");
		taskPlaceHolder.description = in.nextLine();
		return taskPlaceHolder;
	}
	
	public void completeTask() {//Allows a user to cross a task off their to do list
		complete = true;
	}//completeTask()
}
