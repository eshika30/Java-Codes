package Package1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		number = sc.nextInt();
		System.out.println("Reverse is : ");
		int quo,rem;
		int temp=number,rnumber = 0;
		
		while(temp>0) {
			quo = temp/10;
			rem = temp%10;
			rnumber=rnumber*10+rem;
			temp = quo;
		}
		System.out.print(rnumber);
		if(number == rnumber) {
		System.out.println("\nWOW : Its Palindrome");
	}else { 
		System.out.println("\nSorry : Not Palindrome");
	}

}
}
