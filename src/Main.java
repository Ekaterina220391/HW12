//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printTask1() {
        System.out.println("Задание 1");
    }

    public static void chekLeapYear(int year) {
        year = 2011;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Это високосный год");
        } else {
            System.out.println(year + "  Это не високосный год");
        }
    }

    public static void printTask2() {
        System.out.println("Задание 2");
    }

    public static void watchCurrentYear(int current, int client) {
        current = 2020;
        client = 0;
        if (current < 2015 && client == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (current < 2015 && client == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (current >= 2015 && client == 1) {
            System.out.println("Установите  приложение для iOS по ссылке");
        } else if (current >= 2015 && client == 0) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Введите корректные данные");
        }
    }

    public static void printTask3() {
        System.out.println("Задание 3");
    }

    public static void calculateDeliveryDistance(int delivery) {
        delivery = 110;
        int time = 1;
        if (delivery <= 20) {
            System.out.println("Потребуется дней:" + time);
        } else if (delivery > 20 && delivery <= 60) {
            System.out.println("Потребуется дней:" + (time + 1));
        } else if (delivery > 60 && delivery <= 100) {
            System.out.println("Потребуется дней:" + (time + 1 + 1));
        } else {
            System.out.println("Доставки нет");
        }
    }



    public static void main(String[] args) {
        printTask1();
        chekLeapYear(2011);
        printTask2();
        watchCurrentYear(2020, 0);
        printTask3();
        calculateDeliveryDistance(110);


    }

}