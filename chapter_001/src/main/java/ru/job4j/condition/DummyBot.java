package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl =  "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        else
            return rsl;
        return rsl;
    }
    public static void main (String [] args) {
       String q1 = DummyBot.answer("Привет, Бот.");
       System.out.println(q1);
       String q2 = DummyBot.answer("Пока.");
       System.out.println(q2);
       String q3 = DummyBot.answer("Как дела?");
        System.out.println(q3);



    }
}
