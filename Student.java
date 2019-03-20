package gradebook;

import java.util.*;

public class Student {
	
	public String name;	
	public ArrayList<course> courseList = new ArrayList<course>();
	public course placeHolder = new course();
	public void studentInfo() {//Will eventually print the entire set of student's assignments
		System.out.print("\nThe student's name is:");
		System.out.print(name);
		for (int i = 0; i <= courseList.size(); i++) {
			placeHolder = courseList.get(i);
			placeHolder.print();
		}
	}
}
