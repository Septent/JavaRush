package Lvl11.Lecture4;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
 * В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
 * Перехваченные исключения оберни в RuntimeException и пробрось дальше.
 */

public class WrappingExceptions {
    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записываем данные в файл " + filePath);
    }
}