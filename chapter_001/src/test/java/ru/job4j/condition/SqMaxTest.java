package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax () {
        SqMax check1 = new SqMax();
        int result1 = check1.max(5, 3, 1, 2);
        assertThat(result1, is(5));
    }

    @Test
    public void whenThirdMax () {
        SqMax check2 = new SqMax();
        int result2 = check2.max(6, 7, 9, 5);
        assertThat(result2, is(9));
    }

    @Test
    public void whenForthMax () {
        SqMax check3 = new SqMax();
        int result3 = check3.max(6, 7, 9, 10);
        assertThat(result3, is(10));
    }
}
