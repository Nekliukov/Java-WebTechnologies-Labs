package by.bsuir.nekliukov.java_fundamentals.task6;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.java_fundamentals.task6.util.MatrixGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixGeneratorTest {

    @Test
    public void generateSquareTest_5x5() throws ArgumentException, ArgumentNullException {
        double[] initArray = {3.14, 2, 45.1, -3, 100};
        double[][] expectedResult = {
                {3.14, 2, 45.1, -3, 100},
                {2, 45.1, -3, 100, 3.14},
                {45.1, -3, 100, 3.14, 2},
                {-3, 100, 3.14, 2, 45.1},
                {100, 3.14, 2, 45.1, -3},
        };

        Double[][] result = MatrixGenerator.generateSquare(initArray);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void generateSquareTest_2x2() throws ArgumentException, ArgumentNullException {
        double[] initArray = {3.14, 2};
        double[][] expectedResult = {
                {3.14, 2},
                {2, 3.14}
        };
        Double[][] result = MatrixGenerator.generateSquare(initArray);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void generateSquareTest_1x1() throws ArgumentException, ArgumentNullException {
        double[] initArray = {3.14};
        double[][] expectedResult = {
                {3.14}
        };
        Double[][] result = MatrixGenerator.generateSquare(initArray);
        assertArrayEquals(expectedResult, result);
    }

}