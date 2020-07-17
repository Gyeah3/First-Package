
public class Circle{
	double pi = 3.14;
	double r;
	
	Circle(double r){
		this.r = r;
	}
	
	public double area() {
		return pi * r * r;
	}
	
	public double circumference() {
		return 2 * pi * r;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(4);
		double a = c.area();
		double circumference = c.circumference();
		System.out.print("The area and the circumference of the circle are: " + a + ", " + circumference);
	}
}
