package Lvl18.Lecture4;

/*
 * Напиши public static методы: int max(int, int), long max(long, long), double max(double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 */

public class OverloadingFive {
    public static void main(String[] args) {

    }

    public static int max(int i1, int i2) {
        return Integer.max(i1, i2);
    }

    public static long max(long l1, long l2) {
        return Long.max(l1, l2);
    }

    public static double max(double d1, double d2) {
        return Double.max(d1, d2);
    }
}
