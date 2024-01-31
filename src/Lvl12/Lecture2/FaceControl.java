package Lvl12.Lecture2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
 * Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла (используй метод
 * readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
 */

public class FaceControl {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (var line : lines) {
                char[] lineChar = line.toCharArray();
                for (int i = 0; i < lineChar.length; i++) {
                    if ((lineChar[i] != '.') && (lineChar[i] != ',') && (lineChar[i] != ' ')) {
                        System.out.print(lineChar[i]);
                    }
                }
            }
        }
    }
}
