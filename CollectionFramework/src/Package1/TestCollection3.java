package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
	    list1.add(23);
	    list1.add(55);
	    list1.add(64);
	    list1.add(02);
	    list1.add(82);
	    list1.add(11);
	    
	    System.out.println("Array List is : ");
	    
	    for(Integer temp : list1) {
	    	System.out.println(temp);
	    }
	    
	    System.out.println("----------------------");
	    System.out.println("Using Enumeration");
	    
	    Enumeration<Integer> e1 = Collections.enumeration(list1);
	    while(e1.hasMoreElements()) {
	    	System.out.println(e1.nextElement());
	    }
	    System.out.println("----------------------");
	    
	    Iterator<Integer> itr = list1.iterator();
	    while(itr.hasNext()) {
	          Integer i1 = itr.next();
	          System.out.println("Element is : " + i1 + " At an Index " + list1.indexOf(i1));
	          System.out.println("Size of List is : " + list1.size());
	          //itr.remove();
       }
	    System.out.println("----------------------");
	    
	    ListIterator<Integer> ltr = list1.listIterator();
	    while(ltr.hasNext()) {
	    	Integer i1 = ltr.next();
	    	System.out.println("Element is : " + i1 + " at index " + ltr.nextIndex() );
	    }
	    System.out.println("----------------------");
	    
	    ListIterator<Integer> ltr2 = list1.listIterator(3);
	    while(ltr2.hasPrevious()) {
	    	Integer i1 = ltr2.previous();
	    	System.out.println("Element is : " + i1 );
	    }
	    

}
}
