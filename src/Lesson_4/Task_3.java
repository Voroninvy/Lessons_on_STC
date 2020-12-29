package Lesson_4;

public class Task_3 {
    public static void main(String[] args) {
    /*
        Задание 3:

        Написать программу для вывода на экран таблицы умножения.

     */

        int x=1, y=1;

        System.out.println("Программа выводит таблицу умножения: ");
        System.out.println("=====================================================");
        System.out.println();

        while (y<=10){
            System.out.println("Таблица умножения для: " + y);
            for(x=1; x<=10; x++)
                System.out.println(" " + y +" * " + x + " = " + x*y);
            System.out.println();
            y++;
        }
    }
}
