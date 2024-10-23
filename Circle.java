
public class Circle {
	Point P;
	double radius;
	
	public Circle(Point P, double radius){
		this.P = P;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCir() {
		return Math.PI*2*radius;
	}
}
