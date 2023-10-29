package laba11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        currentDate.setTime((currentDate.getTime() / 1000) * 1000);

        SimpleDateFormat dateFormat = new SimpleDateFormat("дд-мм-гггг чч:мм:сс");
        String formattedCurrentDate = dateFormat.format(currentDate);

        System.out.println("Текущая дата и время: " + formattedCurrentDate);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            Date userDate = dateFormat.parse(userInput);

            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата меньше текущей даты");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата больше текущей даты");
            } else {
                System.out.println("Даты равны");
            }
        } catch (Exception e) {
            System.err.println("Ошибка. Введите дату в другом формате");
        }
    }
}
