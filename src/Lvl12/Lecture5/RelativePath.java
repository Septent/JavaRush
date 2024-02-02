package Lvl12.Lecture5;

import java.nio.file.Path;
import java.util.Scanner;

/*
 * Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоль относительный путь между первым и вторым путями,
 * если он существует. В противном случае выводить ничего не нужно.
 */

public class RelativePath {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            Path path1 = Path.of(str1);
            Path path2 = Path.of(str2);
            System.out.println(path1.relativize(path2));
        } catch (RuntimeException e) {}
    }
}
