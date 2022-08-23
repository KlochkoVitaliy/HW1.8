public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static java.time.LocalDate LocalDate;

    //Task 1


    public static int checkingTheYear() {
        int year = 2024;
        boolean yearVis = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (yearVis) {
            System.out.println(ANSI_RED + year + ANSI_RESET + "—  високосный год");
            return year;
        }
        System.out.println(ANSI_GREEN + year + ANSI_RESET + "— не високосный год");
        return year;
    }

    public static int versionOutput() {
        int ClientOS = 0;                                                                                    //  1 - iOs   2- Android
        int currentYear = LocalDate.now().getYear();
        //int clientDeviceYear = 2015;
        if (ClientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите Lite версию приложения для iOS по ссылке");
        } else {
            if (ClientOS == 1 && currentYear <= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        if (ClientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите Lite версию приложения для Android по ссылке");
        } else {
            if (ClientOS == 0 && currentYear <= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        return ClientOS;
    }

    private static int refundDays() {
        int deliveryDistance = 15;
        int srok = 1;
        if (deliveryDistance <= 20) {
            srok = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            srok = srok + 1;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            srok = srok + 2;
        }
        System.out.println("Итоговое количество дней доставки - " +ANSI_RED +  srok + ANSI_RESET);
        return srok;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println(ANSI_GREEN + "Задание № 1" + ANSI_RESET);
        checkingTheYear();
        System.out.println();
        System.out.println(ANSI_GREEN + "Задание № 2" + ANSI_RESET);
        versionOutput();
        System.out.println();
        System.out.println(ANSI_GREEN + "Задание № 3" + ANSI_RESET);
        refundDays();

    }
}


