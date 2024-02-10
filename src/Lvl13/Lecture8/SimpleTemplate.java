package Lvl13.Lecture8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * В методе main выведи на экран переменную localDateTime в таком виде:
 * 19.03.2020г. 5ч.4мин
 */

public class SimpleTemplate {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        System.out.println(formatter.format(localDateTime));
    }
}
