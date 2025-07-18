package Package1;

import java.util.Scanner;

public class ArrayAcceptance {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] key = new int[n];
		
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter Elements for index : [" + i + "] :");
			key[i] = sc.nextInt();
		}
		System.out.println("\n\nArray Elements are : ");
		for(int i=0;i<n;i++) {
			System.out.println(key[i] + " ");
		}
	}

}
