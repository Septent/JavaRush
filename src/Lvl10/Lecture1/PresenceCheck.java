package Lvl10.Lecture1;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/*
 * В классе Solution есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
 * Если слово есть, то выводим в консоль:
 *    Слово [переданное слово] есть в множестве
 * Если нет:
 *    Слова [переданное слово] нет в множестве
 * Метод main не участвует в проверке.
 * Пример вывода:
 *    Слово Java есть в множестве
 */

public class PresenceCheck {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");;
        } else if (!words.contains(word)) {
            System.out.println("Слова " + word + " нет в множестве");;
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}