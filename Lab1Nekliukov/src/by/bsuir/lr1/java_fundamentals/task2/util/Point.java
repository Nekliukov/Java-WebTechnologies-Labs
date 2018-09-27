package by.bsuir.lr1.java_fundamentals.task2.util;

public class Point
{
    public static boolean isInBounds(double x, double y, double step){
        int numOfStepsX1 = 4, numOfStepsX2 = 6,
            numOfStepsY1 = 5, numOfStepsY2 = -3;
        if (step <= 0){
            throw new IllegalArgumentException("Step must be > 0");
        }

        // Check if our point is in bounds with positive y and symmetric x
        if ((Math.abs(x) <= numOfStepsX1 * step && Math.abs(x) >= 0) &&
                (y <= numOfStepsY1 * step && y >= 0)){
            return true;
        }

        // Check if our point is in bounds with negative y and symmetric x
        if ((Math.abs(x) <= numOfStepsX2 * step && Math.abs(x) >= 0) &&
                (y >= numOfStepsY2 * step && y <= 0)){
            return true;
        }

        return false;
    }
}
