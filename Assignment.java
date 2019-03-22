package gradebook;

import java.util.Scanner;

public class Assignment {
	
	public String name = "";
	private float worth = 0;
	public float score = 0;
	private float percent = 0;
	private char grade = 'N';
	public String dueDate = "";
	public Boolean complete = false;
	static Scanner in = new Scanner(System.in);
	
	public void print() {
		System.out.println("Assignment: " + name);
		System.out.println("Score Percent: " + percent);
		System.out.println("Assignment Grade: " + grade);
	}
	
	public void init() {
		name = "";
		worth = 0;
		score = 0;
		percent = 0;
		grade = 'N';
		dueDate = "";
	}
	
	public float[] grade() {
		float[] returnVals = {score, worth};
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
		return returnVals;
	}
		
	public static Assignment addAssignment() {
		Assignment placeHolder = new Assignment();
		System.out.print("What is the assignment name? ");
		placeHolder.name = in.next();
		while(placeHolder.worth <= 0) {
			System.out.print("How many possible points (must be non-negative?) ");
			placeHolder.worth = in.nextInt();
		}
		System.out.print("What is the assignment due date? ");
		placeHolder.dueDate = in.next();
		return placeHolder;
	}
}
