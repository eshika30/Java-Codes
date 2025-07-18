package package1;

import java.util.ArrayList;
import java.util.List;

public class TestLambdaExpression4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println("Array List is : ");
		System.out.println(al);
		System.out.println("--------------------------------");
		
		System.out.println("List with Lamda Expression");
		al.forEach((item)->{System.out.print(item + " ");});
		System.out.println("\n----------------------------");
		
		List<Integer> newList = al.stream().map((x)-> x*x) .toList();
		System.out.println(newList);
		System.out.println("\n----------------------------");
		
		List<Integer> evenList = al.stream().filter(x-> x%2==0).toList();
		System.out.println(evenList);
		System.out.println("\n----------------------------");
		
		int sumOfAll = al.stream().reduce(0, Integer::sum);
		System.out.println("Sum of List Element is : " + sumOfAll);
		
	
	}

}
