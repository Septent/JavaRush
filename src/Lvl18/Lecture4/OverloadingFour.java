package Lvl18.Lecture4;

/*
 * Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */

public class OverloadingFour {
    public static void main(String[] args) {

    }

    public static int min(int i1, int i2) {
        return Integer.min(i1, i2);
    }

    public static long min(long l1, long l2) {
        return Long.min(l1, l2);
    }

    public static double min(double d1, double d2) {
        return Double.min(d1, d2);
    }
}
