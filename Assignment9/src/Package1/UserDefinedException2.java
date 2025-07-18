package Package1;

import java.util.Scanner;

class WrongInput extends Exception{
	int number;
	WrongInput(int number){
		this.number=number;
	}
	int convert() {
		return -number;
	}
}

public class UserDefinedException2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any +ve value : ");
		int number = sc.nextInt();
		System.out.println("U entered : " + number);
		if(number>0) {
			System.out.println("Thank u for entering +ve number");
			System.exit(0);
			
		}else {
			System.out.println("U........");
			try {
				throw new WrongInput(number);
			}catch(WrongInput we) {
				number = we.convert();
				System.out.println("HA HA HA : I converted it to +ve number ");
				System.out.println("Accepted value is : " + number);
			}
		}
				
	}


}
