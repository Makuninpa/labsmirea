package laba11;

import java.util.Date;

public class ex1 {
    public static void main(String[] args) {
        String developerName = "Макунин";

        Date assignmentReceivedDate = new Date();
        long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

        long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000;
        Date assignmentDueDate = new Date(assignmentDueTimeMillis);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + assignmentDueDate);
    }
}

/* Вывод
Фамилия разработчика: Макунин
Дата и время получения задания: Tue Oct 17 21:15:44 MSK 2023
Дата и время сдачи задания: Tue Oct 17 21:15:44 MSK 2023 */

