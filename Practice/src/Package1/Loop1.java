package Package1;

import java.util.Scanner;

public class Loop1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Number2");
		int num2 = sc.nextInt();
		
		System.out.println("Enter an operator(+,-,*,/): ");
		char operator = sc.next().charAt(0);
		
		int result;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;		
		case '/':
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		
		
		
		}
		
	}

}
