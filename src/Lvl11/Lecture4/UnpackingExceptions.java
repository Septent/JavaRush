package Lvl11.Lecture4;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
 * В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
 * Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — "Не удалось записать в файл.".
 */

public class UnpackingExceptions {
    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println("Не удалось прочесть файл."); 
            } else if (cause instanceof FileSystemException) {
                System.out.println("Не удалось записать в файл.");
            }
        }
    }
}

class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записываем данные в файл " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
