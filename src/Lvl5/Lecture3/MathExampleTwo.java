package Lvl5.Lecture3;

/*
 * Исправь методы класса Solution, используя класс Math:
 *    sqrt(double) — должен возвращать квадратный корень переданного аргумента.
 *    cbrt(double) — должен возвращать кубический корень переданного аргумента.
 *    pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
 */

public class MathExampleTwo {
    public static void main(String[] args) {
        
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}
