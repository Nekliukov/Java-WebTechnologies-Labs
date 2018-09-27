package by.bsuir.lr1.convertors.util;

public class ArrayTypeConvertor
{
    public static double[] toPrimitiveDouble(Object[] initArray){
        double[] primitiveArray = new double[initArray.length];
        for(int i = 0; i < primitiveArray.length; i++){
            primitiveArray[i] = (double)initArray[i];
        }

        return primitiveArray;
    }
}
