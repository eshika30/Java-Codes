package Package1;

public class Reverse {
	public static void main(String[] args) {
		String a = "Hello";
		String rev = "";
		
		for(int i = a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
	}



}
