package Lesson_4;

public class Task_1 {
    public static void main(String[] args) {
    /*
        Задание 1:

        Написать программу для поиска минимального из двух чисел.
        На вход подаются два числа: X и Y

     */

        int x = 48;
        int y = 65;

        System.out.println("Программа поиска минимального из двух чисел: X и Y");
        System.out.println("Входные параметры X = " + x + ", Y = " + y);
        System.out.println("=====================================================");
        System.out.println("Ответ:");

        if (x - y == 0) {
            System.out.println("Найти минимальное значение не удалось, значение x = y (" + x + " = " + y + ")");
        }
        else
            if (x>y) {
                System.out.println("Значение числа x > y (" + x + " > " + y + ")");
            }
            else
                System.out.println("Значение числа x < y (" + x + " < " + y + ")");
    }
}
