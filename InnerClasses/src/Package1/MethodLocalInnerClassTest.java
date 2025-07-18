package Package1;

class MethodLocalTest{
	int data = 30;
	public void myMethod() {
		class MyClass{
			void method1() {
				System.out.println("Data Value is : " + data);
			}
		}
		MyClass m1 = new MyClass();
		m1.method1();
	}
}

public class MethodLocalInnerClassTest {
	public static void main(String[] args) {
		MethodLocalTest mt = new MethodLocalTest();
		mt.myMethod();
		
	}

}
