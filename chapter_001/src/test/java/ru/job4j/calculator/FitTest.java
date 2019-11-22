package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;

public class FitTest {


    @Test
    public void manWeight() {
        double in = 180;
    double expected = 92;
    double out = Fit.manWeight(in);
    Assert.assertEquals(expected,out,0.01);
}

    @Test
    public void womanWeight () {
        double in1 = 170;
        double expected1 = 69;
        double out1 = Fit.womanWeight(in1);
        Assert.assertEquals(expected1, out1, 0.01);
    }






}
