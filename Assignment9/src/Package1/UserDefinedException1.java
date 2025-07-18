package Package1;

import java.util.Scanner;
class BadFoodException extends Exception{
	
}

public class UserDefinedException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats for eating :");
		String foodName = sc.next();
		
		try{
			checkFood(foodName);
		}catch(BadFoodException be) {
		System.out.println("I really Don't like : " + foodName);
		}finally {
			System.out.println("Maggi is always better");
		}
		
		
	}
	static void checkFood(String foodName) throws BadFoodException{
		
		if(foodName.equals("Paneer")) {
			System.out.println("WOW : I Like " + foodName);
			}else {
				throw new BadFoodException();
			}
	}

}
