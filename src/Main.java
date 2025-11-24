//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printTask1() {
        System.out.println("Задание 1");
    }
    public static void printTask2() {
        System.out.println("Задание 2");
    }
    public static void printTask3() {
        System.out.println("Задание 3");
    }

    public static void leapYear(int leap) {
        int year=2011;
    }
    public static void currentYear(int update) {
        int current=2020;
    }
    public static void deliveryDistance(int distance) {
        int delivery=110;
    }


    public static void main(String[] args) {
        printTask1();
        int year =2011;
        leapYear(year);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Это високосный год");
        } else{
            System.out.println(year + "  Это не високосный год");
        }
        printTask2();
        int current =2020;
        currentYear(current);
        int clientO = 0;
        if (current < 2015 && clientO == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (current < 2015 && clientO == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (current >= 2015 && clientO == 1) {
            System.out.println("Установите  приложение для iOS по ссылке");
        } else if (current >= 2015 && clientO == 0) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Введите корректные данные");
        }
        printTask3();
        int delivery  = 110;
        deliveryDistance(delivery);
        int time = 1;
        if (delivery <= 20) {
            System.out.println("Потребуется дней:" + time);
        } else if (delivery > 20 && delivery <= 60) {
            System.out.println("Потребуется дней:" + (time + 1));
        } else if (delivery > 60 && delivery <= 100) {
            System.out.println("Потребуется дней:" + (time + 1 + 1));
        } return;



    }

}