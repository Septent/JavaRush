package Lvl10.Lecture2;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:
 * 1. removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for и счетчик.
 * 2. removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл while и метод iterator().
 * 3. removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for-each и копию списка.
 * 4. В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
 * Метод main реализован для вашего кода и не участвует в проверке.
 */

public class RemoveBug {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().equals("bug")) {
                list.remove(i);
                i--;    
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if (s.toLowerCase().equals("bug")) {
                it.remove();
            }
        }        
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copyList = new ArrayList(list);
        for (String s : copyList) {
            if (s.toLowerCase().equals("bug")) {
                list.remove(s);
            }
        }
    }
}