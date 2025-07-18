package Package1;

class Dog {
	static int count;
	
	Dog(){
	count++;
}

public class DogCounting {
	public static void main(String[] args) {
		System.out.println("No of Dogs are : " + Dog.count);
		System.out.println("-------------------------");
		
		Dog d1 = new Dog();
		System.out.println("No of Dogs are :" + d1.count);
		System.out.println("No of Dogs are : " + Dog.count);
		System.out.println("-------------------------");
		
		Dog d2 = new Dog();
		System.out.println("No of Dogs are :" + d2.count);
		System.out.println("No of Dogs are :" + d1.count);
		System.out.println("No of Dogs are : " + Dog.count);
		System.out.println("-------------------------");
		
		
	}
		
	}
}
			
	
	


