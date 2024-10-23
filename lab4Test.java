package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lab4Test {

	@Test
	void PointTestDistance() {
		Point x = new Point(0, 0);
		Point y = new Point(Math.sqrt(2), Math.sqrt(2));
		assertEquals(x.distance(y), 2);
	}
	
	@Test
	void PointTestHashCode() {
		Point x = new Point(2, 3.1415);
		assertEquals(x.hashCode(), (int)(6 + 5*3.1415));
	}
	
	@Test
	void PointTestEqualNull() {
		Point x = new Point(Math.sqrt(5), 0);
		assertEquals(x.equals(null), false);
	}
	
	@Test
	void PointTestEqualItself() {
		Point x = new Point(Math.sqrt(5), 0);
		assertEquals(x.equals(x), true);
	}
	
	@Test
	void PointTestEqualDifferentClass() {
		Point x = new Point(Math.sqrt(5), 0);
		assertEquals(x.equals(1), false);
	}
	
	@Test
	void PointTestDifferentY() {
		Point x = new Point(Math.sqrt(5), 0);
		Point y = new Point(Math.sqrt(5),1);
		assertEquals(x.equals(y), false);
	}
	
	@Test
	void PointTestDifferentX() {
		Point x = new Point(Math.sqrt(5), 0);
		Point y = new Point(0,0);
		assertEquals(x.equals(y), false);
	}
	
	@Test
	void PointTestSameParams() {
		Point x = new Point(Math.sqrt(5), 0);
		Point y = new Point(Math.sqrt(5), 0);
		assertEquals(x.equals(y), true);
	}
	
	@Test
	void TriangleTestPerimeter() {
		Point x = new Point(0,0);
		Point y = new Point(4, 4);
		Point z = new Point(0, 4);
		Triangle a = new Triangle(x,y,z);
		assertEquals(a.perimeter(), 8+Math.sqrt(32));
	}
	
	@Test
	void TriangleTestEqualatTrue() {
		Point x = new Point(0,0);
		Point y = new Point(Math.sqrt(5), 0);
		Point z = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
		Triangle a = new Triangle(x,y,z);
		
		assertEquals(a.isEquilateral(), true);
	}
	
	@Test
	void TriangleTestEqualatFalse() {
		Point x = new Point(0,0);
		Point y = new Point(Math.sqrt(5), 0);
		Point z = new Point(Math.sqrt(5), Math.sqrt(15)/2);
		Triangle a = new Triangle(x,y,z);
		assertEquals(a.isEquilateral(), false);
	}
	

}
