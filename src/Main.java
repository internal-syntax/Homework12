public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOSAndVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int deliveryVia(int deliveryDistance) {
        int daysForDelivery = 0;
        if (deliveryDistance <= 20) {
            daysForDelivery = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysForDelivery += 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysForDelivery += 3;
        } else if (deliveryDistance > 100 || deliveryDistance < 0) {
            daysForDelivery = -1;
        }
        return daysForDelivery;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        checkYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkOSAndVersion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 90;
        int daysForDelivery = deliveryVia(deliveryDistance);
        if (daysForDelivery > 0) {
            System.out.println("На доставку потребуется " + daysForDelivery + " дней");
        } else {
            System.out.println("Доставка невозможна");
        }
    }
}