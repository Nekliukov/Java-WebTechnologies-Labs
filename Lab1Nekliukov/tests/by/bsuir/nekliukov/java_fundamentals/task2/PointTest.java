package by.bsuir.nekliukov.java_fundamentals.task2;

import by.bsuir.lr1.java_fundamentals.task2.util.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void isInBounds_Xis1_Yis1_StepIs1() {
        assertTrue(Point.isInBounds(1,1, 1));
    }

    @Test
    public void isInBounds_Xis3_Yis8_StepIs1() {
        assertFalse(Point.isInBounds(3,8, 1));
    }
    @Test
    public void isInBounds_XisMinus4_Yis1_StepIs1() {
        assertTrue(Point.isInBounds(-4,1, 1));
    }

    @Test
    public void isInBounds_XisMinus5_YisMinus2_StepIs1() {
        assertTrue(Point.isInBounds(-5,-2, 1));
    }

    @Test
    public void isInBounds_Xis0_Yis0_StepIs2() {
        assertTrue(Point.isInBounds(0,0, 2));
    }

}