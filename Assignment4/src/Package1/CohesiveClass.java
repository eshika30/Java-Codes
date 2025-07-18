package Package1;

class Circle{
	int radius;
	final float PI_VALUE=3.14f;
	double area;
	Circle(int radius){
		this.radius=radius;
	}
	double calculateArea() {
		area= PI_VALUE * radius * radius;
				return area;
	}
	void displayArea(double area) {
		System.out.println("Area of Circle is : "+ area);
	}
	    
	
}

public class CohesiveClass {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		double a = c1.calculateArea();
		c1.displayArea(a);
	     
		
	}

}
