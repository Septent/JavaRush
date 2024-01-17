package Lvl10.Lecture2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * В классе Solution есть метод print(HashSet<String>), который должен выводить в консоли все элементы множества, используя iterator().
 * Метод main не участвует в проверке.
 */

public class HashSetIterator {
    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
