package Package1;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(14);
		list1.add(10);
		list1.add(55);
		list1.add(2);
		list1.add(64);
		list1.add(80);
		
		System.out.println("List Elements are : ");
		for(Integer temp : list1) {
			System.out.println(temp);
		}
		Collections.sort(list1);
		System.out.println("List Elements are : ");
		for(Integer temp : list1) {
			System.out.println(temp);
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Eshu");
		list2.add("Sakshu");
		list2.add("Pratu");
		list2.add("Sanika");
		list2.add("Vaishu");
		list2.add("Teju");
		list2.add("Atul");
		
		System.out.println("List Elements are : ");
		for(String temp : list2) {
			System.out.println(temp);
		}
		Collections.sort(list2);
		System.out.println("List Elements are : ");
		for(String temp : list2) {
			System.out.println(temp);
		}
		
		
		
		
		
		
	}

}
