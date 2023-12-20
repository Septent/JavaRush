package Lvl1.Lecture2;

/*
 * В методе main(String[]) тебе нужно заполнить массив strings значениями.
 * Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная),
 * иначе присвоить "Нечётный". Вывод текста в консоль в тестировании не участвует.
*/


public class EvenOddArray {
    public static String[] strings = new String[5];
    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = "Чётный";
            } else {
                strings[i] = "Нечётный";
            }
        }
    }
}
