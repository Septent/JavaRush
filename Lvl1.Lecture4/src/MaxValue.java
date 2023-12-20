/*
 * В этой задаче тебе нужно:
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими массив array.
 * 3. Найти максимальное число среди элементов массива.
 */

import java.util.Scanner;

public class MaxValue {
    public static int[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        array = new int[input];
        
        if (input <= 0) {
            scanner.close();
            return;
        }
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        int max = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println(max);
        scanner.close();
    }
}
