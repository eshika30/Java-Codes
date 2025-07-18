package Package1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>();
		
		s1.add("Eshika");
		s1.add("Sakshi");
		s1.add("Shraddha");
		s1.add("Sayali");
		System.out.println(s1);
		
		LinkedHashSet<String> ls1 = new LinkedHashSet<>();
		ls1.add("Eshika");
		ls1.add("Sakshi");
		ls1.add("Shraddha");
		ls1.add("Sayali");
		System.out.println(ls1);
		
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Eshika");
		ts1.add("Sakshi");
		ts1.add("Shraddha");
		ts1.add("Sayali");
		System.out.println(ts1);
		
		
	}

}
