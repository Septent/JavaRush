package Lvl12.Lecture7;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
 * Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.
 */

public class UrlToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        URL url = new URL(line);
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();

        Path tempPath = Files.createTempFile(null, null);
        Files.write(tempPath, buffer);
    }
}