package Lvl13.Lecture2;

import java.sql.Date;

/*
 * Проинициализируй переменную birthDate объектом Date с датой своего рождения.
 * Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.
 */

public class WorkingWithDatesOne {
    static Date birthDate = new Date(98, 7, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int mounth = date.getDay();
        String str = switch(mounth) {
            case 0 -> "Воскресенье";
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            default -> throw new IllegalStateException("Unexpected value: " + mounth);
        };
        return str;
    }
}
