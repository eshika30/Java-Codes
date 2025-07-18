package Package1;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Prime Number From 1 TO 100");
		System.out.print(2 + " ");
		
		int number = 3;
		int count = 1;
		boolean flag = true;
		
		while(number<=100) {
			for(int i=2;i<number;i++) {
				if(number % i == 0) {
					flag = false;
					break;
				}else {
					flag = true;
					continue;
				}
			}
			if(flag == true) {
				count++;
				System.out.print(number + " ");
			}
			number++;
		}
		System.out.println("\n\nTotal Numbers : " +count);
		
	}

}
