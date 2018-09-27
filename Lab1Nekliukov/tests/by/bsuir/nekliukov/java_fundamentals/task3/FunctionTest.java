package by.bsuir.nekliukov.java_fundamentals.task3;

import by.bsuir.lr1.java_fundamentals.task3.util.Function;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void resolveFunction_Test(){
        double[][] expectedResult = {
                new double[] {0,  0},
                new double[] {1,  1.557},
                new double[] {2, -2.185},
                new double[] {3, -0.143},
                new double[] {4,  1.158},
                new double[] {5, -3.381},
                new double[] {6, -0.291},
                new double[] {7,  0.871},
                new double[] {8, -6.8}
        };

        double[][] result = Function.resolveInRange(0,9,1);
        for(int i = 0; i < 9; i++){
            System.out.println((int)result[i][0]+"\t->\t"+result[i][1]);
            assertEquals(expectedResult[i][1], result[i][1], 0.001);
        }
    }

}