import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void testArea() {
        Point topLeft = new Point(0, 0);
        Square square = new Square(topLeft, 5.0);
        assertEquals(25.0, square.area());
    }

    @Test
    public void testArea() {
        Point topLeft = new Point(0, 0);
        Square square = new Square(topLeft, 7.0);
        assertEquals(49.0, square.area());
    }


    @Test
    public void testPerimeter() {
        Point topLeft = new Point(0, 0);
        Square square = new Square(topLeft, 5.0);
        assertEquals(20.0, square.perimeter());
    }

    @Test
    public void testPerimeter() {
        Point topLeft = new Point(0, 0);
        Square square = new Square(topLeft, 7.0);
        assertEquals(28.0, square.perimeter());
    }
}
