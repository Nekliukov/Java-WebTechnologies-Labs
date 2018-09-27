package by.bsuir.nekliukov.java_fundamentals.task7;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.java_fundamentals.task7.util.ArrayExtension;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayExtensionTest {

    @Test
    public void shellSort() throws ArgumentException, ArgumentNullException {
        Double[] initArray = {3.14D, -20D, 0D, 54.5D, 10D};
        ArrayExtension.shellSort(initArray);
        assertArrayEquals(new Double[]{-20D,0D,3.14D,10D,54.5D}, initArray);
    }

    @Test
    public void shellSort_1element() throws ArgumentException, ArgumentNullException {
        Double[] initArray = {3.14D};
        ArrayExtension.shellSort(initArray);
        assertArrayEquals(new Double[]{3.14D}, initArray);
    }

    @Test
    public void shellSort_2elements() throws ArgumentException, ArgumentNullException {
        Double[] initArray = {3.14D, 1.23D};
        ArrayExtension.shellSort(initArray);
        assertArrayEquals(new Double[]{1.23D, 3.14D}, initArray);
    }

    @Test(expected = ArgumentException.class)
    public void shellSort_EmptyArray_IllegalArgumentException() throws ArgumentException, ArgumentNullException {
        ArrayExtension.shellSort(new Double[]{});
    }

    @Test(expected = ArgumentNullException.class)
    public void shellSort_NullArray_NullPointerException() throws ArgumentException, ArgumentNullException {
        ArrayExtension.shellSort(null);
    }

}