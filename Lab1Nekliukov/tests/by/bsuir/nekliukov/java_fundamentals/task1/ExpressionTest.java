package by.bsuir.nekliukov.java_fundamentals.task1;

import by.bsuir.lr1.java_fundamentals.task1.util.Expression;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTest {

    @Test
    public void resolveExpression_Xis2_Yis3() {
        double result = Expression.resolveExpression(2,3);
        assertEquals(2.517, result, 0.001);
    }

    @Test
    public void resolveExpression_Xis0_Yis8() {
        double result = Expression.resolveExpression(0,8);
        assertEquals(0.989, result, 0.001);
    }

    @Test
    public void resolveExpression_XisMinus500_YisMinus100() {
        double result = Expression.resolveExpression(-500,-100);
        assertEquals(-499.998, result, 0.001);
    }

    @Test
    public void resolveExpression_Xis0_Yis0() {
        double result = Expression.resolveExpression(0,0);
        assertEquals(0.5, result, 0.1);
    }
}