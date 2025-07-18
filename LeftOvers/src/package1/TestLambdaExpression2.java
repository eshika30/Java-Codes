package package1;

@FunctionalInterface
interface MyInterface2{
	int doAddition(int x,int y);
	
}

interface MyInterface3{
	String display(String name);
}

@FunctionalInterface
interface MyInterface4{
	void display();
}




public class TestLambdaExpression2 {
	public static void main(String[] args) {
		
		MyInterface2 i2 = (a,b)->{return a+b; };
		System.out.println(i2.doAddition(22, 40));
		
		MyInterface3 i3 =  (s1)->{return "Hello" + s1;};
		System.out.println(i3.display(" Eshika "));
		
		MyInterface i4 = ()->{
			System.out.println("Hello");
			System.out.println("Everyone");
			System.out.println("How re u?");
		};
		i4.display();
		
	}

}
