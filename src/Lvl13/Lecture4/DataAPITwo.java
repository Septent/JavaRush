package Lvl13.Lecture4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 * Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
 * Воспользуйся методами getDayOfWeek и getDisplayName.
 * 
 * Пример параметров метода getDisplayName, чтобы получить русское название дня недели:
 *    getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
 */

public class DataAPITwo {
    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
        return dayOfWeek;
    }
}
