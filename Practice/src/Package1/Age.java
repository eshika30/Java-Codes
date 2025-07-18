package Package1;

import java.util.Calendar;
import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Birth Year : ");
		int birthYear = sc.nextInt();
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		int age = currentYear - birthYear;
		
		System.out.println("Hello, " + name + " You are " + age + " years old.");
		sc.close();
				
		
		
	}

}
