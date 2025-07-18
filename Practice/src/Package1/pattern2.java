package Package1;

public class pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;(j<=2*(5-i+1)-1);j++) {
				System.out.print("*");
			}
			for(int k=1;k<=5;k++) {
				System.out.print(" ");
			}
			
		
		System.out.println();
		}
	}
   

}
