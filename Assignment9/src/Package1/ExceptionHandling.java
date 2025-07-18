package Package1;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		int a=10;
		int b=0;
		
		
		
		
		try{
			b = Integer.parseInt(args[0]);
			System.out.println("Division is : " + (a/b));
		}catch(ArithmeticException ae) {
			System.out.println("Dear plz check denominator");
		}catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("Plz pass arguments");
		}catch(NumberFormatException nfe) {
			System.out.println("Dear plz pass number in proper format");
		}finally {
			System.out.println("Must always Executes");
		}
		System.out.println("End of Main");
	}
}
