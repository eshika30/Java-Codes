package Package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayAccept {
	public static void main(String[] args)throws Exception {
		
		int key[] = new int[5];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Array Element : ");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Element : ");
			key[i] = Integer.parseInt(br.readLine());
			
		}
		System.out.println("Array Element are : ");
		
		for(int x : key) {
			System.out.println(x);
		}
		
	}

}
