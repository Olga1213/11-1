//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int year = 2021;
        isLeapYear(year);
        int os = 0;
        getClientOs(os);

    }

    public static void isLeapYear(int year) {

        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("високосный год");
        } else {
            System.out.println("невисокосный год");
        }
    }
    public static void getClientOs(int os) {

        if (os == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }
    }
    public static void distance
    }


    //3

    int days = 0;
    int distance = 47;
        if (distance < 20) {
        days = 1;
    } else if (distance < 60) {
        days = 2;
    } else if (distance < 100) {
        days = 3;
    } else {
        days = -1;
    }
        if (days >= 0) {
        System.out.println("доставка займет" + days + "дней");
    } else {
        System.out.println("доставки нет");
    }
}