package Lvl12.Lecture6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * Напиши программу, которая будет считывать с клавиатуры путь к директории, получать список файлов и директорий в заданной директории и выводить
 * в консоли информацию о них в виде:
 * "<путь к файлу> - это файл", если это файл,
 * "<путь к директории> - это директория", если это директория.
 * Треугольные скобки и кавычки выводить не нужно.
 * Используй соответствующие методы класса Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
 * 
 * Ввод:
 * C:\javarush\
 * 
 * Вывод:
 * C:\javarush\test.txt - это файл
 * C:\javarush\tasks - это директория
 * ...
 */

public class InsideTheFolder {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        scanner.close();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
            for (Path file : files) {
                if (Files.isRegularFile(file)) {
                    System.out.println(file + THIS_IS_FILE);
                } else if (Files.isDirectory(file)) {
                    System.out.println(file + THIS_IS_DIR);
                }
            }
        }
    }
}
