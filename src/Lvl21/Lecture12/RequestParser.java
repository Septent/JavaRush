package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Для решения этой задачи тебе нужно:
 * Считать с консоли URL-ссылку.
 * Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert():
 * alert(double value) - для чисел (не забывай о том, что число может быть дробным);
 * alert(String value) - для строк.
 * Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
 */

public class RequestParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] splitOne = url.split("\\?");
        String[] splitTwo = splitOne[1].split("&");
        String lineObj = "";

        for (String line : splitTwo) {
            String[] lastSplit = line.split("=");
            System.out.print(lastSplit[0] + " ");
            if (line.contains("obj")) {
                lineObj = lastSplit[1];
            }
        }
        if (!lineObj.equals("")) {
            System.out.println();
            Double d = tryParseDouble(lineObj);
            if (d != null) {
                alert(d);
            } else {
                alert(lineObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static Double tryParseDouble(String value) {
        try {
            Double d = Double.parseDouble(value);
            return d;
        }
        catch (NumberFormatException e) {
            return null;
        }
    }
}
