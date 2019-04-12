package gradebook;

import java.util.*;

public class GradeBookMain {
	
	public static ArrayList<Student> students = new ArrayList<Student>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int Option = 0;
		//String Option = "";
		//Boolean Running = true;
		printLogo();
		Option = printMainMenu();
		students.add(Student.addStudent());
		students.get(0).courseList.add(course.addCourse());
		students.get(0).courseList.get(0).assignmentList.add(Assignment.addAssignment());
		students.get(0).courseList.get(0).testList.add(Test.addExam());
		if (Option == 1) {
			//Adding option 1 - View the Gradebook 
		}
		
		else if(Option == 2) {
			students.get(0).courseList.get(0).scoreAssignment(students.get(0).courseList.get(0).assignmentList);
			students.get(0).courseList.get(0).scoreTest(students.get(0).courseList.get(0).testList);
			printAssignments(students.get(0));
		}
		
		else if(Option == 3) {
			//adding option 3 - View the exams
		}
		else if(Option == 4) {
			//adding option 4 - View tasks
		}
	}

	public static void printLogo() {
		System.out.println("Student Grade Book");
	}
	
	public static void printGradeBook() {	
		System.out.println("The final grades in the gradebook:");
		for (int i = 0; i < students.size(); i++) {
			
		}
	}
	
	public static void printAssignments(Student studentOfInterest) {
		int response = 0;
		int courseNum = 0;
		System.out.print("Print assignments for all courses or just one course? Enter 1 for all courses or 2 for one course (Case Sensitive)");
		response = in.nextInt();
		if (response == 1)
			for (int i = 0; i < studentOfInterest.courseList.size(); i++) {
				studentOfInterest.courseList.get(i).printAssignments();
			}
		else {
			Boolean validResponse = false;
			System.out.println("For which course would you like to view assignments? (case sensitive)");
			while(!validResponse) {
			courseNum = in.nextInt();
			for (int i = 0; i < studentOfInterest.courseList.size(); i++) {
				if (courseNum == studentOfInterest.courseList.get(i).courseNumber)
					studentOfInterest.courseList.get(i).printAssignments();
				}
			}
		}
	}
	
	public static int printMainMenu() {
		int response;
		Boolean validResponse = false;
		System.out.print("What would you like to do?\n1 View the Gradebook \n2 View assignments \n3 View the exams \n4 View tasks \n");
		response = in.nextInt();
		while(!validResponse) {
			if (response == 1 || response == 2 || response == 3 || response == 4) {
				validResponse = true;
			}
			else {
				System.out.print("\nInvalid response. Please choose option 1, 2, 3, or 4\n");
				response = in.nextInt();
				validResponse = false;
			}
		}
		return response;
	}
	
	public static Boolean validateStringResponse(String input, String[] options, String message) {
		for (int i = 0; i < options.length; i++) {
			if (input == options[i])
				return true;
			else 
				System.out.print(message);
		}
		return false;
	}
	
	public static Boolean validateIntResponse(int input, int[] options, String message) {
		for (int i = 0; i < options.length; i++) {
			if (input == options[i])
				return true;
			else 
				System.out.print(message);
		}
		return false;
	}
	
	public static Boolean validateCharResponse(char input, char[] options, String message) {
		for (int i = 0; i < options.length; i++) {
			if (input == options[i])
				return true;
			else 
				System.out.print(message);
		}
		return false;
	}
	
}

