package Lvl5.Lecture6;

/*
 * В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время,
 * используя соответствующие методы java.util.concurrent.TimeUnit.
 */

import java.util.concurrent.TimeUnit;

public class Timer {
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.MILLISECONDS.sleep(millis);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.DAYS.sleep(days);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
