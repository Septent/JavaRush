package Lvl12.Lecture3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
 * Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла (используй метод readAllLines(Path)
 * класса Files) и выводит их на экран через одну, начиная с первой.
 */

public class DontMiss {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < lines.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(lines.get(i));
                }
            }
        }
    }
}
