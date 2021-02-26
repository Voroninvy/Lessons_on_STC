package Lesson_4;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
    /*
        Задание 2:

        Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
        На вход запрашивается ввод числа: X

     */

        Random random = new Random();
        int x = random.nextInt(100);

        System.out.println("Программа описывает число X ");
        System.out.println("Входные параметры X = " + x);
        System.out.println("=====================================================");
        System.out.println("Ответ:");

        if (x == 0) {
            System.out.print("Число Х: равно нулю");
        } else if (x > 0) {
            System.out.print("Число Х: положительное");
        } else {
            System.out.print("Число Х: отрицательное");
        }

        if(x%2==0) {
            System.out.println(" и четное");
        }else {
            System.out.println(" и нечетное");
        }
    }
}
