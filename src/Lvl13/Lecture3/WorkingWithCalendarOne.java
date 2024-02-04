package Lvl13.Lecture3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения. Реализуй метод getDayOfWeek(Calendar calendar),
 * чтобы он возвращал русское название дня недели аргумента calendar.
 * Помни, что в григорианском календаре неделя начинается с воскресенья.
 */

public class WorkingWithCalendarOne {
    static Calendar birthDate = new GregorianCalendar(1998, 7, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int dow = calendar.get(Calendar.DAY_OF_WEEK);
        String str = switch(dow) {
            case 1 -> "воскресенье";
            case 2 -> "понедельник";
            case 3 -> "вторник";
            case 4 -> "среда";
            case 5 -> "четверг";
            case 6 -> "пятница";
            case 7 -> "суббота";
            default -> throw new IllegalStateException("Unexpected value: " + dow);
        };

        return str;
    }
}
