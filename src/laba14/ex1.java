package laba14;
import java.util.regex.*;
public class ex1 {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 100 RUB, 35.55 EU, 44 ERR, 0.004 EU";
        String pattern = "(\\d+(?:\\.\\d+)?)\\s+(USD|RUB|EU)";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(2);

            switch (currency) {
                case "USD":
                    System.out.println("Найдена цена в USD: " + price);
                    break;
                case "RUB":
                    System.out.println("Найдена цена в RUB: " + price);
                    break;
                case "EU":
                    System.out.println("Найдена цена в EU: " + price);
                    break;
                default:
                    System.out.println("Неправильное выражение: " + matcher.group(0));
                    break;
            }
        }
    }
}

