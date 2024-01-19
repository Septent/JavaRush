package Lvl10.Lecture3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * В классе Solution объявлены методы: reverse(ArrayList<Integer>), sort(ArrayList<Integer>), rotate(ArrayList<Integer>, int),
 * shuffle(ArrayList<Integer>). Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только
 * соответствующие методы класса Collections.
 */

public class CollectionsExampleTwo {
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}