package Package1;

import java.util.Scanner;

public class TablePrinting1 {
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		number = sc.nextInt();
		
		System.out.println("Using While Loop");
		
		int i=1;
		while(i<=10) {
			System.out.println(number + " X " + i + " = " + (number*i));
			i++;
		}
		
		System.out.println("Using For Loop");
		for(i=1;i<=10;i++) {
			System.out.println(number + " X " + i + " = " + (number*i));
		}
		
		
		
		
	}

}
