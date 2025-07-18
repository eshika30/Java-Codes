package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rollNumber;
	String name;
	
}

public class SerializedDemo {
	public static void main(String[] args)throws Exception {
		Student s1 = new Student();
		s1.rollNumber = 7;
		s1.name = "Ganesh";
		
		System.out.println("Before Serialization");
		System.out.println("Roll Number is : " + s1.rollNumber);
		System.out.println("Name is : " + s1.name);
		System.out.println("-------------------------------");
		
		File f1 = new File("Serial.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		System.out.println("Object is Serialized");
		System.out.println("-------------------------------");
		
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2 = null;
		s2 = (Student) ois.readObject();
		ois.close();
		System.out.println("After DeSerialization");
		System.out.println("Roll Number is : " + s2.rollNumber);
		System.out.println("Name is : " + s2.name);
		System.out.println("------------------------------------------");
		
		
	
		
				
			
		}
		
	}


