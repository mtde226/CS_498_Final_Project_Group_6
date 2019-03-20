package gradebook;

import java.util.Scanner;

public class Assignment {
	
	public String name = "";
	private float worth = 0;
	public float score = 0;
	private float percent = 0;
	private char grade = 'N';
	public String dueDate = "";
	Scanner in = new Scanner(System.in);
	
	public void print() {
		System.out.println(name);
		System.out.println(percent);
		System.out.println(grade);
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
		
	public Assignment addAssignment(Assignment placeHolder) {
		System.out.print("What is the assignment name?");
		placeHolder.name = in.nextLine();
		while(worth < 0) {
			System.out.print("\nHow many possible points (must be non-negative?");
			placeHolder.worth = in.nextInt();
		}
		System.out.print("\nWhat is the assignment due date?");
		placeHolder.dueDate = in.nextLine();
		return placeHolder;
	}
}
