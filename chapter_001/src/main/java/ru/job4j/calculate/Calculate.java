package ru.job4j.calculate;

/**
 * Class Calculate решение задачи части 001 урок 1
 * @author verahamanova
 * since 05.09.2019
 */

public class Calculate {

    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление
     * @param first Первый аргумент
     * @param second Второй аргумент
     * @return результат
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Умножение
     * @param first Первый аргумент
     * @param second Второй аргумент
     * @return результат
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Вычитание
     * @param first Первый аргумент
     * @param second Второй аргумент
     * @return результат
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Конструктор, вывод строк в консоль
     * @param args - arg.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
