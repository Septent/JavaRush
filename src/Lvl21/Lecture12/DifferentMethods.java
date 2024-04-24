package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * В этой задаче тебе нужно:
 * Считывать с консоли данные, пока не будет введено слово "exit".
 * Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
 * содержит точку '.', вызвать метод print() для Double;
 * больше нуля, но меньше 128, вызвать метод print() для short;
 * меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
 * иначе — вызвать метод print() для String.
 */

public class DifferentMethods {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;

        while (true) {
            key = reader.readLine();
            if (key.equals("exit")) {
                break;
            } else if (tryParseDouble(key)) {
                print(Double.parseDouble(key));
            } else if (tryParseShort(key)) {
                short i = (short) Integer.parseInt(key);
                print(i);
            } else if (tryParseInteger(key)) {
                Integer i = Integer.parseInt(key);
                print(i);
            } else {
                print(key);
            }


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static boolean tryParseDouble(String value) {
        try {
            if (value.contains(".")) {
                Double.parseDouble(value);
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean tryParseShort(String value) {
        try {
            int i = Integer.parseInt(value);
            if ((i > 0) && (i < 128)) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean tryParseInteger(String value) {
        try {
            int i = Integer.parseInt(value);
            if ((i <= 0) || (i >= 128)) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
