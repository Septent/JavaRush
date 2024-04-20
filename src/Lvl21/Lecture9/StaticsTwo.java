package Lvl21.Lecture9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * В этой задаче тебе нужно:
 * 1. В статическом блоке считать с консоли А и В — две переменные с типом int.
 * 2. Обработать IOException в блоке catch.
 * 3. Закрыть поток ввода методом close().
 */

public class StaticsTwo {
    public static int A;
    public static int B;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(reader);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }

    public static final int MIN = min(A, B);

    

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
