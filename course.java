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
	Scanner in = new Scanner(System.in);
	
	public int searchAssignments(ArrayList<Assignment> List, String term) {
		for (int i = 0; i < List.size(); i++) {
			placeHolder = List.get(i);
			if (placeHolder.name == term) {
				placeHolder.init();//clears the placeholder variable
				return i;//returns index of the assignment
			}
		}
		placeHolder.init();//clears the placeholder variable
		return -1; //returns -1 if not found
	}
	
	public void addCourse() {
		System.out.print("\nWhat is the course number? ");
		courseNumber = in.nextInt();
		System.out.print("\nWhat is the professor's name? ");
		professor = in.nextLine();
		System.out.print("\nHow much are exams worth? ");
		examWorth = in.nextFloat();
		System.out.print("\nHow much are assignments worth? ");
		assignmentWorth = in.nextFloat();
	}
	
	public int searchTests(ArrayList<Test> List, String term) {//Iterates and finds a test
		for (int i = 0; i <  List.size(); i++) {
			examPlaceHolder = List.get(i);
			if (examPlaceHolder.name == term) {
				examPlaceHolder.init();//clears the placeholder variable
				return i;//returns index of the exam
			}
		}
		examPlaceHolder.init();//clears the placeholder variable
		return -1;//returns -1 if not found
	}//searchTests()
	
	public void scoreAssignment(ArrayList<Assignment> List, float score) {//A function to allow the student to enter a score (or hypothetical score)
		System.out.print("\nWhich assignment would you like to grade (case sensitive)");
		response = in.nextLine();//Requests input from the user
		int index = searchAssignments(List, response);
		placeHolder = List.get(index);
		placeHolder.score = score;
		List.set(index, placeHolder);
		gradeAssignments();
		placeHolder.init();//clears the placeholder variable
	}//scoreAssignment()
	
	public void scoreTest(ArrayList<Test> List, float score) {//A function to allow the student to enter a score (or hypothetical score)
		System.out.print("\nWhich exam would you like to grade (case sensitive, format:Exam #)");
		response = in.nextLine();//Requests input from the user
		int index = searchTests(List, response);
		examPlaceHolder = List.get(index);
		examPlaceHolder.score = score;
		List.set(index, examPlaceHolder);
		gradeTests();
		examPlaceHolder.init();//clears the placeholder variable
	}//scoreTest()
	
	public void gradeAssignments() {//Grades all Assignments
		for (int i = 0; i < assignmentList.size(); i++) {
			placeHolder = assignmentList.get(i);
			float[] vals = placeHolder.grade();
			TotalAssignmentPoints = TotalAssignmentPoints + vals[0];
			TotalAssignmentWorth = TotalAssignmentWorth + vals[2];
			placeHolder.init();//clears the placeholder variable
		}
		assignmentPercent = TotalAssignmentPoints/TotalAssignmentWorth;
	}//gradeAssignments()
	
	public void gradeTests() {//Grades all Tests
		for (int i = 0; i < assignmentList.size(); i++) {
			examPlaceHolder = testList.get(i);
			float[] vals = examPlaceHolder.grade();
			TotalTestPoints = TotalTestPoints + vals[0];
			TotalTestWorth = TotalTestWorth + vals[2];
			examPlaceHolder.init();//clears the placeholder variable
		}
		testPercent = TotalTestPoints/TotalTestWorth;
	}//gradeTests()
	
	public void print() {
		System.out.println(courseNumber);
		System.out.println(professor);
		System.out.println(coursePercent);
		System.out.println(letterGrade);
	}
}
