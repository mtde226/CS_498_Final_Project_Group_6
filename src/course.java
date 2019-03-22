package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class course {
	
	public int courseNumber = 000;
	public String professor = "";
	public float coursePercent = 0;
	public char letterGrade = 'N';
	public float examWorth = 0;
	public float assignmentWorth = 0;
	
	public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	public ArrayList<Test> testList = new ArrayList<Test>();
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	public Assignment placeHolder = new Assignment();
	public float TotalAssignmentPoints = 0;
	public float TotalAssignmentWorth = 0;
	public float assignmentPercent = 0;
	
	public Test examPlaceHolder = new Test();
	public float TotalTestPoints = 0;
	public float TotalTestWorth = 0;
	public float testPercent = 0;
	
	public Task taskPlaceHolder = new Task();
	
	public String response = "";
	static Scanner in = new Scanner(System.in);
	
	public static int searchAssignments(ArrayList<Assignment> List) {
		String response = "HW";
		for (int i = 0; i < List.size(); i++) {
			System.out.print(List.get(i).name);
			if (List.get(i).name == response) {
				System.out.print("returning");
				return i;//returns index of the assignment
			}
		}
		return -1; //returns -1 if not found
	}
	
	public static course addCourse() {
		course placeHolder = new course();
		System.out.print("What is the course number? ");
		placeHolder.courseNumber = in.nextInt();
		System.out.print("What is the professor's name? ");
		placeHolder.professor = in.next();
		System.out.print("How much are exams worth? ");
		placeHolder.examWorth = in.nextFloat();
		System.out.print("How much are assignments worth? ");
		placeHolder.assignmentWorth = in.nextFloat();
		return placeHolder;
	}
	
	public static int searchTests(ArrayList<Test> List) {//Iteratively searches to find a test
		String response = "Exam 1";
		for (int i = 0; i <  List.size(); i++) {
			if (List.get(i).name == response) {
				return i;//returns index of the exam
			}
		}
		return -1;//returns -1 if not found
	}//searchTests()
	
	public void scoreAssignment(ArrayList<Assignment> List) {//A function to allow the student to enter a score (or hypothetical score)
		System.out.print("Which assignment would you like to grade? ");
		//String response = in.next();//Requests input from the user
		int index = searchAssignments(List);
		index = 0;
		System.out.print("What is the score?");
		int score = in.nextInt();
		List.get(index).score = score;
		gradeAssignments();
	}//scoreAssignment()
	
	public void scoreTest(ArrayList<Test> List) {//A function to allow the student to enter a score (or hypothetical score)
		System.out.print("Which exam would you like to grade (case sensitive, format:Exam #)");
		//response = in.next();//Requests input from the user
		int index = searchTests(List);
		index = 0;
		System.out.print("What is the score?");
		int score = in.nextInt();
		List.get(index).score = score;
		gradeTests();
	}//scoreTest()
	
	public void gradeAssignments() {//Grades all Assignments
		for (int i = 0; i < assignmentList.size(); i++) {
			float[] vals = assignmentList.get(i).grade();
			TotalAssignmentPoints = TotalAssignmentPoints + vals[0];
			TotalAssignmentWorth = TotalAssignmentWorth + vals[1];
			placeHolder.init();//clears the placeholder variable
		}
		assignmentPercent = TotalAssignmentPoints/TotalAssignmentWorth;
	}//gradeAssignments()
	
	public void gradeTests() {//Grades all Tests
		for (int i = 0; i < assignmentList.size(); i++) {
			float[] vals = testList.get(i).grade();
			TotalTestPoints = TotalTestPoints + vals[0];
			TotalTestWorth = TotalTestWorth + vals[1];
		}
		testPercent = TotalTestPoints/TotalTestWorth;
	}//gradeTests()
	
	public void print() {
		System.out.println("Course: " + courseNumber);
		System.out.println("Professor: " + professor);
		System.out.println("Percent: " + coursePercent);
		System.out.println("Grade: " + letterGrade);
	}
	
	public void printAssignments() {
		for (int i = 0; i < assignmentList.size(); i++)
			assignmentList.get(i).print();
	}
	
	public void printTests() {
		for (int i = 0; i < testList.size(); i++)
			testList.get(i).print();
	}
	
	
}
