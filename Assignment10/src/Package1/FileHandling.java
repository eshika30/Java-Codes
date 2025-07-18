package Package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileHandling {
	public static void main(String[] args)throws Exception {
		File mydir = new File("javadir");
		mydir.mkdir();
		File myFile = new File("javadir");
		System.out.println(myFile.exists());
		
		myFile.createNewFile();
		System.out.println(myFile.exists());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		FileWriter fw = new FileWriter(myFile);
		fw.write(str);
		fw.close();
		
		FileReader fr = new FileReader(myFile);
		BufferedReader br1 = new BufferedReader(fr);
		
		System.out.println("File contents are : ");
		System.out.println(br1.readLine());
		
		br1.close();
		
		
	}
	
	
	
	
	
		
	

}
