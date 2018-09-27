package by.bsuir.lr1.exceptions.util;

public class CustomValidation {
    public static void arrayValidation(Object[] array) throws ArgumentNullException, ArgumentException {
        if (array == null){
            throw new ArgumentNullException();
        }

        if (array.length == 0){
            throw new ArgumentException("Array is empty");
        }
    }
}
