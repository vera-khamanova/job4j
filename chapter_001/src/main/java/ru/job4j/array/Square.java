package ru.job4j.array;

import java.lang.module.FindException;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int index = 0; index<bound; index++) {
            rst[index] = (index+1)*(index+1);
        }
            return rst;
        }


    }
