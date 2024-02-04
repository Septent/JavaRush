package Lvl13.Lecture2;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Исправь ошибку, чтобы программа вывела "2010-01-06".
 * Инициализацию переменной date не меняй.
 */

public class WorkingWithDatesThree {
    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}
