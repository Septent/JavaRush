package Lvl12.Lecture2;

/*
 * Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла (используй метод
 * readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
 */

 import java.nio.file.Files;
 import java.nio.file.Paths;
 import java.util.List;
 import java.util.Scanner;

public class FaceControl {
    public static void main(String[] args) {
        String fileName;
        try (Scanner scanner = new Scanner(System.in);
        var inputStream = new Files.readAllLines(scanner.nextLine())) {

        }
    }
}
