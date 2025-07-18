package package1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestLambdaExpression3 {
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<>();
		friends.add("Eshika");
		friends.add("Sakshi");
		friends.add("Sanika");
		friends.add("Pratiksha");
		friends.add("Vaishnavi");
		friends.add("Shraddha");
		friends.add("Sayali");
		friends.add("Mansavi");
		
		System.out.println(friends);
		System.out.println("-----------------------");
		System.out.println("List with enhanced For Loop");
		
		for(String x : friends) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		System.out.println("List with Lambda expressions");
		
		friends.forEach((item)->{System.out.println(item);});
		System.out.println("-----------------------");
		
		System.out.println("List using Consumer Interface and Lamda Expression");
		Consumer<String> flist = (item)->{System.out.println(item);};
		friends.forEach(flist);
		
	}

}
