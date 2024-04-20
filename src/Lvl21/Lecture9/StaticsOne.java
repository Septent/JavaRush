package Lvl21.Lecture9;

import java.util.HashMap;
import java.util.Map;

/*
 * В статическом блоке инициализируй labels пятью различными парами ключ-значение.
 */

public class StaticsOne {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "One");
        labels.put(2.0, "Two");
        labels.put(3.0, "Three");
        labels.put(4.0, "Four");
        labels.put(5.0, "Five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
