package Package1;

import java.util.ArrayList;
import java.util.Collections;

import utilities.MyUtil;

public class TestArrayList2 {
	public static void main(String[] args) {
		
		ArrayList<Student> sList = new ArrayList<>();
		
		sList.add(new Student(18,"Virat",9.8f));
		sList.add(new Student(45,"Rohit",10.0f));
		sList.add(new Student(07,"Mahi",9.9f));
		sList.add(new Student(10,"Sachin",9.3f));
		sList.add(new Student(63,"Surya",9.10f));
		sList.add(new Student(01,"Kl",9.6f));
		
		System.out.println("List of Student is : ");
		MyUtil.display(sList);
		//Collections.sort(sList);
		Collections.sort(sList,new SortByRollNumber());
		
		
		System.out.println("List of student is : ");
		MyUtil.display(sList);
		System.out.println("-----------------------");
		Collections.sort(sList,new SortByRollNumber());
		System.out.println("List of Student is : ");
		
		MyUtil.display(sList);
		System.out.println("-----------------------");
		
		Collections.sort(sList,new SortByRollNumber());
		

		MyUtil.display(sList);
		System.out.println("-----------------------");
	}

}
