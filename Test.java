package gradebook;

import java.util.Scanner;

public class Test {
	public String name = "";
	public float worth = 0;
	public float score = 0;
	public float percent = 0;
	private char grade = 'N';
	public String dueDate = "";
	Scanner in = new Scanner(System.in);
	
	public void print() {
		System.out.println(percent);
		System.out.println(grade);
	}
	
	public char grade() {
		percent = score/worth;
		if(percent >= 0.9)
			grade = 'A';
		else if(percent >= 0.8)
			grade = 'B';
		else if(percent >= 0.7)
			grade = 'C';
		else if(percent >= 0.6)
			grade = 'D';
		else
			grade = 'F';
		return grade;
	}
	
	public Test addExam(Test placeHolder) {
		System.out.print("\nHow many possible points?");
		placeHolder.worth = in.nextInt();
		System.out.print("\nWhat day is the exam?");
		placeHolder.dueDate = in.nextLine();
		System.out.print("\nWhich exam is it? (enter a number)?");
		placeHolder.name = "Exam" + in.nextLine();
		return placeHolder;
	}
}
