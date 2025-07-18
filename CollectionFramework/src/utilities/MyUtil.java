package utilities;

import java.util.ArrayList;

public class MyUtil {
	public static <E> void display(ArrayList<E> anyList) {
		for(E temp : anyList) {
			System.out.println(temp);
			
		}
		
	}

}
