package Package1;

public class Student implements Comparable<Student> {
	private Integer rollNumber;
	private String name;
	private Float marks;
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
	public Student(Integer rollNumber, String name, Float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student o) {
		
		return this.getRollNumber()- o.getRollNumber();
	}
	
	

}
