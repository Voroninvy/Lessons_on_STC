package Lesson_4;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
    /*
        Задание 4:

        Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

     */

    int d=2;

    System.out.println("Программа выводит арифметическую прогрессию");
    System.out.println("Разность арифметической прогрессии (D) = " + d);
    System.out.println("=====================================================");
    System.out.println();

    for (int i = 0; i <= 10; i=i+d)
            System.out.print(i + " ");

    System.out.println();

    }
}
