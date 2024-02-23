package Lvl15.Lecture2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * В классе Solution публичный метод print(ArrayList<String>) выводит в консоли все элементы списка по порядку.
 * Сейчас метод реализован с использованием метода списка forEach(), который принимает лямбда-выражение. Необходимо переписать
 * реализацию метода print(ArrayList<String>), чтобы метод списка forEach() вместо лямбда-выражения принимал ссылку на метод.
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class MethodReferencesOne {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        strings.forEach( System.out::println );
    }
}
