package Lesson_5;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
    /*
        Задание:

        Дан двумерный массив. Задача – написать метод

        public void toLeft() {}

        1.Пройти с 1-ой до последней строки
        2.Пройти с 1-го до предпоследнего элемента
        3.В текущую ячейку поместить значение следующей
        4.Последнему элементу присвоить 0

        Так выглядит любая строка после преобразования данным методом

        2 3 4 5 6 7 8 9 10 0

     */

        System.out.println("Программа Сдвиг Массива");

            int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8, 4}, {9, 10, 11, 12}};
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < (array[i].length-1); j++) {
                    array[i][j]=array[i][j+1];
                }
                array[i][array[i].length-1]=0;
            }
            System.out.println(Arrays.deepToString(array));
    }
}
