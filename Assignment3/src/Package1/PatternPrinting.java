
package Package1;

import java.util.Scanner;

public class PatternPrinting {
	public static void main(String[] args) {
		int lines;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Lines : ");
		lines = sc.nextInt();
		
		for(int i=1;i<=lines;i++) {
			 
			for(int j=1;j<=i;j++) {
				System.out.print(" " + "*"+" ");
			}
			for(int k=1;k<=1;k++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
