package Lvl2.Lecture3;

/*
 * Напишем утилиту для работы с массивами. Основная часть функционала готова:
 * метод printArray() выводит в консоли все элементы массива. Тебе осталась
 * мелочь: реализовать метод reverseArray(). Он должен менять порядок
 * элементов массива на обратный.
 * Метод должен работать только с массивами целочисленных значений (int[]).
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int temp, i = 0; i < (array.length / 2); i++) {
            temp = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
