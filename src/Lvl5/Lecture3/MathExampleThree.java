package Lvl5.Lecture3;

/*
 * В этой задаче тебе нужно:
 *    Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
 *    Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
 * В методе min(int[]) обязательно используй метод Math.min(int, int).
 */

import java.util.Scanner;

public class MathExampleThree {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minValue = ints[0];
        for (int i = 0; i < ints.length; i++) {
            minValue = Math.min(minValue, ints[i]);
        }
        return minValue;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] intA = new int[10];
        for (int i = 0; i < 10; i++) {
            intA[i] = scanner.nextInt();
        }
        scanner.close();
        return intA;
    }
}
