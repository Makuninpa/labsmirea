package laba7;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        int x;
        int y;
        String move;
        System.out.println("Необходимо задать начальные координаты X Y:\n");
        System.out.println("X ->");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Y ->");
        y = scanner.nextInt();
        MovableRectangle rect = new MovableRectangle(x,y);

        boolean exit = true;

        while (exit) {
            System.out.println("Что нужно сделать?\n");
            System.out.println("-Up (Поднять)\n");
            System.out.println("-Down (Опустить)\n");
            System.out.println("-Left (Влево)\n");
            System.out.println("-Right (Вправо)\n");
            System.out.println("-exit (закончить движения)\n");
            move = scanner.next().toLowerCase();
            switch (move){
                case ("up"):
                    rect.moveUp();
                    System.out.println(rect.toString());
                    break;
                case ("down"):
                    rect.moveDown();
                    System.out.println(rect.toString());
                    break;
                case ("left"):
                    rect.moveLeft();
                    System.out.println(rect.toString());
                    break;
                case ("right"):
                    rect.moveRight();
                    System.out.println(rect.toString());
                    break;
                case ("exit"):
                    System.out.println("Движения прекращены\n");
                    System.out.println(rect.toString());
                    exit = false;
                    break;
                default:
                    System.out.println("Проверьте корректность данных!");
                    System.out.println("Попробуй еще раз!\n");
                    break;
            }
        }
    }
}
