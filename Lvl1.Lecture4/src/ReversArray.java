/*
 * Тебе нужно написать программу, которая:
 * 1. Считывает с консоли целое число N.
 * 2. Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
 * 3. Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
 * Каждое число выводить с новой строки. Число N выводить не нужно.
 */

import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input <= 0) {
            scanner.close();
            return;
        }
        int[] array = new int[input];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        if (input % 2 != 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = input; i != 0; i--) {
                System.out.println(array[i - 1]);
            }
        }
        scanner.close();
    }
}
