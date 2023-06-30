public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не поддерживает данную версию");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        int year = 2020;
        int checkYear  = 2015;
        if (clientOS == iOs && year < checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year < checkYear && clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не поддерживает данную версию");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int interval = 40;
        int firstDist = 20;
        int maxDist = 100;
        int countDay = 2 + (deliveryDistance - firstDist) / interval - firstDist / (deliveryDistance + 1);
        if (deliveryDistance < maxDist) {
            System.out.println("Потребуется дней: " + countDay);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        int monthsInYear = 12;
        int seasons = 4;
        int monthsInSeason = 3;
        int timeOfYear = ((monthNumber - 1)/ monthsInYear) * seasons + (monthNumber % monthsInYear) / monthsInSeason;
        switch (timeOfYear) {
            case 0:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Весна");
                break;
            case 2:
                System.out.println("Лето");
                break;
            case 3:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не верный номер месяца");
        }
    }
}