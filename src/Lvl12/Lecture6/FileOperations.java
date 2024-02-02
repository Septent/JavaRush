package Lvl12.Lecture6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.
 * 1. Если файла по первому пути не существует, его нужно создать.
 * 2. Если же файл по первому пути существует, нужно переместить этот файл по второму пути, но только в том случае, если по второму пути файла нет.
 * 3. Если же он есть, нужно просто удалить файл по первому пути.
 * Используй соответствующие методы класса Files: createFile(), move(), delete(), exists()/notExists().
 */

public class FileOperations {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        scanner.close();
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.exists(filePath) && !Files.exists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else if (Files.exists(fileNewPath)) {
            Files.delete(filePath);
        }
    }
}
