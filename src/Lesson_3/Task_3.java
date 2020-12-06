package Lesson_3;

public class Task_3 {
    public static void main(String[] args) {
    /*
        Задание 3:

        Написать программу, которая конвертирует секунды "sec" в часы "hour".
        Пример: на вход подается 3600, на выходе печатается 1 час.
    */

        int sec=7159;

        if (sec>0) {

            int hour = sec / 3600;
            int min = (sec - (sec / 3600) * 3600) / 60;
            int sec_remainder = sec - (sec / 60) * 60;
            System.out.println("Input value:");
            System.out.println("Number of seconds: " + sec);
            System.out.println("================================");
            System.out.println("Calculated value: " + hour + ":" + min + ":" + sec_remainder);
        }
        else
            System.out.println("Incorrect input value for seconds. Value for seconds must be greater then 0. The current value is: " + sec + " second");
    }
}
