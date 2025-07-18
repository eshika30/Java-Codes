package package1;

interface MyInterface{
	void display();
}

class MyClass implements MyInterface{
	public void display() {
		System.out.println("Success is always with basics");
	}
}

public class TestLambdaExpression {
	public static void main(String[] args) {
		MyInterface i1 = new MyClass();
		i1.display();
		System.out.println("-------------------");
		
		MyInterface i2 = new MyInterface() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("This implementation is with Anonymous class");
				
			}
		};
		i2.display();
		System.out.println("--------------------");
		
		MyInterface i3 = ()->{System.out.println("Implementation with lambda expression");};
		i3.display();
		}
	}



