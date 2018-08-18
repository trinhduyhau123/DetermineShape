import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineShapeTest {

    @Test
    void shape0() {
        int tamgiacdeu = 3;
        int tamgiacvuong = 2;
        int tamgiacthuong = 1;
        int shape = DetermineShape.Shape(3, 4, 5);
        assertEquals(2, shape);
    }
    @Test
    void shape1() {

        int shape = DetermineShape.Shape(3, 3, 3);
        assertEquals(3, shape);
    }
    @Test
    void shape2() {

        int shape = DetermineShape.Shape(3, 5, 6);
        assertEquals(1, shape);
    }
    @Test
    void shape3() {

        int shape = DetermineShape.Shape(3, 10, 6);
        assertEquals(-1, shape);
    }
}
