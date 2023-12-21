package Lvl5.Lecture8;

/*
 * Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
 * Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
 */

public class BitShift {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return 2 << (power - 1);
    }
}
