package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax () {
        MultiMax chek1 = new MultiMax();
        int result1 = chek1.max(5, 3, 1);
        assertThat(result1, is(5));
    }

    @Test
    public void whenThirdMax () {
        MultiMax chek2 = new MultiMax();
        int result2 = chek2.max(6, 7, 9);
        assertThat(result2, is(9));
    }
}