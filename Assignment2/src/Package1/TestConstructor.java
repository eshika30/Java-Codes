package Package1;

class Animal{
	Animal(){
		System.out.println("In no arg Animal Constr");
	}
	
}
class Bird extends Animal{
	Bird(){
		System.out.println("In no arg bird Constr");
	}
	
}
class Sparrow extends Bird{
	Sparrow(){
		System.out.println("In no arg Sparrow Constr");
	}
	Sparrow(String name){
		this();
		System.out.println("In one arg Sparrow Constr");
	}

}


public class TestConstructor {
	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		System.out.println("------------------");
		Sparrow s2 = new Sparrow("Chiu");
	}

}
