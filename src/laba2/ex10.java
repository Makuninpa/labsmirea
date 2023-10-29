package laba2;

import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Велите слова через пробел");
        String input = sc.nextLine();
        int count = 0;

        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("Вы ввели "+count+" слов");
    }
}


