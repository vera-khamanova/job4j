package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {
    //comment

    @Test
    public void distance () {
        int x1 = 1;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);


    }


}
