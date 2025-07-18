package Package1;

class OuterClass{
	int number = 7;
	
	class InnerClass{
		void method() {
			System.out.println("Number Value is : " + number);
		}
	}
}


public class TestNonStaticInnerClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.method();
	}

}
