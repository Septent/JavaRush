package Lvl12.Lecture5;

import java.nio.file.Path;
import java.util.Scanner;

/*
 * Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, при этом если путь не абсолютный, то перед выводом его
 * нужно преобразовать к таковому.
 */

public class AbsolutePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Path path = Path.of(str);
        if (path.isAbsolute()) {
            System.out.println(path);
        } else {
            System.out.println(path.toAbsolutePath());
        }
    }
}
