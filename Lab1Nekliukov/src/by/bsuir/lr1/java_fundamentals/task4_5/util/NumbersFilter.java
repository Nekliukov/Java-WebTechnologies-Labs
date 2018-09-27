package by.bsuir.lr1.java_fundamentals.task4_5.util;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.exceptions.util.CustomValidation;
import by.bsuir.lr1.maths.util.NumberInfo;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static by.bsuir.lr1.exceptions.util.CustomValidation.*;

public class NumbersFilter
{
    //region Public API
    // This method returns array of indexes of prime numbers in integer array
    public static int[] getIndexesOfPrimes(int[] initArray) throws ArgumentException, ArgumentNullException {
        if(initArray == null){
            throw new ArgumentNullException();
        }
        if(initArray.length == 0){
            throw new ArgumentException();
        }

        ArrayList<Integer> primesIndexes = new ArrayList<Integer>();
        findIndexes(initArray, primesIndexes);
        return primesIndexes.stream().mapToInt(i -> i).toArray();
    }

    // This method returns number of elements which we should remove to
    // make our integer array sorted in ascending order
    public static int unnecessaryNumbersCount(int[] initialArray) throws ArgumentException, ArgumentNullException {
        if(initialArray == null){
            throw new ArgumentNullException();
        }
        if(initialArray.length == 0){
            throw new ArgumentException();
        }

        if (initialArray.length == 1){
            return 0;
        }

        return countNumbers(initialArray);
    }
    //endregion
    //region Private methods
    private static int countNumbers(int[] numbers){
        int resultCount = 0, currMaxNumber = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] <= currMaxNumber){
                resultCount++;
            }
            else{
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }
    private static boolean findIndexes(int[] numbers, ArrayList<Integer> primesIndexes){
        boolean isPrimeExists = false;
        for(int i = 0; i < numbers.length; i++){
            if(NumberInfo.isPrime(numbers[i])){
                primesIndexes.add(i);
                isPrimeExists = true;
            }
        }

        return isPrimeExists;
    }

    //endregion
}
