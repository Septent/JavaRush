package Lvl10.Lecture3;

import java.util.ArrayList;
import java.util.Collections;

/*
 * В классе Solution объявлены методы: min(ArrayList<Integer>), max(ArrayList<Integer>), frequency(ArrayList<Integer>, Integer),
 * binarySearch(ArrayList<Integer>, Integer). Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при
 * этом только соответствующие методы класса Collections.
 */

public class CollectionsExampleThree {
    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
