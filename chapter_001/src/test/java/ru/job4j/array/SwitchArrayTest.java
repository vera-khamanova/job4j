package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1,2);
        assertThat(rsl, is(expect));
    }

    @Test
    public  void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 5, 4, 3, 6};
        int[] rsl = SwitchArray.swap(input, 2, input.length-2);
        assertThat(rsl, is(expect));
    }


}