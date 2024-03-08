package Lvl17.Lecture11;

import java.util.Arrays;

/*
 * Реализуй метод, который возвращает объект класса Pair. В поле x этого объекта должно содержаться минимальное число,
 * а в поле y - максимальное число из массива inputArray.
 */

public class MinAndMax {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        return new Pair(Arrays.stream(inputArray).min().getAsInt(), Arrays.stream(inputArray).max().getAsInt());

    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
