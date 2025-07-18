package Package1;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks of 5 Subjects : ");
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		double m4 = sc.nextDouble();
		double m5 = sc.nextDouble();
		
		double average = (m1 + m2 + m3 + m4 + m5)/5;
		System.out.printf("Average marks:%.2f\n", average);
		sc.close();
	}

}
