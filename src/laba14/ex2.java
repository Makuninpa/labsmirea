package laba14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4"; // пример текста

        // Поиск цифр без знака "+"
        Pattern pattern = Pattern.compile("(?<!\\+)\\d+");

        // Создаем объект Matcher для выполнения поиска в тексте
        Matcher matcher = pattern.matcher(text);

        // Флаг, указывающий наличие цифр без знака "+"
        boolean found = false;

        // Проверяем, есть ли совпадения
        while (matcher.find()) {
            found = true;
            System.out.println("Найденная цифра без знака \"+\": " + matcher.group());
        }

        // Выводим результат
        if (found) {
            System.out.println("В тексте есть цифры без знака \"+\".");
        } else {
            System.out.println("В тексте нет цифр без знака \"+\".");
        }
    }
}
