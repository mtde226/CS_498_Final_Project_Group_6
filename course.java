package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class course {
	
	public int courseNumber = 000;
	public String professor = "";
	public float coursePercent = 0;
	public char letterGrade = 'N';
	
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
		for (int i = 0; i < assignmentList.size(); i++) {
			placeHolder = new Assignment();
			if (placeHolder.name == term)
				return i;
			}
		return -1;
	}
	
	public void scoreAssignment(ArrayList<Assignment> List, float score) {
		System.out.print("\nWhich assignment would you like to grade (case sensitive)");
		response = in.nextLine();
		int index = searchAssignments(List, response);
		placeHolder = List.get(index);
		placeHolder.score = score;
		List.set(index, placeHolder);
		placeHolder.init();
	}
	
	public void gradeAssignments() {//Grades all Assignments
		for (int i = 0; i < assignmentList.size(); i++) {
			placeHolder = assignmentList.get(i);
			float[] vals = placeHolder.grade();
			TotalAssignmentPoints = TotalAssignmentPoints + vals[0];
			TotalAssignmentWorth = TotalAssignmentWorth + vals[2];
			placeHolder.init();
		}
		assignmentPercent = TotalAssignmentPoints/TotalAssignmentWorth;
	}
	
	public void gradeTests() {//Grades all Assignments
		for (int i = 0; i < assignmentList.size(); i++) {
			placeHolder = assignmentList.get(i);
			float[] vals = placeHolder.grade();
			TotalTestPoints = TotalTestPoints + vals[0];
			TotalTestWorth = TotalTestWorth + vals[2];
			placeHolder.init();
		}
		testPercent = TotalTestPoints/TotalTestWorth;
	}
	
	public void print() {
		System.out.println(courseNumber);
		System.out.println(professor);
		System.out.println(coursePercent);
		System.out.println(letterGrade);
	}
}
