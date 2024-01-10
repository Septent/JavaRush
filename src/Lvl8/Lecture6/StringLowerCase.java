package Lvl8.Lecture6;

import java.util.Scanner;

/*
 * Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре. Исправь ошибку в коде, чтобы программа работала корректно.
 */

public class StringLowerCase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String result = line.toLowerCase();
        System.out.println(result);
    }
}
