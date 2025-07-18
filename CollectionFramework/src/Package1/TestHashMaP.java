package Package1;

import java.util.HashMap;
import java.util.Map;

public class TestHashMaP {
	public static void main(String[] args) {
		
		HashMap<Integer,String> h1 = new HashMap<>();
		
		h1.put(101,"Eshika1");
		h1.put(102,"Eshika2");
		h1.put(103,"Eshika3");
		h1.put(104,"Eshika4");
		h1.put(105,"Eshika5");
		h1.put(106,"Eshika6");
		h1.put(107,"Eshika7");
		h1.put(108,"Eshika8");
		h1.put(109,"Eshika9");
		h1.put(110,"Eshika10");
		h1.put(111,"Eshika11");
		h1.put(112,"Eshika12");
		h1.put(113,"Eshika13");
		h1.put(114,"Eshika14");
		h1.put(115,"Eshika15");
		
		System.out.println(h1);
		for(Map.Entry<Integer,String> entry : h1.entrySet()) {
			System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
		}
		
	}

}
