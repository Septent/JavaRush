package Lvl14.Lecture5;

/*
 * В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
 * В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают целочисленные (тип int)
 * значения и возвращают минимальное и максимальное из них соответственно.
 * 
 * Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
 * В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
 * Все аргументы методов должны быть типа int.
 */

public class MinAndMax {
    public static int min(int a, int b) {
        int[] array = {a, b};
        int min = a;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        int min = a;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int min(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        int min = a;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        int min = a;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int max(int a, int b) {
        int[] array = {a, b};
        int max = a;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        int max = a;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        int max = a;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int max(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        int max = a;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }
}
