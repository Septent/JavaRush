package Lvl12.Lecture3;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
 * Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.
 */

public class ReadingFromTheConsoleTwo {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        }
    }
}
