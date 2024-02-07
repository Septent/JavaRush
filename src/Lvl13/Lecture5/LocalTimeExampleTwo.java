package Lvl13.Lecture5;

import java.time.LocalTime;

/*
 * Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран вывелись 4 строки.
 * Изменения можно вносить только в метод amazingMethod.
 */

public class LocalTimeExampleTwo {
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(4).plusMinutes(48);
    }
}
