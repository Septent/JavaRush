package Lvl7.Lecture6;

import java.util.Calendar;

/*
 * В классе Solution есть поле currentYear, которое должно инициализироваться значением текущего года(Calendar.getInstance().get(Calendar.YEAR))
 * при создании нового объекта типа Solution.
 * Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear правильно инициализировалось.
 */

public class CurrentYear {
    private int currentYear;

    public CurrentYear() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        CurrentYear currentYear = new CurrentYear();
        System.out.println(currentYear.getCurrentYear());
    }
}
