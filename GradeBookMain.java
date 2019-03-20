package gradebook;

import java.util.*;

public class GradeBookMain {
	
	public ArrayList<Student> students = new ArrayList<Student>();
	private String response;
	private Boolean validResponse = false;
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGradeBook();
	}

	public static void printGradeBook() {
		System.out.println("Student Grade Book");
	}

	public static void printLogo() {
		System.out.println("Student Assignment Tracker");
	}
	
	public String printMenu() {
		while(!validResponse) {
		System.out.print("What would you like to do?\n A. View the Gradebook \nB. View assignments \nC. View the exams \nD. View the tasks ");
		response = in.nextLine();
			if (response != "A" && response != "B" && response != "C" && response != "D") {
				System.out.print("Invalid response. Please choose option A, B, C, or D");
				response = in.nextLine();
			}
			else
				validResponse = true;
		}
		validResponse = false;
		return response;
	}
}

