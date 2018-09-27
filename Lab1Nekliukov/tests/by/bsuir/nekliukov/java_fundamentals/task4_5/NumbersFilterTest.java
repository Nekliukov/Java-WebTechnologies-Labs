package by.bsuir.nekliukov.java_fundamentals.task4_5;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.java_fundamentals.task4_5.util.NumbersFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersFilterTest {
    @Test
    public void getIndexesTestExists() throws ArgumentException, ArgumentNullException {
        int[] initArray = {33,23,55,12,1,9,20,7};
        int[] expectedIndexes = {1,4,7};
        int[] result = NumbersFilter.getIndexesOfPrimes(initArray);
        assertArrayEquals(expectedIndexes, result);
    }

    @Test(expected = ArgumentNullException.class)
    public void getIndexesTest_NullPointer_NullPointerException() throws ArgumentException, ArgumentNullException {
        NumbersFilter.getIndexesOfPrimes(null);
    }

    @Test
    public void unnecessaryNumbersCountTest_2numbers() throws ArgumentException, ArgumentNullException {
        int expectedResult = 2;
        int result = NumbersFilter.unnecessaryNumbersCount(new int[]{45,69,34,5,200});
        assertEquals(expectedResult, result);
    }

    @Test
    public void unnecessaryNumbersCountTest_6numbers() throws ArgumentException, ArgumentNullException {
        int expectedResult = 6;
        int result = NumbersFilter.unnecessaryNumbersCount(new int[]{-34,0,1000,45,235,12,124,25,2500,243});
        assertEquals(expectedResult, result);
    }

    @Test
    public void unnecessaryNumbersCountTest_0numbers() throws ArgumentException, ArgumentNullException {
        int expectedResult = 0;
        int result = NumbersFilter.unnecessaryNumbersCount(new int[]{-34,0,1000});
        assertEquals(expectedResult, result);
    }

    @Test
    public void unnecessaryNumbersCountTest_0numbersWith1Element() throws ArgumentException, ArgumentNullException {
        int expectedResult = 0;
        int result = NumbersFilter.unnecessaryNumbersCount(new int[]{-34});
        assertEquals(expectedResult, result);
    }

    @Test(expected = ArgumentException.class)
    public void unnecessaryNumbersCountTest_EmptyArray_InvalidArgumentException() throws ArgumentException, ArgumentNullException {
        NumbersFilter.unnecessaryNumbersCount(new int[]{});
    }

    @Test(expected = ArgumentNullException.class)
    public void unnecessaryNumbersCountTest_NullPointer_ArgumentNullException() throws ArgumentException, ArgumentNullException {
        NumbersFilter.unnecessaryNumbersCount(null);
    }

}