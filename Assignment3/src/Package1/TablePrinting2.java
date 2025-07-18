package Package1;

import java.util.Scanner;

public class TablePrinting2 {
	public static void main(String[] args) {
		int sNumber,eNumber,Number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start Number : ");
		sNumber = sc.nextInt();
		
		System.out.println("Enter End Number : ");
		eNumber = sc.nextInt();
		
		for(Number=sNumber;Number<=eNumber;Number++) {
			int i=1;
			System.out.println("Table of " + Number);
			
			while(i<=10) {
				System.out.println(Number + " X " + i + " = "+(Number*i));
				i++;
			}
		}
		
	}

}
