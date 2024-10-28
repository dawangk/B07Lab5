package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest1 {

    @Test
    public void testTopLeft() {
        Point topLeft = new Point(2, 3);
        Square square = new Square(topLeft, 4.0);
        assertEquals(topLeft, square.top_left);
    }

    @Test
    public void testTopRight() {
        Point topLeft = new Point(2, 3);
        Square square = new Square(topLeft, 4.0);
        assertEquals(new Point(6, 3), square.top_right);
    }

    @Test
    public void testBottomLeft() {
        Point topLeft = new Point(2, 3);
        Square square = new Square(topLeft, 4.0);
        assertEquals(new Point(2, -1), square.bottom_left);
    }

    @Test
    public void testBottomRight() {
        Point topLeft = new Point(2, 3);
        Square square = new Square(topLeft, 4.0);
        assertEquals(new Point(6, -1), square.bottom_right);
    }
}
