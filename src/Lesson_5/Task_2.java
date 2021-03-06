package Lesson_5;

public class Task_2 {

    public static void main(String[] args) {
    /*
    ДЗ 4_2 Реверс массиваЗадание
    Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
    Задачу не зачитывать если использованы утильные методы класса Arrays. Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.

    Вывести массив в консоль до и после вызова метода по реверсу массива
     */

        System.out.println("Программа Реверс Массива");
        System.out.println("Исходный массив: ");

        //создаем первый массив и выводим его на экран
        int[] array1 = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i] + " ");
        }

        System.out.println();

        System.out.println("=====================================================");
        System.out.println("Перевернутый массив:");

        int[] array2 = new int[array1.length]; //создаем второй массив равный по длине первому
        int z = array1.length - 1; //создаем переменную равную номеру последней ячейки в первом массиве
        for (int k = 0; k < array2.length; k++) { //заполняем второй массив
            int m = array1[z];
            array2[k] = m;
            z--;
        }


        int j = 0; //Копируем значения второго массива в первый
        for (int v = 0; v < array1.length; v++) {
            int l = array2[j];
            array1[v] = l;
            j++;
            System.out.print(" " + array1[v] + " ");
        }
    }
}