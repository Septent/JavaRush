package Lvl12.Lecture6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и перемещать файлы из одной директории в другую
 * (только файлы, директории игнорируй).
 * Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), move().
 */

public class MovingFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        scanner.close();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path file : files) {
                if (Files.isRegularFile(file)) {
                    Files.move(file, targetDirectory.resolve(file.getFileName()));
                }
            }
        }
    }
}
