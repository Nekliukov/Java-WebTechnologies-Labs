package by.bsuir.lr1.java_fundamentals.task3.util;

public class Function {
    public static double[][] resolveInRange(double a, double b, double h) throws IllegalArgumentException {
        if (a >= b){
            throw new IllegalArgumentException("Left border must be grater than right one");
        }

        int tableSize = (int)((b - a)/h);
        double[][] resultTable = new double[tableSize][2];
        int i = 0;
        while (i < tableSize){
            resultTable[i][0] = a;
            resultTable[i++][1] = Math.tan(a);
            a += h;
        }

        return resultTable;
    }
}
