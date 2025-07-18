package Package1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int terms;
		System.out.println("Enter Number of Terms : ");
		
		Scanner sc = new Scanner(System.in);
		
		terms = sc.nextInt();
		 
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print("Series is : " + n1 + " " + n2 + " ");
		int i = 3;
		while(i<=terms) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			i++;
		
		}
	
	}

}
