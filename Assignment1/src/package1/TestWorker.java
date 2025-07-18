package package1;

class Worker{
	int number;
	String name;
	
	public class TestWorker {
		public static void main(String[] args) {
			
			Worker w1 = new Worker();
			w1.number = 1;
			w1.name = "Shubham";
			
			System.out.println("Number is :"+ w1.number);
			System.out.println("Name is :"+ w1.name);
			
			Worker w2;
			w2 = w1;
			
			System.out.println("Number is:"+ w2.number);
			System.out.println("Name is:"+ w2.name);
			
		}
}
	
	

}
