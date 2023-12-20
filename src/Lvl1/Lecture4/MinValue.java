package Lvl1.Lecture4;

/*
 * Чтобы выполнить эту задачу, тебе нужно:
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими массив.
 * 3. Найти минимальное число среди элементов массива и вывести в консоль.
 */

import java.util.Scanner;

public class MinValue {
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
        
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println(min);
        scanner.close();
    }
}
