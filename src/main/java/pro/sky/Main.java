package pro.sky;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * Checks if year is leap or not and prints result in PrintStream.
     * @param year year to check for leap year
     */
    public static void printLeapYear(int year) {
        if ((year % 100 != 0 || year % 400 == 0) && (year % 4 == 0))
            System.out.printf("%d год является високосным%n", year);
        else
            System.out.printf("%d год не является високосным%n", year);
    }

    /**
     * Prints the recommended version of the app to the console.
     * @param clientOS 0 - if phone OS is iOS, 1 - if Android
     * @param clientDeviceYear phone production year
     * @throws IllegalArgumentException if clientOS not 0 or 1
     */
    public static void printCompatibleApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS != 0 && clientOS != 1)
            throw new IllegalArgumentException("clientOS не может принимать значения отличные от 0 или 1");

        if (clientOS == 1 && clientDeviceYear < currentYear)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (clientDeviceYear < currentYear)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для iOS по ссылке");
    }

    /**
     * Prints delivery duration of the bank card depending on distance.
     * @param deliveryDistance distance from bank to client
     */
    public static void printDeliveryDuration(int deliveryDistance) {
        int deliveryDuration = (deliveryDistance - 20) / 40 + 2;

        if (deliveryDistance - 20 < 0)
            System.out.printf("Потребуется дней: %d%n", 1);
        else
            System.out.printf("Потребуется дней: %d%n", deliveryDuration);
    }
}