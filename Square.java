public class Square {

	//fields
	Point top_left;
	Point top_right;
	Point bottom_left;
	Point bottom_right;
	
	//constructor
	public Square(Point top_left, double length) {
		
		this.top_left = top_left;
        top_right = new Point(top_left.x + length, top_left.y);
        bottom_left = new Point(top_left.x, top_left.y - length);
        bottom_right = new Point(top_right.x, top_right.y - length);
	}
	
	//methods
	public double area() {
		
		return Math.pow(top_right.x - top_left.x, 2);
	}
	
	public double perimeter() {
		
		return 4 * (top_right.x - top_left.x);
	}
}