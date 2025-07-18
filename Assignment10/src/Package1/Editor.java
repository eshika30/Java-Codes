package Package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Editor {
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Strings in Editor : ( Enter stop to end input ) : ");
		String [] key = new String[100];
		
		for(int i=0;i<key.length;i++) {
			String str = br.readLine();
			key[i]=str;
			if(str.equalsIgnoreCase("stop"))
				break;
		}
		System.out.println("Editor contents are : ");
		for(String x : key) {
			if(x.equalsIgnoreCase("stop"))
				break;
			System.out.println(x);
		}
	}

}
