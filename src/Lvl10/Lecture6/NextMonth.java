package Lvl10.Lecture6;

/*
 * В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний месяц,
 * возвращать первый. Используй методы values и ordinal.
 * Метод main не участвует в проверке.
 */

public class NextMonth {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if(index == 11) {
            Month nextMonth = Month.values()[0];
            return nextMonth;
        }
        Month nextMonth = Month.values()[index + 1];
        return nextMonth;
    }

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}