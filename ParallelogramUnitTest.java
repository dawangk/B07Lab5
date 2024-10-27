import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParallelogramTest {

    @Test
    public void testIsValidParallelogram_True() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 3);
        Point D = new Point(-1, 3);
        Parallelogram parallelogram = new Parallelogram(A, B, C, D);
        assertTrue(parallelogram.isValidParallelogram());
    }

    @Test
    public void testIsValidParallelogram_False_NotParallelogram() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 2);
        Point D = new Point(-1, 3);
        Parallelogram parallelogram = new Parallelogram(A, B, C, D);
        assertFalse(parallelogram.isValidParallelogram());
    }

    @Test
    public void testIsValidParallelogram_False_DiagonalsEqual() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Parallelogram parallelogram = new Parallelogram(A, B, C, D);
        assertFalse(parallelogram.isValidParallelogram());
    }

    @Test
    public void testComputeArea() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 3);
        Point D = new Point(-1, 3);
        Parallelogram parallelogram = new Parallelogram(A, B, C, D);
        double expectedArea = Math.abs((C.y - A.y) * (B.x - A.x) - (C.x - A.x) * (B.y - A.y));
        assertEquals(expectedArea, parallelogram.computeArea());
    }

    @Test
    public void testComputePerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(3, 3);
        Point D = new Point(-1, 3);
        Parallelogram parallelogram = new Parallelogram(A, B, C, D);
        double expectedPerimeter = 2 * (A.distance(B) + B.distance(C));
        assertEquals(expectedPerimeter, parallelogram.computePerimeter());
    }
}
