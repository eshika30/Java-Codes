package package1;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entered String : ");
		String str = sc.nextLine();
		
		System.out.println("Entered String is : " + str);
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				
			
			}
		}
		System.out.println("No of Vowels are : " + count);
	}

}
