package Lvl13.Lecture4;

import java.time.LocalDate;
import java.time.Month;

/*
 * В классе Solution реализуй 4 метода:
 *    метод nowExample должен вернуть текущую дату;
 *    остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
 */

public class DataAPI {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(2020, 256);
        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.ofEpochDay(18517);
        return date;
    }
}