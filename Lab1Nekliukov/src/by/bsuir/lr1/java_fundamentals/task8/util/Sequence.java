package by.bsuir.lr1.java_fundamentals.task8.util;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.exceptions.util.CustomValidation;
import by.bsuir.lr1.java_fundamentals.task7.util.ArrayExtension;

import java.util.Arrays;
import java.util.LinkedList;

public class Sequence {
    public static int[] findInsertPositions(Double[] sourceNumbers, Double[] dest) throws ArgumentException, ArgumentNullException {
        CustomValidation.arrayValidation(sourceNumbers); CustomValidation.arrayValidation(dest);
        Double[] resultSorted = ArrayExtension.shellSort(ArrayExtension.joinArrayGeneric(sourceNumbers, dest));
        LinkedList<Integer> resultPositions = new LinkedList<>();
        for(int i = 0; i < resultSorted.length; i++){
            for(int j = 0; j < sourceNumbers.length; j++){
                if (resultSorted[i] == sourceNumbers[j])
                    resultPositions.add(i);
            }
        }

        return resultPositions.stream().mapToInt(i -> i).toArray();
    }

    public static int[] findInsertPositions(double[] sourceNumbers, double[] dest) throws ArgumentException, ArgumentNullException {
        return findInsertPositions(
                Arrays.stream(sourceNumbers).boxed().toArray(Double[]::new),
                Arrays.stream(dest).boxed().toArray(Double[]::new)
        );
    }
}

