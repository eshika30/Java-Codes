package Package1;

abstract class MyClass{
	abstract void method1();
}

interface Eatable{
	void eat();
}

public class TestAnonymousClass {
	public static void main(String[] args) {
		
		MyClass m1 = new MyClass() {

			@Override
			void method1() {
				// TODO Auto-generated method stub
				System.out.println("I am inside Anonymous Class");
				
			}
			
		};
		m1.method1();
		Eatable e1 = new Eatable() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("I am Eatable Interface implementer");
			}
	};
	e1.eat();

}
}
