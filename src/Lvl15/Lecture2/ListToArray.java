package Lvl15.Lecture2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * В классе Solution есть два публичных статических метода:
 * 
 *    String[] toStringArray(ArrayList<String>), в котором нужно преобразовать список строк в массив строк и вернуть его;
 *    Integer[] toIntegerArray(ArrayList<Integer>), в котором нужно преобразовать список чисел в массив чисел и вернуть его.
 * Для преобразования списка в массив используй метод списка toArray(), в который нужно передать ссылку на конструктор массива,
 * тип которого соответствует типу списка.
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class ListToArray {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        return strings.toArray( String[]::new );
        //return new String[]{};
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        return integers.toArray( Integer[]::new );
        //return new Integer[]{};
    }
}
