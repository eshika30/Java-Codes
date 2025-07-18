package Package1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number1,number2,result;
		
		System.out.println("Enter Number 1 :");
		number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		number2 = sc.nextInt();
		
		result = number1+number2;
		System.out.println("Add is: "+ result);
		
		result = number1 - number2;
		System.out.println("Sub is: "+ result);
		
		result = number1*number2;
		System.out.println("Mult is: "+ result);

		result = number1/number2;
		System.out.println("Div is: "+ result);
		
		result = number1%number2;
		System.out.println("Mod is: "+ result);
		
		
		
		
	
		
	}

	}


