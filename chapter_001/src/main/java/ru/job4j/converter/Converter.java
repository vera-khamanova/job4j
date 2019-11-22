package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar( 120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        int rubleEuro = euroToRuble(5);
        System.out.println("5 euro are " + rubleEuro + " rubles." );
        int rubleDollar = dollarToRuble(5);
        System.out.println("5 dollars are " + rubleDollar + " rubles.");
    }
}
