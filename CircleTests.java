import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void AreaEqualZero() {
		Point point = new Point(0, 0);
		Circle circle = new Circle(point, 0);
		
		assertEquals(circle.getArea(), 0);
	}
	
	@Test
	void AreaGeneral() {
		Point point = new Point(0, 0);
		Circle circle = new Circle(point, 5);
		
		assertEquals(circle.getArea(), Math.PI*25);
	}
	
	@Test
	void CircumEqualZero() {
		Point point = new Point(0, 0);
		Circle circle = new Circle(point, 0);
		
		assertEquals(circle.getCir(), 0);
	}
	
	@Test
	void CircumEqualZero() {
		Point point = new Point(0, 0);
		Circle circle = new Circle(point, 5);
		
		assertEquals(circle.getCir(), Math.PI*10);
	}

}
