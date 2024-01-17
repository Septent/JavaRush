package Lvl10.Lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>), которые выводят все элементы из
 * переданных коллекций — списка и множества — с новой строки. Твоя задача переписать методы на использование цикла for-each.
 * Метод main не участвует в проверке.
 */

public class IteratorToForeach {
    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (var word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
