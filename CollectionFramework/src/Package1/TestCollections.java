package Package1;

import java.util.Enumeration;
import java.util.Vector;

public class TestCollections {
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(12);
		v1.add(3);
		v1.add(92);
		v1.add(55);
		v1.add(40);
		v1.add(86);
		v1.add(78);
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(88);
		v2.add(11);
		v2.add(66);
		
		v1.addAll(v2);
		System.out.println("\nSize of vector is : " + v1.size());
		System.out.println("Vector Elements are : ");
		
		
		System.out.println(v1.size());
		System.out.println("Vector Elements are : ");
		
		for(Integer temp : v1) {
			System.out.print(temp + " ");
		}
		
		
		
		
		
		
		
		Enumeration<Integer> e1 = v1.elements();
	    System.out.println("\nVectors Elements are : ");
	    while(e1.hasMoreElements()) {
	    	System.out.println(e1.nextElement());
	    }
	}

}
