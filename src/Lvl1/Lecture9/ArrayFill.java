package Lvl1.Lecture9;

/*
 * Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
 * Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
 * Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
 * Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
 */

import java.util.Arrays;

public class ArrayFill {
    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;
    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, array.length / 2, valueStart);
            Arrays.fill(array, array.length / 2, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, (array.length / 2) + 1, valueStart);
            Arrays.fill(array, (array.length / 2) + 1, array.length, valueEnd);
        }
        
        System.out.println(Arrays.toString(array));
    }
}
