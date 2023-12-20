package Lvl1.Lecture9;

/*
 * Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве,
 * иначе — false. Массив array не должен изменять расположение своих элементов.
 * 
 * Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй статический метод
 * Arrays.binarySearch(int[], int) класса Arrays. Первым параметром нужно передать отсортированный массив,
 * в котором выполнить поиск, вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int)
 * возвращает индекс искомого элемента, если такой элемент есть в массиве.
 */

import java.util.Arrays;

public class ArrayBinarySearch {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
    
    public static int[] tempArray;
    public static void main(String[] args) {
        tempArray = new int[array.length];
        
        tempArray = Arrays.copyOf(array, array.length);
        Arrays.sort(tempArray);
        if (Arrays.binarySearch(tempArray, element) >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
