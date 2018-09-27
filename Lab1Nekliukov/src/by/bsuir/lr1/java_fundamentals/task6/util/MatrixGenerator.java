package by.bsuir.lr1.java_fundamentals.task6.util;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.exceptions.util.CustomValidation;

import java.util.*;

public class MatrixGenerator {

    //region Public API
    public static Double[][] generateSquare(double[] initArray) throws ArgumentException, ArgumentNullException {
        Double[] newArray = Arrays.stream(initArray).boxed().toArray(Double[]::new);
        return generateSquare(newArray);
    }

    public static Double[][] generateSquare(Double[] initArray) throws ArgumentException, ArgumentNullException {
        CustomValidation.arrayValidation(initArray);
        LinkedList<Double> numbers = new LinkedList<>();
        FillQueue(initArray, numbers);

        Double[][] resultMatrix = new Double[initArray.length][initArray.length];
        CreateMatrix(resultMatrix, numbers);

        return resultMatrix;
    }
    //endregion

    //region Private methods
    private static void FillQueue(Double[] source, Queue<Double> dest){
        for (int i = 0; i < source.length; i++) {
            dest.add(source[i]);
        }
    }

    private static void CreateMatrix(Double[][] resultMatrix, Queue<Double> initQueue){
        for (int i = 0; i < initQueue.size(); i++) {
            resultMatrix[i] = initQueue.toArray(new Double[initQueue.size()]);
            initQueue.add(initQueue.element());
            initQueue.remove();
        }
    }
    //endregion
}
