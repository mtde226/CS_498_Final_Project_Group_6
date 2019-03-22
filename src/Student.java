package gradebook;

import java.util.*;

public class Student {
	
	public String name;	
	public ArrayList<course> courseList = new ArrayList<course>();
	public void printStudentInfo() {//Will eventually print the entire set of student's assignments
		System.out.print("\nThe student's name is:");
		System.out.print(name);
		for (int i = 0; i < courseList.size(); i++) {
			courseList.get(i).print();
		}
	}
	
	public static Student addStudent() {
		Student placeHolder = new Student();
		placeHolder.name = "James Garfield";
		//placeHolder.courseList.add(course.addCourse());
		return placeHolder;
	}	
}
