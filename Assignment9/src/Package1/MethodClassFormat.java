package Package1;

import java.io.IOException;

public class MethodClassFormat {
	public static void main(String[] args) {
		
		System.out.println("Start of Main");
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Being main method I must handle it");
		}finally {
			System.out.println("Must Execute");
		}
		System.out.println("End of Main");
		}
	
	static void method1()throws IOException {
		System.out.println("Start of method1");
		method2();
		System.out.println("End of method1");
	}
	
	static void method2()throws IOException {
		System.out.println("Start of method2");
		method3();
		System.out.println("End of method2");
	}
	
	static void method3() throws IOException{
		System.out.println("Start of method3");
		throw new IOException();
		//System.out.println("End of method3");
	}
	

}
