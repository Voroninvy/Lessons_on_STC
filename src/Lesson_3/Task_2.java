package Lesson_3;

public class Task_2 {
    public static void main(String[] args) {
    /*
        Задание 2:

        Написать программу, которая считает зарплату «на руки».
        На вход программе передается величина зарплаты - "gross",
        на выходе печатается зарплата за вычетом 13% (НДФЛ) - "net".
        Пример: на вход подается 70000, на выходе печатается 60900 руб.
    */

        double gross = 100000;

        if (gross > 0) {
            double net = gross - (gross * 13 / 100);
            System.out.println("Input value:");
            System.out.println("Gross: " + gross);
            System.out.println("================================");
            System.out.println("The salary is (Net): " + net + " RUB");
        }
        else
            System.out.println("Incorrect input value for Gross. Value for Gross must be greater then 0. The current value is: " + gross + " RUB");
    }
}