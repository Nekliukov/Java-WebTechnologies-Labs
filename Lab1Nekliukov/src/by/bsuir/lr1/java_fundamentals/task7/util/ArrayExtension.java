package by.bsuir.lr1.java_fundamentals.task7.util;

import by.bsuir.lr1.exceptions.util.ArgumentException;
import by.bsuir.lr1.exceptions.util.ArgumentNullException;
import by.bsuir.lr1.exceptions.util.CustomValidation;

import java.lang.reflect.Array;

public class ArrayExtension {
    public static Double[] shellSort(Double[] array) throws ArgumentException, ArgumentNullException {
        CustomValidation.arrayValidation(array);

        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
        return array;
    }

    public static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }
}
