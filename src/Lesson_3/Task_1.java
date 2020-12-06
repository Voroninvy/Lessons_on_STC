package Lesson_3;

public class Task_1 {
    public static void main(String[] args) {
    /*
        Задание 1:

        Написать программу, которая считает стоимость бензина.
        Программа считает стоимость бензина (на вход программе передается кол-во: литров, на выходе печатается стоимость).
        Пример:
        Стоимость литра бензина "price" рублей.
        На вход подается "petrol" литров бензина,
        на выходе должно быть 3120 руб. (Итоговая стоимость бензина)
    */

        int price = 48;
        int petrol = 65;

        if (price>0) {
            if (petrol >0) {
                int total = price * petrol;
                System.out.println("Input value:");
                System.out.println("Price: " + price);
                System.out.println("Petrol: " + petrol);
                System.out.println("================================");
                System.out.println("Total price: " + total + " RUB");
            }
            else
                System.out.println("Incorrect input value for petrol. Value for petrol must be greater then 0. The current value is: " + petrol + " liters");
        }
        else
            System.out.println("Incorrect input value for price. Value for price must be greater then 0. The current value is: " + price + " RUB");
    }
}
