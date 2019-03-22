package gradebook;

import java.util.Scanner;

public class Test {
	public String name = "";
	public float worth = 0;
	public float score = 0;
	public float percent = 0;
	private char grade = 'N';
	public String dueDate = "";
	public Boolean complete = false;
	static Scanner in = new Scanner(System.in);
	
	public void print() {
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
	
	public static Test addExam() {
		Test placeHolder = new Test();
		System.out.print("How many possible points?");
		placeHolder.worth = in.nextInt();
		System.out.print("What day is the exam?");
		placeHolder.dueDate = in.next();
		System.out.print("Which exam is it (enter a number)?");
		placeHolder.name = "Exam " + in.next();
		return placeHolder;
	}
}
