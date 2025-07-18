package Package1;

class Student{
	private int rollNumber;
	private String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Student(int rollNumber){
		this.rollNumber = rollNumber;
	}
	Student(){

	}
	Student(String name){
		this.name = name; 
	}
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}

}
public class StudentDatabase {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNumber(1);
		s1.setName("Eshika");
		System.out.println(s1.getRollNumber() +"     "+ s1.getName());

		Student s2 = new Student(2);
		s2.setName("Sakshi");
		System.out.println(s2.getRollNumber() +"     "+ s2.getName());

		Student s3 = new Student("Pratiksha");
		s3.setRollNumber(3);
		System.out.println(s3.getRollNumber() +"     "+ s3.getName());

		Student s4 = new Student(4,"Vaishnavi");
		System.out.println(s4.getRollNumber() +"     "+ s4.getName());

	}		


}

