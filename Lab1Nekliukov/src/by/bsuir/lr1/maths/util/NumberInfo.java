package by.bsuir.lr1.maths.util;

public class NumberInfo
{
    public static boolean isPrime(int number){
        if (number == 1){
            return true;
        }

        double numberRoot = Math.sqrt(number);
        for (int i = 2; i <= numberRoot; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
