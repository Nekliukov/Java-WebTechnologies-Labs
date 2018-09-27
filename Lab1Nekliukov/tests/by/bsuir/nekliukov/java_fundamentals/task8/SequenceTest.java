package by.bsuir.nekliukov.java_fundamentals.task8;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.java_fundamentals.task8.util.Sequence;
import org.junit.Test;

import static org.junit.Assert.*;
public class SequenceTest {

    @Test
    public void findInsertPositions_WithRepeating() throws ArgumentException, ArgumentNullException {
        double[] seq1 = {1, 5 , 10, 20, 100};
        double[] seq2 = {2,15,15,200};
        int[] expectedResult = {1, 4, 5, 8};
        int[] result = Sequence.findInsertPositions(seq2, seq1);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void findInsertPositions_Unique() throws ArgumentException, ArgumentNullException {
        double[] seq1 = {1, 5 , 10, 20, 100};
        double[] seq2 = {2,100,200};
        int[] expectedResult = {1, 5, 7};
        int[] result = Sequence.findInsertPositions(seq2, seq1);
        assertArrayEquals(expectedResult, result);
    }
}