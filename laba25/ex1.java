package laba25;

import java.util.Scanner;
import java.util.Arrays;
public class ex1 {
    public static void main(String[] args){
        System.out.println("Введите строку>> ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Введите шаблон>> ");
        String pattern = scanner.nextLine();
        System.out.println(Arrays.toString(string.split(pattern)));
    }
}
