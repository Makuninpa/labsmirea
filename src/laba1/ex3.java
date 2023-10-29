package laba1;

import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество элементов массива:");

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Введите элемент массива:" + (i+1)+":");
            array[i] = sc.nextInt();
        }

        int sumar = 0;
        for (int i = 0; i < size; i++){
            sumar += array[i];
        }
        System.out.println("Сумма элементов массива:" + sumar);

        double averange = (double) sumar/size;
        System.out.println("Среднее арифметическое: " + averange);

        sc.close();
    }
}
