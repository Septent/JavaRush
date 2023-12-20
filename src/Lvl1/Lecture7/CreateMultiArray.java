package Lvl1.Lecture7;

/*
 * Реализуй метод main(String[]), который:
 * 1. Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
 * 2. Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
 * 3. Инициализирует двумерный массив multiArray:
 *  - количеством строк N;
 *  - строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
 */

import java.util.Scanner;

public class CreateMultiArray {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        multiArray = new int[input][];
        
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
