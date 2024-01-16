package Lvl9.Lecture6;

import java.util.ArrayList;

/*
 * В методе main создается и заполняется список разными объектами и передается методу checkElementsType(ArrayList<Object>).
 * Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка, а также:
 * 1. Для типа String вызывать printString();
 * 2. Для типа Integer вызывать printInteger();
 * 3. Для типа Integer[] вызывать printIntegerArray();
 * 4. Для всех остальных типов вызывать printUnknown().
 * Метод main не участвует в проверке.
 */

public class CheckElemType {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (var elem : elements) {
            if (elem instanceof String) {
                printString();
            } else if (elem instanceof Integer) {
                printInteger();
            } else if (elem instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}