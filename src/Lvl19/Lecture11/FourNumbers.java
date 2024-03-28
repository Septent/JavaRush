package Lvl19.Lecture11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * В этой задаче тебе нужно:
 * Ввести имя файла с консоли.
 * Прочитать из него набор чисел.
 * Вывести в консоли только четные, отсортированные по возрастанию.
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 * 
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 */

public class FourNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        ArrayList<Integer> values = new ArrayList<>();

        while (scanner.hasNextLine()) {
            values.add(Integer.parseInt(scanner.nextLine()));
        }

        Collections.sort(values);

        for (Integer i : values) {
            if (i % 2 == 0) {
                System.out.println(i);;
            }
        }

        fileInputStream.close();

    }
}
