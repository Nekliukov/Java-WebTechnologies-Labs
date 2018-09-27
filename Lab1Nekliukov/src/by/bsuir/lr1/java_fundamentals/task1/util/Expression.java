package by.bsuir.lr1.java_fundamentals.task1.util;

public class Expression {
    public static double resolveExpression(double x, double y) {
        double numerator = 1.0D + Math.pow(Math.sin(x + y), 2.0D);
        double denominator = 2.0D + Math.abs(x - 2.0D * x / (1.0D + x * x + y * y));
        return numerator / denominator + x;
    }
}
