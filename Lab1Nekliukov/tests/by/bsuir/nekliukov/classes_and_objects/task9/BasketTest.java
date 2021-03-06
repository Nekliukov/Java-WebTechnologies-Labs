package by.bsuir.nekliukov.classes_and_objects.task9;

import by.bsuir.lr1.classes_and_objects.task9.util.Ball;
import by.bsuir.lr1.classes_and_objects.task9.util.Basket;
import by.bsuir.lr1.classes_and_objects.task9.util.Color;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void basketCreatingTest_constructor() {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2)
        ));
        Basket basket = new Basket(balls);
        assertEquals(2, basket.getColorCount(Color.BLUE));
        assertEquals(0.8D, basket.weight, 0.1);
    }

    @Test
    public void basketCreatingTest_addByElement() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add(new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        assertEquals(2, basket.getColorCount(Color.BLUE));
        assertEquals(0.8D, basket.weight, 0.1);
    }

    @Test
    public void basketCreatingTest_remove() {
        Basket basket = new Basket();
        Ball blueBall = new Ball(Color.BLUE, 0.2);
        Ball redBall = new Ball(Color.RED, 0.2);
        Ball greenBall = new Ball(Color.GREEN, 0.2);
        basket.add(blueBall); basket.add(redBall); basket.add(greenBall);
        basket.remove(redBall);
        assertEquals(0, basket.getColorCount(Color.RED));
        assertEquals(0.8D, basket.weight, 0.4);
    }
}